package methodEmbedding.Magic_Trick.S.LYD1132;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {
	public static void main(String args[]) {
		System.out.println("Matarani");
		try {
			FileReader file = new FileReader(new File(
					"D:/Rahul/Practice/src/test.txt"));
			BufferedReader reader = new BufferedReader(file);
			String temp = "";
			int[] firstcase = new int[4];
			int[] secondcase = new int[4];
			String[] gg = null;
			int testcases = Integer.parseInt(reader.readLine());
			for (int d = 1; d <= testcases; d++) {
				int found = 0;
				int first = Integer.parseInt(reader.readLine());
				for (int s = 1; s <= 4; s++) {
					if (s == first) {
						temp = reader.readLine();
					} else {
						reader.readLine();
					}
				}

				String[] ff = temp.split(" ");
				for (int s = 0; s < 4; s++) {
					firstcase[s] = Integer.parseInt(ff[s]);
				}

				int second = Integer.parseInt(reader.readLine());
				String temp2 = "";
				for (int s = 1; s <= 4; s++) {
					if (s == second) {
						temp2 = reader.readLine();
						// System.out.println(temp2);
					} else {
						reader.readLine();
					}
				}
				gg = temp2.split(" ");
				for (int s = 0; s < 4; s++) {
					secondcase[s] = Integer.parseInt(gg[s]);
				}
				int count = 0;
				for (int ddd = 0; ddd < 4; ddd++) {
					for (int ccc = 0; ccc < 4; ccc++) {
						if (firstcase[ccc] == secondcase[ddd]) {
							found = firstcase[ccc];
							count++;
						}
					}
				}
				if (count > 1) {
					System.out.println("Case #" + d + ": Bad magician!");
				} else if (count == 1) {
					System.out.println("Case #" + d + ": " + found);
				} else {
					System.out.println("Case #" + d + ": Volunteer cheated!");
				}
			}

			reader.close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
