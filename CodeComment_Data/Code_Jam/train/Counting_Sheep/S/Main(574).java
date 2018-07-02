package methodEmbedding.Counting_Sheep.S.LYD611;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MainSmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int T;
		int N;
		String strN;
		int i, j, k;
		T = in.nextInt();
		Set<String> set = new HashSet<String>();
		for (i = 0; i < T; i++) {
			N = in.nextInt();
			if (N == 0) {
				System.out.println("Case #" + (i + 1) + ": INSOMNIA");
				continue;
			}
			for (j = 1; set.size() < 10; j++) {
				strN = String.valueOf(N*j);
				for (k = strN.length() - 1; k >= 0; k--) {
					set.add("" + strN.charAt(k));
				}
			}
			System.out.println("Case #" + (i + 1) + ": "+N*(j-1));
			set.clear();
		}
		if (in != null) {
			in.close();
		}
	}

}
