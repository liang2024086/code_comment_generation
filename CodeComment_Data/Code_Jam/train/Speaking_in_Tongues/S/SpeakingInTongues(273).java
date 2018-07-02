package methodEmbedding.Speaking_in_Tongues.S.LYD1424;

import java.io.*;
import java.util.Map;
import java.util.HashMap;


public class SpeakingInTongues {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader f = new BufferedReader (new FileReader("A-small.in"));
		PrintWriter out = new PrintWriter(new FileWriter("A-small.out"));
		
		Map m = new HashMap(26);
		m.put(' ', ' ');
		m.put('y', 'a');
		m.put('n', 'b');
		m.put('f', 'c');
		m.put('i', 'd');
		m.put('c', 'e');
		m.put('w', 'f');
		m.put('l', 'g');
		m.put('b', 'h');
		m.put('k', 'i');
		m.put('u', 'j');
		m.put('o', 'k');
		m.put('m', 'l');
		m.put('x', 'm');
		m.put('s', 'n');
		m.put('e', 'o');
		m.put('v', 'p');
		m.put('z', 'q');
		m.put('p', 'r');
		m.put('d', 's');
		m.put('r', 't');
		m.put('j', 'u');
		m.put('g', 'v');
		m.put('t', 'w');
		m.put('h', 'x');
		m.put('a', 'y');
		m.put('q', 'z');
		
		int c = Integer.parseInt(f.readLine());
		for (int i = 0; i < c; i ++){
			String s = f.readLine();
			out.print("Case #" + (i+1) + ": ");
			for (int j = 0; j < s.length(); j++)
			{				
				out.print(m.get(s.charAt(j)));
			}
			out.println("");
		}
		out.close();
		System.exit(0);

	}

}
