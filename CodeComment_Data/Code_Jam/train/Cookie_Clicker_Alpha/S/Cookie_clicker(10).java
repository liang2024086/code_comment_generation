package methodEmbedding.Cookie_Clicker_Alpha.S.LYD977;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
import java.io.*;

public class Cookie_clicker {

    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int t =0,num = 1;
        double C=0,F=0,X=0,current_x,total_time,rate=2.0;
        
        File file = new File("output.txt");
        FileWriter fileWritter = new FileWriter(file.getName(), true);
        BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
        
        
        FileInputStream fr = new FileInputStream("C:\\Users\\Sachin\\Desktop\\B-small-attempt0.in");
        @SuppressWarnings("deprecation")
        StreamTokenizer st = new StreamTokenizer(fr);
        st.eolIsSignificant(false);
        st.whitespaceChars(0, 32);
        
        
         int learn = 0,temp1=0,temp2=0;
         //testcases
         learn = st.nextToken();
         t=(int)st.nval;
         System.out.println(t);
         
         for(int i=1;i<=t;i++)
         {
             //initialization for every test case
             rate=2;
             current_x=0;
             total_time=0;
             
             learn = st.nextToken();
             C=st.nval;
             learn = st.nextToken();
             F=st.nval;
             learn = st.nextToken();
             X=st.nval;
             
             if(C>=X)
             {
                 total_time=X/rate;
                 bufferWritter.write("Case #" + num + ": " + total_time + "\n");
                 System.out.println(total_time);
                 num++;
             }
             else
             {
                 while(current_x!=X)
                 {
                     if(current_x==C)
                     {
                         if(((X-current_x)/rate)<=(X/(rate+F)))
                         {
                             total_time+=((X-current_x)/rate);
                             current_x=X;
                         }
                         else
                         {
                             current_x=0;
                             rate=rate+F;
                         }
                     }
                     
                     if(current_x==0)
                     {
                         total_time+=(C/rate);
                         current_x=C;
                     }
                 }
                 bufferWritter.write("Case #" + num + ": " + total_time + "\n");
                 System.out.println(total_time);
                 num++;
             }
             
             
         }
         
        bufferWritter.close();
    }
}
