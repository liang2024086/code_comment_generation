package methodEmbedding.Revenge_of_the_Pancakes.S.LYD456;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Created by Euhenio on 09.04.2016.
 */
public class ProblemB2 {

    public static void main(String[] args) {
        try {
            System.setIn(new FileInputStream(new File("inB.in")));
            System.setOut(new PrintStream(new File("outB.out")));

            Scanner in = new Scanner(System.in);
            long t = in.nextLong();
            in.nextLine();
            for (int i = 0; i < t; i++) {
                String s = in.nextLine();
                int count = 0;
                for (int j = 1; j < s.length(); j++) {
                    if (s.charAt(j - 1) != s.charAt(j)) {
                        count++;
                    }
                }
                if (s.charAt(s.length() - 1) == '-') {
                    count++;
                }
                System.out.println(String.format("Case #%d: %d", i + 1, count));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
