package methodEmbedding.Magic_Trick.S.LYD1362;

import java.io.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		System.out.println();
		File input = null;
		for (File f : new File(".").listFiles()) {
			if (f.isFile() && f.getName().endsWith(".in")) {
				input = f;
				break;
			}
		}
		Scanner s = new Scanner(input);
		BufferedWriter w = new BufferedWriter(new FileWriter(new File("output")));
		int cases = s.nextInt();
		s.nextLine();

		for (int i = 0; i < cases; i++) {
			w.write("Case #");
			w.write(String.valueOf(i + 1));
			w.write(": ");

			int first = s.nextInt();
			s.nextLine();

			int j = 1;
			for (; j < first; j++) {
				s.nextLine();
			}

			int[] row1 = new int[4];
			for (int k = 0; k < 4; k++) {
				row1[k] = s.nextInt();
			}

			for (; j <= 4; j++) {
				s.nextLine();
			}

			int second = s.nextInt();
			s.nextLine();

			j = 1;
			for (; j < second; j++) {
				s.nextLine();
			}

			int[] row2 = new int[4];
			for (int k = 0; k < 4; k++) {
				row2[k] = s.nextInt();
			}

			for (; j <= 4; j++) {
				s.nextLine();
			}

			String ans = null;

			finish:
			for (int aa = 0; aa < 4; aa++) {
				for (int bb = 0; bb < 4; bb++) {
					if (row1[aa] == row2[bb]) {
						if (ans == null) {
							ans = String.valueOf(row1[aa]);
						} else {
							ans = "Bad magician!";
							break finish;
						}
					}
				}
			}

			if (ans == null) {
				ans = "Volunteer cheated!";
			}

			w.write(ans);
			w.write("\n");
		}
		w.close();
	}

}
