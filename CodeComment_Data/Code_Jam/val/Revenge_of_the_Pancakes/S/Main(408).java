package methodEmbedding.Revenge_of_the_Pancakes.S.LYD198;

import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner (new BufferedReader(new InputStreamReader(System.in)));
		int t = in.nextInt();
		int i = 0;
		int count = 0;
		String str = "";
		for (i = 1; i <= t; i++) {
			count = 0;
			str = in.next();
			char last = str.charAt(0);
			if (last == '-') count++;
			for (int j = 1; j < str.length(); j++) {
				char temp = str.charAt(j);
				if ((temp == '-') && (last == '+')) {
					count += 2;
				}
				last = temp;
			}
			System.out.println("Case #" + i + ": " + count);
		}
	}
}
