package methodEmbedding.Speaking_in_Tongues.S.LYD124;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class Main {
	public static String SampleG = "y qee ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv";
	public static String SampleS = "a zoo our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up";
	//Forget optimization
	//public static char[] translator = new char[26];
	private static Map<Character, Character> translateMap = new HashMap<Character, Character>();
	
	static {
		Set<Character> remainingKey = new HashSet<Character>(26);
		Set<Character> remainingValue = new HashSet<Character>(26);
		for ( int i =0; i < 26; i++ ) {
			char firstLetter = 'a';
			remainingKey.add((char) ((int)firstLetter + i) );
			remainingValue.add((char) ((int)firstLetter + i) );
		}
		
		for ( int i =0; i<SampleS.length(); i++ ) {
			translateMap.put(SampleG.charAt(i), SampleS.charAt(i));
		}

		remainingKey.removeAll(translateMap.keySet());
		remainingValue.removeAll(translateMap.values());
		assert ( remainingKey.size() == 1 && remainingValue.size() == 1);
		translateMap.put(remainingKey.iterator().next(), remainingValue.iterator().next());
				
	}
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//Read the file
		BufferedReader reader = new BufferedReader(new FileReader(args[0]));
		String firstLine = reader.readLine();
		int numLines = Integer.valueOf(firstLine);
		for ( int i =0; i < numLines; i++ ) {
			String line = reader.readLine();
			StringBuilder buffer = new StringBuilder();
			buffer.append("Case #");
			buffer.append(i+1);
			buffer.append(": ");
			for ( int j =0; j < line.length(); j++) {
				buffer.append(translateMap.get(line.charAt(j)));
			}
			System.out.println(buffer.toString());
		}

	}

}
