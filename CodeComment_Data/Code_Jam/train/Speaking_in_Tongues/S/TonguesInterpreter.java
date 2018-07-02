package methodEmbedding.Speaking_in_Tongues.S.LYD526;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class TonguesInterpreter {

	public TonguesInterpreter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException, NoSuchElementException {
		
		File inputFile = new File("A-small-attempt0.in");
		Scanner in = new Scanner(inputFile);
		int caseNumber = 1;
		int num = 0;
		
		String input = in.nextLine();
		
		while (in.hasNext())
		{
			
			input = in.nextLine();
			
			//while(!Character.isDigit(input.charAt(num))) { num++; }
						

			Map<Character,Character> replacementMap = new HashMap<Character,Character>();

			
			replacementMap.put('a', 'y');
			replacementMap.put('b', 'h');
			replacementMap.put('c', 'e');
			replacementMap.put('d', 's');
			replacementMap.put('e', 'o');
			replacementMap.put('f', 'c');
			replacementMap.put('g', 'v');
			replacementMap.put('h', 'x');
			replacementMap.put('i', 'd');
			replacementMap.put('j', 'u');
			replacementMap.put('k', 'i');
			replacementMap.put('l', 'g');
			replacementMap.put('m', 'l');
			replacementMap.put('n', 'b');
			replacementMap.put('o', 'k');
			replacementMap.put('p', 'r');
			replacementMap.put('q', 'z');
			replacementMap.put('r', 't');
			replacementMap.put('s', 'n');
			replacementMap.put('t', 'w');
			replacementMap.put('u', 'j');
			replacementMap.put('v', 'p');
			replacementMap.put('w', 'f');
			replacementMap.put('x', 'm');
			replacementMap.put('y', 'a');
			replacementMap.put('z', 'q');

			
			StringBuilder sb = new StringBuilder();
			for (int i=0, length=input.length(); i<length; i++) {
			    char ch = input.charAt(i);
			    Character replacement = replacementMap.get(ch);
			    sb.append(replacement != null ? replacement : ch);
			}
			
			String interpretedInput = sb.toString();
			
			
			System.out.println("Case #" + caseNumber + ": " + interpretedInput);
			caseNumber++;
		}
		
//		String input = in.nextLine();
//		String interpretedInput = input.replaceAll("c", "e").replaceAll("y", "a").replaceAll("y", "a").replaceAll("e", "o").replaceAll("q", "z").replaceAll("j", "u").replaceAll("p", "r").replaceAll("m", "l").replaceAll("s", "n").replaceAll("l", "g");
//		System.out.println(interpretedInput);
		
//		Scanner in = new Scanner(new File("input.in"));
//		String inFile = in.nextLine();

	}

}
