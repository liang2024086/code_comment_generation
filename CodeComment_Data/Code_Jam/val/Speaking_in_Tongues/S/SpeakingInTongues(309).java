package methodEmbedding.Speaking_in_Tongues.S.LYD1102;

import java.io.File;
import java.util.Scanner;

public class SpeakingInTongues {
	private static int[] repl = new int[26];
	private static String[] origStr = {
			"ejp mysljylc kd kxveddknmc re jsicpdrysi",
			"rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd",
			"de kr kd eoya kw aej tysr re ujdr lkgc jv" };
	private static String[] replStr = {
			"our language is impossible to understand",
			"there are twenty six factorial possibilities",
			"so it is okay if you want to just give up" };
	private static char[] origChar;
	private static char[] replChar;

	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		scan = new Scanner(new File("A-small-attempt0.in"));
		for (int i = 0; i < origStr.length; i++) {
			origChar = origStr[i].toCharArray();
			replChar = replStr[i].toCharArray();
			for (int j = 0; j < origChar.length; j++) {
				if (origChar[j] == ' ')
					continue;
				repl[origChar[j] - 'a'] = replChar[j];
			}
		}
		repl['a' - 'a'] = 'y';
		// repl['o' - 'a'] = 'e';
		repl['z' - 'a'] = 'q';
		int notFoundIndex = 0;
		boolean[] check = new boolean[26];
		for (int i = 0; i < repl.length; i++) {
			if (repl[i] == 0) {
				notFoundIndex = i;
				continue;
			}
			check[repl[i] - 'a'] = true;
		}
		for (int i = 0; i < check.length; i++) {
			if (!check[i]) {
				repl[notFoundIndex] = i + 'a';
				break;
			}
		}

		int total = Integer.valueOf(scan.nextLine());
		String decrypted;
		for (int t = 1; t <= total; t++) {
			System.out.print("Case #" + t + ": ");
			decrypted = scan.nextLine();
			for (char ch : decrypted.toCharArray()) {
				System.out.print(ch != ' ' ? (char) repl[ch - 'a'] : ' ');
			}
			System.out.println();
		}
	}
}
