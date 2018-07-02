package methodEmbedding.Speaking_in_Tongues.S.LYD1056;

import java.util.*;
import java.io.*;

public class A{
	public static Scanner sin;
	public static PrintWriter out;
	public static char[] conv = new char[] {'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
	public static void main(String[] args) throws IOException{
		sin = new Scanner(new BufferedReader(new FileReader("A.in")));	
		out = new PrintWriter(new BufferedWriter(new FileWriter("A.out")));
		int num = sin.nextInt();
		sin.nextLine();
		for(int i=1; i<=num; i++){
			String s = sin.nextLine();
			char[] ans = new char[s.length()];
			for(int j=0; j<ans.length; j++){
				char p = s.charAt(j);
				if(p>='a' && p<='z') ans[j]=conv[p-'a'];
				else ans[j]=p;
			}
			out.println("Case #"+i+": "+(new String(ans)));
		}
		out.flush();
		out.close();
	}
}
