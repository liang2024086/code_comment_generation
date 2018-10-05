package methodEmbedding.Standing_Ovation.S.LYD848;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StandingOvation {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(in.readLine());
		String[][] data = new String[T][];

		for (int j = 0; j < T; j++) {
			data[j] = in.readLine().split("");

			int clapping = 0;
			int friendsAdded = 0;
			int peopleNeeded = 0;

			for (int i = 2; i < data[j].length; i++) {
				if (data[j][i] == " ") continue;
				try {
					if (Integer.parseInt(data[j][i]) != 0) {
						peopleNeeded = i - 2 - clapping;
						if (peopleNeeded > 0) {
							friendsAdded += peopleNeeded;
							clapping += peopleNeeded;
						}
						clapping += (Integer.parseInt(data[j][i]));
					}
				} catch (Exception e) {

				}
				if (clapping >= data[j].length - 2) break;
			}
			
			System.out.println("Case #" + (j + 1) + ": " + friendsAdded);
		}

	}

}
