package methodEmbedding.Standing_Ovation.S.LYD1948;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


public class MainClass {

	public static void main(String[] args) {
		FileReader file = null;
		PrintWriter outFile = null;
		try {
			file = new FileReader("input.txt");
			outFile = new PrintWriter("output.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		BufferedReader br = new BufferedReader(file);
		try {
			int totalCases = Integer.parseInt(br.readLine());
			for(int i = 1; i <= totalCases; i++) {
				String temp = br.readLine();
				String line[] = temp.split(" ");
				int maxShyLevel = Integer.parseInt(line[0]);
				int standing = 0;
				int friends = 0;
				String str = line[1];
				for(int j = 0; j < str.length(); j++) {
					int count = Integer.parseInt(Character.toString(str.charAt(j)));
					if(count > 0) {
						if(standing >= j) {
							standing += count;
						}
						else {
							friends += (j - standing);
							standing += friends + count;
						}						
					}
				}
				outFile.println("Case #"+i+": "+friends);
			}
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		if(outFile != null) {
			outFile.close();
		}
	}

}
