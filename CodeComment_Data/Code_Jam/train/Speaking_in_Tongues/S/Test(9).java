package methodEmbedding.Speaking_in_Tongues.S.LYD549;

import java.io.*;
import java.util.*;

public class Test {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
		int num = Integer.parseInt(br.readLine());
		HashMap<Character, Character> hmap = new HashMap<Character, Character>();
		String str1 = "ejp mysljylc kd kxveddknmc re jsicpdrysi";
		String str2 = "our language is impossible to understand";
		for (int i = 0; i< str1.length(); i++) {
			char c = str1.charAt(i);
			if (c != ' ')
				hmap.put(c, str2.charAt(i));
		}
		String str3 = "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd";
		String str4 = "there are twenty six factorial possibilities";
		for (int i = 0; i< str3.length(); i++) {
			char c = str3.charAt(i);
			if (c != ' ')
				hmap.put(c, str4.charAt(i));
		}
		String str5 = "de kr kd eoya kw aej tysr re ujdr lkgc jv";
		String str6 = "so it is okay if you want to just give up";
		for (int i = 0; i< str5.length(); i++) {
			char c = str5.charAt(i);
			if (c != ' ')
				hmap.put(c, str6.charAt(i));
		}
		hmap.put('q', 'z');
		hmap.put('z', 'q');
		String line;
		int nline = 1;
		while ((line = br.readLine()) != null && nline <=num) {
			String str = "";
			for (int i = 0; i< line.length(); i++) {
				char c = line.charAt(i);
				if (c != ' ')
					str += hmap.get(c);
				else
					str += " ";
			}
			System.out.println("Case #" + nline + ": " + str);
			nline++;
		}

	}		

}


