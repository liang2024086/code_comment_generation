package methodEmbedding.Speaking_in_Tongues.S.LYD776;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class first {	
	
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader(new File("A-small-attempt3.in")));
		String line = "";
		String code = "ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv y qee";
		String eng = "our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up a zoo";
		char[] mapping = new char[26];
		int sum = 0;
		for (int i = 0, n = code.length(); i < n; i++) {
			char ch = code.charAt(i);
			if (ch == ' ' || mapping[ch - 'a'] != 0) continue;
			mapping[ch - 'a'] = eng.charAt(i);
			sum += eng.charAt(i) - 'a';
		}
		mapping[25] = (char) ((25 * 26 / 2 - sum) + 'a');
		int T = Integer.parseInt(in.readLine());
		PrintWriter out = new PrintWriter(new FileWriter(new File("A-small-attempt3.out")));
		for (int i = 0; i < T; i++) {
			line = in.readLine();
			StringBuffer result = new StringBuffer();
			for (int j = 0, n = line.length(); j < n; j++) {
				char ch = line.charAt(j);
				if (ch == ' ') 
					result.append(' ');
				else
					result.append(mapping[ch - 'a']);
			}
			out.println("Case #" + (i+1) + ": " + result.toString());
		}
		out.close();
	}
	
}
