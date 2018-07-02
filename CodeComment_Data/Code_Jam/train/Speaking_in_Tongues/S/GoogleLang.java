package methodEmbedding.Speaking_in_Tongues.S.LYD77;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.io.*;

public class GoogleLang {
	public static void main(String args[]) throws IOException {
		Map<Character, Character> m = new HashMap<Character, Character>();
		
		m.put('a', 'y');
		m.put('b', 'h');
		m.put('c', 'e');
		m.put('d', 's');
		m.put('e', 'o');
		m.put('f', 'c');
		m.put('g', 'v');
		m.put('h', 'x');
		m.put('i', 'd');
		m.put('j', 'u');
		m.put('k', 'i');
		m.put('l', 'g');  m.put('w', 'f'); m.put('x', 'm'); m.put('v', 'p');
		m.put('m', 'l'); m.put('y', 'a'); m.put('z', 'q'); m.put('u', 'j');
		m.put('n', 'b'); m.put('r', 't'); m.put('s', 'n'); m.put('t', 'w');
		m.put('o', 'k'); m.put('p', 'r'); m.put('q', 'z');
		
		Scanner in = new Scanner("A-small-attempt0.in");
		BufferedReader br  = new BufferedReader(new FileReader("A-small-attempt1.in"));
		//PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("output.in")));
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("output.in"));
		bw.flush();
		String s = "";
		int num = 0;
		
		s = br.readLine();
		
		num = Integer.parseInt(s);
		List<String> l = new ArrayList<String>();
		
		while ((s = br.readLine()) != null)
			l.add(s);
		
		int count = 0;
		for (String str: l) {
			count++;
			StringBuilder strb = new StringBuilder();
			
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == ' ')
					strb.append(' ');
				else
					strb.append(String.valueOf(m.get(str.charAt(j))));
			}
			
			if (count == 1)
				bw.write("Case #" + count + ": " + strb.toString());
			else
				bw.write("\n" + "Case #" + count + ": " + strb.toString());
			bw.flush();
			strb.setLength(0);
		}
		bw.close();
		br.close();
		
	}
}
