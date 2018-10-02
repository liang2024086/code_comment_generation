package methodEmbedding.Magic_Trick.S.LYD1284;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class MagicTrick {
	public static void main(String[] args) {
		Scanner s = null;
		try {
			s = new Scanner(new FileInputStream("Qualification2014/A-small-attempt0.in"));
		} catch (FileNotFoundException e) {
		}

		PrintWriter p = null;
		try {
			p = new PrintWriter(new File("Qualification2014/A-small.out"));
		} catch (IOException e) {
		}

		int t = s.nextInt();

		for (int a = 0; a < t; a++) {
			int c1 = s.nextInt();
			ArrayList<Integer> cards = new ArrayList<Integer>();
			for (int x = 0; x < 4; x++) {
				for (int y = 0; y < 4; y++) {
					if (x + 1 == c1) {
						cards.add(s.nextInt());
					} else {
						s.nextInt();
					}
				}
			}
			int c2 = s.nextInt();
			ArrayList<Integer> cards1 = new ArrayList<Integer>();
			for (int x = 0; x < 4; x++) {
				for (int y = 0; y < 4; y++) {
					if (x + 1 == c2) {
						cards1.add(s.nextInt());
					} else {
						s.nextInt();
					}
				}
			}

			int b = 0;
			int answer = -1;
			for (int x = 0; x < 4; x++) {
				if (cards1.contains(cards.get(x))) {
					b++;
					answer = cards.get(x);
				}
			}
			String ans = "";
			if (b == 1) {
				ans = answer + "";
			} else if (b == 0) {
				ans = "Volunteer cheated!";
			} else {
				ans = "Bad magician!";
			}

			p.println("Case #" + (a + 1) + ": " + ans);
		}
		p.close();
	}
}
