package methodEmbedding.Speaking_in_Tongues.S.LYD302;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;

public class SpeakingInTongues {

	public static void main(String[] args) {
		Scanner sc = null;
		PrintWriter fout = null;
		int n = 0;

		try {
			sc = new Scanner(new File(args[0]));
			fout = new PrintWriter(new BufferedWriter(new FileWriter("result.txt")));
			n = sc.nextInt();
		} catch(Exception e) {
			System.out.println(e);
		}
		
		String[] smp = new String[3], ans = new String[3];
		smp[0] = "ejp mysljylc kd kxveddknmc re jsicpdrysi";
		smp[1] = "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd";
		smp[2] = "de kr kd eoya kw aej tysr re ujdr lkgc jv";
		ans[0] = "our language is impossible to understand";
		ans[1] = "there are twenty six factorial possibilities";
		ans[2] = "so it is okay if you want to just give up";
		
		char[] dic = new char[26];
		ArrayList<Character> left = new ArrayList<Character>();
		
		for( char i = 'a'; i <= 'z'; i++ ) {
			left.add(i);
		}
		
		dic['y'-'a'] = 'a';
		dic['e'-'a'] = 'o';
		dic['q'-'a'] = 'z';
		left.remove((Character)'a');
		left.remove((Character)'o');
		left.remove((Character)'z');
		
		for( int i = 0; i < 3; i++ ) {
			for( int j = 0; j < smp[i].length(); j++ ) {
				if( smp[i].charAt(j) != ' ' ) {
					dic[smp[i].charAt(j) - 'a'] = ans[i].charAt(j);
					if( left.contains( (Character)ans[i].charAt(j) ) ) {
						left.remove( (Character)ans[i].charAt(j) );
					}
				}
			}
		}
		
		if( left.size() == 1 ) {
			for( int i = 0; i < 26; i++ ) {
				if( dic[i] < 'a' || dic[i] > 'z' ) dic[i] = left.get(0);
			}
		}
		
		sc.nextLine();
		for( int i = 0; i < n; i++ ) {
			String inp = sc.nextLine();
			String ret = "";
			for( int j = 0; j < inp.length(); j++ ) {
				if( inp.charAt(j) == ' ' ) ret += ' ';
				else ret += dic[inp.charAt(j)-'a'];
			}
			//System.out.println("Case #" + i + ": " + ret);
			fout.println("Case #" + (i+1) + ": " + ret);
		}

		fout.close();
		sc.close();
	}

}
