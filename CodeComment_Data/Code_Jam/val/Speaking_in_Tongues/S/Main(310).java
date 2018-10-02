package methodEmbedding.Speaking_in_Tongues.S.LYD767;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		char[] tr = new char[65536];
		tr['a'] = 'y';
		tr['b'] = 'h';
		tr['c'] = 'e';
		tr['d'] = 's';
		tr['e'] = 'o';
		tr['f'] = 'c';
		tr['g'] = 'v';
		tr['h'] = 'x';
		tr['i'] = 'd';
		tr['j'] = 'u';
		tr['k'] = 'i';
		tr['l'] = 'g';
		tr['m'] = 'l';
		tr['n'] = 'b';
		tr['o'] = 'k';
		tr['p'] = 'r';
		tr['q'] = 'z';
		tr['r'] = 't';
		tr['s'] = 'n';
		tr['t'] = 'w';
		tr['u'] = 'j';
		tr['v'] = 'p';
		tr['w'] = 'f';
		tr['x'] = 'm';
		tr['y'] = 'a';
		tr['z'] = 'q';
		tr[' '] = ' ';
		
		for(int t=1; t<=T; t++) {
			String G = sc.nextLine();
			
			StringBuffer sb = new StringBuffer();
			
			for(int i=0; i<G.length(); i++) {
				sb.append(tr[G.charAt(i)]);
			}
			
			System.out.println("Case #" + t + ": " + sb);
		}
		
	}

}
