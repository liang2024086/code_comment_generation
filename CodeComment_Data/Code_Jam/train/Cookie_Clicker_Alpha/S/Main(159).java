package methodEmbedding.Cookie_Clicker_Alpha.S.LYD690;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new FileReader(CookieClickerAlpha.WORK_DIR + "input.txt"));
		sc.useLocale(Locale.US);
		PrintWriter pw = new PrintWriter(new FileWriter(CookieClickerAlpha.WORK_DIR + "output.txt"));
		int caseCnt = sc.nextInt();
		for (int caseNum=0; caseNum<caseCnt; caseNum++) {
			pw.print("Case #" + (caseNum+1) + ": ");
			new CookieClickerAlpha().solve(sc, pw);
		}
		pw.flush();
		pw.close();
		sc.close();
	}
}
