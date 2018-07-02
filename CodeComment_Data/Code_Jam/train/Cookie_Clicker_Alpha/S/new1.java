package methodEmbedding.Cookie_Clicker_Alpha.S.LYD962;

import java.util.*;
public class new1 {
    public static void main(String args[])
    {
        Scanner q=new Scanner(System.in);
        double f,c,x,r=0,p;
        int l,t,a,b,d,n;
        t=q.nextInt();
        for(l=1;l<=t;l++)
        {
            c=q.nextDouble();
            f=q.nextDouble();
            x=q.nextDouble();
            r=2.0;
            p=0.0;
            while(true)
            {
                if(((c/r)+(x/(r+f)))<(x/r))
                {
                    p+=(c/r);
                    r+=f;
                }
                else
                {
                    p+=(x/r);
                    break;
                }
            }
            //System.out.printf("%.7f",r);
            //System.out.println();
            System.out.print("Case #"+l+": ");
            System.out.printf("%.7f",p);
            System.out.println();
        }
    }
}
