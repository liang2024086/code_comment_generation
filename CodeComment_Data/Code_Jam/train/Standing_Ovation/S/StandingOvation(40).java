package methodEmbedding.Standing_Ovation.S.LYD1468;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class StandingOvation {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File(
				"C:/Users/Ahmed/Desktop/Codejam/oneS_2.in"));
		PrintWriter print = new PrintWriter("oneS.out");
		int lines = scan.nextInt();
		for (int l = 0; l < lines; l++) {
			scan.nextInt();
			String input = scan.next();
			int res = 0;
			int sum = 0;
			for (int i = 0; i < input.length(); i++) {
				// if (input.charAt(i) == '0') {
				// res++;
				// }
				if (i > sum) {
					res += (i - sum);
					sum += input.charAt(i) - '0' + (i - sum);
				} else
					sum += input.charAt(i) - '0';
			}
//			System.out.println("Case #" + (l + 1) + ": " + res);
			print.println("Case #" + (l + 1) + ": " + res);
		}
		print.close();
	}
}
