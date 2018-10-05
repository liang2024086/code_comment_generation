package methodEmbedding.Speaking_in_Tongues.S.LYD659;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		HashMap<Character, Character> characterMap = new HashMap<Character, Character>();
		characterMap.put('a', 'y');
		characterMap.put('b', 'h');
		characterMap.put('c', 'e');
		characterMap.put('d', 's');
		characterMap.put('e', 'o');
		characterMap.put('f', 'c');
		characterMap.put('g', 'v');
		characterMap.put('h', 'x');
		characterMap.put('i', 'd');
		characterMap.put('j', 'u');
		characterMap.put('k', 'i');
		characterMap.put('l', 'g');
		characterMap.put('m', 'l');
		characterMap.put('n', 'b');
		characterMap.put('o', 'k');
		characterMap.put('p', 'r');
		characterMap.put('q', 'z');
		characterMap.put('r', 't');
		characterMap.put('s', 'n');
		characterMap.put('t', 'w');
		characterMap.put('u', 'j');
		characterMap.put('v', 'p');
		characterMap.put('w', 'f');
		characterMap.put('x', 'm');
		characterMap.put('y', 'a');
		characterMap.put('z', 'q');
		
		Scanner reader = new Scanner(new File("A-small-attempt0.in"));
		PrintWriter writer = new PrintWriter(new File("output.txt"));
		int cases = reader.nextInt();
		String line = reader.nextLine();
		for (int i=0; i<cases; i++) {
			line = reader.nextLine();
			String aux = "";
			for (int j=0; j<line.length(); j++) {
				if (characterMap.containsKey(line.charAt(j))) {
					aux += characterMap.get(line.charAt(j));
				} else {
					aux += line.charAt(j);
				}
			}
			writer.println("Case #" + (i+1) + ": " + aux);
		}
		System.out.println("done");
		reader.close();
		writer.close();
	}

}
