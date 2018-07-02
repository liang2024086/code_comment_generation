package methodEmbedding.Magic_Trick.S.LYD562;

import java.util.*;
public class Puzzle
{
    static int d[],f[];
    public static void main(String[] args) 
    {
        int t,i,j,k,a,b;
        int x[][]= new int[4][4];
        int y[][]=new int[4][4];       
        Scanner sc= new Scanner(System.in);
        t=sc.nextInt();
        d=new int[t];
        f=new int[t];
        for(i=0;i<t;i++)
        {
            
            a=sc.nextInt();
            a--;
            for(j=0;j<4;j++)
            {
                for(k=0;k<4;k++)
                {
                    x[j][k]=sc.nextInt();
                }
                System.out.println();
            }
            b=sc.nextInt();
            b--;
            for(j=0;j<4;j++)
            {
                for(k=0;k<4;k++)
                {
                    y[j][k]=sc.nextInt();
                }
                System.out.println();
            }
            for(j=0;j<4;j++)
            {
                for(k=0;k<4;k++)
                {
                    if(x[a][j]==y[b][k])
                    {
                        f[i]++;
                        d[i]=x[a][j];
                    }
                }   
            }
            
        }
        for(i=0;i<t;i++)
        {
            if(f[i]==0)
                System.out.println("Case #"+(i+1)+": Volunteer cheated!");
            if(f[i]==1)
                System.out.println("Case #"+(i+1)+": "+d[i]);
            if(f[i]>1)
                System.out.println("Case #"+(i+1)+": Bad magician!");
        }
    }  
}
