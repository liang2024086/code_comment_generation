package methodEmbedding.Standing_Ovation.S.LYD1414;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class A {

	public static void main(String[] args) {

		try {
			System.setOut(new PrintStream("src/output.out"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		Scanner in = null;
		try {
			in = new Scanner(new File("src/A-small-attempt0.in"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		String[] str = new String[t];
		for (int i = 0; i < t; i++) {
			int n = in.nextInt();
			str[i] = in.next();
			int nmbr = 0;
			int somme = 0;
			for (int j = 1; j < n + 1; j++) {
				somme += Integer.parseInt(str[i].charAt(j - 1) + "");
				if (somme < j
						* (Integer.parseInt(str[i].charAt(j) + "") > 0 ? 1 : 0)) {
					nmbr += j - somme;
					somme += j - somme;
				}
			}
			System.out.println("Case #" + (i + 1) + ": " + nmbr);
		}
	}
}
