package methodEmbedding.Magic_Trick.S.LYD1638;


import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MagicCard {
	public static void main(String[] args) throws IOException {

		int[][] arrIntA = new int[4][4];
		int[][] arrIntB = new int[4][4];
		String inputFile = "E:\\A-small-attempt5.in";
		Scanner sc = new Scanner(new FileReader(inputFile));
		String outputFile = "E:\\A-small-attempt5.out";
		PrintWriter pw = new PrintWriter(outputFile);
		int n = sc.nextInt();
		int time = 1;
		while (n > 0) {
			int chonTruoc = sc.nextInt();
			sc.nextLine();
			String[] arrTextA = new String[4];
			for (int i = 0; i < 4; i++) {
				arrTextA[i] = sc.nextLine();
			}
			StringTokenizer strA = new StringTokenizer(arrTextA[chonTruoc - 1]);
			int num1 = 0;
			while (strA.hasMoreTokens()) {
				arrIntA[chonTruoc - 1][num1] = Integer.parseInt(strA
						.nextToken());
				num1++;

			}
			int chonSau = sc.nextInt();
			sc.nextLine();
			String[] arrTextB = new String[4];
			for (int i = 0; i < 4; i++) {
				arrTextB[i] = sc.nextLine();
			}
			StringTokenizer strB = new StringTokenizer(arrTextB[chonSau - 1]);
			int num2 = 0;
			while (strB.hasMoreTokens()) {
				arrIntB[chonSau - 1][num2] = Integer.parseInt(strB.nextToken());
				num2++;
			}
			int likeNumber = 0;
			int num3 = 0;
			for (int i = 0; i < arrIntA.length; i++) {
				for (int j = 0; j < arrIntB.length; j++) {
					if (arrIntA[chonTruoc - 1][i] == arrIntB[chonSau - 1][j]) {
						likeNumber++;
						num3 = arrIntA[chonTruoc - 1][i];
					}
				}
			}
			if (likeNumber == 1) {
				pw.println("Case #" + time + ": " + num3);
				time++;
			} else if (likeNumber == 0) {
				pw.println("Case #" + time + ": " + "volunteer cheated!");
				time++;
			} else {
				pw.println("Case #" + time + ": " + "Bad magician!");
				time++;
			}
			n--;
		}
		pw.flush();
		pw.close();
		System.out.println("Xong!!!");

	}

}
