package methodEmbedding.Speaking_in_Tongues.S.LYD1238;

import java.io.*;
import java.util.*;


public class A {
	
	public static void main(String args[]) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("A-small-attempt0.in"));
		PrintWriter out = new PrintWriter(new FileWriter("A-small.out"));
		String code = "yhesocvxduiglbkrztnwjpfmaq";
		int T = Integer.parseInt(in.readLine());
		for(int i=0; i<T; i++) {
			String s = in.readLine();
			String ans = "";
			for(char c: s.toCharArray()) {
				if(c>='a' && c<='z') {
					ans+=code.charAt(c-'a');
				} else {
					ans+=c;
				}
				
			}
			out.println("Case #"+(i+1)+": "+ans);
		}
		out.close();
	}
}
