package methodEmbedding.Counting_Sheep.S.LYD1413;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) {

		PrintWriter writer;
		try {
			writer = new PrintWriter("output.txt", "UTF-8");

			ArrayList<Integer> inputInts = new ArrayList<>();
			try {
				BufferedReader br = new BufferedReader(new FileReader(
						System.getProperty("user.dir") + "/src/input.txt"));
				String sCurrentLine;
				while ((sCurrentLine = br.readLine()) != null) {
					inputInts.add(Integer.valueOf(sCurrentLine));
				}
			} catch (IOException e) {
			}

			HashSet<Character> numbers = new HashSet<>(10);
			for (int i = 1; i <= inputInts.get(0); i++) {
				numbers.clear();
				int n = inputInts.get(i);
				if (n == 0) {
					writer.println("CASE #" + i + ": INSOMNIA");
					continue;
				}
				int increments = 1;
				long result;
				do {
					result = increments * n;
					if (result < 0) {
						break;
					}
					char[] digitss = String.valueOf(result).toCharArray();
					for (char digit : digitss) {
						numbers.add(digit);
					}
					increments++;
				} while (numbers.size() < 10);

				if (result < 0) {
					writer.println("CASE #" + i + ": INSOMNIA");
				} else {
					writer.println("CASE #" + i + ": " + result);
				}
			}

			writer.close();
		} catch (FileNotFoundException | UnsupportedEncodingException e1) {

		}
	}
}
