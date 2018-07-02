package methodEmbedding.Standing_Ovation.S.LYD1925;

import java.io.*;
import java.util.*;

public class StandingOvation {
	public static void main(String[] args) throws FileNotFoundException,
			UnsupportedEncodingException {
		File f = new File("A-small-attempt0.in");
		Scanner sc = new Scanner(f);
		int numcases = Integer.parseInt(sc.nextLine());
		int counter = 1;
		PrintWriter pw = new PrintWriter("output", "UTF-8");
		while (sc.hasNextLine()) {
			int numfriends = 0;
			String raw = sc.nextLine();
			String[] input = raw.split(" ");
			String people = input[1];
			int[] group = new int[people.length()];
			for (int i = 0; i < people.length(); i++) {
				group[i] = Integer
						.parseInt(Character.toString(people.charAt(i)));
			}
			for (int i = 0; i < people.length() - 1; i++) {
				int curj = 0;
				int cur = 0;
				for (int j = 0; j <= i; j++) {
					cur += group[j];
					curj = j;
					System.out.println(counter+" "+j+" "+cur);
				}
				if (cur >= i + 1) {
					continue;
				} else {
					while (cur < i+1) {
						numfriends++;
						cur++;
						group[curj]++;
					}
				}
			}
			pw.println("Case #" + counter + ": " + numfriends);
			counter++;
		}
		pw.close();
	}
}
