package methodEmbedding.Standing_Ovation.S.LYD1526;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StandingOvation {

	private static BufferedReader bufferedReader = new BufferedReader(
			new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		String line = bufferedReader.readLine();
		int cases = Integer.parseInt(line);
		for (int c = 1; c <= cases; c++) {
			line = bufferedReader.readLine();
			String[] split = line.split(" ");
			int maxShyness = Integer.parseInt(split[0]);
			int[] people = new int[maxShyness + 1];

			for (int i = 0; i < maxShyness; i++) {
				people[i] = Integer.parseInt("" + split[1].charAt(i));
			}

			int standing = people[0];
			int added = 0;
			for (int i = 1; i < people.length; i++) {
				if (standing < i) {
					int diff = i - standing;
					added += diff;
					standing += diff;
				}
				standing += people[i];
			}

			System.out.println("Case #" + c + ": " + added);
		}
	}
}
