package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1601;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hppc
 */


import java.io.*;
import java.util.Scanner;

public class Comptiton {

      /**
       * @param args the command line arguments
       */
      public static void main(String[] args) throws FileNotFoundException {
            // TODO code application logic here
            
            Scanner scan = new Scanner(new FileInputStream("C:\\Users\\hppc\\Desktop\\google jam\\comptiton\\src\\comptiton\\input.in"));
            PrintWriter pw = new PrintWriter(new FileOutputStream("output.txt"));
            
            int cas = scan.nextInt();
            for(int j =0;j<cas;j++){
            double c =scan.nextDouble();
            double f = scan.nextDouble();
            double k = scan.nextDouble();
            
            boolean s = true;
            double y =0;
            
            for(double i =0;s;i=i+f){
                  
              
                  if(f>i){
                   y= k/2;
                   if(y<c/2+k/(2+f))
                         s=false;
                  }
                  else{
                        y+=-k/(2+i-f)+c/(2+i-f)+k/(2+i);
                        if(y<y-k/(2+i)+c/(2+i)+k/(2+i+f))
                              s=false;
                  }
                  
            }
            System.out.println("Case #"+(j+1)+": "+y);
                  // pw.printf("Case #%d:%d\n",j,y);
            }
      
            pw.close();
            
            
      }
}
