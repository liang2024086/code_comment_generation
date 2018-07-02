package methodEmbedding.Revenge_of_the_Pancakes.S.LYD909;

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class B {
    public static void main(String[] args) throws Exception {
//        InputStream in = System.in;
        InputStream in = new FileInputStream("/home/floris/Downloads/B-small-attempt0.in");
        System.setOut(new PrintStream("/home/floris/dev/java/Codejam2016/src/B.out"));
        Scanner sc = new Scanner(in);
        sc.useDelimiter(Pattern.compile("[\n /]"));

        for (int c = 1, cases = sc.nextInt(); c <= cases; c++) {
            String s = sc.next();
            int f = 0;

            boolean r = false;
            for (int i = s.length() - 1; i >=0; i--) {
                if (s.charAt(i) == '-' != r) {
                    f++;
                    r = !r;
                }
            }
            System.out.printf("Case #%d: %d%n", c, f);
        }
    }
}
