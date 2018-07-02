package methodEmbedding.Magic_Trick.S.LYD1613;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) throws FileNotFoundException {
		PrintStream out = new PrintStream("output.txt");
		//PrintStream out = System.out;
		
		Scanner scanner = new Scanner(new File("A-small-attempt0.in"));
		int cases = scanner.nextInt();
		for (int casen = 1; casen <= cases; casen++) {
			out.print("Case #" + casen + ": ");
			int[] res = new int[17];
			int a = scanner.nextInt() - 1;
			int[][] x = new int[4][4];
			for (int i = 0; i < 4; i++)
				for (int j = 0; j < 4; j++)
					x[i][j] = scanner.nextInt();
			for (int i = 0; i < 4; i++)
				res[x[a][i]]++;
			a = scanner.nextInt() - 1;
			x = new int[4][4];
			for (int i = 0; i < 4; i++)
				for (int j = 0; j < 4; j++)
					x[i][j] = scanner.nextInt();
			for (int i = 0; i < 4; i++)
				res[x[a][i]]++;
			int sol = 0;
			int i;
			for (i = 1; i <= 16; i++) {
				if (sol == 0 && res[i] == 2)
					sol = i;
				else if (sol != 0 && res[i] == 2) {
					out.println("Bad magician!");
					break;
				}
			}
			if (i != 17)
				continue;
			if (sol == 0)
				out.println("Volunteer cheated!");
			else
				out.println(sol);
		}
		scanner.close();
	}

}
