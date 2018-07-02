package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1370;

public class Cookie {

    static int j;
    static double tc;
    public static void main(String[] args) {
        int t,i=0;
        double c[],f[],x[],a,b,tx[],tt[],n;
        Scanner sc= new Scanner(System.in);
        t=sc.nextInt();
        c = new double[t];
        f = new double[t];
        x = new double[t];
        tt = new double[t];
        while(i<t)
        {
            j=1;
            n=2.0;
            tc=0.0;
            c[i]=sc.nextDouble();
            f[i]=sc.nextDouble();
            x[i]=sc.nextDouble();
            tx = new double[(int)(x[i]+10)];
            tx[0]=x[i];
            do
            {
                a=c[i]/n;
                b=x[i]/n;
                tx[j]=tc+b;
                tc+=a;
                n+=f[i];
                j++;
                System.out.println(tx[j-1]);
            }while(tx[j-1]<tx[j-2]);
            tt[i]=tx[j-2];
            i++;
        }
        for(i=0;i<t;i++)
        {
             System.out.println("Case #"+(i+1)+": "+(tt[i]));
        }    
    }
    
}
