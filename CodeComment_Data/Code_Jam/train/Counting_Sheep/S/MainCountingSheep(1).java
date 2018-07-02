package methodEmbedding.Counting_Sheep.S.LYD1533;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainCountingSheep {
	public static void main(String[] args) throws Exception {
		// Set up the input and output files
		System.setIn(new FileInputStream("sample.in"));
		System.setOut(new PrintStream(new FileOutputStream("sample.out")));
		Scanner in = new Scanner(System.in);

		// Read in T
		int totalCases = Integer.parseInt(in.nextLine());
		for (int caseNumber = 1; caseNumber <= totalCases; caseNumber++) {
			System.out.print("Case #" + caseNumber + ": ");
			String line = in.nextLine();
			long startingNum = Long.parseLong(line);
			long num = startingNum;
			if (startingNum == 0) {
				System.out.println("INSOMNIA");
				continue;
			}
//			System.out.println("Starting num: " + line);
			
			Map<Character, Boolean> letters = new HashMap<>();
			letters.put('0', true);
			letters.put('1', true);
			letters.put('2', true);
			letters.put('3', true);
			letters.put('4', true);
			letters.put('5', true);
			letters.put('6', true);
			letters.put('7', true);
			letters.put('8', true);
			letters.put('9', true);
			
			for (int i=2; i < 1000; i++) {
				char[] numChars = Long.toString(num).toCharArray();
//				System.out.println("Num: " + num);
				for (int j=0; j < numChars.length; j++) {
					if (letters.containsKey(numChars[j])) {
						letters.remove(numChars[j]);
					}
				}
				//System.out.println("Letters: " + letters);
				if (letters.size() == 0) {
					System.out.println(num);
					break;
				}
				num = startingNum * i;
			}
//			System.out.println(num);
		}

	}
}
