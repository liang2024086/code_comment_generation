package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1136;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author chetan
 */
public class CookieClicker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws FileNotFoundException{
        // TODO code application logic here
        
        Scanner s=new Scanner(new File("C:\\Users\\chetan\\Downloads\\A-small-attempt0.in"));
        int no_cases=s.nextInt();s.nextLine();
        for(int ncases=1;ncases<=no_cases;ncases++){
            //System.out.println("-----------------------");
            Double c=s.nextDouble();
            Double f=s.nextDouble();
            Double x=s.nextDouble();
           // System.out.println(c+" "+f+" "+x);
            Double t=new Double("0");
            /********************************************************/
            Double cookies=new Double("0");
            Double rate=new Double("2");
            int flag=0;
            
           while ((t+(c/(rate+f))+(x/(rate+f)))<(t+(x/rate))){
              flag=1;
               t=t+c/rate;
                rate=rate+f;
              // System.out.println(c/rate+" "+rate);
               
               
               
           }
           
            DecimalFormat dc=new DecimalFormat(".0000000");
           if(flag==0){
               System.out.println("Case #"+ncases+": "+dc.format(x/rate));
           }else{
               System.out.println("Case #"+ncases+": "+dc.format((t+(x/(rate-f))-(c/(rate-f)))));
           }
             
          
              //if(ncases<no_cases)
                //s.nextLine();      
            
        }
    }
    
}
