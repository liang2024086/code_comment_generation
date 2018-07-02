package methodEmbedding.Counting_Sheep.S.LYD1443;

import java.util.*;

public class code
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 1; i <= T; i++)
        {
            int N = sc.nextInt();
            if(N == 0)
            {
                System.out.println("Case #" + i + ": INSOMNIA");
                continue;
            }
            boolean negative = false;
            if(N < 0)
            {
                negative = true;
            }
            boolean[] check = new boolean[10];
            for(int j = 0; j < 10; j++)
            {
                check[j] = false;
            }
            int count = 0;
            int copy = N;
            int current = 0;
            while(count < 10)
            {
                N = current + copy;
                current = N;
                while(N > 0)
                {
                    if (!check[N % 10])
                    {
                        check[N % 10] = true;
                        count++;
                    }
                    N /= 10;
                }
            }
            if(negative)
            {
                current = -current;
            }
            System.out.println("Case #" + i + ": " + current);
        }
    }
}
