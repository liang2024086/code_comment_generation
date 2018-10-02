package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1173;

import java.util.*;
import java.io.*;

// Pancakes
public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int t = Integer.parseInt(in.nextLine()); // number of test case

		for (int testCase = 1; testCase <= t; ++testCase) {
			String line = in.nextLine();

			char tmp = line.charAt(line.length()-1);
			int ans = 0;
			if (tmp == '-') ans++;
			
			for (int i = line.length()-1; i >= 0; --i) {
				
				if (tmp != line.charAt(i)) {
					ans++;
				}
				
				tmp = line.charAt(i);
			}

			System.out.println(String.format("Case #%d: %d", testCase, ans));
		}
	}
}
