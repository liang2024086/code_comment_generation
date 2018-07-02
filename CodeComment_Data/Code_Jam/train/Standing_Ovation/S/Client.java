package methodEmbedding.Standing_Ovation.S.LYD570;

import java.util.Scanner;

public class Client
{
    public static void main(String []args)
    {
        int T;
        Scanner in = new Scanner(System.in);
        T = in.nextInt();
        int n = -1;
        int n_str = -1;
        int count = 0;
        int cummulative = 0;
        for(int t=0;t<T;t++)
        {
            count = 0;
            cummulative = 0;
            n = in.nextInt();
            n_str = in.nextInt();
            int n_str_copy = n_str;
            int n_array[] = new int[n+1];
            for(int i = n;i >= 0;i--)
            {
                n_array[i]  = n_str_copy % 10;
                n_str_copy = n_str_copy / 10;
            }
            for(int i=0;i<n;i++)
            {
                cummulative += n_array[i];
                /*if(n_array[i] == 0 && i ==0)
                {
                    count++;
                    cummulative++;
                }
                else if(i+1 > cummulative)
                {
                    count++;
                    cummulative++;
                }*/

                if(i+1 > cummulative)
                {
                    count++;
                    cummulative++;
                }
            }
            System.out.println("Case #"+(t+1)+": "+count);
        }
    }
}
