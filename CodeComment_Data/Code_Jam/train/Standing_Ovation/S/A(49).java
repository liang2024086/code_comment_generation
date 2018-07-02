package methodEmbedding.Standing_Ovation.S.LYD1640;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class A {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner cin = new Scanner(new File("A-small-attempt0.in"));
        PrintStream cout = new PrintStream("A-small-attempt0.out");
        // Scanner cin = new Scanner(new File("A-large-practice.in"));
        // PrintStream cout = new PrintStream("A-large-practice.out");
        //        Scanner cin = new Scanner(System.in);
        //        PrintStream cout = System.out;

        int _case = 0;
        for (int T = cin.nextInt(); T > 0; T--) {
            _case++;
            cin.next();
            char[] a = cin.next().toCharArray();
            int res = 0;
            int total = 0;
            for (int i = 0; i < a.length; i++) {
                if (total < i) {
                    res += i - total;
                    total = i;
                }
                total += a[i] - '0';
            }
            cout.printf("Case #%d: %d%n", _case, res);
        }

        cin.close();
        cout.close();
    }
}
