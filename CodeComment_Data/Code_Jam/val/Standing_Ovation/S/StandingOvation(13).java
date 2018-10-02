package methodEmbedding.Standing_Ovation.S.LYD1713;


import java.io.*;
import java.util.StringTokenizer;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aaly
 */
public class StandingOvation {
    
    
     public static void main (String [] args) throws IOException {
          BufferedReader h = new BufferedReader(new FileReader("A-try.in"));
           PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("hell.out")));
           int x=Integer.parseInt(h.readLine());
           
           for (int i = 1; i <= x; i++) {
               StringTokenizer as=new StringTokenizer(h.readLine());
               
               int a = Integer.parseInt(as.nextToken());
               String b = as.nextToken();
               int min =0;
               int count =0;
               for (int j = 0; j <b.length(); j++) {
                   
                  if (count<j){
                      min+=j-count;
                      count+=j-count;
                       
                  }
                  String no = b.charAt(j)+""; 
                  count+=Integer.parseInt(no);
               }
               out.println("Case #"+i+": "+min);
           }
           
           
           
        out.close();
           System.exit(0);   
     }
    
}
