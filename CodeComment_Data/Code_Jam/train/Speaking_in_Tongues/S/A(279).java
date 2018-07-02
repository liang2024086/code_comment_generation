package methodEmbedding.Speaking_in_Tongues.S.LYD652;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class A {
	public static void main(String[] args) throws Exception {
		char[]a = {'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
		BufferedReader in = new BufferedReader(new FileReader(new File("A.in")));
		PrintWriter out = new PrintWriter(new FileWriter("A.out"));
		int tests = Integer.parseInt(in.readLine());
		
		for (int i = 1; i <= tests; i++) {
			out.print("Case #" + (i) + ": ");
			char [] s = in.readLine().toCharArray();
			for (int j = 0; j < s.length; j++) {
				if(s[j] == ' '){
					out.print(" ");
				}else{
					for (int k = 0; k < 26; k++) {
						if(s[j] == 'a'+k){
							out.print(a[k]);
							break;
						}
					}
				}
			}			
			out.println();
		}
		out.close();
	
	}
}
