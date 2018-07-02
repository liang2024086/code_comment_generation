package methodEmbedding.Standing_Ovation.S.LYD1628;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Badal
 */
public class codejam {
    
   public static void main(String argv[]) throws FileNotFoundException{
       File file = new File("A-small-attempt0.in");
       Scanner in = new Scanner(file);
       int n = in.nextInt();
       String[] arri;
       System.out.println(n);
       
       int[] intArray;
      for(int i=0;i<n;i++) {
          
  int line = in.nextInt();
  String str = in.next();
intArray = new int[str.length()];

for (int j = 0; j < str.length(); j++) 
    intArray[j] = Character.digit(str.charAt(j), 10);

int maxshy,act,frd,c;
      
       maxshy= line;
       
       frd=0;
       c=1;
       
       if(maxshy!=0)
       {
       act=intArray[0];
       
       while(true)
       {
           if(intArray[c]!=0)
           {
               if(act>=c)
           {
           act+=intArray[c];
           }
           else
           {
               frd+=(c-act);
           act=c+intArray[c];
           
           } 
               
           }
         c++;
         
         if(c>maxshy)
             break; 
       
       
       }
       
       System.out.println("Case #"+(i+1)+": "+frd);
       }
       else
          System.out.println("Case #"+(i+1)+": "+0); 
   }
         }
    
}
