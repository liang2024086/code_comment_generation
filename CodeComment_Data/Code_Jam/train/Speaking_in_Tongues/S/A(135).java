package methodEmbedding.Speaking_in_Tongues.S.LYD84;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class A {

	public static void main(String[] args) throws IOException {
		int[] m = {'y', 'h', 'e', 's', 'o', 'c', 'v', 'x', 'd', 'u', 'i', 'g', 'l', 'b', 'k', 'r', 'z', 't', 'n', 'w', 'j', 'p', 'f', 'm', 'a', 'q'};
		BufferedReader in = new BufferedReader(new FileReader("A-small-attempt0.in"));
		String li;
		int tcn = Integer.parseInt(in.readLine());
		
		for (int tc = 0; tc < tcn; tc++) {
			li = in.readLine();
			char[] c = li.toCharArray();
			
			System.out.print("Case #" + (tc + 1) + ": ");
			for (int i = 0; i < c.length; i++) {
				if (c[i] == 32) 
					System.out.print(c[i]);
				else
					System.out.print((char)m[c[i] - 97]);
			}
			
			System.out.println();
		}
		in.close();
	}
}
