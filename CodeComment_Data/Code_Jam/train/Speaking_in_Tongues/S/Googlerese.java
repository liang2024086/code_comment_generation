package methodEmbedding.Speaking_in_Tongues.S.LYD1444;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Googlerese {

	
	
	public static char[] translate = {
		'y', // a
		'h', // b
		'e', // c
		's', // d
		'o', // e
		'c', // f
		'v', // g
		'x', // h
		'd', // i
		'u', // j
		'i', // k
		'g', // l
		'l', // m
		'b', // n
		'k', // o
		'r', // p
		'z', // q
		't', // r
		'n', // s
		'w', // t
		'j', // u
		'p', // v
		'f', // w
		'm', // x
		'a', // y
		'q'  // z
	};
	
	public static void main(String[] args) {
		Scanner sc=null;
		try {
			sc = new Scanner(new File("./A-small-attempt0.in"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		boolean b[] = new boolean[26];
//		for (int i=0;i<26;++i) b[translate[i] - 'a'] = true;
//		for (int i=0;i<26;++i) if(b[i] == false) System.out.println((char)(i+'a'));
		int nbCases = sc.nextInt();
		sc.nextLine();
		mainloop: for(int curCase=1; curCase <= nbCases ;++curCase) {
			String s = sc.nextLine();
			StringBuffer sb = new StringBuffer();
			for(int i=0;i< s.length();++i) {
				char c= s.charAt(i);
				char t = c - 'a' <26 && c- 'a' >=0 ? translate[c-'a'] : c;
				sb.append( t);
				
			}
			System.out.format("Case #%d: %s\n",curCase,sb.toString());
		}
	}

}
