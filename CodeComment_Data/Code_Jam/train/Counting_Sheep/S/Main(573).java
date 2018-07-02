package methodEmbedding.Counting_Sheep.S.LYD1510;

import java.io.BufferedInputStream;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by ?????? on 09.04.2016.
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        int nCases = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < nCases; i++)
        {
            long n = sc.nextInt();
            System.out.print("Case #" + String.valueOf(i + 1) + ": ");
            if (n == 0)
            {
                System.out.println("INSOMNIA");
                continue;
            }
            int mult = 0;
            HashSet<String> seen = new HashSet<String>();
            while (seen.size() != 10)
            {
                mult++;
                String[] ss = String.valueOf(n * mult).split("");
                for (String se : ss)
                {
                    seen.add(se);
                }
            }
            System.out.println(mult * n);
        }
    }
}
