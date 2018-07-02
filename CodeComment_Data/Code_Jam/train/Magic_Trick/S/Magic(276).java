package methodEmbedding.Magic_Trick.S.LYD1707;

class Magic
{
    public static void main(String args[])throws java.io.IOException
    {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        int T=sc.nextInt();
        for(int b=1;b<=T;b++)
        {
            System.out.print("Case #"+b+": ");
            int x=sc.nextInt()-1;
            int arr[]=new int[4];
            for(int i=0;i<4;i++)
            {
                for(int j=0;j<4;j++)
                {
                    if(i==x)
                        arr[j]=sc.nextInt();
                    else
                        sc.nextInt();
                }
            }
            int y=sc.nextInt()-1;
            int v=0,c=0;
            for(int i=0;i<4;i++)
            {
                for(int j=0;j<4;j++)
                {
                    if(i==y)
                    {
                        int g=sc.nextInt();
                        for(int k=0;k<4;k++)
                            if(g==arr[k])
                            {
                                c++;
                                v=g;
                            }
                    }
                    else
                        sc.nextInt();
                }
            }
            if(c==1)
                System.out.println(v);
            else if(c==0)
                System.out.println("Volunteer cheated!");
            else
                System.out.println("Bad magician!");
        }
    }
}
