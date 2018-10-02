package methodEmbedding.Cookie_Clicker_Alpha.S.LYD29;


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
public class cookie {
 public static void main(String args[])
 {
      try
           {
               File f1 = new File("B-small-attempt0.in");
           
        Scanner s = new Scanner(f1);
          FileOutputStream out2; // declare a file output object
                PrintStream p;
                   out2 = new FileOutputStream("myfile.txt");
                        // Connect print stream to the output stream
                        p = new PrintStream(out2);
                        int test_case=s.nextInt();
                        
                        
                        for(int i=0;i<test_case;i++)
                        {
                            double c=s.nextDouble();
                            double f=s.nextDouble();
                            double x=s.nextDouble();
                            double r=2.0;
                            double o=0.0;
                            if(c>=x)
                            {
                                o=x/r;
                            }
                            else
                            { 
                                while((x/r)>((c/r)+(x/(r+f))))
                                {
                                   
                                    o=o+c/r;
                                     r=r+f;
                                }
                                o=o+x/r;
                            }
                            int l=i+1;
                            p.println("Case #"+l+": "+o);
                        }
           }catch(FileNotFoundException e)
           {
               
           }
 }
}
