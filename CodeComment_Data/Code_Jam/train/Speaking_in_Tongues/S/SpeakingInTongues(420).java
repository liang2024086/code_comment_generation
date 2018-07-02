package methodEmbedding.Speaking_in_Tongues.S.LYD761;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


public class SpeakingInTongues {
	public static void main(String args[]) throws IOException {
		String inputFile  = args[0];
		String outputFile = args[1];
		BufferedReader input  = new BufferedReader(new FileReader(inputFile));
		PrintWriter    output = new PrintWriter(outputFile);
		
		int testcases = Integer.valueOf(input.readLine());
		
		int testcase = 0;
		
		char mapping[] = {  'y',				 // 'a' -> 'y'
				            'h',                 // 'b' -> 'h'
				            'e',                 // 'c' -> 'e'
				            's',                 // 'd' -> 's'
				            'o',                 // 'e' -> 'o'
				            'c',                 // 'f' -> 'c'
				            'v',                 // 'g' -> 'v'
				            'x',                 // 'h' -> 'x'
				            'd',                 // 'i' -> 'd'
				            'u',                 // 'j' -> 'u'
				            'i',                 // 'k' -> 'i'
				            'g',                 // 'l' -> 'g'
				            'l',                 // 'm' -> 'l'
				            'b',                 // 'n' -> 'b'
				            'k',                 // 'o' -> 'k'
				            'r',                 // 'p' -> 'r'
				            'z',                 // 'q' -> 'z'
				            't',                 // 'r' -> 't'
				            'n',                 // 's' -> 'n'
				            'w',                 // 't' -> 'w'
				            'j',                 // 'u' -> 'j'
				            'p',                 // 'v' -> 'p'
				            'f',                 // 'w' -> 'f'
				            'm',                 // 'x' -> 'm'
				            'a',                 // 'y' -> 'a'
				            'q'                  // 'z' -> 'q'
		};
		
		while (testcase++ < testcases) {
			String newline = input.readLine();
			StringBuilder sb = new StringBuilder();
			int i;
			for (i = 0; i < newline.length(); i++) {
				char c = newline.charAt(i);
				if (c == ' ')
					sb.append(' ');
				else
					sb.append(mapping[c - 'a']);
			}
			
			output.println("Case #" + testcase + ": " + sb.toString());
		}
		
		output.close();
	}
}
