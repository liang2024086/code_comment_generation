package methodEmbedding.Speaking_in_Tongues.S.LYD740;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc;
		try {
			sc = new Scanner(new File("A-small-attempt0.in"));
		
			int nbLines = Integer.parseInt(sc.nextLine());
			//System.out.print(nbLines);
			String line = "";
			int nb;
			char c;
			int currentLine = 1;
			while (sc.hasNextLine()) {
				System.out.print("Case #"+currentLine+": ");
				currentLine++;
				line = sc.nextLine();
				nb = line.length();
				for (int i = 0; i < nb; i++) {
					c = line.charAt(i);
					if (c == ' ')
						System.out.print(' ');
					else if ( c== 'a') {
						System.out.print('y');
					}
					else if ( c== 'b') {
						System.out.print('h');
					}
					else if ( c== 'c') {
						System.out.print('e');
					}
					else if ( c== 'd') {
						System.out.print('s');
					}
					else if ( c== 'e') {
						System.out.print('o');
					}
					else if ( c== 'f') {
						System.out.print('c');
					}
					else if ( c== 'g') {
						System.out.print('v');
					}
					else if ( c== 'h') {
						System.out.print('x');
					}
					else if ( c== 'i') {
						System.out.print('d');
					}
					else if ( c== 'j') {
						System.out.print('u');
					}
					else if ( c== 'k') {
						System.out.print('i');
					}
					else if ( c== 'l') {
						System.out.print('g');
					}
					else if ( c== 'm') {
						System.out.print('l');
					}
					else if ( c== 'n') {
						System.out.print('b');
					}
					else if ( c== 'o') {
						System.out.print('k');
					}
					else if ( c== 'p') {
						System.out.print('r');
					}
					else if ( c== 'q') {
						System.out.print('z');
					}
					else if ( c== 'r') {
						System.out.print('t');
					}
					else if ( c== 's') {
						System.out.print('n');
					}
					else if ( c== 't') {
						System.out.print('w');
					}
					else if ( c== 'u') {
						System.out.print('j');
					}
					else if ( c== 'v') {
						System.out.print('p');
					}
					else if ( c== 'w') {
						System.out.print('f');
					}
					else if ( c== 'x') {
						System.out.print('m');
					}
					else if ( c== 'y') {
						System.out.print('a');
					}
					else if ( c== 'z') {
						System.out.print('q');
					}
					
				}
				System.out.print("\n");
				if (currentLine > nbLines)
					break;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
