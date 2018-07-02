package method_all.Consonants.S.LYD100;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.util.*;
/**
 *
 * @author Ahmad
 */
public class Main {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(new File("input.in"));
        PrintWriter out=new PrintWriter(new File("output.out"));
        int T = input.nextInt();
        String word;
        int n, count;
        char c;
        long cou;
        for (int i = 1; i <= T; i++) {
            cou = 0;
            word = input.next();
            n = input.nextInt();
            for (int j = 0; j <= word.length() - n; j++) {
                count = 0;
                for (int k = j; k < word.length(); k++) {
                    c = word.charAt(k);
                    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                        count = 0;
                        //j = k;
                    } else {
                        count++;
                    }
                    if (count >= n) {
                        cou += word.length() - k;
                        break;
                    }
                }
            }
            out.printf("Case #%d: %d\n", i, cou);
        }
        out.close();
    }
}
