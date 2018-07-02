package methodEmbedding.Speaking_in_Tongues.S.LYD139;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class SpeakingInToungues {

	private static final String INP_FILE = "input.txt";
	private static final String OUT_FILE = "output.txt";
	private static Map<Character, Character> charMap = new HashMap<Character, Character>();
	static {
		charMap.put('a', 'y');
		charMap.put('b', 'h');
		charMap.put('c', 'e');
		charMap.put('d', 's');
		charMap.put('e', 'o');
		charMap.put('f', 'c');
		charMap.put('g', 'v');
		charMap.put('h', 'x');
		charMap.put('i', 'd');
		charMap.put('j', 'u');
		charMap.put('k', 'i');
		charMap.put('l', 'g');
		charMap.put('m', 'l');
		charMap.put('n', 'b');
		charMap.put('o', 'k');
		charMap.put('p', 'r');
		charMap.put('q', 'z');
		charMap.put('r', 't');
		charMap.put('s', 'n');
		charMap.put('t', 'w');
		charMap.put('u', 'j');
		charMap.put('v', 'p');
		charMap.put('w', 'f');
		charMap.put('x', 'm');
		charMap.put('y', 'a');
		charMap.put('z', 'q');
	}
	
	public static void main(String[] args) throws Exception {
		PrintWriter out =new PrintWriter(new File(OUT_FILE));
		FileReader fRead = new FileReader(INP_FILE);
		BufferedReader reader = new BufferedReader(fRead);
		int numCases = Integer.parseInt( reader.readLine() );
		for(int i=1; i <=numCases; i++) {
			char[] line = reader.readLine().toCharArray();
			StringBuffer outp = new StringBuffer();
			for (char c : line) {
				if(c == ' ') {
					outp.append( c );
				}
				else {
					outp.append( charMap.get(c));
				}
			}
			out.println("Case #"+i+": "+outp.toString());
		}
		reader.close();
		fRead.close();
		out.close();
	}

}
