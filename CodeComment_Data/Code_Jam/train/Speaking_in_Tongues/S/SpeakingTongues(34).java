package methodEmbedding.Speaking_in_Tongues.S.LYD218;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class SpeakingTongues {
	public static void main(String[] args) {
		String english = "abcdefghijklmnopqrstuvwxyz ";
		String goolish = "ynficwlbkuomxsevzpdrjgthaq ";
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int T = Integer.parseInt(br.readLine());
			for (int i=0; i<T; i++) {
				String output = "";
				String s = br.readLine();
				for (int j=0; j<s.length(); j++) {
					int coff = goolish.indexOf(s.charAt(j));
					output = output + english.charAt(coff);
				}
				System.out.println("Case #" + (i+1) + ": " + output);
			}
			
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		
	}
}
