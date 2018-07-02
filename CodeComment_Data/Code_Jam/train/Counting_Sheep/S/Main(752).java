package methodEmbedding.Counting_Sheep.S.LYD243;

import java.util.*;
 import java.io.*;
 public class Main {
   public static void main(String[] args) {
     Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
     int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
     for (int i = 1; i <= t; i++) {
 	  int n = in.nextInt();
	  int[] digits = new int[] {0,0,0,0,0,0,0,0,0,0};
 	  if(n != 0) {
 		  int seq = 1;
 		  boolean checkDigits = false;
 		  int result = 0;
 
 		  while(!checkDigits) {	
 			// Calculate result of N and set found digit into array 
 			result = n*seq; 
			
			int r = result;
 			while(r > 0) {
 				digits[r%10] = 1;
 				r = r/10;
 			}
 			// Check if result contains 10-digits
 			int check = 0;
 			for(int j = 0; j <= 9; j++) {
 				check = check+digits[j];  
 			}
 			if(check == 10) checkDigits = true;
 			else checkDigits = false;
 		
 			seq++;
 		  }
 		  System.out.println("Case #" + i + ": " + result);
 	   }
 	   else {
 		System.out.println("Case #" + i + ": " + "INSOMNIA");
 	   }
     }
   }
 }
