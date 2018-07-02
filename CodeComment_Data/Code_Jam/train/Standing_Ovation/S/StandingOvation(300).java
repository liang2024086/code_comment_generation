package methodEmbedding.Standing_Ovation.S.LYD712;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.Scanner;


public class StandingOvation {

	public static void main(String[] args) throws IOException {
		
		Reader fileIn = new FileReader("A-small-attempt0.in");
		Scanner sIn = new Scanner(fileIn);
		PrintWriter out = new PrintWriter("A-small-attempt0.out"); 
		final int T = sIn.nextInt();
		for (int tNum = 1; tNum <= T; tNum++) {
			int Smax = sIn.nextInt();
			String listStr = sIn.next();
			int[] list = new int[listStr.length()];
			for (int i = 0; i<listStr.length(); i++) {
				list[i] = Character.digit(listStr.charAt(i), 10);
			}
			int currentPeople = list[0];
			int additionalPeople = 0;
			for(int shy = 1; shy <= Smax; shy++) {
				if (currentPeople >= shy) {
					currentPeople += list[shy];
				} else {
					int z = shy - currentPeople;
					additionalPeople += z;
					currentPeople += z + list[shy];
				}
			}
			out.format("Case #%d: %d", tNum, additionalPeople);
			out.println();
		}
		sIn.close();
		fileIn.close();
		out.close();

	}
}
