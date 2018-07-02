package methodEmbedding.Speaking_in_Tongues.S.LYD836;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;


public class Tongue {
	public static void main(String[] arg) {
		HashMap<Character, Character> alphabetMap= new HashMap<Character, Character>();
		alphabetMap.put('a', 'y');
		alphabetMap.put('b', 'h');
		alphabetMap.put('c', 'e');
		alphabetMap.put('d', 's');
		alphabetMap.put('e', 'o');
		alphabetMap.put('f', 'c');
		alphabetMap.put('g', 'v');
		alphabetMap.put('h', 'x');
		alphabetMap.put('i', 'd');
		alphabetMap.put('j', 'u');
		alphabetMap.put('k', 'i');
		alphabetMap.put('l', 'g');
		alphabetMap.put('m', 'l');
		alphabetMap.put('n', 'b');
		alphabetMap.put('o', 'k');
		alphabetMap.put('p', 'r');
		alphabetMap.put('q', 'z');
		alphabetMap.put('r', 't');
		alphabetMap.put('s', 'n');
		alphabetMap.put('t', 'w');
		alphabetMap.put('u', 'j');
		alphabetMap.put('v', 'p');
		alphabetMap.put('w', 'f');
		alphabetMap.put('x', 'm');
		alphabetMap.put('y', 'a');
		alphabetMap.put('z', 'q');
		
		char[] charArray;
		String line, output;
		int t, caseNum,len, i;
		try {
			BufferedReader is = new BufferedReader(new FileReader("infile.txt"));
			FileWriter writer = new FileWriter("output.txt");
			
			line = is.readLine();
			t = Integer.parseInt(line);
			for (caseNum=1; caseNum <= t; caseNum++) {
				line = is.readLine();
				charArray = line.toCharArray();
				
				len = charArray.length;
				for (i=0; i< len; i++) {
					if (charArray[i] != ' ') {
						if (alphabetMap.containsKey(charArray[i])) {
							charArray[i] = alphabetMap.get(charArray[i]);
						}
					}
				}
				
				output = "Case #" + caseNum + ": " + new String(charArray) + "\n";
				writer.write(output.toCharArray());
			}
			writer.close();
		} catch (NumberFormatException ex) {
			System.out.println("Not a valid number: ");
		} catch (IOException e) {
			System.out.println("Unexpected IO ERROR");
		}
	}
}
