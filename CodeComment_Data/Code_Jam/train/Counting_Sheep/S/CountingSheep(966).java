package methodEmbedding.Counting_Sheep.S.LYD523;

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
public class CountingSheep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //variable initialization

        String strLine, output;

//Read in a file and process one line at a time
        FileReader singleFile = new FileReader("E:\\GoogleCodeJam\\input1.txt");
        BufferedReader reader = new BufferedReader(singleFile);
        FileWriter outFile = new FileWriter("E:\\GoogleCodeJam\\output1.txt");
        BufferedWriter writer = new BufferedWriter(outFile);
        boolean digits[] = new boolean[10];

        strLine = reader.readLine();
        System.out.println("Input" + strLine);
        
        int count = Integer.parseInt(strLine);
        int number, next;
        boolean alldigits = Boolean.TRUE;

        char Str2;

        for (int j = 1; j <= count; j++) {
            next = 2;
            for (int k = 0; k < 10; k++) {
                digits[k] = Boolean.FALSE;
            }

            strLine = reader.readLine();
            System.out.println("Input" + strLine);
            number = Integer.parseInt(strLine);
            System.out.println("Input" + number);
            
            if (number == 0) {
                output = "Case #" + j + ": INSOMNIA\n";
                
                //System.out.println(output);
                writer.write(output);
                writer.newLine();
                writer.flush();
                continue;
            }

            while (Boolean.TRUE) {

                for (int l = 0; l < strLine.length(); l++) {
                    Str2 = strLine.charAt(l);

                    switch (Str2) {
                        case '0':
                            digits[0] = Boolean.TRUE;
                            break;
                        case '1':
                            digits[1] = Boolean.TRUE;
                            break;
                        case '2':
                            digits[2] = Boolean.TRUE;
                            break;
                        case '3':
                            digits[3] = Boolean.TRUE;
                            break;
                        case '4':
                            digits[4] = Boolean.TRUE;
                            break;
                        case '5':
                            digits[5] = Boolean.TRUE;
                            break;
                        case '6':
                            digits[6] = Boolean.TRUE;
                            break;
                        case '7':
                            digits[7] = Boolean.TRUE;
                            break;
                        case '8':
                            digits[8] = Boolean.TRUE;
                            break;
                        case '9':
                            digits[9] = Boolean.TRUE;
                            break;

                    }
                }
                alldigits = Boolean.TRUE;
                for (int m = 0; m < 10; m++) {
                    if (digits[m] == Boolean.FALSE) {
                        alldigits = Boolean.FALSE;
                        break;
                    }
                }
                if (alldigits == Boolean.TRUE) {
                    output = "Case #" + j + ": " + Integer.parseInt(strLine);
                    System.out.println(output);
                    writer.write(output);
                    writer.newLine();
                    writer.flush();
                    break;
                } else {
                    int temp = next * number;
                    System.out.println(temp);
                    strLine = "" + temp;
                    next++;
                }
            }
        }
        
        writer.close();
    }
}
