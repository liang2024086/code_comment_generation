package methodEmbedding.Counting_Sheep.S.LYD459;

import java.util.*;
import java.io.*;
import java.math.*;
public class Main {
  public static void main(String[] args) {
  	int count = 0;
  	boolean[] records = new boolean[10];


    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
    in.nextLine();
    for (int i = 1; i <= t; ++i) {
      String s = in.nextLine();
      if (s.equals("0")) {
      	System.out.println("Case #" + i + ": INSOMNIA");
      	continue;
      }

      count = 0;
      Arrays.fill(records, false);
      String tmp = s;
      BigInteger factor = new BigInteger(s);
   	  BigInteger n = new BigInteger(tmp);
   	  while (count < 10) {
   	  	for (int k = 0; k < tmp.length(); k++) {
   	  		int d = tmp.charAt(k) - '0';
   	  		if (!records[d]) {
   	  			records[d] = true;
   	  			count++;
   	  		}
   	  	}
   	  	n = n.add(factor);
   	  	tmp = n.toString();
   	  }
   	  n = n.subtract(factor);
      System.out.println("Case #" + i + ": " + n.toString());
    }
  }
}
