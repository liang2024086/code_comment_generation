package methodEmbedding.Speaking_in_Tongues.S.LYD871;

/*
 * Google Code Jam 2012 - Qualification Round (14.04.2012)
 * Thomas "ThmX" Denor??az - thomas.denoreaz@gmail.com
 */


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class A {
	
	static final String FILENAME = "A-small-attempt0";

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		char[] mapping = new char[255];
		mapping[' '] = ' ';
		
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
		mapping['r'] = 't';
		mapping['s'] = 'n';
		mapping['t'] = 'w';
		mapping['u'] = 'j';
		mapping['v'] = 'p';
		mapping['w'] = 'f';
		mapping['x'] = 'm';
		mapping['y'] = 'a';
		
		mapping['q'] = 'z';
		mapping['z'] = 'q';
		
		BufferedReader reader = new BufferedReader(new FileReader(FILENAME + ".in"));
		PrintWriter writer = new PrintWriter(FILENAME + ".out");
		
		int N = Integer.valueOf(reader.readLine());
		for (int i=1; i<=N; i++) {
			writer.print("Case #" + i + ": ");
			
			String str = reader.readLine();
			for (int j = 0; j < str.length(); j++) {
				writer.print(mapping[str.charAt(j)]);				
			}
			writer.println();
		}
		
		writer.flush();
		writer.close();
		reader.close();
	}

}
