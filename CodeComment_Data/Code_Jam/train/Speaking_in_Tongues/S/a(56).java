package methodEmbedding.Speaking_in_Tongues.S.LYD695;

import java.io.*;
import java.util.*;
import static java.lang.System.*;

public class a{
	public static void main(String[]args) throws Exception{
		StringBuilder sb = new StringBuilder("");
		BufferedReader br = new BufferedReader( new InputStreamReader(in));
		int n = Integer.parseInt(br.readLine().trim());
		HashMap<Character, Character> hm = new HashMap<Character, Character> ();
		hm.put('y','a');
		hm.put('n','b');
		hm.put('f','c');
		hm.put('i','d');
		hm.put('c','e');
		hm.put('w','f');
		hm.put('l','g');
		hm.put('b','h');
		hm.put('k','i');
		hm.put('u','j');
		hm.put('o','k');
		hm.put('m','l');
		hm.put('x','m');
		hm.put('s','n');
		hm.put('e','o');
		hm.put('v','p');
		hm.put('z','q');
		hm.put('p','r');
		hm.put('d','s');
		hm.put('r','t');
		hm.put('j','u');
		hm.put('g','v');
		hm.put('t','w');
		hm.put('h','x');
		hm.put('a','y');
		hm.put('q','z');
		for(int i = 0; i < n; i++){
			String s = br.readLine().trim();
			sb.append("Case #"+(i+1)+": ");
			for(int j = 0; j < s.length(); j++){
				char c = s.charAt(j);
				if(Character.isLetter(c)) sb.append(hm.get(c));
				else sb.append(c);
			}
			sb.append("\n");
		}
		out.print(sb);
	}
}
