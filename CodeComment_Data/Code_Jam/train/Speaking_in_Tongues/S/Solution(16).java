package methodEmbedding.Speaking_in_Tongues.S.LYD1295;

import java.io.*;

public class Solution {
	private static String mapping = "yhesocvxduiglbkrztnwjpfmaq";

	public static void main(String[] args) throws Exception {
		String curLine = "";
		int numLines, x , y;
		char c;
		
		InputStreamReader converter = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(converter);
		numLines = Integer.parseInt(in.readLine());
		
		for (x = 0; x < numLines; x++) {
			
			curLine = in.readLine();
			System.out.printf("Case #%d: ", x + 1);
			
			for (y = 0; y < curLine.length(); y++) {
				c = curLine.charAt(y);
				
				if (c == ' ')
					System.out.printf(" ");
				else
					System.out.printf("%c", mapping.charAt(c - 'a'));
			}
			System.out.print("\n");
		}
	}
}
