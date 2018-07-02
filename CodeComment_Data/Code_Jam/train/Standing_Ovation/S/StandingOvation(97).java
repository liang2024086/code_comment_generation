package methodEmbedding.Standing_Ovation.S.LYD882;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class StandingOvation {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("/home/anuj/Desktop/A-small-attempt0.in"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("/home/anuj/Desktop/standing_ovation_output.in"));
		int t = Integer.parseInt(br.readLine());
		for(int j = 1; j <= t; j++) {
			char[] shynessVals = br.readLine().split(" ")[1].toCharArray();
			int peopleStandingAlready = 0;
			int peopleToBeInvited = 0;
			for(int i = 0; i < shynessVals.length; i++) {
				if(peopleStandingAlready < i) {
					peopleToBeInvited += (i - peopleStandingAlready);
					peopleStandingAlready += (i - peopleStandingAlready);
				}
				peopleStandingAlready += (shynessVals[i] - '0');
			}
			bw.write("Case #" + j + ": " + peopleToBeInvited + "\n");
		}
		br.close();
		bw.close();
	}

}
