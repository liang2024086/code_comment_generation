package methodEmbedding.Standing_Ovation.S.LYD1569;

import java.util.*;

public class jam1{
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      
      int cases = scan.nextInt();
      
      for(int i = 0; i < cases; i++){
         int smax = scan.nextInt();
         int[] counts = new int[smax+1];
         
         String values = scan.next();
         
         for(int j = 0; j < smax+1; j++){
            int cur = Character.getNumericValue(values.charAt(j));
            counts[j] = cur;
         }
         
         int extras = 0;
         int total = 0;
         
         for(int j = 0; j < smax+1; j++){
            if(total >= j){
               total += counts[j];
            }
            else{
               extras += j - total;
               total += j - total;
               total += counts[j];
            }
         }
         
         System.out.printf("Case #%d: %d\n", i+1, extras);
      }
   }
}
