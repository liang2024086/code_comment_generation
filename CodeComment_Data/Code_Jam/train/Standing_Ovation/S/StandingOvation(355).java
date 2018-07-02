package methodEmbedding.Standing_Ovation.S.LYD756;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class StandingOvation {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new FileReader("A-small-attempt0.in"));
		BufferedWriter out = new BufferedWriter(new FileWriter("Aoutput.txt"));
		int T = in.nextInt();
		for (int i = 0; i < T; i++) {
			int Smax = Integer.parseInt(in.next());
			String stringS = in.next();
			int noOfPeopleStanding = 0;;
			int inviteeCount = 0;
			int[] S = new int[stringS.length()];
			for (int j = 0; j < Smax + 1; j++) {
				S[j] = Character.getNumericValue(stringS.charAt(j));
				if (noOfPeopleStanding < j && S[j] != 0) {
					inviteeCount = inviteeCount + j - noOfPeopleStanding;
					noOfPeopleStanding += inviteeCount;
				} 
				noOfPeopleStanding += S[j];
			}
			//Write to the output file
			out.write("Case #" + (i + 1) + ": " + inviteeCount);
			out.newLine();
		}
		in.close();
		out.close();
	}
}
