package methodEmbedding.Standing_Ovation.S.LYD466;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class StandingOvation {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader(
					"/home/animeshk/GoogleCodeJam/StandingOvation/googleinput.txt");
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter(
					"/home/animeshk/GoogleCodeJam/StandingOvation/googleoutput.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			int t = Integer.parseInt(br.readLine());
			for (int i = 0; i < t; i++) {
				String s = br.readLine();
				String[] split = s.split("\\s+");
				int n = Integer.parseInt(split[0]);
				n++;
				int[] shyArr = new int[n];
				int countStanding = 0;
				int count = 0;
				for (int j = 0; j < n; j++) {
					shyArr[j] = Character.getNumericValue(split[1].charAt(j));
					// People will just stand and increment count standing
					if (countStanding < j && shyArr[j] > 0) {
						// Add the required number of people
						int required = j - countStanding;
						countStanding += required;
						count += required;
					}
					countStanding += shyArr[j];
				}
				bw.write("Case #" + (i + 1) + ": " + count);
				bw.newLine();
				bw.flush();
			}
			bw.close();
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
