package methodEmbedding.Speaking_in_Tongues.S.LYD127;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author clary35
 */
public class Jam1 {

    char[] alpha = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    char[] map = new char[26];

    Jam1() {
        String code1 = "zqejp mysljylc kd kxveddknmc re jsicpdrysi";
        String code2 = "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd";
        String code3 = "de kr kd eoya kw aej tysr re ujdr lkgc jv";

        String ans1 = "qzour language is impossible to understand";
        String ans2 = "there are twenty six factorial possibilities";
        String ans3 = "so it is okay if you want to just give up";

        for (int i = 0; i < code1.length(); i++) {
            if (code1.charAt(i) != ' ') {
                int cc = code1.charAt(i) - 97;
                int ca = ans1.charAt(i) - 97;
                map[cc] = alpha[ca];
            }
        }
        for (int i = 0; i < code2.length(); i++) {
            if (code2.charAt(i) != ' ') {
                int cc = code2.charAt(i) - 97;
                int ca = ans2.charAt(i) - 97;
                map[cc] = alpha[ca];
            }
        }
        for (int i = 0; i < code3.length(); i++) {
            if (code3.charAt(i) != ' ') {
                int cc = code3.charAt(i) - 97;
                int ca = ans3.charAt(i) - 97;
                map[cc] = alpha[ca];
            }
        }

//        System.out.println(map.length);
//        System.out.println(alpha);
//        System.out.println(map);


        // test
/*
        for (int i = 0; i < code3.length(); i++) {
            if (code3.charAt(i) != ' ') {
                System.out.print(map[code3.charAt(i) - 97]);
            } else {
                System.out.print(" ");
            }
        }
*/

        System.out.println("Input:");
        Scanner scan = new Scanner(System.in);
        String T = scan.nextLine();
        int cases = Integer.parseInt(T);
        for (int i = 0; i < cases; i++) {
            String thecase = scan.nextLine();
            System.out.print("Case #"+(i+1)+": ");
            for (int j = 0; j < thecase.length(); j++) {
                if (thecase.charAt(j) != ' ') {
                    System.out.print(map[thecase.charAt(j) - 97]);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Jam1 jm = new Jam1();
    }
}
