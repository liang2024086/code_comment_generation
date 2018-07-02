package methodEmbedding.Magic_Trick.S.LYD932;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nikunj
 */
public class magic {
    public static void main(String args[])
    {
           try
           {
               File f = new File("A-small-attempt0.in");
           
        Scanner s = new Scanner(f);
          FileOutputStream out2; // declare a file output object
                PrintStream p;
                   out2 = new FileOutputStream("myfile.txt");
                        // Connect print stream to the output stream
                        p = new PrintStream(out2);
                        int test_case=s.nextInt();
                        
                        
                        for(int i=0;i<test_case;i++)
                        {
                            int a[]=new int[4];
                            int b[]=new int[4];
                            int a1=s.nextInt();
                            for(int j=1;j<a1;j++)
                            { for(int y=0;y<4;y++)
                                s.nextInt();
                            }
                            for(int j=0;j<4;j++)
                            {
                                a[j]=s.nextInt();
 
                            }
                            for(int j=0;j<4-a1;j++)
                            {for(int y=0;y<4;y++)
                                s.nextInt();
                              
                            }
                            int b1=s.nextInt();
                            for(int j=1;j<b1;j++)
                            {for(int y=0;y<4;y++)
                                s.nextInt();

                            }
                            for(int j=0;j<4;j++)
                            {
                                b[j]=s.nextInt();
                            }
                            for(int j=0;j<4-b1;j++)
                            { for(int y=0;y<4;y++)
                                s.nextInt();
                                
                            }
                            int flag=0;
                            int flag2=0;
                            int val=0;
                            for(int j=0;j<4;j++)
                            { 
                                for(int k=0;k<4;k++)
                            {
                                if(a[j]==b[k]&&flag==0)
                                {flag=1;
                                val=a[j];
                                }
                                else if(a[j]==b[k]&&flag==1)
                                        {
                                            flag2=1;
                                        }
                            }
                                }
                            int u=i+1;
                            if(flag==1&&flag2==0)
                            {
                            p.println("Case #"+u+": "+val);
                            }
                            else if(flag2==1)
                            {
                                p.println("Case #"+u+": Bad magician!");
                            }
                            else
                            {
                                p.println("Case #"+u+": Volunteer cheated!");
                            }
                        }

    }
           catch(FileNotFoundException e)
           {}
    }
}
