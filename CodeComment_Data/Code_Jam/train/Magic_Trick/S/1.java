package methodEmbedding.Magic_Trick.S.LYD393;

import java.io.*;
public class JavaApplication7 
{
    public static void main(String[] args) 
    {
        try
        {
            BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
            int t=Integer.parseInt(br.readLine());
            for(int i1=0;i1<t;i1++)
            {
            int count=0;
            String a[] = new String[4];
            int a1[][] = new int[4][4];
            int b1[][] = new int[4][4];
            int n=Integer.parseInt(br.readLine());
            for(int j=0;j<4;j++)
            {
              String s=br.readLine();
                a=s.split(" ");
                for(int i=0;i<4;i++)
                {
                    a1[j][i]=Integer.parseInt(a[i]);
                }   
            }
            int n1=Integer.parseInt(br.readLine());
            for(int j=0;j<4;j++)
            {
              String s=br.readLine();
                a=s.split(" ");
                for(int i=0;i<4;i++)
                {
                    b1[j][i]=Integer.parseInt(a[i]);
                }   
            }
            int temp=0;
            for(int i=0;i<4;i++)
            {
                
                if(a1[n-1][i]==b1[n1-1][i])
                {
                    count++;
                    temp=a1[n-1][i];
                }
            }
                if(count==1)
                    System.out.println("Case #1: " + temp);
                else if(count==1)
                    System.out.println("Case #2: Bad magician!");
                else if(count==0)
                    System.out.println("Case #3: Volunteer cheated!");
            }
        
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
