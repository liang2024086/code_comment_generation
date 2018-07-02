package methodEmbedding.Speaking_in_Tongues.S.LYD531;

import java.util.Scanner;

public class SpeakinginTongues {

	public static void main(String[] args) {
		char[] map = new char[26];
		String[] ciphered = {"ejp mysljylc kd kxveddknmc re jsicpdrysi",
				"rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd",
				"de kr kd eoya kw aej tysr re ujdr lkgc jv"};
		String[] deciphered = {"our language is impossible to understand",
				"there are twenty six factorial possibilities",
				"so it is okay if you want to just give up"};
		for (int i = 0; i < ciphered.length; i++)
			for (int j = 0; j < ciphered[i].length(); j++)
				if (ciphered[i].charAt(j) != ' ')
					map[ciphered[i].charAt(j) - 'a'] = deciphered[i].charAt(j);
		
		/*for (int i = 0; i < 26; i++)
			System.out.println((char) (i + 'a') + ": " + map[i]);*/
		map['z' - 'a'] = 'q';
		map['q' - 'a'] = 'z';
		
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		in.nextLine();
		for (int index = 1; index <= T; index++) {
			System.out.print("Case #" + index + ": ");
			String cipher = in.nextLine();
			for (int i = 0; i < cipher.length(); i++) {
				if (cipher.charAt(i) != ' ')
					System.out.print(map[cipher.charAt(i) - 'a']);
				else
					System.out.print(' ');
			}
			System.out.println();
		}
	}

}
/*
3
ejp mysljylc kd kxveddknmc re jsicpdrysi
rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd
de kr kd eoya kw aej tysr re ujdr lkgc jv
*/
