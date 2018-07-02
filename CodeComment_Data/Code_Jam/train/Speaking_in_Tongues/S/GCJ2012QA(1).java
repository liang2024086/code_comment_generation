package methodEmbedding.Speaking_in_Tongues.S.LYD55;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class GCJ2012QA {
	static final char[] translation = "yhesocvxduiglbkrztnwjpfmaq"
			.toCharArray();
	static char[] to = new char[100];

	public static void main(String[] args) throws Exception {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		int t = Integer.parseInt(r.readLine());
		String fromString;
		char fromChar;
		for (int i = 1; i <= t; i++) {
			fromString = r.readLine();
			int n = fromString.length();
			for (int j = 0; j < n; j++) {
				fromChar = fromString.charAt(j);
				to[j] = fromChar == ' ' ? ' ' : translation[fromChar - 'a'];
			}
			pw.println("Case #" + i + ": " + String.valueOf(to, 0, n));
		}
		pw.flush();
	}
}
