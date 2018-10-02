package methodEmbedding.Counting_Sheep.S.LYD618;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class CountingSheep {
	public static void main(String[] args) throws IOException {
		Scanner s = null;
		Scanner lineScan = null;
		int size;
		String line;
		File output = new File("output.txt");
		PrintWriter printer = new PrintWriter(output);
		s = new Scanner(new BufferedReader(new FileReader("A-small-attempt0.in")));
		size = s.nextInt();
		s.nextLine();
		for (int i = 0; i < size; i++) {
			line = s.nextLine();
			lineScan = new Scanner(line);
			int startingNumber = lineScan.nextInt();
			int currentNumber = 0;
			printer.print("Case #" + (i + 1) + ": ");
			if (startingNumber == 0) {
				printer.print("INSOMNIA");
			} else {
				Set<Integer> digitValues = new HashSet<>();
				while (digitValues.size() < 10) {
					currentNumber += startingNumber;
					int temporaryCurrentNumber = currentNumber;
					while (temporaryCurrentNumber != 0) {
						int currentDigit = temporaryCurrentNumber % 10;
						if (!digitValues.contains(currentDigit)) {
							digitValues.add(currentDigit);
						}
						temporaryCurrentNumber /= 10;
					}
				}
				printer.print(currentNumber);
			}
			printer.println();
		}
		printer.close ();   
	}
}
