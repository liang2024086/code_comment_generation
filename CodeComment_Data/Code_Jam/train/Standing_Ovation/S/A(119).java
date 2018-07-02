package methodEmbedding.Standing_Ovation.S.LYD777;

import java.util.*;

public class A{
   public static void main(String[] args){
      Scanner scan= new Scanner(System.in);
      int t = scan.nextInt();
      for(int i = 1; i <= t; i++){
         int maxShy =scan.nextInt();
         String persons = scan.next();
         int count = 0;
         int sumShy = 0;
         for(int j = 0;j < maxShy; j++){
              sumShy += (persons.charAt(j) - '0');
              if(sumShy < j+1){
                 count ++;
                 sumShy ++;
              }
         }
         System.out.println("Case #"+i+": "+count);

      }

   }

}
