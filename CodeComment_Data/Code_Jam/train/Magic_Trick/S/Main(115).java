package methodEmbedding.Magic_Trick.S.LYD1554;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(args[0]));
			String line = br.readLine();
			int T = Integer.parseInt(line);
			// read Arb input
			for (int t = 0; t < T; t++) {
				int[][] grid1 = new int[4][4];
				int[][] grid2 = new int[4][4];
				int row1 = 0;
				int row2 = 0;

				row1 = Integer.parseInt(br.readLine());
				for (int i = 0; i < 4; i++) {
					line = br.readLine();
					int j = 0;
					for (String c : line.split(" ",-1)) {
						grid1[i][j++] = Integer.parseInt(c);
					}
				}

				row2 = Integer.parseInt(br.readLine());
				for (int i = 0; i < 4; i++) {
					line = br.readLine();
					int j = 0;
					for (String c : line.split(" ",-1)) {
						grid2[i][j++] = Integer.parseInt(c);
					}
				}
				
				int count = 0;
				int val = 0;
				for (int i = 0; i < 4; i++) {
					for (int j = 0; j < 4; j++) {
						if (grid1[row1-1][i] == grid2[row2-1][j]) {
							count++;
							val = grid1[row1-1][i];
						}
					}
				}

				System.out.print("Case #" + (t+1) + ": ");
				if (count > 1) {
					System.out.println("Bad magician!");
				} else if (count == 0) {
					System.out.println("Volunteer cheated!");					
				} else {
					System.out.println(val);
				}
					

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			br.close();
		}

	}

}
