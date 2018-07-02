package methodEmbedding.Speaking_in_Tongues.S.LYD859;

import java.util.Scanner;


public class A {
	public static void main(String[] args) {
		  char alp[] = new char[256];
		  for(int i = 0 ; i < 256 ; i++){
		    alp[i] = '@';
		  }
		  alp['a'] = 'y';
		  alp['b'] = 'h';
		  alp['c'] = 'e';
		  alp['d'] = 's';
		  alp['e'] = 'o';
		  alp['f'] = 'c';
		  alp['g'] = 'v';
		  alp['h'] = 'x';
		  alp['i'] = 'd';
		  alp['j'] = 'u';
		  alp['k'] = 'i';
		  alp['l'] = 'g';
		  alp['m'] = 'l';
		  alp['n'] = 'b';
		  alp['o'] = 'k';
		  alp['p'] = 'r';
		  alp['q'] = 'z';
		  alp['r'] = 't';
		  alp['s'] = 'n';
		  alp['t'] = 'w';
		  alp['u'] = 'j';
		  alp['v'] = 'p';
		  alp['w'] = 'f';
		  alp['x'] = 'm';
		  alp['y'] = 'a';
		  alp['z'] = 'q';
		  alp[' '] = ' ';
		  Scanner sc = new Scanner(System.in);
		  int t = new Integer(sc.nextLine());
		  for(int i = 1 ; i <= t ; i++){
			  String s = sc.nextLine();
			  System.out.print("Case #"+i+": ");
			  for(Character c : s.toCharArray()){
				  System.out.print(alp[c]);
			  }
			  System.out.println();
		  }
	}
}
