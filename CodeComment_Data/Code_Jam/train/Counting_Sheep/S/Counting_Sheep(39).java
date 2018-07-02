package methodEmbedding.Counting_Sheep.S.LYD1389;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Patrick Udochukwu
 */

import java.io.*;
import java.util.*;

public class Counting_Sheep {

    /**
     * @param args the command line arguments
     */
   static Scanner input; 
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        
        
        
          BufferedReader bis=new BufferedReader(new FileReader("C:/Users/USER/Documents/Downloads/Desktop/input1.txt"));
        
       FileOutputStream fos=new FileOutputStream("C:/Users/USER/Documents/Downloads/Desktop/output1.txt");
       
       PrintWriter out=new PrintWriter(fos);
       
        
        
      int T=Integer.parseInt(bis.readLine());
      
    
      int counter=0;
      
      while(counter<T){ 
          
      
         
     
        
        int i=1;
        int multiply=0;
        int value=0;
        int N;
        Set<Integer>set=new TreeSet();
        N=Integer.parseInt(bis.readLine());
        while(i<=Integer.MAX_VALUE){
                
        multiply=i*N;
        if(multiply==0)
            break;
        value=multiply;
        while(multiply>0){
            if(multiply/10!=0){
              
            set.add(multiply%10);
              multiply/=10;
              
            }
            
            else{
            set.add(multiply);
            multiply=0;
            }
        
        
        
        }
        
        if(set.size()==10)
            break;
        
        i++;
        }
        
        if(set.size()==10){
          
       out.printf("Case #%d: %d",counter+1,value);
       out.println();
        }
            
        else{
              
       out.printf("Case #%d: %s",counter+1,"INSOMNIA");
       out.println();
        
            
        }
        
        counter++;
      }
      out.close();
        
    }
    
}
