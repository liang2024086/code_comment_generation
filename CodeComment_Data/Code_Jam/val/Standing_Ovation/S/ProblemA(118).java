package methodEmbedding.Standing_Ovation.S.LYD38;

import java.io.*;

public class ProblemA {
	public static void main(String args[]) throws Exception {

		FileInputStream fis = new FileInputStream(
				"D:/Code_Jam/ProblemA/A-small-attempt1.in");
		BufferedReader reader = new BufferedReader(new InputStreamReader(fis));

		File OutputFile = new File("D:/Code_Jam/ProblemA/Output.txt");
		BufferedWriter writer = new BufferedWriter(new FileWriter(OutputFile));
		
		String newline = System.getProperty("line.separator");
		
		String s = reader.readLine();
		int totalCount = Integer.parseInt(s);
		for (int i = 0; i < totalCount; i++) {
			s = reader.readLine();
			String[] parts = s.split(" ");
			int count = Integer.parseInt(parts[0]);
			String audArray = parts[1];
			int audCount = 0;
			int NumNeeded = 0;
			for (int j = 0; j <= count; j++) {
				if (audCount < j) {
					NumNeeded = NumNeeded + j - audCount;
					audCount = j;
				}
				audCount = audCount + Integer.parseInt("" + audArray.charAt(j));
			}
			writer.write("Case #" + (i + 1) + ": " + NumNeeded + newline);
		}
		writer.close();
		reader.close();
		
	}

}
