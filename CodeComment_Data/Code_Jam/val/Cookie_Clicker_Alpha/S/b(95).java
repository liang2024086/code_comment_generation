package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1039;

import java.util.*;

class b{

    public static void main(String[] args){
            Scanner x =new Scanner(System.in);
            int t0=x.nextInt();
            for(int i=0;i<t0;i++)
            {
            double s=2;
            double c0=x.nextDouble();
            double f0=x.nextDouble();
            double x0=x.nextDouble();

            double t=0;
            double t1,t2;

            t1=x0/s;
            t2=c0/s+x0/(s+f0);

            while(t1>t2)
            {
                t+=c0/s;
                s+=f0;
                t1=x0/s;
                t2=c0/s+x0/(s+f0);
            }

            t+=t1;

            System.out.printf("Case #%d: %.7f\n",i+1,t);
            }
    }
}
