package methodEmbedding.Magic_Trick.S.LYD819;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class A {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new FileReader("input.txt"));
		int T = in.nextInt();
		int[][] arr1 = new int[4][4];
		int[][] arr2 = new int[4][4];

		BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));

		for (int I = 1; I <= T; I++) {
			int res1 = in.nextInt() - 1;
			for (int i = 0; i < 4; i++)
				for (int j = 0; j < 4; j++)
					arr1[i][j] = in.nextInt();

			int res2 = in.nextInt() - 1;
			for (int i = 0; i < 4; i++)
				for (int j = 0; j < 4; j++)
					arr2[i][j] = in.nextInt();

			boolean[] v = new boolean[17];
			for (int i = 0; i < 4; i++)
				v[arr1[res1][i]] = true;

			int cnt = 0, answer = -1;
			for (int i = 0; i < 4; i++)
				if (v[arr2[res2][i]]) {
					answer = arr2[res2][i];
					cnt++;
				}

			String s;

			if (cnt == 1)
				s = answer + "";
			else if (cnt > 1)
				s = "Bad magician!";
			else
				s = "Volunteer cheated!";

			System.out.println("Case #" + I + ": " + s);
			
			bw.write("Case #" + I + ": " + s + "\n");
		}

		bw.close();
	}
}
