package methodEmbedding.Speaking_in_Tongues.S.LYD292;

import java.awt.Frame;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Translation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader("A-small-attempt2.in"));
			int cases = Integer.parseInt(br.readLine());
			String[] words = new String[cases];
			for(int i = 0; i < cases; i++){
				words[i] = br.readLine();
			}
			LetterMap letters = new LetterMap();
			String from = "ejp mysljylc kd kxveddknmc re jsicpdrysirbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcdde kr kd eoya kw aej tysr re ujdr lkgc jvy qeez";
			String to = "our language is impossible to understandthere are twenty six factorial possibilitiesso it is okay if you want to just give upa zooq";
			int length = from.length();
			for(int i = 0; i < length; i++){
				letters.add(from.charAt(i), to.charAt(i));
			}
			FileWriter writer = new FileWriter("out.txt", true);
			for(int i = 0; i < cases; i++){
				StringBuffer out = new StringBuffer("Case #");
				out.append(i + 1);
				out.append(": ");
				length = words[i].length();
				for(int j = 0; j < length; j++){
					out.append(letters.translate(words[i].charAt(j)));
				}
				writer.append(out);
				writer.append("\n");
			}
			writer.close();
		} catch (NumberFormatException | IOException e) {
				e.printStackTrace();
		}
	}
}
