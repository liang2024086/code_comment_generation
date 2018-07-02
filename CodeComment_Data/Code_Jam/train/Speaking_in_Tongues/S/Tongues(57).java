package methodEmbedding.Speaking_in_Tongues.S.LYD912;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Tongues {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String gibberish = " abcdefghijklmnopqrstuvwxyz";
		String english = " yhesocvxduiglbkrztnwjpfmaq";
		Map<Character, Character> translation = new HashMap<Character, Character>();
		for (int i = 0; i < gibberish.length(); i++) {
			translation.put(gibberish.charAt(i), english.charAt(i));
		}
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		for (int i = 1; i <= T; i++) {
			String line = sc.nextLine();
			char[] output = new char[line.length()];
			for (int j = 0; j < line.length(); j++) {
				output[j] = translation.get(line.charAt(j));
			}
			System.out.println("Case #" + i + ": " + new String(output));
		}
	}

}
