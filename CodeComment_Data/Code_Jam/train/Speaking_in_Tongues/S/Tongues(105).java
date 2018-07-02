package methodEmbedding.Speaking_in_Tongues.S.LYD1637;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Tongues {

    public static Map<Character, Character> map = new TreeMap<Character, Character>();

    static {
	map.put('a', 'y');
	map.put('b', 'h');
	map.put('c', 'e');
	map.put('d', 's');
	map.put('e', 'o');
	map.put('f', 'c');
	map.put('g', 'v');
	map.put('h', 'x');
	map.put('i', 'd');
	map.put('j', 'u');
	map.put('k', 'i');
	map.put('l', 'g');
	map.put('m', 'l');
	map.put('n', 'b');
	map.put('o', 'k');
	map.put('p', 'r');
	map.put('q', 'z');
	map.put('r', 't');
	map.put('s', 'n');
	map.put('t', 'w');
	map.put('u', 'j');
	map.put('v', 'p');
	map.put('w', 'f');
	map.put('x', 'm');
	map.put('y', 'a');
	map.put('z', 'q');
    }

    public static void main(String[] args) throws IOException {

	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	String s = in.readLine();

	int cases = Integer.parseInt(s);

	for (int i = 0; i < cases; i++) {
	    s = in.readLine();
	    List<String> translatedWords = new ArrayList<String>();
	    StringTokenizer tokenizer = new StringTokenizer(s, " ");

	    while (tokenizer.hasMoreTokens()) {
		String normal = tokenizer.nextToken();
		String translated = "";
		for (int k = 0; k < normal.length(); k++) {
		    translated += map.get(normal.charAt(k));
		}

		translatedWords.add(translated);
	    }

	    String result = "Case #" + (i + 1) + ": ";
	    for (int k = 0; k < translatedWords.size() - 1; k++) {
		result += translatedWords.get(k) + " ";
	    }
	    result += translatedWords.get(translatedWords.size() - 1);
	    System.out.println(result);

	}
    }

}
