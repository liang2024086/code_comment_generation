package methodEmbedding.Magic_Trick.S.LYD1077;


import java.util.*;
import java.io.*;

public class magician {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(new File("test.txt")));
		PrintWriter out = new PrintWriter(new FileWriter("out.txt"));
		int T = Integer.parseInt(br.readLine().trim());
		for (int i =1; i <= T; i++) {
			out.print("Case #"+i+": ");
			int r = Integer.parseInt(br.readLine().trim());
			int[] row = new int[4];
			for (int j = 1; j <= 4; j++) {
				if (j == r) {
					StringTokenizer st = new StringTokenizer(br.readLine().trim());
					for (int q = 0; q < 4; q++) {
						row[q] = Integer.parseInt(st.nextToken());
					}
				} else {
					br.readLine();
				}
			}
			r = Integer.parseInt(br.readLine().trim());
			int[] row2 = new int[4];
			for (int j = 1; j <= 4; j++) {
				if (j == r) {
					StringTokenizer st = new StringTokenizer(br.readLine().trim());
					for (int q = 0; q < 4; q++) {
						row2[q] = Integer.parseInt(st.nextToken());
					}
				} else {
					br.readLine();
				}
			}
			int total = 0;
			int same = -1;
			for (int k = 0; k < 4; k++) {
				for (int j = 0; j < 4; j++) {
					if (row[k] == row2[j]) {
						total++;
						same = row[k];
					}
				}
			}
			if (total == 0) {
				out.println("Volunteer cheated!");
			} else if (total == 1) {
				out.println(same);
			} else {
				out.println("Bad magician!");
			}
		}
		out.close();
	}
}
