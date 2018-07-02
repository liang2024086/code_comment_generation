package methodEmbedding.Speaking_in_Tongues.S.LYD1360;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;

public class SpTngEagle{
	static HashMap<Character, Character> mappingEagle = new HashMap<Character, Character>();

	public static void main(String args[]) throws IOException {
		mappingEagle.put('y', 'a');
		mappingEagle.put('n', 'b');
		mappingEagle.put('f', 'c');
		mappingEagle.put('i', 'd');
		mappingEagle.put('c', 'e');
		mappingEagle.put('w', 'f');
		mappingEagle.put('l', 'g');
		mappingEagle.put('b', 'h');
		mappingEagle.put('k', 'i');
		mappingEagle.put('u', 'j');
		mappingEagle.put('o', 'k');
		mappingEagle.put('m', 'l');
		mappingEagle.put('x', 'm');
		mappingEagle.put('s', 'n');
		mappingEagle.put('e', 'o');
		mappingEagle.put('v', 'p');
		mappingEagle.put('z', 'q');
		mappingEagle.put('p', 'r');
		mappingEagle.put('d', 's');
		mappingEagle.put('r', 't');
		mappingEagle.put('j', 'u');
		mappingEagle.put('g', 'v');
		mappingEagle.put('t', 'w');
		mappingEagle.put('h', 'x');
		mappingEagle.put('a', 'y');
		mappingEagle.put('q', 'z');
		mappingEagle.put(' ', ' ');

		BufferedReader bfr = new BufferedReader(new FileReader("input.txt"));

		Writer output = null;
		File file = new File("EagleOutput.txt");
		output = new BufferedWriter(new FileWriter(file));

		int T = Integer.parseInt(bfr.readLine());
		int i = 0;
		while (i < T) {
			
			
			String temp = bfr.readLine();
			
			char[] data = new char [temp.length()];
			
			for(int j=0;j<temp.length();j++){
				data[j] =mappingEagle.get(temp.charAt(j));
			}
			String str = new String(data);		
			
			output.write("Case #"+(i+1)+": "+ str);
			if(i!=T-1){
				output.write("\n");
			}

			i++;
		}
		output.close();

	}
}
