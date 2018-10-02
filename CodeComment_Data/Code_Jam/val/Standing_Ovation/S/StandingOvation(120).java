package methodEmbedding.Standing_Ovation.S.LYD1154;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StandingOvation {
	public static void main(String[] args) throws FileNotFoundException,
			IOException {

		FileReader fin = new FileReader("A-small-attempt0.in");
		BufferedReader br = new BufferedReader(fin);
		FileWriter fout = new FileWriter("A-small-attempt0.txt");
		BufferedWriter out = new BufferedWriter(fout);

		int T = Integer.parseInt(br.readLine());
		String sMax;

		for (int i = 0; i < T; i++) {
			sMax = (br.readLine().split(" "))[1];
			int friendsInvited = 0, peopleStanding = 0;

			for (int j = 0; j < sMax.length(); j++) {

				if (peopleStanding + friendsInvited < j) {

					friendsInvited++;
				}
				peopleStanding += Integer.parseInt(String.valueOf(sMax.charAt(j)));

			}

			//System.out.println("Case #" + (i + 1) + ": " + friendsInvited);

			out.write("Case #" + (i + 1) + ": " + friendsInvited);
			out.newLine();
			

		}

		out.close();
		br.close();
	}
}
