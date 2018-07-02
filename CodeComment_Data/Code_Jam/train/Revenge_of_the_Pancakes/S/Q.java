package methodEmbedding.Revenge_of_the_Pancakes.S.LYD841;

import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;

import java.util.Scanner;
import java.util.*;

public class Q {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOfTests = parseInt(sc.nextLine());
		for (int t = 1; t <= numberOfTests; t++) {
			char[] in = sc.nextLine().toCharArray();
			int res = 0;
			char nextRequired = '-';
			for (int i = in.length-1; i >= 0; i--) {
				if (in[i] == nextRequired) {
					++res;
					nextRequired = nextRequired == '-' ? '+' : '-';
				}
			}
			System.out.println(String.format("Case #%s: %s", t, res));
		}
		sc.close();
	}
}
