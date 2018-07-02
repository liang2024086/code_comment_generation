package methodEmbedding.Magic_Trick.S.LYD923;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintStream;
import java.math.RoundingMode;
import java.util.HashSet;
import java.util.Set;

public class Magic {

	public static void main(String[] args) throws Exception {
		String infile = args[0];
		String outfile = args[1];
		BufferedReader in = new BufferedReader(new FileReader(new File(infile)));
		PrintStream ps = new PrintStream(outfile);
		int T = Integer.parseInt(in.readLine());
		for (int t = 0; t < T; t++) {
			int ansA = Integer.parseInt(in.readLine());
			int[][] gridA = new int[4][4];
			for (int row = 0; row < 4; row++) {
				String[] rowParts = in.readLine().split(" ");
				for (int col = 0; col < 4; col++) {
					gridA[row][col] = Integer.parseInt(rowParts[col]);
				}
			}
			int ansB = Integer.parseInt(in.readLine());
			int[][] gridB = new int[4][4];
			for (int row = 0; row < 4; row++) {
				String[] rowParts = in.readLine().split(" ");
				for (int col = 0; col < 4; col++) {
					gridB[row][col] = Integer.parseInt(rowParts[col]);
				}
			}
			
			Set<Integer> potentials = new HashSet<Integer>();
			
			for (int i : gridA[ansA - 1]) {
				for (int j : gridB[ansB - 1]) {
					if (i == j) {
						potentials.add(i);
					}
				}
			}
			
			
			if (potentials.size() > 1) {
				ps.println("Case #" + (t+1) + ": Bad magician!");
			} else if (potentials.isEmpty()) {
				ps.println("Case #" + (t+1) + ": Volunteer cheated!");
			} else {
				for (int ans : potentials) {
					ps.println("Case #" + (t+1) + ": " + ans);
				}
			}
			
		}
		ps.close();
		in.close();
	}
	
}
