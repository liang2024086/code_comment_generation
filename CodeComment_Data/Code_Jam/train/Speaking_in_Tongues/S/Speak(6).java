package methodEmbedding.Speaking_in_Tongues.S.LYD1096;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Speak {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner oku = new Scanner(new File("A-small-attempt2.in"));
		PrintStream yaz = new PrintStream(new File("output.txt"));

		int n = oku.nextInt();
		
		String[] lines = new String[n];
		
		int[] stats = new int[255];

		oku.nextLine();
		for (int i = 0; i < n; i++) {

			lines[i] = oku.nextLine();
			
			for (int j = 0; j < lines[i].length(); j++)
				if ( lines[i].charAt(j) != ' ' )
					stats[lines[i].charAt(j)]++;
		}
		
		for (int i = 'a'; i <= 'z'; i++) {
			System.out.println((char)i + " " + stats[i]);
		}
		
		char[] mapping = new char[255];
		
		char[] englishMap = { 'e', 't', 'a', 'o', 'i', 'n', 's', 'h', 'r', 'd', 'l', 'c', 'u', 'm', 'w', 'f', 'g', 'y', 'p', 'b', 'v', 'k', 'j', 'x', 'q', 'z' };
		
		for (int j = 0; j < 26; j++) {
			int maxIndis = 'a';
			for (int i = 'a'; i <= 'z'; i++) {
				if ( stats[i] > stats[maxIndis] )
					maxIndis = i;
			}
			mapping[maxIndis] = englishMap[j];
			stats[maxIndis] = -1;
		}
		
		mapping['a'] = 'y';
		mapping['b'] = 'h';
		mapping['c'] = 'e';
		mapping['d'] = 's';
		mapping['e'] = 'o';
		mapping['f'] = 'c';
		mapping['g'] = 'v';
		mapping['h'] = 'x';
		mapping['i'] = 'd';
		mapping['j'] = 'u';
		mapping['k'] = 'i';
		mapping['l'] = 'g';
		mapping['m'] = 'l';
		mapping['n'] = 'b';
		mapping['o'] = 'k';
		mapping['p'] = 'r';
		mapping['q'] = 'z';//xx
		mapping['r'] = 't';
		mapping['s'] = 'n';
		mapping['t'] = 'w';
		mapping['u'] = 'j';
		mapping['v'] = 'p';
		mapping['w'] = 'f';
		mapping['x'] = 'm';
		mapping['y'] = 'a';
		mapping['z'] = 'q';
				
		for (int i = 0; i < n; i++) {
			String result = "";
			for (int j = 0; j < lines[i].length(); j++) {
				if ( lines[i].charAt(j) != ' ' )
					result += mapping[lines[i].charAt(j)];
				else result += ' ';
			}
			yaz.println("Case #" + (i+1) + ": " + result);
			
		}
		
		yaz.close();
		
	}

}
