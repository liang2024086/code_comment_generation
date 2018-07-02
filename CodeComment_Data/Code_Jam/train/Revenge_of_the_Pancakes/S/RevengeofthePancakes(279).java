package methodEmbedding.Revenge_of_the_Pancakes.S.LYD529;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class RevengeofthePancakes {

	/**
	 * @author Nicolas
	 */
	public static void main(String[] args) throws IOException {
		String file = "C:/Users/nicol/Desktop/B-small-attempt0";
		Scanner sc;
		FileWriter fw = null;
		PrintWriter out = null;
		sc = new Scanner(new FileReader(file + ".in"));
		fw = new FileWriter(file + ".out");
		out = new PrintWriter(fw);

		int cases = sc.nextInt();
		sc.nextLine();

		for (int cas = 1; cas <= cases; cas++) {
			String tira = sc.nextLine();
			int maniobra = 0;
			String signoAnterior = null;
			String signoActual = null;
			for (int i = 0; i < tira.length(); i++) {
				signoActual = String.valueOf(tira.charAt(i));
				if (i != 0)
					signoAnterior = String.valueOf(tira.charAt(i - 1));
				if (signoAnterior != null) {
					if (!signoAnterior.equals(signoActual)) {
						maniobra++;
					}
				}
			}
			if (signoActual.equals("-"))
				maniobra++;
			if (cas == cases)
				out.print("Case #" + cas + ": " + maniobra);
			else
				out.println("Case #" + cas + ": " + maniobra);
		}

		out.flush();
		fw.close();
		out.close();
	}
}
