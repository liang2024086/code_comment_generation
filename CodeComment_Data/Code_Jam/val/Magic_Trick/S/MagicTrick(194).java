package methodEmbedding.Magic_Trick.S.LYD860;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;


public class MagicTrick {

	public static void main(String[] args) throws IOException {
		
		List<String> lines = Files.readAllLines(new File("problem1.txt").toPath(), Charset.defaultCharset());
		PrintWriter writer = new PrintWriter("output.txt", "UTF-8");

		
		int testcases = Integer.parseInt(lines.get(0));
		
		int index = 0;
		for(int i = 0; i < testcases; i++) {
			
			index++;
			
			int first = Integer.parseInt(lines.get(index));
			int[][] array1 = new int[4][4];
			
			for(int j=0;j<4;j++){
				index++;
				String[] row = lines.get(index).split(" ");
				for(int k=0;k<4;k++){
					array1[j][k] = Integer.parseInt(row[k]);
				}
			}
			
			index++;
			
			int second = Integer.parseInt(lines.get(index));
			int[][] array2 = new int[4][4];
			
			for(int j=0;j<4;j++){
				index++;
				String[] row = lines.get(index).split(" ");
				for(int k=0;k<4;k++){
					array2[j][k] = Integer.parseInt(row[k]);
				}
			}
			
			int result = 0;
			int num = 0;
			
			for(int j=0;j<4;j++){
				
				for(int k=0;k<4;k++){
					
					if(array1[first-1][j] == array2[second-1][k]) {
						result++;
						num = array1[first-1][j];
					}
					
				}
				
			}
			
			if(result == 1) {
				writer.println("Case #" + (i+1) + ": " + (num));
			} else if(result > 1) {
				writer.println("Case #" + (i+1) + ": Bad magician!");
			} else if(result == 0) {
				writer.println("Case #" + (i+1) + ": Volunteer cheated!");
			}
			
		}
		
		writer.close();

	}

}
