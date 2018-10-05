package methodEmbedding.Speaking_in_Tongues.S.LYD1179;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		char[] b1 = "ejp mysljylc kd kxveddknmc re jsicpdrysi".toCharArray();
		char[] b2 = "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd".toCharArray();
		char[] b3 = "de kr kd eoya kw aej tysr re ujdr lkgc jv".toCharArray();
		
		char[] a1 = "our language is impossible to understand".toCharArray();
		char[] a2 = "there are twenty six factorial possibilities".toCharArray();
		char[] a3 = "so it is okay if you want to just give up".toCharArray();
		boolean[] v = new boolean[300];
		char[] t = new char[300];
		t['z'] = 'q';
		t['q'] = 'z';
		for(int i = 0; i < a1.length; i++)
			t[a1[i]] = b1[i];
		for(int i = 0; i < a2.length; i++)
			t[a2[i]] = b2[i];
		for(int i = 0; i < a3.length; i++)
			t[a3[i]] = b3[i];
//		for(int ch = 'a'; ch <= 'z'; ch++)
//			System.out.println((char)ch + " " + t[ch]);
//		System.out.println(" .. ");
//		for(int ch = 'a'; ch <= 'z'; ch++)
//			v[t[ch]] = true;
//		for(int ch = 'a'; ch <= 'z'; ch++)
//			if(!v[ch])System.out.println((char)ch);
		char[] d = new char[300];
		for(int ch = 'a'; ch <= 'z'; ch++)
			d[t[ch]] = (char)ch;
		
//		for(int ch = 'a'; ch <= 'z'; ch++)
//			System.out.println((char)ch + " " + d[ch]);
		
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(r.readLine());
		int caseNumber = 1;
		while(T-- > 0){
			char[] a = r.readLine().toCharArray();
			
			System.out.printf("Case #%d: ", caseNumber++);
			for(int i = 0; i < a.length; i++)
				if(a[i] == ' ')System.out.print(' ');
				else System.out.print(d[a[i]]);
			System.out.println();
		}
	}
}
