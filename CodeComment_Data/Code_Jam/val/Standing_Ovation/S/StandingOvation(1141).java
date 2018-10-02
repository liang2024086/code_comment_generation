package methodEmbedding.Standing_Ovation.S.LYD149;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class StandingOvation {
	public static void main(String[] args) throws IOException {
		String fileName = "A-small-attempt0";
		Scanner s = null;
		PrintWriter p = null;
		try {
			s = new Scanner(new FileInputStream(fileName + ".in"));
			p = new PrintWriter(new File(fileName + ".out"));
		} catch (IOException e) {
		}

		int c = s.nextInt();
		for (int a = 0; a < c; a++) {
			int sMax = s.nextInt();
			String word = s.next();
			int answer = 0;
			int peopleClapping = 0;

			for (int x = 0; x < sMax; x++) {
				peopleClapping += Integer.parseInt(word.substring(x, x + 1));
				if (peopleClapping + answer < x + 1)
					answer = x - peopleClapping + 1;
			}
			p.println("Case #" + (a + 1) + ": " + answer);
		}
		p.close();
		s.close();
	}
}
