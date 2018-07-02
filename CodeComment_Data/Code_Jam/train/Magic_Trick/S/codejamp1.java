package methodEmbedding.Magic_Trick.S.LYD441;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;


public class codejamp1 {
	public static void main(String[] args) throws IOException {
		String workingDir = System.getProperty("user.dir") + "\\src\\";
		BufferedReader br = new BufferedReader(new FileReader(workingDir+"in.txt"));
		String line = br.readLine();
		int case_count = Integer.parseInt(line);
		String result = "";
		for(int i = 0; i < case_count; i++) {
			line = br.readLine();
			String sol = "";
			int first_row = Integer.parseInt(line);
			HashSet<Integer> row_set= new HashSet<Integer>();
			for(int j = 0; j < 4; j++) {
				line = br.readLine();
				if (first_row == j+1) {
					String[] split = line.split(" ");
					for(int k = 0; k < 4; k++) {
						row_set.add(Integer.parseInt(split[k]));
					}
				}
			}
			line = br.readLine();
			int second_row = Integer.parseInt(line);
			int counter = 0;
			int only_match = -1;
			for(int j = 0; j < 4; j++) {
				line = br.readLine();
				if (second_row == j+1) {
					String[] split = line.split(" ");
					for(int k = 0; k < 4; k++) {
						int current = Integer.parseInt(split[k]);
						if(row_set.contains(current)) {
							counter++;
							only_match = current;
						}
					}
				}
			}
			if (counter == 1) {
				sol = "" + only_match;
			} else if (counter == 0) {
				sol = "Volunteer cheated!";
			} else {
				sol = "Bad magician!";
			}
			result += "Case #" + (i+1) + ": " + sol + "\n";
		}
		
		File file = new File(workingDir+"out.txt");
		if (!file.exists()) {
			file.createNewFile();
		}

		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(result);
		bw.close();
	}
}
