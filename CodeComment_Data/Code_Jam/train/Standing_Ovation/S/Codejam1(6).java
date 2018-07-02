package methodEmbedding.Standing_Ovation.S.LYD1581;

import java.util.*;

public class Codejam1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (int i=0; i<n; i++) {
			int k = s.nextInt();
			String num = s.next();

			int sum = 0;
			int needed = 0;
			for (int j=0; j<=k; j++) {
				int m = num.charAt(j) - '0';
				if (sum >= j) {
					sum += m;
				} else {
					needed += (j - sum);
					sum = j + m;
				}
			}
			int no = i + 1;
			System.out.println("Case #"+no+": "+needed);
		}

	}
}
