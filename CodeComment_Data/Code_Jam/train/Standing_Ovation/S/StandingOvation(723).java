package methodEmbedding.Standing_Ovation.S.LYD611;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StandingOvation {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new FileReader(
				"A-small-attempt0.in"));
		BufferedWriter wr = new BufferedWriter(new FileWriter(
				"A-small-attempt0.out"));
		int T = Integer.parseInt(br.readLine());
		int test = 1;
		while (test <= T) {
			String[] line = br.readLine().split(" ");
			int sMax = Integer.parseInt(line[0]);
			long standing = 0;
			long invited = 0;
			for (int i = 0; i < line[1].length(); i++) {
				if (i > sMax)
					break;
				int currNum = line[1].charAt(i) - '0';
				if (standing < i) {
					invited += (long) i - standing;
					standing = (long) i + currNum;
				} else {
					standing += currNum;
				}
			}
			wr.write("Case #" + test + ": " + invited + "\n");
			test++;
		}
		br.close();
		wr.flush();
		wr.close();
	}

}
