package methodEmbedding.Magic_Trick.S.LYD139;


public class Magic {
        
    public static void main(String[] args) {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        int n =sc.nextInt();
        int a[][][]=new int[4][4][n];
        int b[][][]=new int[4][4][n];
        int line1[]=new int[n];
        int line2[]=new int[n];
        int count=0;
        int res=0;
        for(int k=0;k<n;k++)
        {
            line1[k]=sc.nextInt();
            for(int i=0;i<4;i++)
            {
                for(int j=0;j<4;j++)
                {
                    a[i][j][k]=sc.nextInt();
                }
            }
            line2[k]=sc.nextInt();
            for(int i=0;i<4;i++)
            {   
                for(int j=0;j<4;j++)
                {
                    b[i][j][k]=sc.nextInt();
                }
            }
        }
        
        for(int k=0;k<n;k++)
        {
                int m=k+1;
                for(int j=0;j<4;j++)
                {
                    int row1=line1[k]-1;
                    int row2=line2[k]-1;
                    for(int l=0;l<4;l++)
                    {
                        if(a[row1][j][k]==b[row2][l][k])
                        {
                            res=a[row1][j][k];
                            count++;
                        }
                    }
                }
                if(count==0)
                {
                    System.out.print("Case #"+m+": ");
                    System.out.println("Volunteer cheated!");
                }
                else if(count==1)
                {
                    System.out.print("Case #"+m+": ");
                    System.out.println(res);
                    count=0;
                }
                else
                {
                    System.out.print("Case #"+m+": ");
                    System.out.println("Bad magician!");
                    count=0;
                }
            }
            }
}
