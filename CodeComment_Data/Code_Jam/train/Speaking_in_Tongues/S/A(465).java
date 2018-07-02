package methodEmbedding.Speaking_in_Tongues.S.LYD1191;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A {
	private static final Map<Character, String> replacements = new HashMap<Character, String>( 26 );

	static {
		replacements.put('a', "y");
		replacements.put('b', "h");
		replacements.put('c', "e");
		replacements.put('d', "s");
		replacements.put('e', "o");
		replacements.put('f', "c");
		replacements.put('g', "v");
		replacements.put('h', "x");
		replacements.put('i', "d");
		replacements.put('j', "u");
		replacements.put('k', "i");
		replacements.put('l', "g");
		replacements.put('m', "l");
		replacements.put('n', "b");
		replacements.put('o', "k");
		replacements.put('p', "r");
		replacements.put('q', "z");
		replacements.put('r', "t");
		replacements.put('s', "n");
		replacements.put('t', "w");
		replacements.put('u', "j");
		replacements.put('v', "p");
		replacements.put('w', "f");
		replacements.put('x', "m");
		replacements.put('y', "a");
		replacements.put('z', "q");
		replacements.put(' ', " ");
	}

	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );

		int t = input.nextInt();
		input.nextLine();
		for( int i = 0; i < t; i++ ) {
			String frase = input.nextLine();
			System.out.print( "Case #" + ( i + 1 ) + ": " );
			for( int j = 0; j < frase.length(); j++ ) {
				System.out.print( replacements.get( frase.charAt( j ) ) );
			}
			System.out.println();
		}
	}

}
