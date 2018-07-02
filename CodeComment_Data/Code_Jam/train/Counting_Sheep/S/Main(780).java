package methodEmbedding.Counting_Sheep.S.LYD428;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int T = in.nextInt();
        for (int num = 1; num <= T; ++num)
        {
            int N = in.nextInt();

            if (N == 2 * N)
            {
                System.out.println("Case #" + num + ": " + INSOMNIA);
                continue;
            }

            int mask = (1<<10) - 1;
            int i = 1;
            int last;
            do
            {
                last = i++ * N;
                while (last != 0)
                {
                    mask &= ~ (1 << (last % 10));
                    last /= 10;
                }
            }
            while (mask != 0);
            System.out.println("Case #" + num + ": " + N * (i - 1));
        }
    }

    private static final String INSOMNIA = "INSOMNIA";
}
