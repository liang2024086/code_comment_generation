package methodEmbedding.Speaking_in_Tongues.S.LYD43;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SpeakingInTongues {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new FileInputStream("input/p1-small"));
		int n = scan.nextInt();
		scan.nextLine();
		String haha = "yhesocvxduiglbkrztnwjpfmaq";
		for (int k = 0; k < n; k++) {
			String s = scan.nextLine();
			System.out.print("Case #" + (k + 1) + ": ");
			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				if (c == ' ')
					System.out.print(' ');
				else
					System.out.print(haha.charAt(c - 'a'));

			}
			System.out.println();
		}
	}

}
