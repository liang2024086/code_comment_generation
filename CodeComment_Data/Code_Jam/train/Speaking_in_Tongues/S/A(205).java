package methodEmbedding.Speaking_in_Tongues.S.LYD1544;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class A {
	public static void main(String[] args) throws IOException {
		Map<Character, Character> mapping = new HashMap<Character, Character>();
		String googlerese = "ejp mysljylc kd kxveddknmc re jsicpdrysirbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcdde kr kd eoya kw aej tysr re ujdr lkgc jvzq";
		String language = "our language is impossible to understandthere are twenty six factorial possibilitiesso it is okay if you want to just give upqz";

		for (int i=0; i < language.length(); i++) {
			mapping.put(googlerese.charAt(i), language.charAt(i));
		}
		
		File file = new File(args[0]);
		BufferedReader input = new BufferedReader(new FileReader(file));
		PrintWriter output = null;
		output = new PrintWriter(new FileWriter("/home/jose/dev/out.txt"));
		String line = null;
		line = input.readLine();
		
		int t = Integer.parseInt(line);
		
		for (int caseNum = 1; caseNum <= t; caseNum++) {
			line = input.readLine();
			StringBuffer resultLine = new StringBuffer();
			for (int i = 0; i < line.length(); i++) {
				resultLine.append(mapping.get(line.charAt(i)));
			}
			output.println("Case #" + caseNum + ": " + resultLine);
			System.out.println("Case #" + caseNum + ": " + resultLine);
		}
		output.close();
	}
}
