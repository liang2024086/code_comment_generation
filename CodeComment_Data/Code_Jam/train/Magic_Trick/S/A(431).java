package methodEmbedding.Magic_Trick.S.LYD1419;

import java.util.Scanner;
import java.io.*;
import java.lang.Math;

public class A {
   public static void main(String[] args) throws IOException {
      /* predetermined code. do not delete. */
   
//    String inFile = "test.txt";
    String inFile = "A-small-attempt1.in";
//    String inFile = "";
      
      File theFile = new File(inFile);
      Scanner input = new Scanner(theFile);              // input.nextInt(), .nextLn(), .nextChar()
      PrintWriter out = new PrintWriter("outFile.txt");  // out.printLn("message");
      int ans1 = 0, ans2 = 0, matches = 0, answer = 0;
      String message = "";
      int caseCount = input.nextInt();
      int[][] cards1 = new int[4][4];
      int[][] cards2 = new int[4][4];
      
      
      
      for(int i = 0; i < caseCount; i++) {
         matches = 0;
         ans1 = input.nextInt();
         for(int j = 0; j < 4; j++) {
            for(int k = 0; k < 4; k++) {
               cards1[j][k] = input.nextInt();
            }
         }
         
         ans2 = input.nextInt();
         for(int j = 0; j < 4; j++) {
            for(int k = 0; k < 4; k++) {
               cards2[j][k] = input.nextInt();
            }
         }
         
         for(int j = 0; j < 4; j++) {
            for(int k = 0; k < 4; k++) {
               if (cards1[ans1-1][j] == cards2[ans2-1][k]) {
                  matches++;
                  answer = cards1[ans1-1][j];
                  //System.out.println((i+1) + " " + answer);
               }
            }
         }         
         
         if (matches == 0) { 
            message = "Volunteer cheated!"; 
         }
         else if (matches == 1) { 
            message = Integer.toString(answer);
         }   
         else { 
            message = "Bad magician!";
         }
      
         out.println("case #" + (i+1) + ": " + message);
      }
      out.close();
         
   }
}
