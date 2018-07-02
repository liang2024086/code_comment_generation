package methodEmbedding.Cookie_Clicker_Alpha.S.LYD152;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Locale;
import java.util.ArrayList;
import java.util.Scanner;


public class Cookieclicker {

    public static Scanner ins;
    public static PrintWriter pw;
    
    
    public static void main(String[] args) {
    
         try {
            ins = new Scanner(new File("input.in"));
            pw = new PrintWriter(new File("Output.txt"));
                       
            int T = ins.nextInt();
            
                      
            int cases=1;
            
            while (cases<=T){//loop for cases
                
                ins.nextLine();
                
                while (ins.hasNextDouble()){
                        
                 double C=ins.nextDouble();
                 double  F=ins.nextDouble();
                 double  X=ins.nextDouble();
                 
                 double a=0.0;
                 double b=0.0;
                 double cc=0.0;
                 double d=0.0;
                 
                   
                 boolean endcount= false;
                 double sumtime=0.0;
                 
                 int i=0;
                 while(endcount==false)
                 {
                     a=(C/(2+(i*F)));
                     
                     b=(X/(2+(i*F)));
                     
                     cc=(X/(2+((i+1)*F)));
                     
                     if ((a+cc)>b)
                     {
                        sumtime=sumtime+b ;
                        endcount=true;
                        
                     }
                     else{
                         sumtime=sumtime+a;
                     }

                     i=i+1;
                 }  
                            
                 
                  pw.println("Case #"+ cases +": "+sumtime); 
             
                  cases=cases+1;
                  
                }
              
            }//loop for cases
  
         } catch (IOException e) {
            e.printStackTrace();
            return;
        }
      ins.close();    
     pw.close();
        
        
    }
}
