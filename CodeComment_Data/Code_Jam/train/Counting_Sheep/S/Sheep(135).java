package methodEmbedding.Counting_Sheep.S.LYD1509;

import java.util.*;
import java.io.*;
public class Sheep {
  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc

    for (int i = 1; i <= t && t <= 100; ++i) {
      int n = in.nextInt();
      LinkedList<Integer> a = new LinkedList<Integer>();
      int counter = 1;
      int holder = n;
      while (a.size() < 10 && counter <= 200) {
		holder = n * counter;
      int testInt = holder;
      while (testInt > 0) {
      	int remain = testInt % 10;
      	for (int j = 0; j <= a.size(); j++) {
      		if ( a.contains(remain) ) {
      			break;
      			}
      		if (j == a.size() && !(a.contains(remain))) {
      			a.push(remain);
      			}
      		}
      		testInt = testInt / 10;
      	}
      	counter++;
      }

      if (counter == 201) {
      	System.out.println("Case #" + i + ": INSOMNIA");
      }
      else {
      System.out.println("Case #" + i + ": " + holder);
      }
    }
  }
}
