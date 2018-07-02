package methodEmbedding.Magic_Trick.S.LYD1924;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Magic {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("A"));
		// Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			ArrayList<Integer> source = new ArrayList<>();
			ArrayList<Integer> dest = new ArrayList<>();
			int found = 0;
			int card = 0;
			int skip = sc.nextInt();
			for (int j = 1; j < 5; j++) {
				if (j != skip) {
					sc.nextInt();
					sc.nextInt();
					sc.nextInt();
					sc.nextInt();
					continue;
				} else {
					for (int k = 0; k < 4; k++) {
						source.add(sc.nextInt());
					}
				}
			}

			skip = sc.nextInt();
			for (int j = 1; j < 5; j++) {
				if (j != skip) {
					sc.nextInt();
					sc.nextInt();
					sc.nextInt();
					sc.nextInt();
					continue;
				} else {
					for (int k = 0; k < 4; k++) {
						dest.add(sc.nextInt());
					}
				}
			}

			for (int x : source) {
				if (dest.contains(x)) {
					card = x;
					found++;
				}

			}

			if (found == 0) {
				System.out.println("Case #" + (i + 1) + ": Volunteer cheated!");
			} else if (found > 1) {
				System.out.println("Case #" + (i + 1) + ": Bad magician!");
			} else {
				System.out.println("Case #" + (i + 1) + ": " + card);

			}

		}
		sc.close();
	}

}
