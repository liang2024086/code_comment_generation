package methodEmbedding.Magic_Trick.S.LYD2112;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import com.google.common.collect.Sets;
import com.google.common.collect.Sets.SetView;

public class MagicTrick {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner scanner = new Scanner(System.in);
		int numberOfCases = scanner.nextInt();
		
		for (int c = 0; c < numberOfCases; c++) {
			int choice1_0 = scanner.nextInt()-1;
			Set<Integer> cardSet1 = new HashSet<Integer>();
			for (int i = 0; i < 16; i++) {
				int cardNumber = scanner.nextInt();
				if (i / 4 == choice1_0) {
					cardSet1.add(cardNumber);
				}
			}
			int choice2_0 = scanner.nextInt()-1;
			Set<Integer> cardSet2 = new HashSet<Integer>();
			for (int i = 0; i < 16; i++) {
				int cardNumber = scanner.nextInt();
				if (i / 4 == choice2_0) {
					cardSet2.add(cardNumber);
				}
			}
			
			System.out.print("Case #" + (c+1) + ": ");
			SetView<Integer> setView = Sets.intersection(cardSet1, cardSet2);
			switch (setView.size()) {
			case 0:
				System.out.print("Volunteer cheated!");
				break;
			case 1:
				System.out.print(setView.iterator().next());
				break;
			default:
				System.out.print("Bad magician!");
				break;
			}
			System.out.println();
		}
	}

}
