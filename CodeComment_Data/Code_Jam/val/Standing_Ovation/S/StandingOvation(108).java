package methodEmbedding.Standing_Ovation.S.LYD936;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class StandingOvation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File inputFile = new File("smallInput.txt");
        FileReader reader = null;
        BufferedReader bufferedReader = null;

        File outputFile = new File("smallOutput.txt");

        try {
            reader = new FileReader(inputFile);
            bufferedReader = new BufferedReader(reader);
            String line = bufferedReader.readLine();

            int pos = 1;
            
            while ((line = bufferedReader.readLine()) != null) {
                String[] elements = line.split(" ");
                String[] numbers = elements[1].split("");
                Integer sum = 0;
                Integer minNeeded = 0;
                Integer maxShyness = Integer.parseInt(elements[0]);
                for (int i = 0; i <= maxShyness; ++i) {
                    if (sum < i) {
                        if (minNeeded < i - sum) {
                            minNeeded = i - sum;
                        }
                    }
                    sum += Integer.parseInt(numbers[i]);
                }

                System.out.println("Case #" + pos + ": " + minNeeded);
                pos++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
}
