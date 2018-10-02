package methodEmbedding.Magic_Trick.S.LYD448;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MagicTrick {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(reader.readLine());
		for (int t=1; t <= T; t++) {
			int first = Integer.parseInt(reader.readLine());
			boolean[] nums = new boolean[17];
			for (int i=1; i <= 4; i++) {
				if (i == first) {
					for (String s : reader.readLine().split(" ")) {
						int num = Integer.parseInt(s);
						nums[num] = true;
					}
				} else {
					reader.readLine();
				}
			}
			int second = Integer.parseInt(reader.readLine());
			int found = 0;
			for (int i=1; i <= 4; i++) {
				if (i == second) {
					for (String s : reader.readLine().split(" ")) {
						int num = Integer.parseInt(s);
						if (nums[num]) {
							if (found > 0) {
								found = -1;
								break;
							} else {
								found = num;
							}
						}
					}
				} else {
					reader.readLine();
				}
			}
			String answer;
			if (found < 0) {
				answer = "Bad magician!";
			} else if (found == 0) {
				answer = "Volunteer cheated!";
			} else {
				answer = "" + found;
			}
			System.out.println("Case #" + t + ": " + answer);
		}
	}
}
