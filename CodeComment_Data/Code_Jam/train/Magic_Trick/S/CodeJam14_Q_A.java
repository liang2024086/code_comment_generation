package methodEmbedding.Magic_Trick.S.LYD926;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class CodeJam14_Q_A {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(new File("output"));
		int t = in.nextInt();
		for (int tc = 1; tc <= t; tc++) {
			int num = in.nextInt() - 1;
			int[] curRow = new int[4];
			for (int i = 0; i < 4; i++) {
				if (i != num) 
					for (int j = 0; j < 4; j++)
						in.nextInt();
				else
					for (int j = 0; j < 4; j++)
						curRow[j] = in.nextInt();
			}

			num = in.nextInt() - 1;
			int cur;
			int counter = 0;
			int ans = 0;
			for (int i = 0; i < 4; i++) {
				if (i != num)
					for (int j = 0; j < 4; j++)
						in.nextInt();
				else {
					for (int j = 0; j < 4; j++) {
						cur = in.nextInt();
						for (int k = 0; k < 4; k++)
							if (curRow[k] == cur) {
								counter++;
								ans = cur;
							}
					}
				}
			}
			
			out.print("Case #" + tc + ": ");
			if (counter == 0)
				out.println("Volunteer cheated!");
			else if (counter == 1) 
				out.println(ans);
			else
				out.println("Bad magician!");
		}
		in.close();
		out.close();
	}
}
