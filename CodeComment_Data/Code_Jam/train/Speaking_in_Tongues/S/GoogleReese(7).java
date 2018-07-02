package methodEmbedding.Speaking_in_Tongues.S.LYD351;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;

public class GoogleReese {
	public static void main (String[] args) throws IOException {
		HashMap<Character, Integer>hashMap = new HashMap<Character, Integer>();
		String key = "ynficwlbkuomxsevzpdrjgthaq";
		for (int i=0; i<key.length(); i++) {
			hashMap.put(key.charAt(i), new Integer(i));
		}
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int testCase = Integer.parseInt(in.readLine());
		for (int i=1; i<=testCase; i++) {
			String encoded = in.readLine();
			String decoded = "";
			System.out.print("Case #" + i +": ");
			for (int j=0; j<encoded.length(); j++) {
				if (encoded.charAt(j) == ' ') {
					System.out.print(" ");
				} else {
					char ch = (char) ((int)'a' + (hashMap.get(encoded.charAt(j))));
					System.out.print(ch);
				}
			}
			System.out.println();
		}
	}
}
