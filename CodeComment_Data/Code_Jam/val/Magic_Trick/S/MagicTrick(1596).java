package methodEmbedding.Magic_Trick.S.LYD21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class MagicTrick {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("in"));
			BufferedWriter bw = new BufferedWriter(new FileWriter("out"));

			int tests = Integer.parseInt(br.readLine());

			for (int i = 0; i < tests; ++i) {
				int ans1 = Integer.parseInt(br.readLine()) - 1;
				int[][] arrangement1 = new int[4][4];
				for (int r = 0; r < 4; ++r) {
					String[] tokens = br.readLine().split(" ");
					arrangement1[r][0] = Integer.parseInt(tokens[0]);
					arrangement1[r][1] = Integer.parseInt(tokens[1]);
					arrangement1[r][2] = Integer.parseInt(tokens[2]);
					arrangement1[r][3] = Integer.parseInt(tokens[3]);
				}

				int ans2 = Integer.parseInt(br.readLine()) - 1;
				int[][] arrangement2 = new int[4][4];
				for (int r = 0; r < 4; ++r) {
					String[] tokens = br.readLine().split(" ");
					arrangement2[r][0] = Integer.parseInt(tokens[0]);
					arrangement2[r][1] = Integer.parseInt(tokens[1]);
					arrangement2[r][2] = Integer.parseInt(tokens[2]);
					arrangement2[r][3] = Integer.parseInt(tokens[3]);
				}

				LinkedList<Integer> matches = new LinkedList<>();
				for (int f1 = 0; f1 < 4; ++f1) {
					for (int f2 = 0; f2 < 4; ++f2) {
						if (arrangement1[ans1][f1] == arrangement2[ans2][f2]) {
							matches.add(arrangement1[ans1][f1]);
						}
					}
				}
				
				if(matches.size() == 1) {
					bw.write("Case #" + Integer.toString(i + 1) + ": " + Integer.toString(matches.getFirst()) + "\n");
				} else if(matches.size() > 1) {
					bw.write("Case #" + Integer.toString(i + 1) + ": Bad magician!\n");
				} else {
					bw.write("Case #" + Integer.toString(i + 1) + ": Volunteer cheated!\n");
				}
			} 
			
			br.close();
			bw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
