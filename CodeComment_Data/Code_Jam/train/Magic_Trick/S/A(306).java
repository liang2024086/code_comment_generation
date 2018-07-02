package methodEmbedding.Magic_Trick.S.LYD1397;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class A {
	public static void main(String[] args) throws IOException {
		String fileName = "A-small-attempt0";
		BufferedReader inStream = new BufferedReader(new FileReader(fileName + ".in"));
		FileWriter writer = new FileWriter(fileName + ".out");
		int testCases = new Integer(inStream.readLine());
		for (int count = 1; count <= testCases; count++) {
			String[] rowA, rowB;
			rowA = rowB = new String[4];
			
			int rowNum = new Integer(inStream.readLine());
			for (int lineCount = 1; lineCount <= 4; lineCount++) {
				if (lineCount == rowNum) {
					rowA = inStream.readLine().split(" ");
				} else {
					inStream.readLine();
				}
			}
			
			rowNum = new Integer(inStream.readLine());
			for (int lineCount = 1; lineCount <= 4 ; lineCount++) {
				if (lineCount == rowNum) {
					rowB = inStream.readLine().split(" ");
				} else {
					inStream.readLine();
				}
			}
			
			String answer = "";
			for (int i = 0; i < rowA.length; i++) {
				for (int j = 0; j < rowB.length; j++) {
					if (rowA[i].equals(rowB[j]) && answer.isEmpty()) {
						answer = rowA[i];
					} else if (rowA[i].equals(rowB[j]) && !answer.isEmpty()) {
						answer = "Bad magician!";
						break;
					}
				}
			}

			if (answer.isEmpty()) {
				answer = "Volunteer cheated!";
			}
			writer.write ("Case #" + count + ": " + answer.trim() + "\n");
		}
		writer.flush();
		writer.close();
		inStream.close();
	}
}
