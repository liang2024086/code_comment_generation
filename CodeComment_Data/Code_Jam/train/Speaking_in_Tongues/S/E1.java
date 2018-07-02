package methodEmbedding.Speaking_in_Tongues.S.LYD341;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Scanner;


public class E1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char d[] = new char[256];
		
		d['a'] = 'y';
		d['b'] = 'h';
		d['c'] = 'e';
		d['d'] = 's';
		d['e'] = 'o';
		d['f'] = 'c';
		d['g'] = 'v';
		d['h'] = 'x';
		d['i'] = 'd';
		d['j'] = 'u';
		d['k'] = 'i';
		d['l'] = 'g';
		d['m'] = 'l';
		d['n'] = 'b';
		d['o'] = 'k';
		d['p'] = 'r';
		d['q'] = 'z'; //
		d['r'] = 't';
		d['s'] = 'n';
		d['t'] = 'w';
		d['u'] = 'j';
		d['v'] = 'p';
		d['w'] = 'f';
		d['x'] = 'm';
		d['y'] = 'a'; 
		d['z'] = 'q'; //
		
		
		Scanner sc = null;
		
		sc = new Scanner(System.in);
		
		
		int fases = sc.nextInt();
		
		sc.nextLine();
		
		for(int j=1; j<=fases; ++j){
			
			String line = sc.nextLine();
			
			String output = "";
			
			for(int i=0; i<line.length(); ++i){
				char c = line.charAt(i);
				
				if(c == ' '){
					output += " ";
				}
				else{
					output += d[c];
				}
			}
			
			output = "Case #" + j + ": " + output;
			
			System.out.println(output);
		}
		
		
	}

}
