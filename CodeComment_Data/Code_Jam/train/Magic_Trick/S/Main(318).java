package methodEmbedding.Magic_Trick.S.LYD34;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	static File input = new File("D:\\A-small-attempt0.in");
	static File output = new File("D:\\output.txt");

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(input);
		BufferedWriter bw = new BufferedWriter(new FileWriter(output.getAbsoluteFile()));
		
		int N = in.nextInt();

		in.nextLine();
		for (int i = 0; i < N; i++) {
			int R_1 = in.nextInt();
			in.nextLine();
			int[] a1 = new int[4];

			for (int j = 0; j < 4; j++) {
				if (j == R_1 - 1) {
					String row = in.nextLine();
					StringTokenizer st = new StringTokenizer(row);
					for (int k = 0; k < 4; k++) {
						a1[k] = Integer.parseInt(st.nextElement().toString());
					}
				} else {
					in.nextLine();
				}
			}

			int R_2 = in.nextInt();
			in.nextLine();

			int counter = 0;
			int index = 0;

			for (int j = 0; j < 4; j++) {
				if (j == R_2 - 1) {
					String row = in.nextLine();
					StringTokenizer st = new StringTokenizer(row);
					for (int k = 0; k < 4; k++) {
						int e = Integer.parseInt(st.nextElement().toString());
						for (int l = 0; l < 4; l++) {
							if (e == a1[l]) {
								counter++;
								index = e;
							}
						}
					}
				} else {
					in.nextLine();
				}
			}

			switch (counter) {
			case 0:
				bw.write("Case #" + (i + 1) + ": Volunteer cheated!\n");
				break;
			case 1:
				bw.write("Case #" + (i + 1) + ": " + index + "\n");
				break;
			default:
				bw.write("Case #" + (i + 1) + ": Bad magician!\n");
				break;
			}

		}
		System.out.println("Done!");
		bw.close();
		in.close();
	}
}
