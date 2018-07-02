package methodEmbedding.Speaking_in_Tongues.S.LYD523;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class SpeakingTongues {
	public static final int [] CHAR_CONST = {-9,-24,-11,-17,-6,-11,3,-5,2,9,2,-4,-12,-1,-5,-2,11,-5,16,15,-3,10,15,2,6,24};
	
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(
			new InputStreamReader(System.in));
		/**
		Hashtable<Character, Integer> tableOfChars = new 
			Hashtable<Character, Integer>();
	

		for(int ii = 0; ii < 3; ii++) {
			String encMsg = reader.readLine();
			String decMsg = reader.readLine();
			int size = encMsg.length();
			for(int jj = 0; jj < size; jj++) {
				int diff = decMsg.charAt(jj) - encMsg.charAt(jj);
				tableOfChars.put(encMsg.charAt(jj), diff);
			}
		}
		Set<Character> chars = tableOfChars.keySet();
		System.out.print("static final char [] CHAR_CONST = {");
		for(Character c : chars) {
			System.out.print(tableOfChars.get(c) + ",");
			
		}

		System.out.print("}");

		**/
		int times = Integer.parseInt(reader.readLine());
		for(int ii = 0; ii < times; ii++) {
			char [] buffer = reader.readLine().toCharArray();
			for(int jj = 0; jj < buffer.length; jj++) {
				if(buffer[jj] == '\t' || buffer[jj] == '\n' ||
					buffer[jj] == ' ' || buffer[jj] == '\r')
						continue;
				//System.out.println((buffer[jj] - 97) % 25);
				buffer[jj] += CHAR_CONST[(CHAR_CONST.length-1) - ((buffer[jj] - 97) % 26)];
				//System.out.println(buffer);
			}
			System.out.printf("Case #%d: %s\n", ii+1, new String(buffer));
		}
	}
}
