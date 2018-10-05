package methodEmbedding.Speaking_in_Tongues.S.LYD626;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {
		int N;
		try {
			BufferedReader in = new BufferedReader(new FileReader(
					"A-small-attempt0.in"));
			PrintWriter out = new PrintWriter(new BufferedWriter(
					new FileWriter("out")));
			String strLine;
			String outLine;
			strLine = in.readLine();
			N = Integer.valueOf(strLine);
			Map<Character, Character> chars = new HashMap<Character, Character>();
			Map<Character, Character> charsInv = new HashMap<Character, Character>();
			chars.put('a', 'y');
			chars.put('b', 'n');
			chars.put('c', 'f');
			chars.put('d', 'i');
			chars.put('e', 'c');
			chars.put('f', 'w');
			chars.put('g', 'l');
			chars.put('h', 'b');
			chars.put('i', 'k');
			chars.put('j', 'u');
			chars.put('k', 'o');
			chars.put('l', 'm');
			chars.put('m', 'x');
			chars.put('n', 's');
			chars.put('o', 'e');
			chars.put('p', 'v');
			chars.put('q', 'z');
			chars.put('r', 'p');
			chars.put('s', 'd');
			chars.put('t', 'r');
			chars.put('u', 'j');
			chars.put('v', 'g');
			chars.put('w', 't');
			chars.put('x', 'h');
			chars.put('y', 'a');
			chars.put('z', 'q');
			chars.put(' ', ' ');
			for(Entry e :chars.entrySet()){
				charsInv.put((Character)e.getValue(), (Character)e.getKey());
			}

			for (int i = 0; i < N; i++) {
				strLine = in.readLine();
				String result = "";
				// String[] stringArray = strLine.split(" ");
				char[] charArray = strLine.toCharArray();
				for (char c : charArray) {
					result += charsInv.get(c);
				}

				outLine = "Case #" + (i + 1) + ": " + result;
				out.println(outLine);
			}
			in.close();
			out.flush();
			out.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
