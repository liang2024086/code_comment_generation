package methodEmbedding.Magic_Trick.S.LYD1121;

import java.util.*;

public class A
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        for(int ca=1;ca <= T;ca++)
        {
            boolean[] a = new boolean[16];
            int k = scan.nextInt()-1;
            for(int i=0;i < 4;i++)
            for(int j=0;j < 4;j++)
            {
                int n = scan.nextInt();
                if(i != k)
                    a[n-1] = true;
            }
            k = scan.nextInt()-1;
            for(int i=0;i < 4;i++)
            for(int j=0;j < 4;j++)
            {
                int n = scan.nextInt();
                if(i != k)
                    a[n-1] = true;
            }

            int ans = -1;
            int count = 0;
            for(int i=0;i < 16;i++)
                if(!a[i])
                {
                    count++;
                    ans = i+1;
                }
            
            System.out.print("Case #" + ca + ": ");
            if(count == 0)
                System.out.println("Volunteer cheated!");
            else if(count == 1)
                System.out.println(ans);
            else
                System.out.println("Bad magician!");
        }
    }
}
