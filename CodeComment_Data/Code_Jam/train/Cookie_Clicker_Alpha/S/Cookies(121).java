package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1421;

class Cookies
{
    public static void main(String args[])throws java.io.IOException
    {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        int T=sc.nextInt();
        for(int b=1;b<=T;b++)
        {
            System.out.print("Case #"+b+": ");
            double c=sc.nextDouble();
            double f=sc.nextDouble();
            double x=sc.nextDouble();
            double r=2.0;
            double t=0;
            
                while((x/r)>((c/r)+(x)/(r+f)))
                {
                    t=t+(c/r);
                    r=r+f;
                    
                }
                t=t+x/r;
            
            System.out.printf("%.7f\n",t);
            
            
            
        }
    }
}
