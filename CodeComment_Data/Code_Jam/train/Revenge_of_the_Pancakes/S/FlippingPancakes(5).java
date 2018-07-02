package methodEmbedding.Revenge_of_the_Pancakes.S.LYD958;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;

/**
 *
 * @author Ash
 */
public class FlippingPancakes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        // TODO code application logic here
        FileInputStream fin = new FileInputStream("C:\\Users\\Ash\\Downloads\\B-small-attempt0.in");
        BufferedReader br = new BufferedReader(new InputStreamReader(fin));
        File file = new File("C:\\Users\\Ash\\Downloads\\B-small.out");
        FileOutputStream fout = new FileOutputStream(file);
        PrintStream ps = new PrintStream(fout);
        System.setOut(ps);
        String s,substr;
        int count=0,x;
        int t = Integer.parseInt(br.readLine());
        for (int i=1;i<=t;i++)
        {
            count=0;
           s= br.readLine();
           s=s.replace("+", "#");
           while(s.indexOf("-")!=-1)
           {
               if(s.indexOf("-")==0)
               {    
                   x=s.indexOf("#");
                   if(x==-1)
                       x=s.length();
                   //System.out.println("x="+x);
                   substr=s.substring(0,x);
                   //System.out.println("substr"+substr);
                   s=s.replaceFirst(substr, "#");
                   //System.out.println("s"+s);
                   count++;
               }
               if(s.indexOf("#")==0)
               {    
                   if(s.indexOf("-")==-1)
                       break;
                   x=s.indexOf("-");
                   //System.out.println("x="+x);
                   substr=s.substring(0,x);
                   //System.out.println("substr"+substr);
                   s=s.replaceFirst(substr, "-");
                   //System.out.println("s="+s);
                   count++;
                   
               }
                             
           }
           System.out.println("Case #"+i+": "+count);
           
        }
    }
    
}
