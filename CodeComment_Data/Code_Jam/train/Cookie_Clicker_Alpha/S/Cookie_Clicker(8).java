package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1108;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ramshad
 */
public class Cookie_Clicker {
    
     public static void main(String[] args) {
        // TODO code application logic here
         
     int count;
     try {
        Scanner sc=new Scanner(new BufferedReader(new FileReader("B-small-attempt0.in")));
        
        int T =sc.nextInt();
        if(1<=T && T<=100){
          
          
          PrintStream out = new PrintStream(new FileOutputStream("B-small-output.txt"));
          int cas=1;
          
          
          while( cas<=T && sc.hasNext() ){
              int i=0;
              double temp=0.0;
              double C=sc.nextDouble();
              double F=sc.nextDouble();
              double X=sc.nextDouble();
              
              if((C<=500 && C>=1) && (F>=1 && F<=4) && (X>=1 && X<=2000) ){
              ArrayList<Double> a= new ArrayList();
              ArrayList<Double> b= new ArrayList();
              double d=2.0;
              a.add(C/d);
              b.add(X/d);
              double Total=0.0;
              if(X/d<=C/d){Total=X/d;}
              else{
                  //System.out.println("hi");
                  do{
                      b.add(X/(d+F));
                      temp=b.get(i+1)+a.get(i);
                      a.add(C/(d+F));
                      d=d+F;
                      i++;
                      
                  }while(temp<b.get(i-1));
                  
                  for(int j=0;j<i-1;j++){
                  Total=Total+a.get(j);
                  }
                  Total=Total+b.get(i-1);
              }
              DecimalFormat formatter = new DecimalFormat("0.0000000");
              System.setOut(out);
              System.out.println("Case #"+cas+": "+formatter.format(Total));
              
           }   
           cas++; 
      }
      }
     
      sc.close();
      
    } catch (Exception e) {
      // TODO Auto-generated catch block
    }
    
}    
}
