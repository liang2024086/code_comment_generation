package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1042;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author user
 */
public class RevengePancakes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //variable initialization

        String strLine, output;

//Read in a file and process one line at a time
        FileReader singleFile = new FileReader("E:\\GoogleCodeJam\\input2.txt");
        BufferedReader reader = new BufferedReader(singleFile);
        FileWriter outFile = new FileWriter("E:\\GoogleCodeJam\\output2.txt");
        BufferedWriter writer = new BufferedWriter(outFile);

        strLine = reader.readLine();
        System.out.println("Input" + strLine);

        int count = Integer.parseInt(strLine);
        int noOfFlips;

        for (int j = 1; j <= count; j++) {
            noOfFlips = 0;
            strLine = reader.readLine();
            //System.out.println("Input" + strLine);
            char[] charArray = strLine.toCharArray();
            int length = charArray.length;
            if (length == 1 && charArray[0] == '-') {
                charArray[0] = '+';
                noOfFlips = 1;
            }
            int change = 1;
            for (; change < length; change++) {
                if (charArray[change] != charArray[change - 1]) {
                    for (int flip = 0; flip < change; flip++) {
                        charArray[flip] = charArray[change];
                    }

                    noOfFlips++;
                    //System.out.println("Change: " + change + " no. " + noOfFlips);
                }
            }

            if (charArray[length - 1] == '-') {
                noOfFlips++;
            }

            output = "Case #" + j + ": " + noOfFlips;
            System.out.println(output);
            writer.write(output);
            writer.newLine();
            writer.flush();
        }

        writer.close();
    }

}
