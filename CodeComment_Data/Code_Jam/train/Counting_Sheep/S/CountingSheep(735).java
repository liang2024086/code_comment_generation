package methodEmbedding.Counting_Sheep.S.LYD1153;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 *
 * @author saikat
 */
public class CountingSheep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, IOException {
        // TODO code application logic here
        int a[] = new int[101];
        Scanner scanner = new Scanner(System.in);
        FileReader in = new FileReader("/home/saikat/Downloads/A-small-attempt2.in");
        BufferedReader br = new BufferedReader(in);
        PrintWriter writer = new PrintWriter("output.txt", "UTF-8");
        int i=0 ;
        int c;
        String line = null;
        while( (line = br.readLine()) != null){
            
            a[i] = Integer.parseInt(line);
           // System.out.println(a[i]);
            i++;
        }
            
        int T = a[0];
        for ( i = 1; i <= T; i++) {
            int N = a[i];
            //while ((N = in.read()) != -1) {
                //int N = in.read();
              //  System.out.println(N);
                int[] count = new int[10];

                long number = N;
                int test = 0;

                int j = 0;
                boolean flag = false;
                long back;
                while (true) {
                    number = N * (++j);
                    back = number;

                    if (N == 0) {
                        break;
                    }
                    while (number != 0) {

                        int index = (int) (number % 10);
                        //System.err.println(index + " " + N);
                        if (count[index] == 0) {
                         //   System.err.println(index + " " + N);
                            count[index] = 1;
                        }

                        test = (byte) count[0] & (byte) count[1] & (byte) count[2] & (byte) count[3] & (byte) count[4] & (byte) count[5] & (byte) count[6] & (byte) count[7] & (byte) count[8] & (byte) count[9];

                        if (test == 1) {
                            flag = true;
                            break;
                        }

                        number = number / 10;
                    }
                    if (flag == true) {
                        break;
                    }

                }
                String output = "";
                if (N == 0) {
                    output = "Case #" + i + ": " + "INSOMNIA";
                } //System.out.println("Case# " + i + ": " + "INSOMNIA");
                else {
                    output = "Case #" + i + ": " + back;
                }
                //System.out.println("Case# " + i + ": " + back);

                writer.println(output);
            }

            writer.close();
        }
   // }
}
