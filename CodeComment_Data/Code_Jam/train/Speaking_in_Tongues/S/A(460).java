package methodEmbedding.Speaking_in_Tongues.S.LYD1020;

import java.util.*;

public class A {
	static char map[] = new char[30];
	
	static {
		String s[] = {"ejp mysljylc kd kxveddknmc re jsicpdrysi", "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd", "de kr kd eoya kw aej tysr re ujdr lkgc jv"};
		String t[] = {"our language is impossible to understand", "there are twenty six factorial possibilities", "so it is okay if you want to just give up"};
		
		for(int i = 0; i < s.length; ++i) {
			for(int j = 0; j < s[i].length(); ++j) {
				if(s[i].charAt(j)-'a' >= 0)
					map[s[i].charAt(j)-'a'] = t[i].charAt(j);
			}
		}
		map['z'-'a'] = 'q';
		map['q'-'a'] = 'z';
//		for(int i = 0; i < map.length; ++i) {
//			System.out.println((char) ('a'+i) + " " + map[i]);
//		}
//		
	}
	
	public static void main(String args[]) {
		
	}
}
