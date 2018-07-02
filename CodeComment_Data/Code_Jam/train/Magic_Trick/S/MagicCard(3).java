package methodEmbedding.Magic_Trick.S.LYD1352;


import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MagicCard {
	public static void main(String[] args) throws IOException {
		int[][] array1 = new int[4][4];
		int[][] array2 = new int[4][4];
		String inFile = "D:\\A-small-attempt0(1).in";
		Scanner sc = new Scanner(new FileReader(inFile));
		String outFile = "D:\\A-small-attempt0(1).out";
		PrintWriter pw = new PrintWriter(outFile);
		int n = sc.nextInt();
		int tRun = 1;
		while (n > 0) {
			int choose1 = sc.nextInt();
			sc.nextLine();
			String[] arrayTextA = new String[4];
			for (int i = 0; i < 4; i++) {
				arrayTextA[i] = sc.nextLine();
			}
			StringTokenizer s1 = new StringTokenizer(arrayTextA[choose1 - 1]);
			int num1 = 0;
			while (s1.hasMoreTokens()) {
				array1[choose1 - 1][num1] = Integer.parseInt(s1.nextToken());
				num1++;
			}
			int choose2 = sc.nextInt();
			sc.nextLine();
			String[] arrayTextB = new String[4];
			for (int i = 0; i < 4; i++) {
				arrayTextB[i] = sc.nextLine();
			}
			StringTokenizer s2 = new StringTokenizer(arrayTextB[choose2 - 1]);
			int num2 = 0;
			while (s2.hasMoreTokens()) {
				array2[choose2 - 1][num2] = Integer.parseInt(s2.nextToken());
				num2++;
			}
			int likeNum = 0;
			int num3 = 0;
			for (int i = 0; i < array1.length; i++) {
				for (int j = 0; j < array2.length; j++) {
					if (array1[choose1 - 1][i] == array2[choose2 - 1][j]) {
						likeNum++;
						num3 = array1[choose1 - 1][i];
					}
				}
			}
			if (likeNum == 1) {
				pw.println("Case #" + tRun + ": " + num3);
				tRun++;
			} else if (likeNum == 0) {
				pw.println("Case #" + tRun + ": " + "Volunteer cheated!");
				tRun++;
			} else {
				pw.println("Case #" + tRun + ": " + "Bad magician!");
				tRun++;
			}
			n--;

		}
		pw.flush();
		pw.close();
		System.out.println("All Done");

	}

}
