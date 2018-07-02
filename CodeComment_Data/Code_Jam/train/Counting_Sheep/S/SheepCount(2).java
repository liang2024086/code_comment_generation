package methodEmbedding.Counting_Sheep.S.LYD1231;

import java.util.*;
import java.io.*;


public class SheepCount {
   public static void main(String[] args) {
      boolean digCheck[] = new boolean[10];
      boolean insomnia = false;
      int count = 0;
      int current = 0;
      int tmp = 0;
      int digit = 0;
      int cases = 0;
      int index = 0;
      int data[] = {0};
      int i = 1;
      
      // Open file.
      try {
         File file = new File("A-small-attempt1.in");
         Scanner inputFile = new Scanner(file);
         
         if (file == null){
            throw new FileNotFoundException();
         }
         
         cases = inputFile.nextInt();
         
         if (cases == 0){
            insomnia = true;
         }
         data = new int[cases];
         
         while (inputFile.hasNext()) {
            data[index] = inputFile.nextInt();
            index++;
         }
         
         inputFile.close();
      } catch (FileNotFoundException fe) {
         System.out.println("File not found");
      }
      
      try {
         File outfile = new File("output.txt");
         if(outfile == null){
            throw new FileNotFoundException();
         }

         PrintStream out = new PrintStream(outfile);
         
         
         // check every test value
         for(int h = 0; h < cases; h++) {  
            current = data[h];       
            // if the value is zero
            if (data[h] == 0) {
               insomnia = true;
            }
            else {
            
               // while all digits are not found
               while(count < 10) {
                  tmp = current * i; // the current multiple of the test value
                  
                  // check every digit in current
                  while (tmp > 0){
                     digit = tmp % 10;
                     
                     if (digCheck[digit] == false)
                     {
                        digCheck[digit] = true;
                        count++;
                     }
                     
                     tmp /= 10;
                     for(int z = 0; z < 10; z++){
                     }
                  }
                  i++;
               }
               count = 0;
               Arrays.fill(digCheck, false);
               
            }
            
            out.print("Case #" + (h+1) + ": ");
               
            if (insomnia == false){
               out.print(current * (i-1));
               out.println();
            }
            else {
               out.print("INSOMNIA");
               out.println();
            }
               
            insomnia = false;
            i = 1;
         }
         out.close();

      } catch (FileNotFoundException nf) {
         System.out.println("File not found");
      }
      
   }
}
