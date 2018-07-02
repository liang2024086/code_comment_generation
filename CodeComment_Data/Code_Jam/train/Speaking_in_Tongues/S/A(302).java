package methodEmbedding.Speaking_in_Tongues.S.LYD382;

import java.util.*;
import java.io.*;
public class A {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(new File("A.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("A.out")));
		char[] shift = {'y', 'h', 'e', 's', 'o', 'c', 'v', 'x', 'd', 'u', 'i', 'g', 'l', 'b', 'k', 'r', 'z', 't', 'n', 'w', 'j', 'p', 'f', 'm', 'a', 'q'};
		int N = Integer.parseInt(sc.nextLine());
		for(int i=1;i<=N;i++){
			char[] s = sc.nextLine().toCharArray();
			StringBuilder SB = new StringBuilder();
			for(int a=0;a<s.length;a++){
				if(s[a]!=' ')s[a]=shift[s[a]-'a'];
				SB.append(s[a]);
			}
			
			out.println("Case #"+i+": "+SB.toString());
		}
		
		out.close();
	}

}
