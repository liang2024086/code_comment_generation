package methodEmbedding.Cookie_Clicker_Alpha.S.LYD683;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mahesh
 */
import java.io.*;
public class cookie {
       public static void main (String args []) throws IOException {
           BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
           String s,temp[];
           double c,f,x;
           double r,ie,t,p;
           
           int n;
           n= Integer.parseInt(br.readLine());
           for(int j=1;j<=n;j++) {
           s=br.readLine();
           temp=s.split(" ");
           c= Double.parseDouble(temp[0]);
           f=Double.parseDouble(temp[1]);
           x=Double.parseDouble(temp[2]);
           r=2;
           //System.out.println("valus are " +c + " " +f+" "+x );
           ie=c/r; p=x/r;
           if(x<c) {
               //System.out.println("hello");
           }
           else {
               
               for (int i=1;;i++){
                   //System.out.println("internal: "+ie+" "+p);
                   r=r+(f);
                   t=ie+(x/r);
                  // System.out.println("t:"+t);
                   //t=ie+t;
                   //System.out.println("r:" +r+"t: "+t);
                   if(t>p) {
                       break;
                   }
                   else {
                       ie= ie+ (c/r);
                       p=t;
                   }
               }
           }
           System.out.println("case #"+j+": "+p);
       }
       }
    
}
