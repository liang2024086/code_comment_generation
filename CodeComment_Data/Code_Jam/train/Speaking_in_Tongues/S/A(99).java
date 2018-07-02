package methodEmbedding.Speaking_in_Tongues.S.LYD1176;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintStream;

public class A {
	
	public static void main(String[] args) throws Throwable {
		//BufferedReader in = new BufferedReader(new FileReader("a.in"));
		BufferedReader in = new BufferedReader(new FileReader("A-small-attempt0.in"));		
		System.setOut(new PrintStream("a.out"));
//		            abcdefghijklmnopqrstuvwxyz
		char b[] = "yhesocvxduiglbkrztnwjpfmaq".toCharArray();
		for (int t = 0, n = Integer.parseInt(in.readLine().trim()); t < n; t++) {
			char a[] = in.readLine().toCharArray();
			char d[] = new char[a.length];
			for (int i = 0; i < a.length; i++) {
				d[i] = a[i] == ' ' ? ' ' : b[a[i]-'a'];
			}
			System.out.println("Case #"+(t+1)+": "+new String(d));
		}		
		System.out.close();
	}

}
