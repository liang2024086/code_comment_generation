package methodEmbedding.Speaking_in_Tongues.S.LYD716;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static final String sampleI = "ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv yeq";
	public static final String sampleO = "our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up aoz";

	public static final char[] converter = new char[26];
	public static final char[] used = new char[26];
	
	static {
		for (int i=0; i<converter.length; i++) {
			converter[i] = (char)255;
			used[i] = (char)255;
		}
		for (int i=0; i < sampleI.length(); i++) {
			int c = (int)sampleI.charAt(i);
			if (c != ' ') {
				converter[c - 'a'] = sampleO.charAt(i);
				used[sampleO.charAt(i) - 'a'] = (char)c;
			}
		}
		
		for (int i=0; i<converter.length; i++) {
			if (converter[i] == (char)255) {
				for (int j=0; i<used.length; j++) {
					if (used[j] == (char)255) {
						converter[i] = (char)('a' + j);
						used[j] = (char)('a' + i);
						break;
					}
				}
			}
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		
		StringBuilder builder = new StringBuilder();
		
		int T = Integer.parseInt(reader.readLine());
		for (int i=0; i<T; i++) {
			builder.append("Case #").append(i+1).append(": ");
			String line = reader.readLine();
			for (int j=0; j < line.length(); j++) {
				char c = line.charAt(j);
				if (c == ' ') {
					builder.append(' ');
				} else {
					builder.append((char)converter[c - 'a']);
				}
			}
			builder.append("\n");
		}
		System.out.println(builder.toString());
	}
}
