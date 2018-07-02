package methodEmbedding.Speaking_in_Tongues.S.LYD151;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.google.common.base.Charsets;
import com.google.common.io.Files;

public class Tounges {
	private static final Map<Character, Character> map = new TreeMap<Character, Character>();

	public Tounges() {

		String one = "ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv";
		String onegood = "our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up";

		map.put('q', 'z');
		map.put('z', 'q');

		for (int i = 0; i < one.toCharArray().length; i++) {
			map.put(one.charAt(i), onegood.charAt(i));
		}
		
	}

	public static void main(String[] args) throws IOException {
		List<String> lines = Files.readLines(new File("C:\\Users\\Anthony\\Desktop\\A-small-attempt0.in"),
				Charsets.UTF_8);
		Tounges tounges = new Tounges();
		StringBuilder output = new StringBuilder();
		for (int i = 1; i <= Integer.parseInt(lines.get(0)); i++) {
			output.setLength(0);
			output.append("Case #").append(i).append(": ");
			for (char chara : lines.get(i).toCharArray()) {
				output.append(map.get(chara));
			}
			output.append("\r\n");
			Files.append(output.toString(), new File("out.in"), Charsets.UTF_8);
		}
		System.out.println(output);
		

	}

}
