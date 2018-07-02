package methodEmbedding.Speaking_in_Tongues.S.LYD1043;

import java.util.HashMap;
import java.util.Scanner;


public class SpeakingAnal {
	public static void main(String[] args) {
		//Scanner scan = new Scanner(System.in);
		HashMap<Character, Character> alp = new HashMap<Character,Character>();
		char[] g1 = "ejp mysljylc kd kxveddknmc re jsicpdrysi".toCharArray();
		char[] g2 = "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd".toCharArray();
		char[] g3 = "de kr kd eoya kw aej tysr re ujdr lkgc jv".toCharArray();
		
		String s1 = "our language is impossible to understand";
		String s2 = "there are twenty six factorial possibilities";
		String s3 = "so it is okay if you want to just give up";
		
		for(int i = 1; i < g1.length; i++) {
			alp.put(g1[i], s1.charAt(i));
		}
		
		for(int i = 1; i < g2.length; i++) {
			alp.put(g2[i], s2.charAt(i));
		}
		
		for(int i = 1; i < g3.length; i++) {
			alp.put(g3[i], s3.charAt(i));
		}
		
		alp.put('q', 'z');
		alp.put('z', 'q');
		
		Scanner scan = new Scanner(System.in);
		int cases = Integer.parseInt(scan.nextLine());
		
		for(int i = 0; i < cases; i++) {
			System.out.print("Case #" + (i+1) + ": ");
			String s = scan.nextLine().trim();
			for(int j = 0; j < s.length(); j++){
				System.out.print(alp.get(s.charAt(j)));
			}
			System.out.println();
		}
		
	}

}
