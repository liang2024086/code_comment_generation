package methodEmbedding.Speaking_in_Tongues.S.LYD1151;

import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class googlerese {
	public static void main(String[] a) throws Exception{
		Scanner f = new Scanner(new File(a[0]));
		int T=f.nextInt();f.nextLine();
		for(int t=1; t<=T; t++){//for each case
			System.out.print("Case #"+t+": ");
			String g = f.nextLine();
			for (int i=0; i<g.length(); i++){
				switch(g.charAt(i)){
				case ' ':
					out.print(' ');break;
				case 'y':
					out.print('a');break;
				case 'n':
					out.print('b');break;
				case 'f':
					out.print('c');break;
				case 'i':
					out.print('d');break;
				case 'c':
					out.print('e');break;
				case 'w':
					out.print('f');break;
				case 'l':
					out.print('g');break;
				case 'b':
					out.print('h');break;
				case 'k':
					out.print('i');break;
				case 'u':
					out.print('j');break;
				case 'o':
					out.print('k');break;
				case 'm':
					out.print('l');break;
				case 'x':
					out.print('m');break;
				case 's':
					out.print('n');break;
				case 'e':
					out.print('o');break;
				case 'v':
					out.print('p');break;
				case 'z':
					out.print('q');break;
				case 'p':
					out.print('r');break;
				case 'd':
					out.print('s');break;
				case 'r':
					out.print('t');break;
				case 'j':
					out.print('u');break;
				case 'g':
					out.print('v');break;
				case 't':
					out.print('w');break;
				case 'h':
					out.print('x');break;
				case 'a':
					out.print('y');break;
				case 'q':
					out.print('z');break;
				default:
					out.print('-');
				}//end switch
			}//end for each letter in String
		out.println();
		}//end for each case
	}//end main
}
