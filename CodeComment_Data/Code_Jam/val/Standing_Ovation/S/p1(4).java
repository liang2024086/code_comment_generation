package methodEmbedding.Standing_Ovation.S.LYD1626;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class p1 {
	public static void main(String[] args) throws IOException {
		String workingDir = System.getProperty("user.dir") + "\\src\\";
		BufferedReader br = new BufferedReader(new FileReader(workingDir+"in.txt"));
		String line = br.readLine();
		int case_count = Integer.parseInt(line);
		String result = "";
		for(int i = 0; i < case_count; i++) {
			line = br.readLine();
			String[] splits = line.split(" ");
			int max = Integer.parseInt(splits[0]);
			int standing = Character.getNumericValue(splits[1].charAt(0));
			int needed = 0;
			for (int j = 1; j < max + 1; j++) {
				int current = Character.getNumericValue(splits[1].charAt(j));
				if (standing < j) {
					needed += j - standing;
					standing = j;
				} 
				standing += current;
			}
			result += "Case #" + (i+1) + ": " + needed + "\n";
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
