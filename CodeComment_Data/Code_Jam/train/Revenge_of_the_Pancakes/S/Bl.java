package methodEmbedding.Revenge_of_the_Pancakes.S.LYD243;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Bl {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("b.in"));
		PrintWriter writer = new PrintWriter(new File("bl.out"));

		int c = scanner.nextInt();
		for (int k = 1; k <= c; ++k) {
			writer.print("Case #" + k + ": ");
			String temp = scanner.next();
			int n = temp.length();
			int minusCount = 0;
			boolean flag = true;
			for (int i = 0; i < n; ++i) {
				if (temp.charAt(i) == '-') {
					if (flag) {
						minusCount ++;
					}
					flag = false;
				} else {
					flag = true;
				}
			}
//			System.out.println(minusCount);
			if (temp.charAt(0) == '-') {
				writer.println(minusCount * 2 - 1);
			} else {
				writer.println(minusCount * 2);
			}
		}

		scanner.close();
		writer.close();

	}

}
