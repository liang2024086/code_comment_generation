package methodEmbedding.Speaking_in_Tongues.S.LYD587;

import java.util.Scanner;

public class SpeakingInTongues {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String encrypted = "ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv y qeez";
		String decrypted = "our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up a zooq";
		char[] decryptScheme = new char[26];
		for(int i = 0; i < encrypted.length(); i++) {
			if(encrypted.charAt(i) >= 'a' && encrypted.charAt(i) <= 'z') {
				decryptScheme[encrypted.charAt(i) - 'a'] = decrypted.charAt(i);
			}
		}
		int numberOfLines = Integer.parseInt(in.nextLine());
		for(int i = 0; i < numberOfLines; i++) {
			String s = in.nextLine(), r = "";
			for(int j = 0; j < s.length(); j++) {
				if(s.charAt(j) >= 'a' && s.charAt(j) <= 'z') {
					r += decryptScheme[s.charAt(j) - 'a'];
				} else {
					r += s.charAt(j);
				}
			}
			System.out.println("Case #" + (i + 1) + ": " + r);
		}
	}
}
