package methodEmbedding.Revenge_of_the_Pancakes.S.LYD265;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Set;

public class QualifB {

	public static void main(String[] args) throws NumberFormatException, IOException {
		PrintStream out = new PrintStream(
				new FileOutputStream("C:\\Users\\Valentin\\workspace\\GoogleCodeJam2016\\qualif_b.txt"));
		System.setOut(out);

		BufferedReader in = new BufferedReader(new InputStreamReader(
				new FileInputStream("C:\\Users\\Valentin\\workspace\\GoogleCodeJam2016\\B-small-attempt0.in")));
		int t = Integer.parseInt(in.readLine());
		for (int k = 0; k < t; k++) {
			String str = in.readLine();

			boolean done = true;
			char[] tab = new char[str.length()];
			for (int i = 0; i < str.length(); i++) {
				tab[i] = str.charAt(i);
				if (tab[i] == '-') {
					done = false;
				}
			}
			
			long op = 0;
			
			while (!done) {
				int ctr = 0;
				char first = tab[ctr];
				char cur = first;
				
				while (cur == first) {
					ctr++;
					if (ctr == tab.length) {
						if (cur == '-') {
							op++;
						}
						done = true;
						break;
					}
					cur = tab[ctr];
				}
				
				if (!done) {
					for (int i = 0; i < ctr; i++) {
						char temp = tab[ctr - i - 1];
						tab[ctr - i - 1] = tab[i];
						tab[i]= temp;
					}
					for (int i = 0; i < ctr; i++) {
						tab[i] = tab[i] == '-' ? '+' : '-';
					}
					op++;
				}
				
			}

			System.out.println("Case #" + (k + 1) + ": " + op);

		}

	}

}
