package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1075;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class RevengePancakes {
	public static void main(String[] args) throws IOException {
		Scanner s = null;
		Scanner lineScan = null;
		int size;
		String line;
		File output = new File("output.txt");
		PrintWriter printer = new PrintWriter(output);
		s = new Scanner(new BufferedReader(new FileReader("B-small-attempt0.in")));
		size = s.nextInt();
		s.nextLine();
		for (int i = 0; i < size; i++) {
			line = s.nextLine();
			lineScan = new Scanner(line);
			String pancake = lineScan.next();
			char current = pancake.charAt(0);
			int count = 0;
			for (int j = 1; j < pancake.length(); j++) {
				if (pancake.charAt(j) != current) {
					count++;
					current = pancake.charAt(j);
				}
			}
			if (pancake.charAt(pancake.length() - 1) == '-') {
				count++;
			}
			printer.print("Case #" + (i + 1) + ": " + count);
			printer.println();
		}
		printer.close ();   
	}
}
