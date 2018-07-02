package methodEmbedding.Speaking_in_Tongues.S.LYD601;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;

public class A {

	public static void main(String[] args) throws Exception {

		HashMap<Character, Character> table = new HashMap<Character, Character>();

		table.put(' ', ' ');
		table.put('y', 'a');
		table.put('n', 'b');
		table.put('f', 'c');
		table.put('i', 'd');
		table.put('c', 'e');
		table.put('w', 'f');
		table.put('l', 'g');
		table.put('b', 'h');
		table.put('k', 'i');
		table.put('u', 'j');
		table.put('o', 'k');
		table.put('m', 'l');
		table.put('x', 'm');
		table.put('s', 'n');
		table.put('e', 'o');
		table.put('v', 'p');
		table.put('z', 'q');
		table.put('p', 'r');
		table.put('d', 's');
		table.put('r', 't');
		table.put('j', 'u');
		table.put('g', 'v');
		table.put('t', 'w');
		table.put('h', 'x');
		table.put('a', 'y');
		table.put('q', 'z');

		String filename = "A-small-attempt0";
		BufferedReader inputFile = new BufferedReader(new FileReader(filename + ".in"));
		FileWriter outputFile = new FileWriter(filename + ".out");

		int casesNumber = Integer.valueOf(inputFile.readLine());
		for (int cn = 1; cn <= casesNumber; cn++) {
			String result = "Case #" + cn + ": ";

			char[] line = inputFile.readLine().toCharArray();
			for (char c : line) {
				result = result + table.get(c);
			}

			System.out.println(result);
			outputFile.write(result);
			if (cn < casesNumber) {
				outputFile.write("\n");
			}
		}

		inputFile.close();
		outputFile.close();
	}

}
