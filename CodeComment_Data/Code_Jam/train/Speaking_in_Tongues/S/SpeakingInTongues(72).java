package methodEmbedding.Speaking_in_Tongues.S.LYD926;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class SpeakingInTongues {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {

		String fileName = "SpeakingInTongues.small.txt";
		System.setIn(new FileInputStream("data/input/" + fileName));
		System.setOut(new PrintStream(new FileOutputStream("data/output/"
				+ fileName)));

		String[] replacement = { "y", "h", "e", "s", "o", "c", "v", "x", "d",
				"u", "i", "g", "l", "b", "k", "r", "z", "t", "n", "w", "j",
				"p", "f", "m", "a", "q" };

		Scanner scanner = new Scanner(System.in);
		int testCases = Integer.parseInt(scanner.nextLine());
		for (int i = 1; i <= testCases; i++) {
			System.out.print("Case #" + i + ": ");
			String line = scanner.nextLine();
			char[] ch = line.toCharArray();
			for (int j = 0; j < ch.length; j++) {
				if (ch[j] == ' ') {
					System.out.print(" ");
				} else {
					System.out.print(replacement[(int) ch[j] - 97]);
				}
			}
			System.out.println();
		}

	}

}
