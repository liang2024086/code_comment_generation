package methodEmbedding.Magic_Trick.S.LYD1722;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Magician1 {
	public static void main(String args[]) throws IOException {
		File file = new File("input.txt");
		Scanner sc = new Scanner(file);
		FileWriter fo = new FileWriter("output.txt");
		int test_cases, ans1, ans2, count = 0, element = 0;
		int arr1[][] = new int[4][4];
		int arr2[][] = new int[4][4];
		test_cases = sc.nextInt();
		for (int N = 0; N < test_cases; N++) {
			ans1 = sc.nextInt(); // row number
			ans1 -= 1;
			for (int a = 0; a < 4; a++) {
				for (int b = 0; b < 4; b++) {
					arr1[a][b] = sc.nextInt();
				}
			}
			ans2 = sc.nextInt();
			ans2 -= 1;
			for (int c = 0; c < 4; c++) {
				for (int d = 0; d < 4; d++) {
					arr2[c][d] = sc.nextInt();
				}
			}
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					if (arr1[ans1][i] == arr2[ans2][j]) {
						count++;
						element = arr1[ans1][i];
					}
				}
			}

			if (count == 1) {
				count = 0;
				fo.write("case #" + (N+1) + ": " + element);
				fo.write("\n");
			} else if (count > 1) {
				count = 0;
				fo.write("case #" + (N+1) + ": " + "Bad Magician!");
				fo.write("\n");
			} else if (count == 0) {
				count = 0;
				fo.write("case #" + (N+1) + ": " + "Volunteer cheated!");
				fo.write("\n");
			}

		}
		sc.close();
		fo.close();

	}
}
