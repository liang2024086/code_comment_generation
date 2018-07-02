package methodEmbedding.Speaking_in_Tongues.S.LYD1203;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.*;

/**
 * 
 */

/**
 * @author Daniel
 *
 */
public class Tongues {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Scanner s = new Scanner(System.in);
		Scanner s = new Scanner(new FileReader(new File(args[0])));
		int T = Integer.parseInt(s.nextLine());
		
		Map<Character,Character> translator = new HashMap<Character,Character>();
		translator.put(Character.valueOf('a'), Character.valueOf('y'));
		translator.put(Character.valueOf('b'), Character.valueOf('h'));
		translator.put(Character.valueOf('c'), Character.valueOf('e'));
		translator.put(Character.valueOf('d'), Character.valueOf('s'));
		translator.put(Character.valueOf('e'), Character.valueOf('o'));
		translator.put(Character.valueOf('f'), Character.valueOf('c'));
		translator.put(Character.valueOf('g'), Character.valueOf('v'));
		translator.put(Character.valueOf('h'), Character.valueOf('x'));
		translator.put(Character.valueOf('i'), Character.valueOf('d'));
		translator.put(Character.valueOf('j'), Character.valueOf('u'));
		translator.put(Character.valueOf('k'), Character.valueOf('i'));
		translator.put(Character.valueOf('l'), Character.valueOf('g'));
		translator.put(Character.valueOf('m'), Character.valueOf('l'));
		translator.put(Character.valueOf('n'), Character.valueOf('b'));
		translator.put(Character.valueOf('o'), Character.valueOf('k'));
		translator.put(Character.valueOf('p'), Character.valueOf('r'));
		translator.put(Character.valueOf('q'), Character.valueOf('z'));
		translator.put(Character.valueOf('r'), Character.valueOf('t'));
		translator.put(Character.valueOf('s'), Character.valueOf('n'));
		translator.put(Character.valueOf('t'), Character.valueOf('w'));
		translator.put(Character.valueOf('u'), Character.valueOf('j'));
		translator.put(Character.valueOf('v'), Character.valueOf('p'));
		translator.put(Character.valueOf('w'), Character.valueOf('f'));
		translator.put(Character.valueOf('x'), Character.valueOf('m'));
		translator.put(Character.valueOf('y'), Character.valueOf('a'));
		translator.put(Character.valueOf('z'), Character.valueOf('q'));
		translator.put(Character.valueOf(' '), Character.valueOf(' '));
		
		
		Writer output = new BufferedWriter(new FileWriter(new File("data.out")));
		for (int i = 1; i <= T; i++){
			System.out.print("Case #" + i + ": ");
			output.write("Case #" + Integer.toString(i) + ": ");
			String line = s.nextLine();
			for (int j = 0; j < line.length(); j++){
				System.out.print(translator.get(line.charAt(j)));
				output.write(Character.toString(translator.get(line.charAt(j))));
			}
			System.out.println();
			output.write("\n");
		}
		output.close();

	}

}
