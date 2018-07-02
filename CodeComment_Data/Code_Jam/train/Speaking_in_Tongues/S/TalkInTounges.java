package methodEmbedding.Speaking_in_Tongues.S.LYD1142;

import java.io.PrintWriter;
import java.util.TreeMap;

public class TalkInTounges {
	public static void main(String[] args) throws Exception {

		String input = "ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jvzq";
		String output = "our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give upqz";

		int inputLengh = input.length();
		TreeMap<String, String> charMap = new TreeMap<String, String>();

		PrintWriter pw = new PrintWriter("c:/antany/output.out");
		
		for (int i = 0; i < inputLengh; i++) {
			charMap.put("" + input.charAt(i), "" + output.charAt(i));
		}

		String str = GetWriteFileContent
				.getFileContent("c:/Antany/input.in");
		String[] strArray = str.split("\n");

		System.out.println("," + strArray[0].trim() + ",");

		int count = Integer.parseInt(strArray[0].trim());
		
		for (int j = 1; j <= count; j++) {
			String outline = "Case #"+j+": ";
			String line = strArray[j].trim();

			for (int k = 0; k < line.length(); k++) {

				outline = outline + charMap.get("" + line.charAt(k));
			}
			pw.println(outline);
		}
		
		pw.flush();
		pw.close();

	}
}
