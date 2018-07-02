package methodEmbedding.Speaking_in_Tongues.S.LYD186;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class SpeakinginTongues {
	public static void main(String[] args) throws IOException {
		FileReader fs = new FileReader("input/A-small-attempt0.txt");
		char[] arr = new char['z' - 'a' + 1];
		arr['a' - 'a'] = 'y';
		arr['b' - 'a'] = 'h';
		arr['c' - 'a'] = 'e';
		arr['d' - 'a'] = 's';
		arr['e' - 'a'] = 'o';
		arr['f' - 'a'] = 'c';
		arr['g' - 'a'] = 'v';
		arr['h' - 'a'] = 'x';
		arr['i' - 'a'] = 'd';
		arr['j' - 'a'] = 'u';
		arr['k' - 'a'] = 'i';
		arr['l' - 'a'] = 'g';
		arr['m' - 'a'] = 'l';
		arr['n' - 'a'] = 'b';
		arr['o' - 'a'] = 'k';
		arr['p' - 'a'] = 'r';
		arr['q' - 'a'] = 'z';
		arr['r' - 'a'] = 't';
		arr['s' - 'a'] = 'n';
		arr['t' - 'a'] = 'w';
		arr['u' - 'a'] = 'j';
		arr['v' - 'a'] = 'p';
		arr['w' - 'a'] = 'f';
		arr['x' - 'a'] = 'm';
		arr['y' - 'a'] = 'a';
		arr['z' - 'a'] = 'q';

		BufferedReader bf = new BufferedReader(fs);
		int T = Integer.valueOf(bf.readLine());
		int  jj = 1;
		while (T-- > 0) {
			String line = bf.readLine();
			System.out.print("Case #" + jj + ": ");
			for (int i = 0; i < line.length(); ++i) {
				if (line.charAt(i) == ' ') {
					System.out.print(" ");
					continue;
				}
				System.out.print(arr[line.charAt(i) - 'a']);
			}
			System.out.println();
			jj++;
		}
		bf.close();
		
	}
}
