package methodEmbedding.Magic_Trick.S.LYD1056;

import java.io.File;
import java.util.HashSet;
import java.util.Scanner;

public class MagicTrick {
	
	public static void main(String[] args) throws Exception {

		Scanner scan = new Scanner(new File("A-small-attempt0.in"));

		int rounds = scan.nextInt();

		for (int round = 0; round < rounds; round++) {

			int row1 = scan.nextInt();

			HashSet<Integer> set1 = new HashSet<Integer>();
			for (int row = 1; row <= 4; row++) {

				if (row == row1) {
					for (int i = 0; i < 4; i++)
						set1.add(scan.nextInt());
				} 
				else {
					for (int i = 0; i < 4; i++)
						scan.nextInt();
	
				}
				
			}

			int row2 = scan.nextInt();

			HashSet<Integer> set2 = new HashSet<Integer>();
			for (int row = 1; row <= 4; row++) {

				if (row == row2) {
					for (int i = 0; i < 4; i++)
						set2.add(scan.nextInt());
				} 
				else {
					for (int i = 0; i < 4; i++)
						scan.nextInt();
	
				}
				
			}

//			System.out.println(set1 + "\n" + set2);

			set1.retainAll(set2);
			
			System.out.print("Case #" + (round + 1) + ": ");
			
			if (set1.size() > 1) {
				System.out.println("Bad magician!");
			}
			else if (set1.size() == 1) {
				System.out.println(set1.iterator().next());
			} else {
				System.out.println("Volunteer cheated!");
			}

			
		}

	}

}
