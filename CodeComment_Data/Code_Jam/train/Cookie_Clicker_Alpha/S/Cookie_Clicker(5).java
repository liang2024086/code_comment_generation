package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1025;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Cookie_Clicker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double Result_Time=Double.POSITIVE_INFINITY;
        double temp=0.0;
        double Current_Time=0.0;
        double cookie_rate=2.0;
        
         Scanner scanner = new Scanner(System.in);
         int testcase=scanner.nextInt();
         double[][] variables=new double[testcase][3];
         //System.out.println(testcase);
        int i=0;
         while(i<testcase){
             variables[i][0]=scanner.nextDouble();
             variables[i][1]=scanner.nextDouble();
             variables[i][2]=scanner.nextDouble();    
             i++;
         }
         
         DecimalFormat df = new DecimalFormat("#.0000000");
         
 
         int k=0;
         while(k<testcase){
             
             while(true){
             Current_Time+=variables[k][0]/cookie_rate;
             temp=Current_Time+(variables[k][2]-variables[k][0])/cookie_rate;
             
             if(temp<Result_Time){
                 Result_Time=temp;
             }
             cookie_rate+=variables[k][1];
             
             if(Current_Time>Result_Time)
                 break;
             }
             
             k++;
  
             System.out.println("Case #"+k+": "+df.format(Result_Time));
             Result_Time=Double.POSITIVE_INFINITY;
             Current_Time=0.0;
             cookie_rate=2.0;
         }
         
    }
}
