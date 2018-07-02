package methodEmbedding.Magic_Trick.S.LYD1676;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Magic {

	public static void main(String[] args) {
		File f = new File("src/A");
		Scanner sc = null;
		try {
			sc = new Scanner(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		File f2 = new File("src/A-small");
		PrintWriter out = null;
		try {
			out = new PrintWriter(f2);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			int row1 = sc.nextInt() - 1;
			int[][] a1 = new int[4][4];
			for (int k = 0; k < 4; k++)
				for (int p = 0; p < 4; p++)
					a1[k][p] = sc.nextInt();
			int row2 = sc.nextInt() - 1;
			int[][] a2 = new int[4][4];
			for (int k = 0; k < 4; k++)
				for (int p = 0; p < 4; p++)
					a2[k][p] = sc.nextInt();
			int[] line1 = new int[4];
			for (int j = 0; j < 4; j++)
				line1[j] = a1[row1][j];

			int[] line2 = new int[4];
			for (int j = 0; j < 4; j++)
				line2[j] = a2[row2][j];
			int flag = 0;
			int C = 0;
			for (int i = 0; i < 4; i++)
				for (int j = 0; j < 4; j++) {
					if (line1[i] == line2[j]) {
						flag++;
						C = i;
					}

				}

			

			if (flag == 1)
				out.println("Case #" + t + ": " + a1[row1][C]);
			else if(flag > 1)
				out.println("Case #" + t + ": Bad magician!");
			else
				out.println("Case #" + t + ": Volunteer cheated!");
			

		}
		out.close();

	}

}
