package methodEmbedding.Speaking_in_Tongues.S.LYD922;

import java.util.*;
import java.io.*;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;

public class q_a {
	
	private static char[] gin =  {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	private static char[] gout = {'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
	
	public static void main(String [] args) {
		
		// Prepare hashmapping of Googlese cipher
		HashMap<Character, Character> googlese = new HashMap<Character, Character>();

		for(int i=0; i<26; i++) googlese.put(gin[i], gout[i]);

		// Open files
		try {
			// Open input file
			FileInputStream iStream = new FileInputStream("Sample.in");
			// Get the DataInputStream object
			DataInputStream in = new DataInputStream(iStream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			
			System.out.println("Input file opened");
			
			// Create output file 
			FileWriter oStream = new FileWriter("Sample.out");
			BufferedWriter out = new BufferedWriter(oStream);
			
			System.out.println("Output file opened");
			
			// Read File Line By Line
			String strLine = br.readLine();
			int caseN = 1;
			while ((strLine = br.readLine()) != null) {
			
				out.write("Case #" + caseN + ": ");
				
				CharacterIterator it = new StringCharacterIterator(strLine);
				for (char ch=it.first(); ch != CharacterIterator.DONE; ch=it.next()) {
					if (ch == ' ') out.write(ch);
					else out.write(googlese.get(ch));		
				}
				out.newLine();
				System.out.println();
				caseN++;				
			}
			// Close the streams
			in.close();
			out.close();
		}catch (Exception e) {// Catch exception if any
			System.err.println("Error: " + e.getMessage());
		}		
		
		// Test cipher HashMap
		/*
		Set s = googlese.entrySet();
		Iterator i = s.iterator();
		int n = 0;
		while (i.hasNext()) {
			System.out.println(n+" "+i.next());
			n++;
		}
		*/
	}

}
