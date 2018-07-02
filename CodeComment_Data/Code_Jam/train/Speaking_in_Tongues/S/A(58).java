package methodEmbedding.Speaking_in_Tongues.S.LYD585;

import java.util.*;
import java.io.*;
import java.lang.*;

public class A {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new  FileReader("A-small-attempt3.in"));
	        PrintStream out = new PrintStream(new FileOutputStream("out.txt"));
		
		int t = Integer.parseInt(in.readLine());
		char[] alfa = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		char[] decode = {'y', 'h', 'e', 's', 'o', 'c', 'v', 'x', 'd', 'u', 'i', 'g', 'l', 'b', 'k', 'r', 'z', 't', 'n', 'w', 'j', 'p', 'f', 'm', 'a', 'q'};
	
		for(int cas = 0; cas < t; cas++) {
			String s = in.readLine();
			char[] tester = s.toCharArray();
			char[] solution = new char[s.length()];
			for(int i = 0; i < s.length(); i++) {
				for(int j = 0; j < 26; j++) {
					if (tester[i] == alfa[j])
						solution[i] = decode[j];
					if (tester[i] == ' ')
						solution[i] = ' ';
				}
			}
			String answer = new String(solution);
			
			out.println("Case #" + (cas+1) + ": " + answer);
		}
	}
}
