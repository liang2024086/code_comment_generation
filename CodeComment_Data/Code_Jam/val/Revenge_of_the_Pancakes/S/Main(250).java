package methodEmbedding.Revenge_of_the_Pancakes.S.LYD92;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	private static String WORK_DIR = "C:\\Gcj\\data\\";

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new FileReader(WORK_DIR + "input.txt"));
		sc.useLocale(Locale.US);
		PrintWriter pw = new PrintWriter(
				new FileWriter(WORK_DIR + "output.txt"));
		int caseCnt = sc.nextInt();
		for (int caseNum = 0; caseNum < caseCnt; caseNum++) {
			pw.print("Case #" + (caseNum + 1) + ": ");
			new Pancakes().solve(sc, pw);
		}
		pw.flush();
		pw.close();
		sc.close();
	}
}
