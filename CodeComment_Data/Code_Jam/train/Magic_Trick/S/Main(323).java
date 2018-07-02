package methodEmbedding.Magic_Trick.S.LYD299;

import java.util.Scanner;
import java.io.*;
public class Main
{
    public static void main(String args[])throws IOException
    {
        File abc = new File("F:/A-small-attempt1.in");
        Scanner in = new Scanner(abc);
        int t = in.nextInt();
        int arr[][]=new int[4][4];
        String s[]=new String[t];
        int a[]=new int[4];
        int i,j,k,x,y=0;
        for(i=0;i<t;i++)
        {
            x = in.nextInt();
            for(j=0;j<4;j++)
            {
                for(k=0;k<4;k++)
                {
                    arr[j][k]=in.nextInt();
                }
            }
            for(j=0;j<4;j++)
            {
                a[j]=arr[x-1][j];
            }
            x = in.nextInt();
            for(j=0;j<4;j++)
            {
                for(k=0;k<4;k++)
                {
                    arr[j][k]=in.nextInt();
                }
            }
            int c=0;
            for(j=0;j<4;j++)
            {                
                for(k=0;k<4;k++)
                {
                    if(a[j]==arr[x-1][k])
                    {
                        c++;
                        y=a[j];
                    }   
                }
            }
            if(c==1)
            s[i]=y+"";
            else if(c==0)
            s[i]="Volunteer cheated!";
            else
            s[i]="Bad Magician!";       
        }  
        for(i=0;i<t;i++)
        System.out.println("Case #"+(i+1)+": "+s[i]);
    }
}    
               
