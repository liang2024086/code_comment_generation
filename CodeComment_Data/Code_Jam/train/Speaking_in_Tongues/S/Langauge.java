package methodEmbedding.Speaking_in_Tongues.S.LYD1004;


import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Langauge {
	
	public static void main(String[] args){
		HashMap<Character,Character> letterMap = new HashMap<Character,Character>();
		letterMap.put('a', 'y');
		letterMap.put('b', 'h');
		letterMap.put('c', 'e');
		letterMap.put('d', 's');
		letterMap.put('e', 'o');
		letterMap.put('f', 'c');
		letterMap.put('g', 'v');
		letterMap.put('h', 'x');
		letterMap.put('i', 'd');
		letterMap.put('j', 'u');
		letterMap.put('k', 'i');
		letterMap.put('l', 'g');
		letterMap.put('m', 'l');
		letterMap.put('n', 'b');
		letterMap.put('o', 'k');
		letterMap.put('p', 'r');
		letterMap.put('q', 'z');
		letterMap.put('r', 't');
		letterMap.put('s', 'n');
		letterMap.put('t', 'w');
		letterMap.put('u', 'j');
		letterMap.put('v', 'p');
		letterMap.put('w', 'f');
		letterMap.put('x', 'm');
		letterMap.put('y', 'a');
		letterMap.put('z', 'q');
		letterMap.put(' ', ' ');
		
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();
		in.nextLine();
		for(int i=1; i<=cases; i++){
			char[] input = in.nextLine().toCharArray();
			for(int j=0; j<input.length; j++){
				input[j] = letterMap.get(input[j]).charValue();
			}
			System.out.println("Case #"+i+": "+new String(input));
		}
	}
}
