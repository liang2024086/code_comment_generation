package methodEmbedding.Speaking_in_Tongues.S.LYD1183;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Scanner;

public class SpeakingInTongues {

	static HashMap<Character, String> template = new HashMap<Character, String>();

	public static void main(String[] args) throws FileNotFoundException {

		template.put('a', "y");
		template.put('b', "h");
		template.put('c', "e");
		template.put('d', "s");
		template.put('e', "o");
		template.put('f', "c");
		template.put('g', "v");
		template.put('h', "x");
		template.put('i', "d");
		template.put('j', "u");
		template.put('k', "i");
		template.put('l', "g");
		template.put('m', "l");
		template.put('n', "b");
		template.put('o', "k");
		template.put('p', "r");
		template.put('q', "z");
		template.put('r', "t");
		template.put('s', "n");
		template.put('t', "w");
		template.put('u', "j");
		template.put('v', "p");
		template.put('w', "f");
		template.put('x', "m");
		template.put('y', "a");
		template.put('z', "q");
		template.put(' ', " ");

		try {
			PrintStream out = new PrintStream(new FileOutputStream("Qualifying Round/A-small-Output.in"));
			System.setOut(out);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}

		try {
			Scanner scan = new Scanner(new File("Qualifying Round/A-small-attempt0.in"));

			int noOfCases = scan.nextInt();
			String ignore1 = scan.nextLine();

			for (int caseBeingHandled = 1; caseBeingHandled <= noOfCases; caseBeingHandled++) {

				String toHandle = scan.nextLine();

				String answer = "";

				char[] toHandleCharArray = toHandle.toCharArray();

				boolean start = true;

				for (char thisChar : toHandleCharArray) {

					String toAppend = "";

					toAppend += template.get(thisChar);

					answer += toAppend;

				}
				System.out.println("Case #" + (caseBeingHandled) + ": " + answer);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
