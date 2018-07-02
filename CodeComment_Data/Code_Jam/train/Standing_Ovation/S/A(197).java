package methodEmbedding.Standing_Ovation.S.LYD843;

import java.util.*;

public class A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int cs = 1; cs <= T; cs ++) {
			int S = sc.nextInt();
			String hist = sc.next();

			int res = 0;
			int cur = 0;
			for(int i = 0; i <= S; i++) {
				if(i > cur) {
					res += i - cur;
					cur = i;
				}				
				cur += hist.charAt(i) - '0';
			}

			System.out.println("Case #" + cs + ": " + res);
		}

		sc.close();
	}

}
