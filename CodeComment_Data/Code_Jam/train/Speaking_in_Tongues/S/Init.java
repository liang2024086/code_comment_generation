package methodEmbedding.Speaking_in_Tongues.S.LYD476;

import java.io.*;
import java.util.*;
public class Init {

	/**
	 * @param args
	 */
	public static void main(String[] args) {	
		try {
		// ----------------------------------------------------- //
		
			BufferedReader br = new BufferedReader(new FileReader("C:\\input.in"));
			BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\output.out"));
			
			int testcases = Integer.parseInt(br.readLine());
			
			// Create a map containing the letter associations. Key is in Googlerese, value in english.
			Map<Character,Character> assocs = new HashMap<Character,Character>();
			assocs.put('a','y');
			assocs.put('b','h');
			assocs.put('c','e');
			assocs.put('d','s');
			assocs.put('e','o');
			assocs.put('f','c');
			assocs.put('g','v');
			assocs.put('h','x');
			assocs.put('i','d');
			assocs.put('j','u');
			assocs.put('k','i');
			assocs.put('l','g');
			assocs.put('m','l');
			assocs.put('n','b');
			assocs.put('o','k');
			assocs.put('p','r');
			assocs.put('q','z');
			assocs.put('r','t');
			assocs.put('s','n');
			assocs.put('t','w');
			assocs.put('u','j');
			assocs.put('v','p');
			assocs.put('w','f');
			assocs.put('x','m');
			assocs.put('y','a');
			assocs.put('z','q');
			assocs.put(' ', ' ');
			
			// For each test case
			for(int i = 0; i < testcases; i++){
				String inputline = br.readLine();
				String outputline = "";
				
				// Loop thru letters in the current input line
				for (int j = 0; j < inputline.length(); j++) {
					outputline += assocs.get(inputline.charAt(j));
				}
				
				// Add the final string to the file
				bw.write("Case #"+Integer.toString(i+1)+": "+outputline);
				bw.newLine();
			}
			
			bw.flush();
			bw.close();
		// ----------------------------------------------------- //
		}
	
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
