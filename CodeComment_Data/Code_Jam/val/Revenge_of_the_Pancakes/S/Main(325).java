package methodEmbedding.Revenge_of_the_Pancakes.S.LYD831;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author osilva
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (BufferedReader bufReader = new BufferedReader(new FileReader("/Projects/GCJ/2016/RevengeOfThePancakes/input.in"))) {
            String line;
            int count = 0;
            
            int numberOfInputs = -1;
            int numberOfInputsProcessed = 0;
            
            while ((line = bufReader.readLine()) != null) {
                if (count++ == 0) {
                    numberOfInputs = Integer.parseInt(line.trim());
                } else {
                    /// Logic goes here.
                    
                    char[] pancackeStack = line.trim().toCharArray();
                    
                    int flipCount = 0;
                    boolean allSame = false;
                    
                    while (!allSame) {
                        char previousChar = '0';
                        char currentChar = '0';
                        int flipIndex = -1;

                        for (int i = 0; i < pancackeStack.length; i++) {
                            previousChar = currentChar;
                            currentChar = pancackeStack[i];

                            if (previousChar != '0' && previousChar != currentChar) {
                                flipIndex = i - 1;
                                break;
                            }
                        }
                        
                        if (flipIndex >= 0) {
                            // Flipping
                            for (int i = 0; i <= flipIndex; i++) {
                                pancackeStack[i] = currentChar;
                            }
                            flipCount++;
                        } else {
                            allSame = true;
                        }
                    }
                    
                    // If all are converted to '-', another flip is required
                    if (pancackeStack[0] == '-') {
                        flipCount++;
                    }
                    
                    
                    numberOfInputsProcessed++;
                    if (numberOfInputsProcessed > numberOfInputs) break;
                    
                    System.out.println("Case #" + numberOfInputsProcessed + ": " + flipCount);
                    
                    /// Logic ends.
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
