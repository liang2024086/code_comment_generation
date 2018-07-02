package methodEmbedding.Standing_Ovation.S.LYD1250;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;


public class StandingOvation {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.setOut(new PrintStream(new File("A-small.out")));
		int T = Integer.parseInt(in.readLine());
		int S_max;
		int[] S_i;
		String[] data;
		int clappers;
		int friends;
		for(int t = 1; t <= T; t++) {
			data = in.readLine().split(" ");
			S_max = Integer.parseInt(data[0]);
			S_i = new int[S_max + 1];
			for(int i = 0; i < data[1].length(); i++) {
				S_i[i] = data[1].charAt(i) - 48;
			}
			friends = 0;
			clappers = S_i[0];
			for(int i = 1; i < S_i.length; i++) {
				int defecit = i - clappers;
				clappers += defecit > 0 ? defecit + S_i[i] : S_i[i];
				friends += defecit > 0 ? defecit : 0;
			}
			System.out.println("Case #" + t +": " + friends);
		}
	}
	

}
