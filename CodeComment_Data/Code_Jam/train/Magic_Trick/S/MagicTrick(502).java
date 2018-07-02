package methodEmbedding.Magic_Trick.S.LYD1694;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class MagicTrick {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("A-small-attempt0.in"));
		int t = scanner.nextInt();
		int caseNumber = 1;
		while (caseNumber <= t) {
			int a = scanner.nextInt();
			for (int i = 1; i <= a; i++) {
				scanner.nextLine();
			}
			Set<Integer> setA = new HashSet<Integer>();
			for (int i = 0; i < 4; i++) {
				setA.add(scanner.nextInt());
			}
			for (int i = a; i <= 4; i++) {
				scanner.nextLine();
			}
			
			int b = scanner.nextInt();
			for (int i = 1; i <= b; i++) {	
				scanner.nextLine();
			}
			Set<Integer> setB = new HashSet<Integer>();
			for (int i = 0; i < 4; i++) {
				setB.add(scanner.nextInt());
			}
			for (int i = b; i <= 4; i++) {
				scanner.nextLine();
			}

			setA.retainAll(setB);
			Integer[] resultArray = setA.toArray(new Integer[setA.size()]);
			
			String result = "";
			if (resultArray.length == 1) {
				result = String.valueOf(resultArray[0]);
			} else if (resultArray.length == 0) {
				result = "Volunteer cheated!";
			} else if (resultArray.length > 1) {
				result = "Bad magician!";
			}
			
			System.out.println("Case #" + caseNumber++ + ": " + result);
		}
	}
	
}
