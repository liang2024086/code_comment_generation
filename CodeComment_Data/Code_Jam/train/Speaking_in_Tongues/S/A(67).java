package methodEmbedding.Speaking_in_Tongues.S.LYD1636;

import java.util.*;
import java.io.*;

public class A {
	public static void main(String[] args) throws IOException {
		Scanner source = new Scanner(new BufferedReader(new FileReader("sampleg.in")));
		Scanner target = new Scanner(new BufferedReader(new FileReader("samplee.in")));
		Scanner s = new Scanner(System.in);
		
		int n = source.nextInt();
		source.nextLine();
		target.nextLine();
		
		char[] id1 = {'*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', };	// 26
		
		for (int cases=1; cases<=n; cases++) {
			String stsource = source.nextLine();
			String sttarget = target.nextLine();
			
			for (int i=0; i< stsource.length(); i++)
				if (stsource.charAt(i) != ' ') {
					char cs = stsource.charAt(i);
					id1[cs-'a'] = sttarget.charAt(i);
				}
		}
		id1['z'-'a'] = 'q';
		id1['q'-'a'] = 'z';
		
		n = s.nextInt();
		s.nextLine();
		for (int cases=1; cases <= n; cases++) {
			String ss = s.nextLine();
			String ts = "";
			for (int i=0; i<ss.length(); i++)
				if (ss.charAt(i) == ' ') ts+=" ";
			else
				ts += id1[ss.charAt(i)-'a'];
			System.out.println("Case #" + cases + ": " + ts);
		}
		
		source.close();
		target.close();
	}
}
