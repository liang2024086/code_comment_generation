package methodEmbedding.Speaking_in_Tongues.S.LYD1648;



import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Map;
import java.util.Scanner;

import com.google.common.collect.Maps;

// Using the Google Collections library.
public class A {

	public static void main(String [] args) throws IOException {
		String inputFile = "src/A-small-attempt0.in";
		Scanner in = new Scanner(new File(inputFile));
		PrintStream out = new PrintStream(inputFile.substring(0, inputFile.length()-2)+"out");
		int cases = in.nextInt();
		
		String input = "abcdefghijklmnopqrstuvwxyz";
		String output= "ynficwlbkuomxsevzpdrjgthaq";
		Map<Character, Character> translate = Maps.newHashMap();
		translate.put(' ', ' ');
		for (int i = 0; i < 26; i++) {
			translate.put(output.charAt(i), input.charAt(i));
		}
		in.nextLine();
		for (int c = 1; c <= cases; c++) {
			String line = in.nextLine();
			StringBuilder buf = new StringBuilder();
			for (char ch : line.toCharArray()) {
				buf.append(translate.get(ch));
			}
			out.print("Case #"+c+": " + buf.toString());
			out.println();
		}
		out.close();
	}
}
