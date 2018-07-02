package methodEmbedding.Speaking_in_Tongues.S.LYD1290;

import java.io.*;
import java.util.*;


public class A_Qual {
	public static void main(String[] args) throws IOException {
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
			String s=r.readLine();
			int T = new Integer(s);
			char[] map=new char[26];
			Arrays.fill(map, '?');
			for(int tt=1;tt<=T;tt++){
				s=r.readLine();
				String s2=r.readLine();
				for(int i=0;i<s.length();i++){
					if(s.charAt(i)==' ')continue;
					if(map[s.charAt(i)-'a']=='?')
						map[s.charAt(i)-'a'] = s2.charAt(i);
				}
			}
			map[25]='q';
			map['q'-'a']='z';
			T=new Integer(r.readLine());
			for (int tt = 1; tt <= T; tt++) {
				s=r.readLine();
				System.out.print("Case #"+tt+": ");
				for(int i=0;i<s.length();i++){
					if(s.charAt(i)==' ')System.out.print(" ");else
					System.out.print(map[s.charAt(i)-'a']);
				}
				System.out.println();
			}
	}
}
//3
//ejp mysljylc kd kxveddknmc re jsicpdrysi
//our language is impossible to understand
//rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd
//there are twenty six factorial possibilities
//de kr kd eoya kw aej tysr re ujdr lkgc jv
//so it is okay if you want to just give up
