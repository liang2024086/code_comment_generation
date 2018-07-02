package methodEmbedding.Speaking_in_Tongues.S.LYD1421;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;


public class Tongues {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		String[] s={"ejp mysljylc kd kxveddknmc re jsicpdrysi",
				"rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd",
				"de kr kd eoya kw aej tysr re ujdr lkgc jvqz"};
		
		String[] t={"our language is impossible to understand",
				"there are twenty six factorial possibilities",
				"so it is okay if you want to just give upzq"};
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length(); j++) {
				map.put(s[i].charAt(j), t[i].charAt(j));
			}
		}
		BufferedReader bReader  = new BufferedReader(new InputStreamReader(System.in));
		String number = bReader.readLine();
		int num = Integer.parseInt(number);
		for (int i = 0; i < num; i++) {
			String str = bReader.readLine();
			StringBuilder builder = new StringBuilder();
			builder.append("Case #");
			builder.append(i+1);
			builder.append(": ");
			for (char c : str.toCharArray()) {
				builder.append(map.get(c));
			}
			System.out.println(builder.toString());
		}
		

	}

}
