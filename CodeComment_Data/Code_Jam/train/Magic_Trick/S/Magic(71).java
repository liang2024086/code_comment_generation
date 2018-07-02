package methodEmbedding.Magic_Trick.S.LYD1913;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Magic {
	public static void main(String[] args) throws IOException {
		int[][] array1 = new int[4][4];
		int[][] array2 = new int[4][4];
		String inFile = "E:\\A-small-attempt3.in";
		Scanner sc = new Scanner(new FileReader(inFile));
		String outFile = "E:\\A-small-attempt3.out";
		PrintWriter pw = new PrintWriter(outFile);
		int n = sc.nextInt();
		int time = 1;
		while (n > 0) {
			int choose1 = sc.nextInt();
			sc.nextLine();
			String[] arrayText1 = new String[4];
			for (int i = 0; i < 4; i++) {
				arrayText1[i] = sc.nextLine();
			}
			StringTokenizer string1 = new StringTokenizer(arrayText1[choose1 - 1]);
			int nber1 = 0;
			while (string1.hasMoreTokens()) {
				array1[choose1 - 1][nber1] = Integer.parseInt(string1.nextToken());
				nber1++;

			}
			int choose2 = sc.nextInt();
			sc.nextLine();
			String[] arrayText2 = new String[4];
			for (int i = 0; i < 4; i++) {
				arrayText2[i] = sc.nextLine();
			}
			StringTokenizer string2 = new StringTokenizer(arrayText2[choose2 - 1]);
			int number2 = 0;
			while (string2.hasMoreTokens()) {
				array2[choose2 - 1][number2] = Integer.parseInt(string2.nextToken());
				number2++;
			}
			int Nber = 0;
			int nber3 = 0;
			for (int i = 0; i < array1.length; i++) {
				for (int j = 0; j < array2.length; j++) {
					if (array1[choose1 - 1][i] == array2[choose2 - 1][j]) {
						Nber++;
						nber3 = array1[choose1 - 1][i];
					}
				}
			}
			if (Nber == 1) {
				pw.println("Case #" + time + ": " + nber3);
				time++;
			} else if (Nber == 0) {
				pw.println("Case #" + time + ": " + "Volunteer cheated!");
				time++;
			} else {
				pw.println("Case #" + time + ": " + "Bad magician!");
				time++;
			}
			n--;
		}
		pw.flush();
		pw.close();
		System.out.println("All Done");
	}
}
