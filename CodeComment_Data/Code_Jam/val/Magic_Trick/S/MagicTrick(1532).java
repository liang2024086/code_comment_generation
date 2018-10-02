package methodEmbedding.Magic_Trick.S.LYD1843;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class MagicTrick {
	final static String fileName = "e:/temp/jam/A-small-attempt0";

	final static String inExtension = ".in";
	final static String outExtension = ".out";
	final static String source = fileName + inExtension;
	final static String destination = fileName + outExtension;

	static BufferedReader bufferedReader;
	static BufferedWriter bufferedWriter;

	/* this is problem-specific */
	static int numOfCases;


	public static void main(String[] args) throws NumberFormatException, IOException, InterruptedException {
		bufferedReader = new BufferedReader(new FileReader(new File(source)));
		bufferedWriter = new BufferedWriter(new FileWriter(new File(destination)));

		numOfCases = Integer.parseInt(bufferedReader.readLine());

		String line;
		StringTokenizer tokenizer;
		
		for (int c = 0; c < numOfCases; c++) {
			int firstAnswer = Integer.parseInt(bufferedReader.readLine());
			int[] firstRow = new int[4];
			for (int i = 0; i < 4; i++) {
				line = bufferedReader.readLine();
				if (i + 1 == firstAnswer) {
					tokenizer = new StringTokenizer(line);
					for (int j = 0; j < 4; j++) {
						firstRow[j] = Integer.parseInt(tokenizer.nextToken());
					}
				}
			}

			int secondAnswer = Integer.parseInt(bufferedReader.readLine());
			int[] secondRow = new int[4];
			for (int i = 0; i < 4; i++) {
				line = bufferedReader.readLine();
				if (i + 1 == secondAnswer) {
					tokenizer = new StringTokenizer(line);
					for (int j = 0; j < 4; j++) {
						secondRow[j] = Integer.parseInt(tokenizer.nextToken());
					}
				}
			}

			int count = 0, answer = -1;
			for (int i = 0; i < 4; i++) {
				int num1 = firstRow[i];
				for (int j = 0; j < 4; j++) {
					int num2 = secondRow[j];
					if (num1 == num2) {
						count++;
						answer = num1;
					}
				}
			}
			
			if (count == 1) 
				bufferedWriter.write("Case #" + (c + 1) + ": " + answer + "\n");
			else if (count == 0)
				bufferedWriter.write("Case #" + (c + 1) + ": Volunteer cheated!\n");
			else
				bufferedWriter.write("Case #" + (c + 1) + ": Bad magician!\n");
		}

		bufferedWriter.close();
		bufferedReader.close();
	}
}
