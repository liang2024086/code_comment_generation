package methodEmbedding.Speaking_in_Tongues.S.LYD966;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Solution {

	static private Map<Character, Character> map = new HashMap<Character, Character>() {{
		put('a','y');
		put('b','h');
		put('c','e');
		put('d','s');
		put('e','o');
		put('f','c');
		put('g','v');
		put('h','x');
		put('i','d');
		put('j','u');
		put('k','i');
		put('l','g');
		put('m','l');
		put('n','b');
		put('o','k');
		put('p','r');
		put('q','z');
		put('r','t');
		put('s','n');
		put('t','w');
		put('u','j');
		put('v','p');
		put('w','f');
		put('x','m');
		put('y','a');
		put('z','q');
		put(' ',' ');
	}};
	
	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("A-small-attempt0.in"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("A-small-attempt0.txt"));
		int nTestCases = Integer.parseInt(br.readLine());
		for (int i=0; i<nTestCases; i++) {
			String line = br.readLine();
			
			StringBuffer result = new StringBuffer();
			for (int j=0; j<line.length(); j++) {
				char letter = line.charAt(j);
				if (map.containsKey(letter)) {
					result.append(map.get(letter));
				} else {
					result.append(letter);
				}
			}
			// Display the results.
			bw.write("Case #"+(i+1)+": ");
			bw.write(result+"\n");
		}
		bw.close();
	}

}
