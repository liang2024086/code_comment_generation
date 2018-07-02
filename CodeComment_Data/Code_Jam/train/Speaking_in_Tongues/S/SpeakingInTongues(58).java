package methodEmbedding.Speaking_in_Tongues.S.LYD710;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;


public class SpeakingInTongues {
	
	public static void main(String[] argv) throws Exception {
	 //Scanner s = new Scanner(System.in);
	 Scanner s = new Scanner(new FileInputStream("SpeakingInTongues/A-small-attempt0.in"));
		PrintWriter p = new PrintWriter(new FileOutputStream("SpeakingInTongues/A-small-attempt0.out"));
		//PrintWriter p = new PrintWriter(System.out);
		
		String G1 = "ejp mysljylc kd kxveddknmc re jsicpdrysi";
		String E1 = "our language is impossible to understand";
		String G2 = "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd";
		String E2 = "there are twenty six factorial possibilities";
		String G3 = "de kr kd eoya kw aej tysr re ujdr lkgc jv";
		String E3 = "so it is okay if you want to just give up";
		String G4 = "yeqz";
		String E4 = "aozq";
		
		char[] map = new char[26];
		
		for(int i=0;i<G1.length();i++) {
			if(G1.charAt(i) == ' ') continue;
			map[G1.charAt(i)-'a'] = E1.charAt(i);
		}

		for(int i=0;i<G2.length();i++) {
			if(G2.charAt(i) == ' ') continue;
			map[G2.charAt(i)-'a'] = E2.charAt(i);
		}

		for(int i=0;i<G3.length();i++) {
			if(G3.charAt(i) == ' ') continue;
			map[G3.charAt(i)-'a'] = E3.charAt(i);
		}
		for(int i=0;i<G4.length();i++) {
			if(G4.charAt(i) == ' ') continue;
			map[G4.charAt(i)-'a'] = E4.charAt(i);
		}

		
		for(int i=0;i<map.length;i++) {
			System.out.println((char)(i+'a') + "=" + map[i]);
		}
		int N = s.nextInt();
		s.nextLine();
		for(int i=1;i<=N;i++) {
			String s1 = s.nextLine();
			char[] s2 = new char[s1.length()];
			for(int j=0;j<s1.length();j++) {
				if(s1.charAt(j) == ' ') s2[j] = ' ';
				else {
					s2[j] = map[s1.charAt(j)-'a'];
				}
			}
			
			p.println("Case #" + i +": " + new String(s2));
			System.out.println("Case #" + i +":" + new String(s2));
		}
		p.flush();
		p.close();
	}

}
