package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1153;

import java.util.*;
import java.lang.*;
import java.io.*;

class C2
 {
	public static void main (String[] args) throws IOException
	 {
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 int numTestCases = Integer.parseInt(br.readLine());
	 
	 for(int i = 1; i <= numTestCases; i++) {
	     String value = br.readLine();
	     int strLength = value.length();
	     
	     boolean startWithZero = (value.charAt(0) == '-') ? true : false;
	     int consecZeroCount = 0;
	     boolean zeroInProgress = false;
	     
	     for(int j = 0; j < strLength; j++) {
	         if (value.charAt(j) == '-') {
	             if (!zeroInProgress) {
	                 zeroInProgress = true;
	                 consecZeroCount++;
	             }
	         } else {
	             if (zeroInProgress) {
	                 zeroInProgress = false;
	             }
	         }
	     }
	     int result;
	     
	     if (consecZeroCount == 0) {
	         result = 0;
	     } else if (startWithZero) {
	         result = (consecZeroCount - 1)*2 + 1;
	     } else {
	         result = (consecZeroCount)*2;
	     }
	     
	     System.out.println("Case #" + i + ": " + result);
	 }
	 
	 }
}
