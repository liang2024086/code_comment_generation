package methodEmbedding.Speaking_in_Tongues.S.LYD487;


import java.util.HashMap;
import java.util.Map;

import reusable.CodeJamBase;

public class SpeakingInTongues {

	public static void main(String[] args) {
		String[] inputs = { "yeq", "ejp mysljylc kd kxveddknmc re jsicpdrysi", "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd", "de kr kd eoya kw aej tysr re ujdr lkgc jv" };
		String[] outputs = { "aoz", "our language is impossible to understand", "there are twenty six factorial possibilities", "so it is okay if you want to just give up" };
		final Map<Character, Character> mapping = new HashMap<Character, Character>(27);

		for (int i = 0; i < inputs.length; i++) {
			for (int j = 0; j < inputs[i].length(); j++) {
				mapping.put(inputs[i].charAt(j), outputs[i].charAt(j));
			}
		}
		System.out.println(mapping.size());

		char missingKey = 0;
		char missingValue = 0;
		for (char c = 'a'; c <= 'z'; c++) {
			if (!mapping.containsKey(c)) {
				missingKey = c;
			}
			if (!mapping.containsValue(c)) {
				missingValue = c;
			}
		}
		mapping.put(missingKey, missingValue);
		System.out.println(mapping.size());

		new CodeJamBase("A-small-attempt0") {

			@Override
			protected String solution() {
				String input = nextString();

				StringBuilder output = new StringBuilder(input.length());

				for (char c : input.toCharArray()) {
					output.append(mapping.get(c));
				}

				return output.toString();
			}

		}.run();
	}
}
