package methodEmbedding.Magic_Trick.S.LYD503;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class MagicTrick {
	public static void main(String[] args) throws IOException {
		int[][] arr1 = new int[4][4];
		int[][] arr2 = new int[4][4];
		int count = 0;
		int result = 0;
		int up = 1;
		String inFile = "E:\\A-small-attempt0.in";
		Scanner sc = new Scanner(new FileReader(inFile));
		String outFile = "E:\\A-small-attempt0.out";
		PrintWriter pw = new PrintWriter(outFile);
		int n = sc.nextInt();

		while (n > 0) {

			int c = 0;

			ArrayList<Integer> arr11 = new ArrayList<Integer>();
			ArrayList<Integer> arr22 = new ArrayList<Integer>();
			int chose1 = sc.nextInt();
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					int num1 = sc.nextInt();
					arr1[i][j] = num1;
					if (i == (chose1 - 1)) {
						arr11.add(num1);

					}

				}
			}

			int chose2 = sc.nextInt();
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					int num2 = sc.nextInt();
					arr2[i][j] = num2;
					if (i == (chose2 - 1)) {
						arr22.add(num2);
					}
				}
			}
			while (c < 4) {
				for (int i = 0; i < 4; i++) {
					if (arr11.get(c) == arr22.get(i)) {
						count++;
						result = arr22.get(i);
					}
				}
				c++;
			}
			if (count == 1) {
				pw.println("Case #" + up + ": " + result);
				up++;
			} else if (count == 0) {
				pw.println("Case #" + up + ": " + "Volunteer cheated!");
				up++;
			} else {
				pw.println("Case #" + up + ": " + "Bad magician!");
				up++;
			}
			arr11.clear();
			count = 0;
			n--;
		}
		pw.flush();
		pw.close();
		System.out.println("Done");
	}

}
