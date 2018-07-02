package methodEmbedding.Counting_Sheep.S.LYD1134;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

public class SheepCounter {

	public static void main(String[] args) {
		File f = new File("input.txt");
		try (Scanner s = new Scanner(f); PrintWriter w = new PrintWriter(new File("output.txt"))) {

			int T = Integer.parseInt(s.nextLine());
			for (int k = 1; k <= T; k++) {
				if (k > 1)
					w.println();

				int N = Integer.parseInt(s.nextLine());
				if (N == 0) {
					w.print("CASE #" + k + ": INSOMNIA");
					continue;
				}

				HashMap<Integer, Boolean> digits = new HashMap<>();
				for (int i = 0; i < 10; i++)
					digits.put(i, false);

				int i = 1;
				for (; digits.containsValue(false); i++) {
					String current = String.valueOf(N * i);
					for (int j = 0; j < current.length(); j++) {
						char c = current.charAt(j);
						int key = (int) c - 48;
						digits.put(key, true);
					}
				}
				w.print("CASE #" + k + ": " + N * (i - 1));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
