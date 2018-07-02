package methodEmbedding.Standing_Ovation.S.LYD888;

/**
 * Main file for Google Code Jam - Qualification Round 2015 - Problem A. Standing Ovation
 * 
 * @author Zac (Qi ZHANG)
 * Created on 04/11/2015
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
	
	private static final String INPUT_FILE_NAME = "A-small-attempt0.in";
	private static final String OUTPUT_FILE_NAME = "A-small-attempt0.out";
	private static final String FILE_FOLDER_NAME = "files";
	
	public static void main(String[] args) {
		Charset charset = Charset.forName("US-ASCII");
		Path inputFilePath = FileSystems.getDefault().getPath(FILE_FOLDER_NAME, INPUT_FILE_NAME);
		Path outputFilePath = FileSystems.getDefault().getPath(FILE_FOLDER_NAME, OUTPUT_FILE_NAME);
		try (BufferedReader reader = Files.newBufferedReader(inputFilePath, charset);
				BufferedWriter writer = Files.newBufferedWriter(outputFilePath, charset)) {
			int t;
			try {
				t = Integer.parseInt(reader.readLine());
			} catch (Exception e) {
				throw new RuntimeException("Cannot get the number of test cases T. Exception: " + e.getMessage());
			}
			for (int caseNum = 1; caseNum <= t; caseNum++) {
				String line = reader.readLine();
				if (line == null)
					throw new RuntimeException("Cannot read test case: " + caseNum);
				String[] subStrings = line.split(" ");
				if (subStrings.length != 2)
					throw new RuntimeException("Input case format is incorrect. Case number: " + caseNum + "; subStrings.length: " + subStrings.length + "; input: " + line);
				
				char[] chars = subStrings[1].toCharArray();
				int numStanded = chars[0] - '0';
				int numTotalNeeded = 0;
				for (int i = 1; i < chars.length; i++) {
					int numCurrent = chars[i] - '0';
					if (numCurrent != 0 && i > numStanded) {
						int numAdded = i - numStanded;
						numTotalNeeded += numAdded;
						numStanded += numAdded;
					}
					numStanded += numCurrent;
				}
				writer.write("Case #" + caseNum + ": " + String.valueOf(numTotalNeeded));
				writer.newLine();
			}
		} catch (IOException x) {
		    System.err.format("IOException: %s%n", x);
		}
	}
	
}
