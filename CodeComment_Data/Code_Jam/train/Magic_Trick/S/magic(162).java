package methodEmbedding.Magic_Trick.S.LYD1354;

import java.io.*;
import java.util.Scanner;
class magic
{
    public static void main(String[]args)throws IOException
    {
        File file=new File("A-small-attempt2.in");
        Scanner obj=new Scanner(file);
        int i,j,k=0,n=0,x,y,p,q,h;
        int c[]=new int[4];
        int a[][]=new int[4][4];
        int b[][]=new int[4][4];
        int t=obj.nextInt();
        for(h=0;h<t;h++)
        {
            x=obj.nextInt();
            for(p=0;p<4;p++)
            {
                for(q=0;q<4;q++)
                {
                    a[p][q]=obj.nextInt();
                }
            }
            y=obj.nextInt();
            for(p=0;p<4;p++)
            {
                for(q=0;q<4;q++)
                {
                    b[p][q]=obj.nextInt();
                }
            }
            k=0;
            for(i=0;i<4;i++)
                c[i]=a[x-1][i];
            for(i=0;i<4;i++)
            {
                for(j=0;j<4;j++)
                {
                    if(c[i]==b[y-1][j])
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
