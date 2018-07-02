package methodEmbedding.Standing_Ovation.S.LYD1371;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("A-small-attempt0.in"));
        PrintWriter writer = new PrintWriter("out.txt");
        int tests = sc.nextInt();
        for (int i = 0; i < tests; i++) {
            int n = sc.nextInt();
            String s = sc.next();
            int all = 0;
            int friends = 0;
            for (int j = 0; j <= n; j++) {
                int count = s.charAt(j) - '0';
                if (count > 0 && all < j) {
                    friends += (j - all);
                    all = j;
                }
                all += count;
            }
            writer.println("Case #" + (i + 1) + ": " + friends);
        }
        sc.close();
        writer.close();
    }
}
