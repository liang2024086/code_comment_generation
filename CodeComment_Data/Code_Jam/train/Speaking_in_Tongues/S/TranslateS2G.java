package methodEmbedding.Speaking_in_Tongues.S.LYD1535;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;


public class TranslateS2G {

	static String sGooglerese = "ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv";
	static String sEnglish =    "our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up";
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File dic = new File("./dic.txt");
		dic.createNewFile();
		PrintStream out = new PrintStream(dic);
		
		Map<String, String> dictionary = new HashMap<String, String>();
		for (int i = 0; i < sGooglerese.length(); i ++) {
			String key = sGooglerese.substring(i, i+1);
			String value = sEnglish.substring(i, i+1);
			if (dictionary.containsKey(key)) {
				if (!value.equals(dictionary.get(key))) {
					throw new RuntimeException("bad match");
				}
			} else {
				dictionary.put(key, value);
			}
		}
		out.print(dictionary);
	}

}
