package methodEmbedding.Counting_Sheep.S.LYD810;

import java.io.*;
import java.util.*;

public class CountingSheep {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner in = new Scanner(new File("A-small-attempt0.in"));
		PrintStream out = new PrintStream(new File("countingsheep.out"));
		
		int T = in.nextInt();
		for (int i = 0; i < T; i++) {
			int N = in.nextInt();
			if (N == 0) out.println("Case #" + (i + 1) + ": " + "INSOMNIA");
			else {
				Set digits = new HashSet();
				for (int j = 1; j > 0; j++) {
					String temp = Integer.toString(N * j);
					for (int k = 0; k < temp.length(); k++) {
						digits.add(temp.charAt(k));
					}
					if (digits.size() == 10) {
						out.println("Case #" + (i + 1) + ": " + temp);
						break;
					}
				}
			}
		}
		
	}

}
