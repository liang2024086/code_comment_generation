package methodEmbedding.Speaking_in_Tongues.S.LYD1680;

import java.util.Hashtable;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class SpeakingTongues {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Hashtable<Character, Character> transl = new Hashtable<Character, Character>();
		transl.put('y', 'a');
		transl.put('n', 'b');
		transl.put('f', 'c');
		transl.put('i', 'd');
		transl.put('c', 'e');
		transl.put('w', 'f');
		transl.put('l', 'g');
		transl.put('b', 'h');
		transl.put('k', 'i');
		transl.put('u', 'j');
		transl.put('o', 'k');
		transl.put('m', 'l');
		transl.put('x', 'm');
		transl.put('s', 'n');
		transl.put('e', 'o');
		transl.put('v', 'p');
		transl.put('z', 'q');
		transl.put('p', 'r');
		transl.put('d', 's');
		transl.put('r', 't');
		transl.put('j', 'u');
		transl.put('g', 'v');
		transl.put('t', 'w');
		transl.put('h', 'x');
		transl.put('a', 'y');
		transl.put('q', 'z');
		try{
			String result = new String();
			//read file
			FileReader filein = new FileReader(args[0]);
			BufferedReader in = new BufferedReader(filein);
			int numcases = Integer.valueOf(in.readLine()).intValue();
			for(int i=0; i<numcases; i++){
				result += "Case #" + (i+1) + ": ";
				String sent = in.readLine();
				for(int j = 0; j < sent.length(); j++) {
					char c = sent.charAt(j);
					if(c == ' '){
						result += ' ';
					}
					else{
						result += transl.get(c);
					}
				}
				result += '\n';
			}
			//write file 
			FileWriter fileout = new FileWriter("output.txt");
			BufferedWriter out = new BufferedWriter(fileout);
			out.write(result);
			//Close the output stream
			out.close();
		}catch (Exception e){//Catch exception if any
			System.err.println("Error: " + e.getMessage());
		}
	}

}
