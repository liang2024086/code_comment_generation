package methodEmbedding.Revenge_of_the_Pancakes.S.LYD134;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CJ_2016_QR_B {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int nT = Integer.parseInt(in.readLine());
		for (int t = 1; t <= nT; t++) {
			String s = in.readLine();
			s = s + "+";
			int count = 0;
			for (int i = 1; i < s.length(); i++)
				if (s.charAt(i) != s.charAt(i - 1))
					count++;
			System.out.printf("Case #%d: %d\n", t, count);
		}
	}
	
	/*private static int n;
	private static int[] dp;
	private static boolean[] b;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int nT = Integer.parseInt(in.readLine());
		for (int t = 1; t <= nT; t++) {
			String s = in.readLine();
			n = s.length();
			dp = new int[1 << n];
			b = new boolean[1 << n];
			int a = 0;
			for (int i = 0; i < n; i++)
				if (s.charAt(i) == '+')
					a += (1 << i);
			System.out.printf("Case #%d: %d\n", t, dp(a));
		}
	}
	
	private static int dp(int a) {
		if (a == (1 << n) - 1)
			return 0;
		if (dp[a] != 0)
			return dp[a];
		if (b[a])
			return Integer.MAX_VALUE / 10;
		b[a] = true;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++)
			min = Math.min(min, dp(flip(a, i)));
		return dp[a] = 1 + min;
	}

	private static int flip(int a, int p) {
		int c = a;
		a &= ~((1 << (p + 1)) - 1);
		for (int i = 0; i <= p; i++)
			if ((c & (1 << (p - i))) == 0)
				a += 1 << i;
		return a;
	}*/

}
