package methodEmbedding.Speaking_in_Tongues.S.LYD722;

import java.io.*;
import java.util.*;

public class Googlerese {

	public Googlerese() {
	}

	public static void main(String[] args) {
		BufferedReader input = null;
		BufferedWriter output = null;
		try {
			input = new BufferedReader(new FileReader("C:\\Users\\cerebrus\\eclipse-workspace\\QualiA-Googlerese\\src\\A-small-attempt0.in"));
			output = new BufferedWriter(new FileWriter("C:\\Users\\cerebrus\\eclipse-workspace\\QualiA-Googlerese\\src\\output"));
			
			TreeMap<Character, Character> mapping = new TreeMap<Character, Character>();
			mapping.put('y', 'a'); mapping.put('u', 'j'); mapping.put('d', 's');
			mapping.put('n', 'b'); mapping.put('o', 'k'); mapping.put('r', 't');
			mapping.put('f', 'c'); mapping.put('m', 'l'); mapping.put('j', 'u');
			mapping.put('i', 'd'); mapping.put('x', 'm'); mapping.put('g', 'v');
			mapping.put('c', 'e'); mapping.put('s', 'n'); mapping.put('t', 'w');
			mapping.put('w', 'f'); mapping.put('e', 'o'); mapping.put('h', 'x');
			mapping.put('l', 'g'); mapping.put('v', 'p'); mapping.put('a', 'y');
			mapping.put('b', 'h'); mapping.put('z', 'q'); mapping.put('q', 'z');
			mapping.put('k', 'i'); mapping.put('p', 'r'); mapping.put(' ', ' ');
			
			int T = Integer.valueOf(input.readLine());
		    for(int i=1; i<=T; i++) {
		    	char line[] = input.readLine().toCharArray();
		    	output.write("Case #"+i+": ");
		    	for(int j=0; j<line.length; j++) {
		    		output.write(mapping.get(line[j]));
		    	}
		        if(i<T) output.write("\n"); 
		    }
		    
		    
		} catch (FileNotFoundException e) {
			System.out.println("input file not found: ");
			e.printStackTrace();
		} catch(IOException e) {
			System.out.println("Error opening files: ");
		    e.printStackTrace();
		    System.exit(1);
		} finally {
			try {
				input.close();
				output.close();
				System.out.println("Done !!");
			} catch (IOException e) {
				System.out.println("Error closing files: ");
				e.printStackTrace();
			}
		}
	}

}
