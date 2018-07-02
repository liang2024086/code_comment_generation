package methodEmbedding.Speaking_in_Tongues.S.LYD1482;

import java.util.Scanner;


public class Exe2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String S="";
		String NS="";
		char a;
		Scanner b = new Scanner(System.in);
		for(int j=1;j<=30;j++){
		S=b.nextLine();
		NS="";
		for(int i=0;i<S.length();i++){
		a=S.charAt(i);
		switch(a){
		case 'a':
			NS+=String.valueOf('y');
		break;
		case 'b':
			NS+=String.valueOf('h');
		break;
		case 'c':
			NS+=String.valueOf('e');
		break;
		case 'd':
			NS+=String.valueOf('s');
		break;
		case 'e':
			NS+=String.valueOf('o');
		break;
		case 'f':
			NS+=String.valueOf('c');
		break;
		case 'g':
			NS+=String.valueOf('v');
		break;
		case 'h':
			NS+=String.valueOf('x');
		break;
		case 'i':
			NS+=String.valueOf('d');
		break;
		case 'j':
			NS+=String.valueOf('u');
		break;
		case 'k':
			NS+=String.valueOf('i');
		break;
		case 'l':
			NS+=String.valueOf('g');
		break;
		case 'm':
			NS+=String.valueOf('l');
		break;
		case 'n':
			NS+=String.valueOf('b');
		break;
		case 'o':
			NS+=String.valueOf('k');
		break;
		case 'p':
			NS+=String.valueOf('r');
		break;
		case 'q':
			NS+=String.valueOf('z');
		break;
		case 'r':
			NS+=String.valueOf('t');
		break;
		case 's':
			NS+=String.valueOf('n');
		break;
		case 't':
			NS+=String.valueOf('w');
		break;
		case 'u':
			NS+=String.valueOf('j');
		break;
		case 'v':
			NS+=String.valueOf('p');
		break;
		case 'x':
			NS+=String.valueOf('m');
		break;
		case 'z':
			NS+=String.valueOf('q');
		break;		
		case 'y':
			NS+=String.valueOf('a');
		break;
		case 'w':
			NS+=String.valueOf('f');
		break;
		default: NS+=" ";
		}
		
		}System.out.println("Case #"+j+": "+NS);
		
		
	}
	}
}
