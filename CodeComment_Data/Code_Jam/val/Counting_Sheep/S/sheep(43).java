package methodEmbedding.Counting_Sheep.S.LYD948;

import java.util.*;
import java.io.*;
public class sheep{
   public static void main(String args[])throws FileNotFoundException{ 
      PrintStream printer = new PrintStream(new FileOutputStream("A-small-attempt2.out"));
      Scanner scan = new Scanner(new File("A-small-attempt2.in"));
      ArrayList<Integer> n= new ArrayList<>();
      ArrayList<Integer> finished = new ArrayList<Integer>();
      for(int i = 0; i < 10; i++){
         finished.add(i);
      }
      int count = 1;
      int index = 0;
      int len = scan.nextInt();
      for(int i = 0; i < len ;i++){
         int num = scan.nextInt();
         int base = num;
         index = 0;
         if(num == 0){
            printer.println("Case #" + count++ + ": INSOMNIA");
            continue;
         }
         while(!n.equals(finished)){
            while(!(num/1 == 0)){
               if(!n.contains(num%10)){
                  
                  n.add(num%10);
               }
               num/=10;
               
               
            }
            index++;
            Collections.sort(n);
            if(n.equals(finished)){
               num = base*index;
               break;
            }   
            num = base*(index+1);
            
            
         }
         n= new ArrayList<>();
         printer.println("Case #" + count++ + ": " + num);
         
      }
      
   }
}
