package methodEmbedding.Speaking_in_Tongues.S.LYD950;

import java.util.HashMap;
import java.util.Scanner;


public class A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int nbr_case = scan.nextInt();
		String ans;
		HashMap<Character ,String> translator = new HashMap<Character,String>();
		translator.put('a', "y");
		translator.put('b', "h");
		translator.put('c', "e");
		translator.put('d', "s");
		translator.put('e', "o");
		translator.put('f', "c");
		translator.put('g', "v");
		translator.put('h', "x");
		translator.put('i', "d");
		translator.put('j', "u");
		translator.put('k', "i");
		translator.put('l', "g");
		translator.put('m', "l");
		translator.put('n', "b");
		translator.put('o', "k");
		translator.put('p', "r");
		translator.put('q', "z");
		translator.put('r', "t");
		translator.put('s', "n");
		translator.put('t', "w");
		translator.put('u', "j");
		translator.put('v', "p");
		translator.put('w', "f");
		translator.put('x', "m");
		translator.put('y', "a");
		translator.put('z', "q");
		translator.put(' ', " ");
		scan.nextLine();
		for(int i = 0; i < nbr_case; i++)
		{
			ans = "";
			String word = scan.nextLine();
			char[] chars = word.toCharArray();
			for(int j = 0; j < word.length(); j++)
			{
				ans+= translator.get(chars[j]);
				
			}
			System.out.format("Case #%d: %s\n", i+1, ans);
		}
		
		
		
	}

	

}
