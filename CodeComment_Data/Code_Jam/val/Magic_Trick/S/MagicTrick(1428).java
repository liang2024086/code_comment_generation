package methodEmbedding.Magic_Trick.S.LYD332;

import java.io.*;
import java.util.*;

public class MagicTrick {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(new FileInputStream("src/A-small.in"))));

		String output = "";
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int firstAns = sc.nextInt()-1;
			int[][] first = new int[4][4];
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 4; k++) {
					first[j][k] = sc.nextInt();
				}
			}
			int secAns = sc.nextInt()-1;
			int[][] sec = new int[4][4];
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 4; k++) {
					sec[j][k] = sc.nextInt();
				}
			}
			List<Integer> list = new ArrayList<Integer>();
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 4; k++) {
					if (first[firstAns][j] == sec[secAns][k])
						list.add(first[firstAns][j]);
				}
			}
			switch (list.size()) {
			case 0:
				output += "Case #" + (i+1) + ": Volunteer cheated!\n";
				break;
			case 1:
				output += "Case #" + (i+1) + ": " + list.get(0) + "\n";
				break;
			default:
				output += "Case #" + (i+1) + ": Bad magician!\n";
				break;
			}
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("src/A-small.out"), "utf-8"));
		bw.write(output);
		bw.close();
	}
}
