package methodEmbedding.Revenge_of_the_Pancakes.S.LYD103;


import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class B {
	public static void main(String[] args) throws IOException {

		String task = "B-small-attempt0";
		Scanner scanner = new Scanner(new File("C:\\dev\\codejam\\codejam\\src\\resources\\" + task + ".in"));

		PrintWriter out = new PrintWriter("C:\\dev\\codejam\\codejam\\src\\resources\\" + task + ".out");
		int nrTests = scanner.nextInt();
		scanner.nextLine();

		System.out.println("Init done!");
		System.out.flush();
		for (int i = 0; i < nrTests; i++) {
			int flips = 0;
			String line = scanner.nextLine();
			for (int j = 0; j < line.length() - 1; j++) {
				if (line.charAt(j) != line.charAt(j + 1)) {
					flips++;
				}
			}
			if (line.charAt(line.length() - 1) == '-') {
				flips++;
			}
			out.println("Case #" + (i + 1) + ": " + flips);
			System.out.println("Case #" + (i + 1) + ": " + flips);
		}

		out.close();
	}
}
