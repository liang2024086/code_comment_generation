package methodEmbedding.Magic_Trick.S.LYD1451;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Salman Ahmed
 */
public class Main {
    
    public static void main (String[] a)
    {
        
        try
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("A-small-attempt0.in")));
            PrintWriter pw = new PrintWriter(new FileOutputStream("A-small-practice.out"));
            int inputs = Integer.parseInt(br.readLine());
            for(int i = 0 ; i < inputs ;i++)
            {
                int x = Integer.parseInt(br.readLine());
                x=x-1;
                int A[] = new int[4];
                String []t = null;
                for(int j = 0 ; j < 4 ; j++)
                {
                    if(j==x)
                    {
                        t = br.readLine().split(" ");
                    }
                    else
                    {
                        br.readLine();
                    }
                }
                
                A[0]=Integer.parseInt(t[0]);
                A[1]=Integer.parseInt(t[1]);
                A[2]=Integer.parseInt(t[2]);
                A[3]=Integer.parseInt(t[3]);
                x = Integer.parseInt(br.readLine());
                x=x-1;
                int B[] = new int[4];
                
                for(int j = 0 ; j < 4 ; j++)
                {
                    if(j==x)
                    {
                        t = br.readLine().split(" ");
                    }
                    else
                    {
                        br.readLine();
                    }
                }
                
                B[0]=Integer.parseInt(t[0]);
                B[1]=Integer.parseInt(t[1]);
                B[2]=Integer.parseInt(t[2]);
                B[3]=Integer.parseInt(t[3]);
                
                int common = 0 ;
                int num = 0 ;
                for(int d = 0 ; d < 4 ; d++)
                {
                     for(int f = 0 ; f < 4 ; f++)
                    {
                          if(A[d]==B[f])
                          {
                              common++;
                              num = A[d];
                          }
                    }
                }
                if(common == 0)
                {
                    pw.println("Case #"+(i+1)+": Volunteer cheated!");
                }
                else if(common == 1)
                {
                    pw.println("Case #"+(i+1)+": "+num);
                }
                else 
                {
                    pw.println("Case #"+(i+1)+": Bad magician!");
                }
            }
            pw.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
