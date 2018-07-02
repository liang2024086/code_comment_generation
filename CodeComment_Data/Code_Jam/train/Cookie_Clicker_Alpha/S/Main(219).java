package methodEmbedding.Cookie_Clicker_Alpha.S.LYD973;

import java.util.Scanner;
public class Main {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int t1=in.nextInt();
        for (int i=0; i<t1; i++)
        {
            double C,F,X;
            C=in.nextDouble();
            F=in.nextDouble();
            X=in.nextDouble();
            if (C>=X)
            {
                System.out.printf("Case #%d: %.7f",i+1,X/2);
                System.out.println();
            }
            else
            {
                double a=C; double b=F; double c=X;
                double k=2.0;
                double t=0.0;
                while(c/k>((a/k)+c/(k+b)))
                {
                    //cout<<a/k<<endl;
                    //float rr=("%.7f",(a/k));
                    t+=a/k;
                    k+=b;
                }
                //double kk=("%.7f",c/k);
                //printf("%f",kk);
                t+=c/k;
                System.out.printf("Case #%d: %.7f",i+1,t);
                System.out.println();
            }
        }
    }
}
