package methodEmbedding.Speaking_in_Tongues.S.LYD879;


import java.awt.Frame;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Runner {

	public static void main(String[] args) {

		String[] s1;
		try {
			BufferedReader br = new BufferedReader(new FileReader(new File(
					"src/com/google/codejam2011/language/input.txt")));
			ArrayList<String> input = new ArrayList<String>();

			String tmpInput;
			while ((tmpInput = br.readLine()) != null)
				input.add(tmpInput);

			s1 = new String[input.size()];
			for (int i = 0; i < input.size(); i++)
				s1[i] = input.get(i);
			String[] s2;
			Character[] alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h',
					'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
					'u', 'v', 'w', 'x', 'y', 'z' };
			Map<Character, Character> keymap = new HashMap<Character, Character>();

			keymap.put(' ', ' ');
			keymap.put('a', 'y');
			keymap.put('b', 'h');
			keymap.put('c', 'e');
			keymap.put('d', 's');
			keymap.put('e', 'o');
			keymap.put('f', 'c');
			keymap.put('g', 'v');
			keymap.put('h', 'x');
			keymap.put('i', 'd');
			keymap.put('j', 'u');
			keymap.put('k', 'i');
			keymap.put('l', 'g');
			keymap.put('m', 'l');
			keymap.put('n', 'b');
			keymap.put('o', 'k');
			keymap.put('p', 'r');
			keymap.put('q', 'z');
			keymap.put('r', 't');
			keymap.put('s', 'n');
			keymap.put('t', 'w');
			keymap.put('u', 'j');
			keymap.put('v', 'p');
			keymap.put('w', 'f');
			keymap.put('x', 'm');
			keymap.put('y', 'a');
			keymap.put('z', 'q');

			BufferedWriter bw = new BufferedWriter(new FileWriter(new File("src/com/google/codejam2011/language/output.txt")));
			s2 = new String[s1.length];
			for (int j = 0; j < s1.length; j++) {
				String sentence = "";
				for (int i = 0; i < s1[j].length(); i++)
					sentence += keymap.get(s1[j].charAt(i));
				s2[j] = sentence;
				
				if(j != 0){
					bw.write("Case #"+j+": "+ sentence + "\r\n");
					System.out.println("Case #"+j+": "+ sentence);
				}
			}

			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
