package methodEmbedding.Magic_Trick.S.LYD2228;

import java.util.ArrayList;
import java.util.Scanner;


public class Trick {


   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int numTricks, tricks = 0;
      int firstRow, secondRow;
      int matches, rightNum = -1;
      ArrayList<Integer> nums;
      
      numTricks = sc.nextInt();
      
      while(tricks++ < numTricks) {
         matches = 0;
         firstRow = sc.nextInt();
         nums = new ArrayList<Integer>();
         
         for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
               if(firstRow == (i + 1)) {
                  nums.add(sc.nextInt());
               } else {
                  sc.nextInt();
               }
            }
         }
         
         secondRow = sc.nextInt();
         
         for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
               if(secondRow == (i + 1)) {
                  int tmp = sc.nextInt();
                  if(nums.contains(tmp)) {
                     matches++;
                     rightNum = tmp;
                  }
               } else {
                  sc.nextInt();
               }
            }
         }
         
         System.out.print("Case #"+tricks+": ");
         
         if(matches == 1) {
            System.out.println(rightNum);
         } else if (matches > 1) {
            System.out.println("Bad magician!");
         } else {
            System.out.println("Volunteer cheated!");
         }
      }
   }

}
