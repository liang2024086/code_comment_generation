package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1448;

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int cas = 1, cases = sc.nextInt(); cas <= cases; cas++) {
			double c = sc.nextDouble(), f = sc.nextDouble(), x = sc.nextDouble();
			double t = 0;
			long n = Math.max(0, (long)Math.ceil(x/c-2/f-1));
			for (long i = 0; i < n; i++)
			{
				t += c/(2+i*f);
			}
			t += x/(2+n*f);
			System.out.println("Case #" + cas + ": " + t);
		}
	}
}
