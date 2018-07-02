package methodEmbedding.Magic_Trick.S.LYD1302;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
/*import java.util.List;
import java.util.Arrays;
import java.util.Collections;*/
      
/**
 *
 * 
 */
public class A2014 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	
        try {
            // TODO code application logic 
            BufferedReader reader = new BufferedReader(new FileReader("E:\\CODE PRACTICE\\codejam\\A-small-attempt1.in"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("E:\\CODE PRACTICE\\codejam\\as.out"));
            int T = Integer.parseInt(reader.readLine());
            for (int i = 1; i <= T; i++)
            {   
            	int count =0;
                System.out.println(i);
                int k = Integer.parseInt(reader.readLine());
                String w="";
                for (int m =1; m<k; m++)
                {reader.readLine();
               // System.out.println(m);
                }
                
                String[] s = reader.readLine().split(" ");
              /* 
                int  A = Integer.parseInt(s[0]);
                int B = Integer.parseInt(s[1]);
                int  C = Integer.parseInt(s[2]);
                int D = Integer.parseInt(s[3]); 
                
                */
                for (int m =0; m<(4-k); m++)
                {reader.readLine();
               // System.out.println(m);
                }
                int p = Integer.parseInt(reader.readLine());
                
                for (int q =1; q<p; q++)
                {reader.readLine();
               // System.out.println("q"+q);
                }
                
                String[] s1 = reader.readLine().split(" ");
                /*int  A1 = Integer.parseInt(s1[0]);
                int B1 = Integer.parseInt(s1[1]);
                int  C1 = Integer.parseInt(s1[2]);
                int D1= Integer.parseInt(s1[3]);*/
                
               for (int z =0; z<s.length;z++)
               
               {
            	   for (int r=0;r<s1.length;r++)
            	   {
            		   if (s[z].equals(s1[r]))
            		   {
            			   count++;
            			   w = s[z];
            			  
            		   }
            		   
            	   }
            	   
            	
               }
                  if (count ==0) 
                  {System.out.println("cheated");
                  writer.write("Case #"+i+": " +"Volunteer cheated!");
                  writer.newLine();
                  
                  }  
                  if (count ==1)
                  {System.out.println("w"+w);
                  writer.write("Case #"+i+": " +w);
                  writer.newLine();
                  }
                  if (count >1)
                  {System.out.println("bad");
                  writer.write("Case #"+i+": " +"Bad magician!");
                  writer.newLine();
                  }
                   
                  for (int m =0; m<(4-p); m++)
                  {reader.readLine();}
                  
            
            }
            reader.close();
            writer.close();
        } catch (Exception ex) {
            Logger.getLogger(A2013.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
