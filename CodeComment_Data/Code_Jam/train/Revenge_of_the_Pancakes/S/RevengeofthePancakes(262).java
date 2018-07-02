package methodEmbedding.Revenge_of_the_Pancakes.S.LYD937;

import java.util.Scanner;

/**
 * Created by Dell on 09-04-2016.
 */
public class RevengeofthePancakes {
    public static void main(String[] args) {
        // write your code here
        int n,t,i,j,x,l;
        int k;
        //long a,m,z;
        String s = null;
        char c;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        for (i=1; i<=t; i++)
        {
            s = sc.next();
            l = s.length();
            n = 0;
            /*for (j=l-1; j>=0; j--)
            {
                if (s.charAt(j) == '-')
                    break;
            }*/
            for (k=0; k<l; )
            {
                c = s.charAt(k);
                k++;
                while (k<l)
                {
                    if(c == s.charAt(k))
                    {
                        k++;
                    }
                    else
                    {
                        n++;
                        break;
                    }
                }
            }
            if (s.charAt(l-1) == '-')
            {
                n++;
            }
            System.out.println("Case #" + i + ": "+n);
        }
    }
}
