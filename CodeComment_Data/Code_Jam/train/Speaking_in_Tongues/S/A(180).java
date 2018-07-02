package methodEmbedding.Speaking_in_Tongues.S.LYD1099;

import java.util.*;
import java.io.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Math.*;
import static java.lang.Integer.*;

public class A {
	static char[] a = "ejp mysljylc kd kxveddknmc re jsicpdrysirbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcdde kr kd eoya kw aej tysr re ujdr lkgc jv".toCharArray();
	static char[] b = "our language is impossible to understandthere are twenty six factorial possibilitiesso it is okay if you want to just give up".toCharArray();
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		char[] map = new char[26];
		for(int i=0;i<a.length;i++) {
			if(a[i] != ' ') {
				map[a[i]-'a'] = b[i];
			}
		}
		map['z'-'a']='q';
		map['q'-'a']='z';
		// boolean[] arr = new boolean[26];
		// for(int i=0;i<map.length;i++) {
			// if(arr[map[i]-'a']) {
				// out.println("error at "+i);
			// }
			// arr[map[i]-'a']=true;
			// out.println((char)('a'+i)+" "+map[i]);
		// }
		int t = parseInt(br.readLine());
		int z = 1;
		while(t-->0) {
			char[] c = br.readLine().toCharArray();
			for(int i=0;i<c.length;i++) {
				if(c[i] != ' ') {
					c[i] = map[c[i]-'a'];
				}
			}
			out.println("Case #"+z+++": " + new String(c));
		}
	}
}
