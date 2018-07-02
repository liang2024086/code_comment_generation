package methodEmbedding.Speaking_in_Tongues.S.LYD1355;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class A {
	public static void main(String[] args) throws IOException {
		char[] M = { 'y', 'h', 'e', 's', 'o', 'c', 'v', 'x', 'd', 'u', 'i',
				'g', 'l', 'b', 'k', 'r', 'z', 't', 'n', 'w', 'j', 'p', 'f',
				'm', 'a', 'q', };
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(in.readLine());
		for (int m = 1; m <= t; m++) {
			String s = in.readLine();
			String ans = "";
			for (int j = 0; j < s.length(); j++)
				if (s.charAt(j) == ' ')
					ans += " ";
				else
					ans += M[s.charAt(j) - 'a'];
			System.out.println("Case #" + m + ": " + ans);
		}
	}
}
