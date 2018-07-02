package methodEmbedding.Speaking_in_Tongues.S.LYD1108;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;


public class A {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		String [] input = {"ejp mysljylc kd kxveddknmc re jsicpdrysi", "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd", "de kr kd eoya kw aej tysr re ujdr lkgc jv"};
		String [] output = {"our language is impossible to understand", "there are twenty six factorial possibilities", "so it is okay if you want to just give up"};
		HashMap<Character, Character> map = new HashMap<Character, Character> ();
		map.put('y', 'a');
		map.put('e', 'o');
		map.put('q', 'z');
		map.put(' ', ' ');
		map.put('z', 'q');
		for (int i = 0; i < 3; i++ ) {
			char [] cinput = input[i].toCharArray();
			char [] coutput = output[i].toCharArray();
			for (int j = 0; j < cinput.length; j++) {
				if(!map.containsKey(cinput[j])) {
					map.put(cinput[j], coutput[j]);
				}
			}
		}
		BufferedReader reader = new BufferedReader(new FileReader("a.txt"));
		String line = reader.readLine();
		int count = 1;
		while ((line = reader.readLine()) != null) {
			char [] cline = line.toCharArray();
			char [] coutput = new char[cline.length];
			for (int i = 0; i < cline.length; i++) {
				coutput[i] = map.get(cline[i]);
			}
			System.out.println("Case #"+(count++)+": "+new String(coutput));
		}
		reader.close();
	}

}
