package methodEmbedding.Cookie_Clicker_Alpha.S.LYD878;


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
public class CookieClicker {
    
public static void main (String [] args) throws IOException {
      BufferedReader h = new BufferedReader(new FileReader("ab.in"));
           PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("hell.out.txt"))); 
           
                       int a = Integer.parseInt(h.readLine());
                       
                       for ( int i=1; i<=a ;i++) {
                             double ar[]=new double[3];
                             StringTokenizer as=new StringTokenizer(h.readLine());
                             
                              for ( int j=0; j<3 ;j++) {
                                  
                  ar[j]=Double.parseDouble(as.nextToken());
                 
             }
                              double var=2.0;
                           double c =ar[0];
                           double f= ar[1];
                           double x =ar[2];
                           double cok= 0.0;
                           double min=0.0;
                           double res=0.0;
                           int count = (int)(x/c);

                           
            while (true){
                
                             
                            if(x/var <= (c/var)+ (x/(var+f))){
                                
                                min =x/var ;
                                
                                res+=min;
                                
                                break;
                            }
                            
                            else {
                                
                                
                               min =c/var;
                               res+=min;
                               var+=f;
                                
                               
                           }
                                   


                                   }
            
                           out.println("Case #"+i+": "+res);

                       }
                       
                       out.close();
                       System.exit(0);
    }
    
}
