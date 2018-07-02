package methodEmbedding.Magic_Trick.S.LYD1584;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Magic {
	
	StringBuilder output;
	
	public Magic() throws NumberFormatException, IOException {
		
		output = new StringBuilder();
		
		
		BufferedReader in = new BufferedReader(new FileReader(new File("src/Qualification/magic.in")));
		
		int T = Integer.parseInt(in.readLine());
		
		for (int i = 0; i < T; i++) {
			
			// Input
			
			int firstPick = Integer.parseInt(in.readLine());
			
			int[][] board1 = new int[4][4];
			
			for (int j = 0; j < 4; j++) {
				String line = in.readLine();
				
				board1[j][0] = Integer.parseInt(line.split(" ")[0]);
				board1[j][1] = Integer.parseInt(line.split(" ")[1]);
				board1[j][2] = Integer.parseInt(line.split(" ")[2]);
				board1[j][3] = Integer.parseInt(line.split(" ")[3]);
			}
			
			int secondPick = Integer.parseInt(in.readLine());
			
			int[][] board2 = new int[4][4];
			
			for (int j = 0; j < 4; j++) {
				String line = in.readLine();
				
				board2[j][0] = Integer.parseInt(line.split(" ")[0]);
				board2[j][1] = Integer.parseInt(line.split(" ")[1]);
				board2[j][2] = Integer.parseInt(line.split(" ")[2]);
				board2[j][3] = Integer.parseInt(line.split(" ")[3]);
			}
			
			
			// Solve
			
			int[] set1 = board1[firstPick-1];
			int[] set2 = board2[secondPick-1];
			
			int coincidents = 0;
			int coincident = 0;
			
			
			for (int x = 0; x < 4; x++) {
				for (int y = 0; y < 4; y++) {
					if (set1[x] == set2[y]) {
						coincidents++;
						coincident = set1[x];
					}
				}
			}
			
			if (coincidents == 0) {
				output.append("Case #" + (i + 1) + ": Volunteer Cheated!\n");
			} else if (coincidents == 1) {
				output.append("Case #" + (i + 1) + ": " + coincident + "\n");
			} else {
				output.append("Case #" + (i + 1) +  ": Bad magician!\n");
			}
			
		}
		
		System.out.println(output);
		
			
		
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		new Magic();
	}

}
