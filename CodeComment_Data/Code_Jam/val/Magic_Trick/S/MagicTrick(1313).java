package methodEmbedding.Magic_Trick.S.LYD614;

import java.util.*;
import java.io.*;

public class MagicTrick {
	public static void main(String args[]) throws FileNotFoundException {
		Scanner input = new Scanner(new File("A-small-attempt0.in"));
		int T = input.nextInt();
		for(int loopvar = 1; loopvar <= T; loopvar++) {
			Set<Integer> set1 = new HashSet<Integer>(), set2 = new HashSet<Integer>();
			for(int i = 0; i < 2; i++) {
				int row = input.nextInt();
				input.nextLine();
				for(int r = 1; r <= 4; r++) {
					if(r == row) {
						for(int c = 0; c < 4; c++) {
							if(i == 0)
								set1.add(input.nextInt());
							else
								set2.add(input.nextInt());
						}
					}
					input.nextLine();
				}
			}
			set1.retainAll(set2);
			System.out.printf("Case #%d: ", loopvar);
			if(set1.size() == 1)
				System.out.println(set1.iterator().next());
			else if(set1.size() > 1)
				System.out.println("Bad magician!");
			else
				System.out.println("Volunteer cheated!");
		}
	}
}
