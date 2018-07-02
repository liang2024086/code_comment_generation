package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1203;


import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class P2 {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(new File("B-small-attempt0.in"));
		PrintWriter writer = new PrintWriter(new File("B.out"));

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
		
		int T = scanner.nextInt();
		for (int i=0; i<T; i++) {
			String S = scanner.next();
			char last = S.charAt(0);
			int Y = 0;

			String U = "" + S.charAt(0);
			
			for (int j=1; j<S.length(); j++) {
				char current = S.charAt(j);
				if (last != S.charAt(j)) {
					U += current;
				}
				last = current;
			}
			
			while (U.length() >= 2) {
				if (U.startsWith("-+-")) {
					Y += 3;
					U = U.substring(3);
				} else if (U.startsWith("+-")) {
					Y += 2;
					U = U.substring(2);
				} else if (U.startsWith("-+")) {
					Y += 1;
					U = U.substring(2);
				}
			}
			
			if (U.length() > 0)
				if (U.equals("-"))
					Y += 1;
			
			String r = String.format("Case #%d: %d", i+1, Y);
			System.out.println(r);
			writer.println(r);
		}

		scanner.close();
		writer.close();
	}
}
