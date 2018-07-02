package methodEmbedding.Speaking_in_Tongues.S.LYD150;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class A {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("A-small-attempt0.in"));
		String mapping = "yhesocvxduiglbkrztnwjpfmaq";

		int t = scan.nextInt();
		scan.nextLine();
		for (int i = 0; i < t; i++) {
			String coded = scan.nextLine();
			String decoded = ""; // oh well
			for (int j = 0; j < coded.length(); j++) {
				char ch = coded.charAt(j);
				if (ch == ' ')
					decoded += " ";
				else
					decoded += mapping.charAt(ch - 'a');
			}
			System.out.printf("Case #%d: %s%n", i + 1, decoded);
		}
	}
}
