package methodEmbedding.Speaking_in_Tongues.S.LYD1620;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Hashtable;

public class R1P1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {

		Hashtable<Character, Character> lMap = new Hashtable<Character, Character>();
		lMap.put('y', 'a');
		lMap.put('n', 'b');
		lMap.put('f', 'c');
		lMap.put('i', 'd');
		lMap.put('c', 'e');
		lMap.put('w', 'f');
		lMap.put('l', 'g');
		lMap.put('b', 'h');
		lMap.put('k', 'i');
		lMap.put('u', 'j');
		lMap.put('o', 'k');
		lMap.put('m', 'l');
		lMap.put('x', 'm');
		lMap.put('s', 'n');
		lMap.put('e', 'o');
		lMap.put('v', 'p');
		lMap.put('z', 'q');
		lMap.put('p', 'r');
		lMap.put('d', 's');
		lMap.put('r', 't');
		lMap.put('j', 'u');
		lMap.put('g', 'v');
		lMap.put('t', 'w');
		lMap.put('h', 'x');
		lMap.put('a', 'y');
		lMap.put('q', 'z');
		BufferedReader in = new BufferedReader(new FileReader("A-small-attempt0.in"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("small1.out"));
		String inLine;
		int tn = Integer.parseInt(in.readLine());
		int counter = 0;
		while ((inLine = in.readLine()) != null) {
			counter++;
			System.out.print("Case #" + counter + ": ");
			bw.write("Case #" + counter + ": ");
			String temp = inLine;
			for (int i = 0; i < temp.length(); i++) {
				char t = temp.charAt(i);
				if(lMap.get(t) != null) {
					System.out.print(lMap.get(t));
					bw.write(lMap.get(t));
				}
				else {
					System.out.print(t);
					bw.write(t);
				}				
			}
			System.out.println();
			bw.newLine();
		}
		in.close();
		bw.close();
	}

}
