package methodEmbedding.Counting_Sheep.S.LYD351;

import java.util.*;
import java.lang.*;
import java.io.*;

class C1
 {
	public static void main (String[] args) throws IOException
	 {
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 int numTestCases = Integer.parseInt(br.readLine());
	 boolean[] digits = new boolean[10];
	 
	 for (int i = 1; i <= numTestCases; i++) {
	     Arrays.fill(digits, false);
	     int countDigits = 0;
	     int N = Integer.parseInt(br.readLine());
	     int multi = 1;
	     boolean resultFound = false;
	     int temp = N;
	     String curDigits = "", prevDigits = "";
	     while (temp > 0) {
	         temp = N*multi;
	         int temp1 = temp;
	         while (temp1 > 0) {
	             int d = temp1%10;
	             curDigits = curDigits + String.valueOf(d);
	             if (digits[d] == false) {
	                 countDigits++;
	                 digits[d] = true;
	             }
	             temp1 = temp1/10;
	         }
	         
	         if (curDigits.equals(prevDigits)) {
	             resultFound = false;
	             break;
	         }
	         
	         if (countDigits == 10) {
	             resultFound = true;
	             break;
	         }
	         
	         prevDigits = curDigits;
	         curDigits = "";
	         multi++;
	     }
	     
	     if (resultFound) {
	         System.out.println("Case #" + i + ": " + temp);
	     } else {
	         System.out.println("Case #" + i + ": INSOMNIA");
	     }
	 }
	     
	 }
}
