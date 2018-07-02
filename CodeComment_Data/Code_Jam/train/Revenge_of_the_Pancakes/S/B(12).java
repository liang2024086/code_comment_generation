package methodEmbedding.Revenge_of_the_Pancakes.S.LYD999;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class B {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(new File(args[0]));
        PrintWriter output = new PrintWriter("B-small.txt");

        int T = console.nextInt();
        for (int i = 1; i <= T; i++) {
            String S = console.next();
            int flips = (S.charAt(S.length() - 1) == '+' ? 0 : 1);
            for (int j = 1; j < S.length(); j++) {
                if (S.charAt(j) != S.charAt(j-1)) {
                    flips++;
                }
            }
            output.println("Case #" + i + ": " + flips);
            System.out.println("Case #" + i + ": " + flips);
        }
        console.close();
        output.close();
    }
}
