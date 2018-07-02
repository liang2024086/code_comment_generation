package methodEmbedding.Counting_Sheep.S.LYD691;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Ric
 */
public class GoogleCodeJam2016ProblemACountingSheep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new FileReader("C:/Users/Ric/Documents/NetBeansProjects/Google Code Jam 2016- Problem A. Counting Sheep/A-small-attempt2 (1).in"));
        String [] tokens = br.readLine().split(" ");
        int n = Integer.parseInt(tokens[0]);
        int originalValue = 0;
        int newValue = 0;
        int numberOfDifferentDigitsChosen = 0;
        String s;
        boolean [] isPreviouslyChosen = new boolean[11];
        for(int i = 0; i < n; i++)
        {
            newValue = 0;
            tokens = br.readLine().split(" ");
            originalValue = Integer.parseInt(tokens[0]);
            if(originalValue <= 0)
            {
                System.out.println("Case #" + (i + 1) + ": INSOMNIA");
            }
            else
            {
                numberOfDifferentDigitsChosen = 0;
                isPreviouslyChosen = new boolean[11];
                while(numberOfDifferentDigitsChosen < 10)
                {
                    newValue += originalValue;
                    // System.out.println(newValue);
                    s = String.valueOf(newValue);
                    for(int j = 0; j < s.length(); j++)
                    {
                        if(isPreviouslyChosen[Integer.parseInt(s.substring(j, j + 1))] == false)
                        {
                            isPreviouslyChosen[Integer.parseInt(s.substring(j, j + 1))] = true;
                            numberOfDifferentDigitsChosen++;
                        }
                    }
                }
                System.out.println("Case #" + (i + 1) + ": " + newValue);
            }
        }
    }
    
}
