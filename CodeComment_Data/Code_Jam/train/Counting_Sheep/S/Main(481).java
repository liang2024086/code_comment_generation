package methodEmbedding.Counting_Sheep.S.LYD1030;

import java.util.*;
import java.io.*;
public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
    for (int i = 1; i <= t; ++i) {
      int number = in.nextInt();
      if(number==0) {
          System.out.println("Case #" + i + ": " + "INSOMNIA");  
          continue;
      }
      
      int seen[] = new int[10];
      int op = 1;
      int orignumber = number;
      while(true) {
    	  int tmpnumber = number;
    	  while (tmpnumber > 0) {
    		  seen[tmpnumber % 10] = 1;
    		  tmpnumber = tmpnumber / 10;
      		}
    	  	int sumOfSeen=0;
    	  	for(int k:seen) {
    	  		sumOfSeen+=k;
    	  	}
//    	    for(int j=0; j <10; j++) {
//    	    	System.out.println("** " + "op = " + op + " number = " + number +   " " +  j +  ":" + seen[j]);
//    	    }
//    	    System.out.println("\n");
	  		if(sumOfSeen == 10) {
	  			System.out.println("Case #" + i + ": " + number);  
	  			break;
	  		}
	    	op++;
	        number = orignumber * op;
      }

    }
    in.close();
  }
}
