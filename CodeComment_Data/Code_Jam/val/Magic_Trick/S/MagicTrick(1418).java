package methodEmbedding.Magic_Trick.S.LYD827;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class MagicTrick {
	private final static int GRID_SIZE = 4;
	
	

	public static void main(String[] args) {
		if (args.length < 2) {
			System.out.print("Arguments required: <input> <output>");
			return;
		}
		
		Path inputPath = Paths.get(args[0]);
		Path outputPath = Paths.get(args[1]);
		Charset charset = StandardCharsets.US_ASCII;
		String s;
		try (BufferedWriter writer = Files.newBufferedWriter(outputPath, charset);
		     BufferedReader reader = Files.newBufferedReader(inputPath, charset)) {
			int tests = Integer.parseInt(reader.readLine());
			int[][] grid1 = new int[4][4];
			int[][] grid2 = new int[4][4];
			for (int test = 1; test <= tests; test++) {
				int answer1 = Integer.parseInt(reader.readLine()) - 1;
				for (int i = 0; i < 4; i++) {
					String row[] = reader.readLine().split(" ");
					for (int j = 0; j < 4; j++) {
						grid1[i][j] = Integer.parseInt(row[j]);
					}
				}
				
				int answer2 = Integer.parseInt(reader.readLine()) - 1;
				for (int i = 0; i < 4; i++) {
					String row[] = reader.readLine().split(" ");
					for (int j = 0; j < 4; j++) {
						grid2[i][j] = Integer.parseInt(row[j]);
					}
				}
				
				int countMatching = 0;
				int matchingCard = 0;
				for(int i = 0; i < 4; i++) {
					for (int j = 0; j < 4; j++) {
						if (grid1[answer1][i] == grid2[answer2][j]) {
							countMatching++;
							matchingCard = grid1[answer1][i];
						}
					}
				}
				
				String answer = "";
				switch(countMatching) {
				case 0: answer = "Volunteer cheated!";
						break;
				case 1: answer = String.valueOf(matchingCard);
						break;
				default: answer = "Bad magician!";
						 break;
				}
				
				
				writer.append(String.format("Case #%d: %s%n", test, answer));
			}
		} catch (IOException x) {
		    System.err.format("IOException: %s%n", x);
		}
	}

}
