package methodEmbedding.Speaking_in_Tongues.S.LYD1198;


import java.util.List;
import java.util.Map;

import com.google.common.collect.Maps;

public class A {
	public static final String FROM = "our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up";
	public static final String TO =   "ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv";
	public static Map<String, String> RULE = Maps.newTreeMap();
	
	public static final String in = "/Users/vickcy/Downloads/A-small-attempt1.in.txt";
	public static final String out = "outA.txt";
	
	public static void main(String[] args) {
		for (int i=97; i < 123; i++) {
			int index = TO.indexOf((char) i);
			if (index >= 0) {
				RULE.put(TO.substring(index, index+1), FROM.substring(index, index+1));
			}
			RULE.put("q", "z");
			RULE.put("z", "q");
		}
		
		JamIO io = new JamIO();
		io.inPath = in;
		io.outPath = out;

		io.exec(new iIO() {
			@Override
			public void logic(String line, List<String> outputList) {
				StringBuffer sb = new StringBuffer();
				for (int i = 0; i < line.length(); i++) {
					if (line.charAt(i) == ' ')
						sb.append(" ");
					else
						sb.append(RULE.get(String.valueOf(line.charAt(i))));
				}
				outputList.add(sb.toString());
			}
		});
	}

}
