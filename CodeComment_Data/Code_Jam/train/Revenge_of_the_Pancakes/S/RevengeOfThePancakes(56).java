package methodEmbedding.Revenge_of_the_Pancakes.S.LYD223;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RevengeOfThePancakes {

    public static void main(String[] args) throws FileNotFoundException {
    Scanner cin = new Scanner(new File("B-small-attempt0.in"));
    PrintStream cout = new PrintStream("B-small-attempt0.out");
        //		Scanner cin = new Scanner(new File("A-large-practice.in"));
        //		PrintStream cout = new PrintStream("A-large-practice.out");
//        Scanner cin = new Scanner(System.in);
//        PrintStream cout = System.out;

        int _case = 0;
        for (int T = cin.nextInt(); T > 0; T--) {
            _case++;
            StringBuilder ans = new StringBuilder();

            String s = cin.next();
            int[] a = new int[s.length()];
            for (int i = 0; i < a.length; i++) a[i] = s.charAt(i) == '-' ? 0 : 1;
            int cnt = 0;
            for (int i = a.length - 1; i >= 0; i--) {
                if ((cnt + a[i]) % 2 == 0) {
                    cnt++;
                }

            }
            ans.append(cnt);

            cout.printf("Case #%d: %s%n", _case, ans.toString());
        }

        cin.close();
        cout.close();
    }
}
