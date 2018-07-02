package methodEmbedding.Counting_Sheep.S.LYD280;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Sheep {
	public static void main(String[] args) throws FileNotFoundException {
		int countLimit = 100000;

		Scanner s = new Scanner(new File("sheep.in"));
		int T = s.nextInt();
		for (int i = 0; i < T; i++) {
			int digitsMap = 0;
			int N = s.nextInt();
			int c = N;
			int j;
			for (j = 0; j < countLimit; j++) {
				String str = c + "";
				for (int l = 0; l < str.length(); l++) {
					int d = str.charAt(l) - '0';
					digitsMap = digitsMap | (int) Math.pow(2, d);
				}
				if (digitsMap == Math.pow(2, 10) - 1) {
					System.out.println("Case #" + (i + 1) + ": " + c);
					break;
				}
				c += N;
			}
			if(j == countLimit) {
				System.out.println("Case #" + (i + 1) + ": INSOMNIA");
			}
		}

		s.close();
	}
}
