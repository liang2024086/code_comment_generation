package methodEmbedding.Speaking_in_Tongues.S.LYD974;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.HashMap;

public class SpeakingInTongues {
	
	public static void main(String[] args) throws Exception {
		String[] coded = new String[]{"ejp mysljylc kd kxveddknmc re jsicpdrysi",
									  "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd",
									  "de kr kd eoya kw aej tysr re ujdr lkgc jv"};
		
		String[] original = new String[]{"our language is impossible to understand",
										 "there are twenty six factorial possibilities",
										 "so it is okay if you want to just give up"};
		
		HashMap<Character, Character> decodeMap = new HashMap<Character, Character>();
		decodeMap.put('y', 'a');
		decodeMap.put('e', 'o');
		decodeMap.put('q', 'z');
		decodeMap.put('z', 'q');
		
		for(int i = 0; i < coded.length; i++) {
			for(int j = 0; j < coded[i].length(); j++) {
				char c = coded[i].charAt(j);
				char o = original[i].charAt(j);
				
				if(c == ' ') continue;
				
				decodeMap.put(c, o);
			}
		}
		
//		for(char c = 'a'; c <= 'z'; c++) {
//			System.out.println(c + " -> " + decodeMap.get(c));
//		}
		
		System.setIn(new FileInputStream("speakingintongues.in"));
		System.setOut(new PrintStream("speakingintongues.out"));
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(bf.readLine());
		for(int t = 1; t <= T; t++) {
			String line = bf.readLine().trim();
			StringBuilder out = new StringBuilder();
			
			for(int i = 0; i < line.length(); i++) {
				char c = line.charAt(i);
				if(c == ' ') out.append(' ');
				else out.append(decodeMap.get(c));
			}
			
			System.out.println("Case #" + t + ": " + out);
		}		
	}

}
