package methodEmbedding.Counting_Sheep.S.LYD233;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ex1 {

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		// TODO Auto-generated method stub

		String fileName = "src/input.txt";
		String outputName = "src/output.txt";
		String line = null;
		int totalCaseNumber = 0;
		String[] otherLines = null;
		FileReader fileReader;
		try {
			fileReader = new FileReader(fileName);
			// Always wrap FileReader in BufferedReader.
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			int currentline = 1;

			while ((line = bufferedReader.readLine()) != null) {
				switch (currentline) {
				case 1:
					totalCaseNumber = Integer.parseInt(line);
					otherLines = new String[totalCaseNumber];
					break;
				default:
					otherLines[currentline - 2] = line;
					break;
				}
				currentline++;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		PrintWriter writer = new PrintWriter(outputName, "UTF-8");

		for (int k = 0; k < otherLines.length; k++) {

			String current = otherLines[k];
			String finalString = "";

			ArrayList<String> digitsRemaining = new ArrayList<String>();
			digitsRemaining.add("0");
			digitsRemaining.add("1");
			digitsRemaining.add("2");
			digitsRemaining.add("3");
			digitsRemaining.add("4");
			digitsRemaining.add("5");
			digitsRemaining.add("6");
			digitsRemaining.add("7");
			digitsRemaining.add("8");
			digitsRemaining.add("9");

			int N = Integer.parseInt(current);
			int M = 0;

			if (N == 0) {
				finalString = "INSOMNIA";
			} else {

				while (digitsRemaining.size() > 0) {
					M += N;
					String currentMString = Integer.toString(M);
					String[] digitsArray = currentMString.split("");
					Set<String> digits = new HashSet<String>();
					Collections.addAll(digits, digitsArray);

					ArrayList<String> toBeDeleted = new ArrayList<String>();
					for (int i = 0; i < digitsRemaining.size(); i++) {
						String currentRemaining = digitsRemaining.get(i);
						if (digits.contains(currentRemaining)) {
							toBeDeleted.add(currentRemaining);
						}
					}
					for (int i = 0; i < toBeDeleted.size(); i++) {

						digitsRemaining.remove(toBeDeleted.get(i));

					}

					// System.out.println(digitsRemaining.size());
				}

				finalString = Integer.toString(M);
			}

			System.out.println("Case #" + (k + 1) + ": " + finalString);
			writer.println("Case #" + (k + 1) + ": " + finalString);

		}

		writer.close();

	}

}
