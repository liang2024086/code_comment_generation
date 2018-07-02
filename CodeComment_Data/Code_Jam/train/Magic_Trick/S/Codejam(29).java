package methodEmbedding.Magic_Trick.S.LYD1762;



import java.io.*;
import java.util.Scanner;
class Codejam 
{
    public static void main(String[] args) 
    {
        int i,j,x,y;int a=0,b=0,c=0;
        int o1[][]=new int[4][4];
        int o2[][]=new int[4][4];
        Scanner in=new Scanner(System.in);
        int test;
        test=in.nextInt();
        in.nextLine();
        int ch1,ch2;
        while(test>0)
        {
            b++;
        ch1=in.nextInt();
        in.nextLine();
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                o1[i][j]=in.nextInt();
            }
            in.nextLine();
        }
        ch2=in.nextInt();
        in.nextLine();
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                o2[i][j]=in.nextInt();
            }
            in.nextLine();
        }
        for(i=0;i<4;i++)
        {
            x=o1[ch1-1][i];
            for(j=0;j<4;j++)
            {
                y=o2[ch2-1][j];
                if(x==y)
                {
                    a++;
                    c=x;
                }
            }
        }
        if(a==0)
        {
            System.out.println("Case #"+b+": Volunteer cheated!");
        }
        else if(a==1)
        {
            System.out.println("Case #"+b+": "+c);
        }
        else
        {
            System.out.println("Case #"+b+": Bad magician!");
        }
        test--;
        a=0;c=0;
        } 
    }
    
}
