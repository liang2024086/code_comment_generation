package methodEmbedding.Speaking_in_Tongues.S.LYD1131;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class SpeakingInTongues {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Map<Character, Character> map = new HashMap<Character, Character>(); 
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String code = "ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jvqz";
		String sol  = "our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give upzq";
		
		for (int i=0;i<code.length();i++) { 
			map.put(code.charAt(i), sol.charAt(i));
		}
		
		map.put('z', 'q');
		
		try {
			
			int T = Integer.parseInt(in.readLine());
			for (int tc = 0; tc<T; tc++) {
				StringBuffer decoded = new StringBuffer(in.readLine()); 
				
				for (int i=0;i<decoded.length();i++) {
					decoded.setCharAt(i, map.get(decoded.charAt(i)));
				}
				
				System.out.println("Case #" + (tc+1) + ": " + decoded.toString());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
