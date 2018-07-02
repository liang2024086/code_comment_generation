package methodEmbedding.Speaking_in_Tongues.S.LYD1098;

import java.util.*;
import java.io.*;
public class A {
	public static void main(String[]args) throws IOException {
		char[] letters={'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
//						a   b    c   d   e   f   g   h   i   j   k   l   m   n   o   p   Q   r   s   t   u   v   w   x   y   z
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		for(int x=1;x<N+1;x++) {
			String s = in.readLine();
			String r="";
			for(int i=0;i<s.length();i++) {
				if(Character.isLetter(s.charAt(i)))
					r+=letters[s.charAt(i)-'a'];
				else
					r+=' ';
			}
			System.out.println("Case #"+x+": "+r);
		}
	}
}
