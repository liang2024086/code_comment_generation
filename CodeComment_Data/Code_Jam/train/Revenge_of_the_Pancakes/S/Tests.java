package methodEmbedding.Revenge_of_the_Pancakes.S.LYD132;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author selmi
 */
public class Tests {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int test = read.nextInt();
        read.nextLine();
        for (int i = 0; i < test; i++) {

            String str = read.nextLine();
            int c = 0;
            for (int j = 1; j < str.length(); j++) {
                if (str.charAt(j) != str.charAt(j - 1)) {
                    c++;
                }
            }
            if (str.charAt(str.length() - 1) == '-') {
                c++;
            }
            System.out.println("Case #" + (i + 1) + ": " + c);
        }
    }
}
