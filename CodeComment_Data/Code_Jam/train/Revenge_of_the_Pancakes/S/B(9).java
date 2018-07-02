package methodEmbedding.Revenge_of_the_Pancakes.S.LYD540;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class B {

    public static void main(String[] args) throws Exception {
        //String fileName = "B-large";
        String fileName = "B-small-attempt0";
        Scanner in = new Scanner(new FileInputStream("/Users/amer/Downloads/" + fileName + ".in"));
        PrintStream out = new PrintStream(new FileOutputStream("/Users/amer/Downloads/" + fileName + ".out"));
        //PrintStream out = System.out;
        //Scanner in = new Scanner(System.in);

        int T = Integer.parseInt(in.nextLine());
        for (int t = 0; t < T; t++) {
            char[] s = in.nextLine().toCharArray();
            int c = 0;
            for (int i = 1; i < s.length; i++)
                c += s[i - 1] == s[i] ? 0 : 1;
            c += s[s.length - 1] == '-' ? 1 : 0;
            out.println("Case #" + (t + 1) + ": " + c);
        }

    }

}
