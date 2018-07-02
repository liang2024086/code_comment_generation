package methodEmbedding.Magic_Trick.S.LYD28;

import java.io.*;
import java.util.*;

public class magictrick {
	public static void main(String[] args) throws IOException {
		//BufferedReader br = new BufferedReader(new FileReader("14a.txt"));
		//PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("gcj14aOut.txt")));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		StringTokenizer st;
		
		for (int t = Integer.parseInt(br.readLine()), k = 1; t-- > 0; k++) {
			boolean[] guess1 = new boolean[16], guess2 = new boolean[16];
			int row1 = Integer.parseInt(br.readLine());
			for (int i = 0; i < 4; i++) {
				st = new StringTokenizer(br.readLine());
				if (i == row1 - 1)
					for (int j = 0; j < 4; j++)
						guess1[Integer.parseInt(st.nextToken()) - 1] = true;
			}
			int row2 = Integer.parseInt(br.readLine());
			for (int i = 0; i < 4; i++) {
				st = new StringTokenizer(br.readLine());
				if (i == row2 - 1)
					for (int j = 0; j < 4; j++)
						guess2[Integer.parseInt(st.nextToken()) - 1] = true;
			}
			boolean flag1 = false, flag2 = false;
			for (int i = 0; i < 16; i++) {
				if (guess1[i] && guess2[i]) {
					if (flag1) {
						flag1 = false;
						flag2 = true;
						break;
					}
					flag1 = true;
					row1 = i + 1;
				}
			}
			if (flag1)
				out.println("Case #" + k + ": " + row1);
			else if (flag2)
				out.println("Case #" + k + ": Bad magician!");
			else
				out.println("Case #" + k + ": Volunteer cheated!");
		}
		br.close();
		out.close();
	}
}
