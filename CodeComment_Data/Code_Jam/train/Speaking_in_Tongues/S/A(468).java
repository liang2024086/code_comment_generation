package methodEmbedding.Speaking_in_Tongues.S.LYD347;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;


public class A {
	public static void main(String ... args) throws Exception{
		Scanner in = new Scanner(new File("A-small-attempt1.in"));
		PrintStream out = new PrintStream(new File("A-small-attempt1.out"));
		
		char[] mapping = new char[255];
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
		mapping['q'] = 'z';
		mapping['r'] = 't';
		mapping['s'] = 'n';
		mapping['t'] = 'w';
		mapping['u'] = 'j';
		mapping['v'] = 'p';
		mapping['w'] = 'f';
		mapping['x'] = 'm';
		mapping['y'] = 'a';
		mapping['z'] = 'q';
		mapping[' '] = ' ';
				
		
		int T = in.nextInt();
		in.nextLine();
		
		for(int t=0;t<T;t++){
			char[] line = in.nextLine().toCharArray();
			for(int i=0;i<line.length;i++){
				line[i] = mapping[line[i]];
			}
			out.println("Case #" + (t+1) + ": " + new String(line));
		}
		
		
	}
}
