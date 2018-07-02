package methodEmbedding.Magic_Trick.S.LYD868;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class A {

	public static void main(String[] args) throws FileNotFoundException,
			IOException {
		Scanner sc = new Scanner(new FileReader("input.txt"));
		PrintWriter pw = new PrintWriter(new FileWriter("output.txt"));

		int noOfCases = sc.nextInt();

		for (int caseNum = 0; caseNum < noOfCases; caseNum++) {
			int rowOne  = sc.nextInt();
			HashSet<Integer> cardSetOne = new HashSet<Integer>();
			for (int i = 0; i < 16; i++) {
				int cardNumber = sc.nextInt();
				if (i >= (rowOne-1)*4 && i < (rowOne-1)*4 + 4) {
					cardSetOne.add(cardNumber);
				}
			}
			
			int rowTwo  = sc.nextInt();
			HashSet<Integer> cardSetTwo = new HashSet<Integer>();
			for (int i = 0; i < 16; i++) {
				int cardNumber = sc.nextInt();
				if (i >= (rowTwo-1)*4 && i < (rowTwo-1)*4 + 4) {
					cardSetTwo.add(cardNumber);
				}
			}
			
			String answer;
			cardSetOne.retainAll(cardSetTwo);
			
			if (cardSetOne.size() == 1) {
				answer = cardSetOne.toArray(new Integer[1])[0].toString();
			} else if (cardSetOne.size() > 1) {
				answer = "Bad magician!";
			} else {
				answer = "Volunteer cheated!";
			}
			
			pw.println("Case #" + (caseNum + 1) + ": "+answer);
		}
		pw.println();

		pw.flush();
		pw.close();
		sc.close();
	}
}
