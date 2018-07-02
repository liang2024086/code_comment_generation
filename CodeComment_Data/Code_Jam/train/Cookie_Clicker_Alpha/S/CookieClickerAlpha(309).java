package methodEmbedding.Cookie_Clicker_Alpha.S.LYD80;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class CookieClickerAlpha {
	
	private static double cost, x, f;

	public static void main(String[] args) throws IOException {
		Scanner cin = new Scanner(new FileReader("B-small-attempt0.txt"));
		PrintWriter cout = new PrintWriter(new FileWriter("output.txt"));
		//Scanner cin = new Scanner(System.in);
		//PrintWriter cout = new PrintWriter(System.out);
		cin.useLocale(Locale.ENGLISH);
		int T = cin.nextInt();
		for (int tc = 1;tc <= T; ++tc){
			cost = cin.nextDouble();f = cin.nextDouble(); x = cin.nextDouble();
			double curRate = 2, curTime = 0;
			while (true){
				if (x/curRate < x/(curRate+f)+cost/curRate)break;
				//cout.format(Locale.ENGLISH, "%.7f%n", cost/curRate);
				curTime += cost/curRate;curRate += f;
			}
			//cout.format(Locale.ENGLISH, "%.7f%n", x/curRate);
			curTime += x/curRate;
			cout.format(Locale.ENGLISH, "Case #%d: %.7f%n", tc, curTime);
		}
		cout.flush();
	}

}
