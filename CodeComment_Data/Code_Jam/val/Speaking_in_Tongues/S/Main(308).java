package methodEmbedding.Speaking_in_Tongues.S.LYD539;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(new File("A-small-attempt0.in"));
		FileWriter out = new FileWriter("out.txt");

		
		HashMap<Character,Character> map = new HashMap<Character, Character>();
		
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
		map.put(' ', ' ');
		int lineNumber = input.nextInt();
		input.nextLine();
		for(int i=0;i<lineNumber;i++){
			String in = input.nextLine();
			System.out.println(in);
			String solution = "Case #"+(i+1)+": ";
			for(int j=0;j<in.length();j++){
				solution=solution+map.get(in.charAt(j));
			}
			solution+=System.getProperty("line.separator");;
			out.write(solution);
		}
		
		out.close();
		input.close();
	}

}
