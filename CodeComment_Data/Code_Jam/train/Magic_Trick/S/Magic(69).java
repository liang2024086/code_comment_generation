package methodEmbedding.Magic_Trick.S.LYD1736;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rajarshee
 */
public class Magic {
    public static void main(String args[])throws IOException
    {
        BufferedReader b= new BufferedReader(new InputStreamReader(System.in));
        int i,j,k,T=Integer.parseInt(b.readLine());
        int ar1[][]=new int[4][4];
        int ar2[][]=new int[4][4];
        Scanner s;
        for(i=1;i<=T;i++)
        {
            int a1=Integer.parseInt(b.readLine());
            for(j=0;j<4;j++)
            {
                s=new Scanner(b.readLine());
                for(k=0;s.hasNextInt();k++)
                {
                    ar1[j][k]=s.nextInt();
                }
            }
            int a2=Integer.parseInt(b.readLine());
            for(j=0;j<4;j++)
            {
                s=new Scanner(b.readLine());
                for(k=0;s.hasNextInt();k++)
                {
                    ar2[j][k]=s.nextInt();
                }
            }
            
            int c=0,p=0;
            for(j=0;j<4;j++)
            {
                for(k=0;k<4;k++)
                {
                    if(ar1[a1-1][j]==ar2[a2-1][k])
                    {
                        c++;
                        p=ar1[a1-1][j];
                    }
                }
            }
            if(c==0)
                System.out.println("Case #"+i+": Volunteer cheated!");
            else if(c==1)
                System.out.println("Case #"+i+": "+p);
            else
                System.out.println("Case #"+i+": Bad magician!");
        }
    }
}
