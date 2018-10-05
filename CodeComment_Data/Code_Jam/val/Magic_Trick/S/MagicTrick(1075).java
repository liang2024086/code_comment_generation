package methodEmbedding.Magic_Trick.S.LYD68;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;

public class MagicTrick {

	public static void main(String[] args) throws IOException {
		File inputFile = new File(args[0]);
		File outputFile = new File(args[1]);
		BufferedReader reader = new BufferedReader(new FileReader(inputFile));
		BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
		
		int numOfQuestion = Integer.valueOf(reader.readLine());
		
		for (int i = 0; i < numOfQuestion; i++) {
			int firstRow = Integer.valueOf(reader.readLine());
			HashSet<Integer> set = new HashSet<Integer>(); 
			
			for (int j = 1; j <= 4; j++) {
				String line = reader.readLine();
				if (j == firstRow) {
					String[] strArray= line.split(" ");
					for (int k = 0; k < 4; k++) {
						set.add(Integer.valueOf(strArray[k]));
					}
				}
			}
			
			int secondRow = Integer.valueOf(reader.readLine());
			int count = 0;
			String result = "";
			for (int j = 1; j <= 4; j++) {
				String line = reader.readLine();
				if (j == secondRow) {
					String[] strArray= line.split(" ");
					for (int k = 0; k < 4; k++) {
						if (set.contains(Integer.valueOf(strArray[k]))) {
							count++;
							result = strArray[k];
						}
					}
				}
			}
			
			String output = "Case #" + String.valueOf(i + 1) + ": ";
			if (count == 1) {
				output += result;
			} else if (count == 0) {
				output += "Volunteer cheated!";
			} else {
				output += "Bad magician!";
			}
			writer.write(output);
			writer.newLine();
			writer.flush();
		}
		
		reader.close();
		writer.close();
	}
}
