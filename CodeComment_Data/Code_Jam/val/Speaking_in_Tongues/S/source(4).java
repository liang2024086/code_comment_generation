package methodEmbedding.Speaking_in_Tongues.S.LYD698;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class Main {

	static HashMap<Character, Character> reverseReplacementMap;

	static {
		reverseReplacementMap = new HashMap<Character, Character>();
		reverseReplacementMap.put('y', 'a');
		reverseReplacementMap.put('n', 'b');
		reverseReplacementMap.put('f', 'c');
		reverseReplacementMap.put('i', 'd');
		reverseReplacementMap.put('c', 'e');
		reverseReplacementMap.put('w', 'f');
		reverseReplacementMap.put('l', 'g');
		reverseReplacementMap.put('b', 'h');
		reverseReplacementMap.put('k', 'i');
		reverseReplacementMap.put('u', 'j');
		reverseReplacementMap.put('o', 'k');
		reverseReplacementMap.put('m', 'l');
		reverseReplacementMap.put('x', 'm');
		reverseReplacementMap.put('s', 'n');
		reverseReplacementMap.put('e', 'o');
		reverseReplacementMap.put('v', 'p');
		reverseReplacementMap.put('z', 'q');
		reverseReplacementMap.put('p', 'r');
		reverseReplacementMap.put('d', 's');
		reverseReplacementMap.put('r', 't');
		reverseReplacementMap.put('j', 'u');
		reverseReplacementMap.put('g', 'v');
		reverseReplacementMap.put('t', 'w');
		reverseReplacementMap.put('h', 'x');
		reverseReplacementMap.put('a', 'y');
		reverseReplacementMap.put('q', 'z');
		reverseReplacementMap.put(' ', ' ');
	}

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		short n;// no of test cases
		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(new FileInputStream(new File(args[0]))));
		BufferedWriter bufferedWriter = new BufferedWriter(
				new OutputStreamWriter(new FileOutputStream(new File(args[1]))));
		n = Short.parseShort(bufferedReader.readLine());
		for (short i = 0; i < n; i++) {
			String input = bufferedReader.readLine();
			StringBuffer output = new StringBuffer();
			for (char ch : input.toCharArray()) {
				output.append(reverseReplacementMap.get(ch));
			}
			bufferedWriter.write("Case #" + (i + 1) + ": " + output.toString()
					+ "\n");
			bufferedWriter.flush();
		}
		bufferedReader.close();
		bufferedWriter.close();
	}
}

