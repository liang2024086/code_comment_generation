package methodEmbedding.Counting_Sheep.S.LYD56;

import java.util.Scanner;

/**
 * Created by Dell on 09-04-2016.
 */
public class CountingSheep {
    public static void main(String[] args) {
        // write your code here
        int n,t,i,j,x,m,z;
        boolean a[];
        int c;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        outer: for (i=1; i<=t; i++)
        {
            c = 0;
            n = sc.nextInt();
            a = new boolean[10];
            if (n == 0)
            {
                System.out.println("CASE #"+i+": INSOMNIA");
                continue ;
            }
            x=n;
            while (x>0)
            {
                m = x % 10;
                if (!a[m])
                {
                    a[m]=true;
                    c++;
                    if ( c>=10 )
                    {
                        System.out.println("CASE #"+i+": "+n);
                        continue outer;
                    }
                }
                x/=10;
            }

            for (j=2; true; j++)
            {
                x=n*j;
                z=x;
                while (x>0)
                {
                    m = x % 10;
                    if (!a[m])
                    {
                        a[m]=true;
                        c++;
                        if ( c>=10 )
                        {
                            System.out.println("CASE #"+i+": "+z);
                            continue outer;
                        }
                    }
                    x/=10;
                }
                //System.out.println("check");
            }
            //System.out.println(x);
        }
    }
}
