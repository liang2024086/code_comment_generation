package methodEmbedding.Speaking_in_Tongues.S.LYD472;

import java.io.*;

public class Speaking_In_Tongues {
	public static void main(String[] args) {
		char convert[] = new char[26];
		convert[0] = 'y';
		convert[1] = 'h';
		convert[2] = 'e';
		convert[3] = 's';
		convert[4] = 'o';
		convert[5] = 'c';
		convert[6] = 'v';
		convert[7] = 'x';
		convert[8] = 'd';
		convert[9] = 'u';
		convert[10] = 'i';
		convert[11] = 'g';
		convert[12] = 'l';
		convert[13] = 'b';
		convert[14] = 'k';
		convert[15] = 'r';
		convert[16] = 'z';
		convert[17] = 't';
		convert[18] = 'n';
		convert[19] = 'w';
		convert[20] = 'j';
		convert[21] = 'p';
		convert[22] = 'f';
		convert[23] = 'm';
		convert[24] = 'a';
		convert[25] = 'q';

		try {
			// Initialize
			InputStreamReader converter = new InputStreamReader(System.in);
			BufferedReader in = new BufferedReader(converter);
			String curLine = in.readLine();
			
			// Find number of cases
			int N = Integer.parseInt(curLine);
			
			// Read line by line
			for (int line = 0; line < N; line++) {
				curLine = in.readLine();

				// Translate
				StringBuilder sb = new StringBuilder();
				for (int curChar = 0; curChar < curLine.length(); curChar++) {
					if (curLine.charAt(curChar) == ' ') {
						sb.append(' ');
					}
					else {
						sb.append(convert[(int)(curLine.charAt(curChar)-'a')]);
					}
				}
				System.out.println("Case #" + (line+1) + ": " + sb.toString());
			}
		} catch(Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
