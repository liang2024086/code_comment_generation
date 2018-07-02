package methodEmbedding.Revenge_of_the_Pancakes.S.LYD410;

import java.util.Scanner;

public class RevengeOfThePancakes {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int tc = scan.nextInt();
		int rd = 1;
		while(tc-- != 0) {
			String x = scan.next();
			char cur;
			char[] hehe = x.toCharArray();
			cur = hehe[0];
			int flips = 0;
			for(char t: hehe) {
				if(t == cur) continue;
				flips++;
				if(cur == '+') cur = '-';
				else cur = '+';
			}
			if(cur == '-') {
				flips++;
			}
			System.out.printf("Case #%d: %d\n",rd++, flips);
		}
	}
}
