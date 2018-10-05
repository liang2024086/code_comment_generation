package methodEmbedding.Speaking_in_Tongues.S.LYD534;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new File("A-small-attempt0.in"));
		PrintWriter out = new PrintWriter(new File("speaking.out"));
		String charMap = "yhesocvxduiglbkrztnwjpfmaq";
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		System.out.println(alpha.length());

		int T = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < T; i++) {
			String ans = "";
			String input = sc.nextLine();
			for (int j = 0; j < input.length(); j++) {
				char c = input.charAt(j);
				if (c == ' ') {
					ans += c;
				} else {
					ans += charMap.charAt(alpha.indexOf(c));
				}
			}
			out.println("Case #" + (i + 1) + ": " + ans);
		}
		out.close();

	}

}
