package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1599;

import java.util.*;

public class CookieClickerAlpha {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		in.useLocale(Locale.ENGLISH);
		int T = in.nextInt(), i = 0, factBought;
		double C, F, X, spentTime, toAdd, lastRemaining, newRemaining;
		while (i++ < T)
		{
			System.out.print("Case #" + i + ": ");
			C = in.nextDouble();
			F = in.nextDouble();
			X = in.nextDouble();
			spentTime = 0;
			factBought = 0;
			lastRemaining = X / (2 + factBought * F);
			while ((toAdd = C / (2 + factBought * F)) + (newRemaining = X / (2 + ((factBought + 1) * F)))
					< lastRemaining)
			{
				spentTime += toAdd;
				++factBought;
				lastRemaining = newRemaining;
			}
			System.out.println("" + (spentTime + lastRemaining));
		}
		in.close();
	}
}
