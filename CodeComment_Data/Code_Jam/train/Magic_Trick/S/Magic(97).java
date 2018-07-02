package methodEmbedding.Magic_Trick.S.LYD208;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Magic {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(new File("A-small-attempt0.in"));
		PrintWriter out = new PrintWriter("output.txt", "UTF-8");

		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {

			int row1 = sc.nextInt();
			int[] n1 = new int[4];

			// get table

			sc.nextLine();

			for (int j = 0; j < 4; j++) {

				if ((j + 1) == row1) {

					for (int k = 0; k < 4; k++) {
						n1[k] = sc.nextInt();
					}

					sc.nextLine();

				} else {
					sc.nextLine();
				}

			}

			int row2 = sc.nextInt();
			int[] n2 = new int[4];

			sc.nextLine();

			// get the table again

			for (int j = 0; j < 4; j++) {

				if ((j + 1) == row2) {

					for (int k = 0; k < 4; k++) {
						n2[k] = sc.nextInt();
					}

					sc.nextLine();

				} else {
					sc.nextLine();
				}

			}

			int counter = 0, card = -1;

			for (int j = 0; j < n1.length; j++) {

				for (int k = 0; k < n2.length; k++) {

					if (n1[j] == n2[k]) {
						counter++;
						card = n1[j];
					}

				}

			}
			out.print("Case #" + (i + 1) + ": ");
			if (counter == 1) {
				out.println(card);
			} else if (counter == 0) {
				out.println("Volunteer cheated!");
			} else {
				out.println("Bad magician!");
			}

		}

		sc.close();
		out.close();
	}
}
