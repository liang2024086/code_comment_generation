package methodEmbedding.Standing_Ovation.S.LYD872;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;


public class A {

    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream(new File("A_small.in")));
        System.setOut(new PrintStream(new FileOutputStream(new File("A_small2.out"))));
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for ( int i = 0 ;i < t; i++ ) {
            int smax = in.nextInt();
            int[] s = new int[smax+1];
            String sstr = in.next();
            for (int j = 0; j < smax + 1; j++ ) {
                s[j] = (int)(sstr.charAt(j) - '0');
            }
            int add = 0;
            int total = 0;
            for (int j = 0; j < s.length; j++) {
                if (total < j) {
                    add += (j-total);
                    total += (j-total);
                }
                total += s[j];
            }
            System.out.printf("Case #%d: %d", i+1, add);
            System.out.println();
        }
    }
}
