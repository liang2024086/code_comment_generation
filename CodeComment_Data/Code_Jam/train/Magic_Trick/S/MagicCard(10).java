package methodEmbedding.Magic_Trick.S.LYD47;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MagicCard {
	public static void main(String[] args) throws IOException {
		int[][] arr1 = new int[4][4];
		int[][] arr2 = new int[4][4];
		String inFile = "E:\\A-small-attempt0.in";
		Scanner sc = new Scanner(new FileReader(inFile));
		String outFile = "E:\\A-small-attempt0.out";
		PrintWriter pw = new PrintWriter(outFile);
		int n = sc.nextInt();
		int timeRun = 1;
		while (n > 0) {
			int choose1 = sc.nextInt();
			sc.nextLine();
			String[] arrText1 = new String[4];
			for (int i = 0; i < 4; i++) {
				arrText1[i] = sc.nextLine();
			}
			StringTokenizer str1 = new StringTokenizer(arrText1[choose1 - 1]);
			int number1 = 0;
			while (str1.hasMoreTokens()) {
				arr1[choose1 - 1][number1] = Integer.parseInt(str1.nextToken());
				number1++;

			}
			int choose2 = sc.nextInt();
			sc.nextLine();
			String[] arrText2 = new String[4];
			for (int i = 0; i < 4; i++) {
				arrText2[i] = sc.nextLine();
			}
			StringTokenizer str2 = new StringTokenizer(arrText2[choose2 - 1]);
			int number2 = 0;
			while (str2.hasMoreTokens()) {
				arr2[choose2 - 1][number2] = Integer.parseInt(str2.nextToken());
				number2++;
			}
			int likeNumber = 0;
			int number3 = 0;
			for (int i = 0; i < arr1.length; i++) {
				for (int j = 0; j < arr2.length; j++) {
					if (arr1[choose1 - 1][i] == arr2[choose2 - 1][j]) {
						likeNumber++;
						number3 = arr1[choose1 - 1][i];
					}
				}
			}
			if (likeNumber == 1) {
				pw.println("Case #" + timeRun + ": " + number3);
				timeRun++;
			} else if (likeNumber == 0) {
				pw.println("Case #" + timeRun + ": " + "Volunteer cheated!");
				timeRun++;
			} else {
				pw.println("Case #" + timeRun + ": " + "Bad magician!");
				timeRun++;
			}
			n--;
		}
		pw.flush();
		pw.close();
		System.out.println("All Done");
	}
}
