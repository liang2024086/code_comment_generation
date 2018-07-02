package methodEmbedding.Magic_Trick.S.LYD270;

import java.io.*;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by ?????????????? on 12.04.2014.
 */
public class A {
    public static void main(String[] args) throws IOException
    {
        int n,a,t;
        HashSet<Integer> s1 = new HashSet<Integer>(4);
        HashSet<Integer> s2 = new HashSet<Integer>(4);
        Scanner input = new Scanner(new FileInputStream(new File("input.txt")));
        PrintWriter out = new PrintWriter(new File("output.txt").getAbsoluteFile());
        n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            a = input.nextInt();
            for (int j = 1; j <= 4; j++)
                for (int k = 1; k <= 4; k++) {
                    t = input.nextInt();
                    if (a == j)
                        s1.add(t);
                }
            a = input.nextInt();
            for (int j = 1; j <= 4; j++)
                for (int k = 1; k <= 4; k++) {
                    t = input.nextInt();
                    if (a == j)
                        s2.add(t);
                }
            int k = 0, r = 0;
            for (Integer j : s1) {
                if (s2.contains(j))
                {
                    k++;
                    if (k == 1) r = j;
                }
            }
            switch (k)
            {
                case 0 : out.write("Case #" + i + ": Volunteer cheated!\n"); break;
                case 1 : out.write("Case #" + i + ": " + r + '\n'); break;
                default : out.write("Case #" + i + ": Bad magician!" + '\n');
            }
            s1.clear();
            s2.clear();
        }
        out.close();
    }
}
