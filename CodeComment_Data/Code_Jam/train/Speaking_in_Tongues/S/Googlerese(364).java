package methodEmbedding.Speaking_in_Tongues.S.LYD1095;

import java.util.*;

public class Googlerese {
	private static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		String translation = "ynficwlbkuomxsevzpdrjgthaq";

		int T = s.nextInt();
		s.nextLine();

		for (int t = 0; t < T; t++) {
			String gr = s.nextLine();
			String eng = "";
			for (int i = 0; i < gr.length(); i++) {
				char c = gr.charAt(i);
				if (c == ' ') {
					eng += ' ';
					continue;
				}

				char nc = (char)('a' + translation.indexOf(c));
				eng += nc;
			}

			System.out.printf("Case #%d: %s\n", t + 1, eng);
		}
	}
}
