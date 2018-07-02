package methodEmbedding.Magic_Trick.S.LYD968;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 *
 * @author ISURU
 */
public class Q1 {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     * @throws java.io.UnsupportedEncodingException
     */
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        PrintWriter writer = new PrintWriter("output.txt", "UTF-8");

        for (int i = 0; i < t; i++) {
            int[] arr = new int[16];
            for (int j = 0; j < 2; j++) {
                int row = s.nextInt();
                for (int k = 0; k < 4; k++) {
                    for (int l = 0; l < 4; l++) {
                        int p = s.nextInt();
                        if (k == row-1) {
                            arr[p-1]++;
                        }
                    }
                }
            }
            int count = 0;
            int num = 0;
            for (int j = 0; j < 16; j++) {
                if (arr[j] == 2) {
                    num = j;
                    count++;
                }
            }
            writer.print("Case #" + (i + 1) + ": ");
            if (count == 0) {
                writer.println("Volunteer cheated!");
            } else if (count > 1) {
                writer.println("Bad magician!");
            }
            else
                writer.println(num+1);

        }
        writer.close();
    }

}
