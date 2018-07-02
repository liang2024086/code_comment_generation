package methodEmbedding.Revenge_of_the_Pancakes.S.LYD244;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author Elizabeth
 */
public class Prob2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        for (int i = 1; i <= num; i++) {
            String l = s.next();
            int len = l.length();
           
            int count = 0;
            for (int p = 0; p < len; p++){
                char c = l.charAt(p);
                if (p == 0) {
                    if (c == '-') {
                        count = 1;
                    }
                    
                } else {
                    if ('+' == l.charAt(p-1) && c == '-') {
                        count += 2;
                    }
                }
            }
            System.out.println("Case #" + i + ": " + count);
        }
        // TODO code application logic here
    }
    
}
