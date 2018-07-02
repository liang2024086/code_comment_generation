package methodEmbedding.Speaking_in_Tongues.S.LYD1641;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SpeakingInTongues {

	public static void main(String[] args) throws NumberFormatException, IOException {
		char[]mapping = new char[26];		
		String[]G = {"ejp mysljylc kd kxveddknmc re jsicpdrysi", "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd", "de kr kd eoya kw aej tysr re ujdr lkgc jv", "zq"};
		String[]S = {"our language is impossible to understand", "there are twenty six factorial possibilities", "so it is okay if you want to just give up", "qz"};
		for(int i = 0; i < G.length; i++){
			char[]g = G[i].toCharArray();
			char[]s = S[i].toCharArray();
			for(int j = 0; j < g.length; j++){
				if(g[j]==' ')continue;
				mapping[g[j]-'a'] = s[j];
			}
		}
//		for(int i = 0; i < mapping.length; i++){
//			System.out.print((char)(i+'a') + "->'" + mapping[i] + "' ");
//		}
//		System.out.println();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer t = Integer.parseInt(br.readLine());
		int init = t;
		while (t-- > 0) {
			char[]a = br.readLine().toCharArray();
			System.out.print("Case #"+(init-t)+": ");
			for(int i = 0; i < a.length; i++){
				char map = ' ';
				if(a[i]!= ' '){
					map = mapping[a[i]-'a'];
				}
				System.out.print(map);
			}
			System.out.println();
		}
	}
}
