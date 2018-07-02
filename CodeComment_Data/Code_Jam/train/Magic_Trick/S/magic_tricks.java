package methodEmbedding.Magic_Trick.S.LYD709;

import java.io.*;
import java.util.Scanner;
class magic_tricks
{
    public static void main(String[]args)throws IOException
    {
        File file=new File("A-small-attempt1.in");
        Scanner obj=new Scanner(file);
        int i,j,k=0,n=0,x1,y1,p,q,h;
        int c[]=new int[4];
        int a[][]=new int[4][4];
        int b[][]=new int[4][4];
        int t=obj.nextInt();
        for(h=0;h<t;h++)
        {
            x1=obj.nextInt();
            for(i=0;i<4;i++)
            {
                for(j=0;j<4;j++)
                {
                    a[i][j]=obj.nextInt();
                }
            }
            y1=obj.nextInt();
            for(i=0;i<4;i++)
            {
                for(j=0;j<4;j++)
                {
                    b[i][j]=obj.nextInt();
                }
            }
            k=0;
            for(i=0;i<4;i++)
                c[i]=a[x1-1][i];
            for(i=0;i<4;i++)
            {
                for(j=0;j<4;j++)
                {
                    if(c[i]==b[y1-1][j])
                    {
                        n=c[i];
                        k++;
                    }
                }
            }
            if(k==0)
                System.out.println("Case #"+(h+1)+": Volunteer cheated!");
            else if(k==1)
                   System.out.println("Case #"+(h+1)+": "+n);
                 else
                   System.out.println("Case #"+(h+1)+": Bad magician!");
        }
    }
}
