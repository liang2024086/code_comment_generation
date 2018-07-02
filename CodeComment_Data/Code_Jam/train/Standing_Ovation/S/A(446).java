package methodEmbedding.Standing_Ovation.S.LYD2013;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by Ren? on 1-4-2015.
 */
public class A {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("a.in"));
        PrintWriter pw = new PrintWriter("a.out");

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            int sMax = sc.nextInt();
            String shyness = sc.next();

            int friends = 0;
            int clapping = 0;

            for (int j = 0; j <= sMax; j++) {

                if (clapping < j) {
                    friends = Math.max(friends, j - clapping);
                }

                clapping += shyness.charAt(j) - 48;

            }

            pw.printf("Case #%d: %d\n", i + 1, friends);

        }

        pw.close();
        sc.close();

    }

}
