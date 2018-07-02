package methodEmbedding.Speaking_in_Tongues.S.LYD1685;

import java.io.*;
import java.util.*;

public class A2012 {
	public static void main(String[] args) throws IOException {
		PrintWriter out;
		BufferedReader f;
		try {
			f = new BufferedReader(new FileReader("A2012.in"));
			out = new PrintWriter(new BufferedWriter(new FileWriter(
					"A2012.out")));
		} catch (Exception e) {
			f = new BufferedReader(new InputStreamReader(System.in));
			out = new PrintWriter(System.out);
		}
		int n=Integer.parseInt(f.readLine());
		char[] code={'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
		for(int i=1;i<=n;i++){
			StringBuffer b=new StringBuffer(f.readLine());
			StringBuffer answer=new StringBuffer();
			for(int j=0;j<b.length();j++){
				char c=b.charAt(j);
				if(c==' '){
					answer.append(" ");
					continue;
				}
				answer.append(code[c-97]);
			}
			out.print("Case #");
			out.print(i+": ");
			out.println(answer);
		}

		

		out.close();
		System.exit(0);
	}
}
