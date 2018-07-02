package methodEmbedding.Counting_Sheep.S.LYD1076;


import java.util.*;
import java.io.*;
public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
    int[] testCases = new int[t];
    int[] results = new int[t];
    for (int i = 0; i < t; i++) {
      int N = in.nextInt();
      testCases[i] = N;
    }
    for(int i = 0; i < t; i++) {
//   	 System.out.println("Doing: " + testCases[i]);
   	 if (testCases[i] == 0) {
   		 results[i] = 0;
   	 } else {
   		 boolean[] seen = new boolean[10];
   		 int seenCount = 0;
   		 int currentValue = 0;
   		 while(seenCount < 10) {
   			 currentValue += testCases[i];
//   			 System.out.println("Current value is: " + currentValue);
   			 String currentValueString = Integer.toString(currentValue);
   			 for(int j = 0; j < currentValueString.length(); j++) {
   				 int index = Integer.parseInt(currentValueString.substring(j,j+1));
   				 if (seen[index] == false){
//   					 System.out.println("Just saw " + index + " in " + currentValueString);
   					 seen[index] = true;
   					 seenCount++;
   				 }
   			 }
   		 }
   		 results[i] = currentValue;
   	 }
   	 String output = String.format("Case #%d: %s", (i+1), results[i] == 0 ? "INSOMNIA" : results[i]);
   	 System.out.println(output);
    }
    in.close();
  }
}
