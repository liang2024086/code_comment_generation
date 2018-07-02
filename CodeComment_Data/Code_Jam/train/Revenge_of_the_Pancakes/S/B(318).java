package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1181;

import java.io.*;
import java.util.Scanner;

public class B {
	public static void main(String[] args) {
		String filename = "src/B-small-attempt0.in";
		String output = "output.txt";
		Scanner scanner = null;
		PrintWriter printer = null;

		try {
			scanner = new Scanner(new FileReader(filename));
			printer = new PrintWriter(new FileWriter(output));

			int tests = scanner.nextInt();
			for (int test = 1; test <= tests; test++) {

				String value = scanner.next();
				char[] arr = value.toCharArray();
				char ini = arr[0];
				int flips = 0;
				for (int i = 1; i < arr.length; i++) {
					char c = arr[i];
					if (ini != c)
						flips++;
					ini = c;
				}
				if (ini == '-')
					flips++;

				printer.println(String.format("Case #%d: %d", test, flips));
			}

		} catch (FileNotFoundException e) {
			System.out.println(filename + " not found.");
		} catch(IOException e) {
			System.out.println(e.getMessage());
		} finally {
			if (scanner != null) {
				scanner.close();
			}
			if (printer != null) {
				printer.flush();
				printer.close();
			}
		}
	}
}
