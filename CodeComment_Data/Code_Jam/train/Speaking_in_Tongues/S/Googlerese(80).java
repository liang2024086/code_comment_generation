package methodEmbedding.Speaking_in_Tongues.S.LYD333;

import java.util.HashMap;
import java.util.Scanner;


public class Googlerese {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		HashMap<Character, Character> words = new HashMap<Character, Character>();
		words.put('y','a');
		words.put('n','b');
		words.put('f','c');
		words.put('i','d');
		words.put('c','e');
		words.put('w','f');
		words.put('l','g');
		words.put('b','h');
		words.put('k','i');
		words.put('u','j');
		words.put('o','k');
		words.put('m','l');
		words.put('x','m');
		words.put('s','n');
		words.put('e','o');
		words.put('v','p');
		words.put('z','q');
		words.put('p','r');
		words.put('d','s');
		words.put('r','t');
		words.put('j','u');
		words.put('g','v');
		words.put('t','w');
		words.put('h','x');
		words.put('a','y');
		words.put('q','z');
		
		Scanner sc = new Scanner(System.in);
		int lines = Integer.parseInt(sc.nextLine().trim());
		for(int i=1;i<=lines;i++){
			String line = sc.nextLine().trim();
			String changedLine="";
			for(int j=0;j<line.length();j++){
				char ch = line.charAt(j);
				if(ch!=' '){
					changedLine +=words.get(ch);
				}else{
					changedLine += ch;
				}
			}
			System.out.println("Case #"+i+": "+changedLine);
		}
		
		
	}

}
