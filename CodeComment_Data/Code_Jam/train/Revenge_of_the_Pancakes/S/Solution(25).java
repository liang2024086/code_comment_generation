package methodEmbedding.Revenge_of_the_Pancakes.S.LYD167;

import java.io.*;
import java.util.Scanner;

/**
 * Created by d6831 on 31/03/16.
 */
public class Solution {


    public static void main(String[] args) throws FileNotFoundException {

        String input = args[0];

        Scanner scanner = new Scanner(new FileInputStream(input));

        final int testCases = scanner.nextInt();

        PrintWriter out = null;

        try {
            out = new PrintWriter(new FileOutputStream(new File("/tmp/output")));

            for (int i = 1; i <= testCases; i++) {

                String p = scanner.next();

                System.out.println(p);

                int j = 0;
                while (p.indexOf("-") >= 0) {

                    char first = p.charAt(0);

                    int k = 1;

                    while (k < p.length()) {
                        if (first != p.charAt(k)) {
                            break;
                        }
                        k++;
                    }

                    if (first == '-') {
                        p = p.substring(0, k).replaceAll("\\-", "\\+") + p.substring(k);
                    } else {
                        p = p.substring(0, k).replaceAll("\\+", "\\-") + p.substring(k);
                    }

                    j++;
                }

                out.println("Case #" + i + ": " + j);
            }


        } finally {
            if (null != out) {
                out.flush();
                out.close();
            }
        }


    }
}
