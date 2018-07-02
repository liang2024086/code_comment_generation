package methodEmbedding.Counting_Sheep.S.LYD1584;

import java.util.*;
import java.io.*;
public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
    for (int i = 1; i <= t; i++) {
    
      int n = in.nextInt();
      ArrayList<Integer> digits = new ArrayList<Integer>();
      int current = n;
      boolean insomnia = false;
      while(digits.size() < 10){
      	// put all the new digits of current number to the digits list
      	int next = current + n;
      	if (current == next) {
      		//Insomnia case
			     insomnia = true;
			     break;
      	}
      	while(current >= 1){
      		int currentDigit = current%10;
      		if (!digits.contains(currentDigit)) {
      			digits.add(currentDigit);
      		}
      		current /= 10;
      	}
      	current = next;
      }
      if (insomnia) {
      	System.out.println("Case #" + i + ": INSOMNIA");
      } else{      	
      	System.out.println("Case #" + i + ": " + (current-n));
      }
    }
  }
}
