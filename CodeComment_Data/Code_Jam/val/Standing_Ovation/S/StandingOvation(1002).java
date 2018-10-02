package methodEmbedding.Standing_Ovation.S.LYD1585;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StandingOvation {

	public static void main(String[] args) throws IOException {
		try (Scanner sc = new Scanner(new File("A-small-attempt1.in")); BufferedWriter bw = new BufferedWriter(new FileWriter("A-small1.out"))) {
			int ncases = sc.nextInt();
			for (int ccase = 1; ccase <= ncases; ccase++) {
				int max = sc.nextInt();
				int total = 0, needed = 0;
				String people = sc.next();
				for (int i=0; i<=max; i++) {
					if (people.charAt(i) > '0' && i > total) {
						needed += i - total;
						total += needed;
					}
					total += people.charAt(i) - 48;
				}
				bw.write(String.format("Case #%d: %d\n", ccase, needed));
			}
		}
	}

}
