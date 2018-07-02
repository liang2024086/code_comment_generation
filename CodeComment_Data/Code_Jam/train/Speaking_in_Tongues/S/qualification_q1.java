package methodEmbedding.Speaking_in_Tongues.S.LYD1064;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class qualification_q1 {

	public static void main(String[] args) {
		String currLine = ""; // Line read from standard in
		int totalInput = 0;
		int counter = 0;
		String output = "";

		InputStreamReader converter = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(converter);

		Map<Character, Character> googlereseMap = new HashMap<Character, Character>();
		googlereseMap.put('a', 'y');
		googlereseMap.put('b', 'h');
		googlereseMap.put('c', 'e');
		googlereseMap.put('d', 's');
		googlereseMap.put('e', 'o');
		googlereseMap.put('f', 'c');
		googlereseMap.put('g', 'v');
		googlereseMap.put('h', 'x');
		googlereseMap.put('i', 'd');
		googlereseMap.put('j', 'u');
		googlereseMap.put('k', 'i');
		googlereseMap.put('l', 'g');
		googlereseMap.put('m', 'l');
		googlereseMap.put('n', 'b');
		googlereseMap.put('o', 'k');
		googlereseMap.put('p', 'r');
		googlereseMap.put('q', 'z');
		googlereseMap.put('r', 't');
		googlereseMap.put('s', 'n');
		googlereseMap.put('t', 'w');
		googlereseMap.put('u', 'j');
		googlereseMap.put('v', 'p');
		googlereseMap.put('w', 'f');
		googlereseMap.put('x', 'm');
		googlereseMap.put('y', 'a');
		googlereseMap.put('z', 'q');
		googlereseMap.put(' ', ' ');

		do {
			try {
				currLine = in.readLine();
			} catch (IOException e1) {
				System.out.print("Error while reading user input. Exiting...");
				System.exit(1);
			}
			if (counter == 0) {
				int tmpInt = 0;

				try {
					tmpInt = Integer.parseInt(currLine);
				} catch (Exception e) {
					System.out
							.print("Please specified the line of input with valid numeric value. Exiting...");
					System.exit(1);
				}

				if (tmpInt < 0 || tmpInt == 0) {
					System.out
							.print("Please specified the line of input with numeric more than 0. Exiting...");
					System.exit(1);
				}

				totalInput = tmpInt;
			} else {
				output += "Case #" + counter + ": ";
				for (int charCounter = 0; charCounter < currLine.length(); charCounter++) {
					output += googlereseMap.get(currLine.charAt(charCounter));
				}

				output += "\n";
			}

			counter++;
			currLine = "";
		} while (counter <= totalInput);

		System.out.print(output);

	}

}
