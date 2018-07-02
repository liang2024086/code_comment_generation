package methodEmbedding.Counting_Sheep.S.LYD429;

import java.util.*;
import java.io.*;
public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int t = in.nextInt();
    for (int i = 1; i <= t; ++i) {
      int n = in.nextInt();
      if (n == 0) {
	System.out.println("case #" + i + ": " + "INSOMNIA");
      } else {
	int[] seen = new int[10];
	int j = 1;
	int d;
	while (true) {
		d = n * j++;
		int f = d;

		while (f >= 10) {
			seen[f % 10] = 1;
			f /= 10;
		}

		seen[f] = 1;

		boolean done = true;
		for (int x = 0; x < seen.length; ++x) {
			if (seen[x] == 0) {
				done = false;
				break;
			}
		}

		if (done)
			break;
	}

    System.out.println("Case #" + i + ": " + d);
      }
    }
  }
}
