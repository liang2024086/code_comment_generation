package methodEmbedding.Magic_Trick.S.LYD1718;

import java.util.*;
import java.io.*;

public class MagicTrick {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int anz = sc.nextInt();
		for (int i = 1; i <= anz; i++) {
			int z = sc.nextInt();
			ArrayList<Integer> first = new ArrayList<>();
			ArrayList<Integer> sec = new ArrayList<>();
			for (int k = 0; k < 4; k++) {
				for (int m = 0; m < 4; m++) {
					int wert = sc.nextInt();
					if (k==z-1) {
						first.add(wert);
					}
				}
			}
			int s = sc.nextInt();
			for (int k = 0; k < 4; k++) {
				for (int m = 0; m < 4; m++) {
					int wert = sc.nextInt();
					if (k==s-1) {
						if (first.contains(wert)) {
							sec.add(wert);
						}
					}
				}
			}
			if (sec.isEmpty()) {
				System.out.println("Case #"+i+": Volunteer cheated!");
			} else if (sec.size()==1) {
				System.out.println("Case #"+i+": "+sec.get(0));
			} else {
				System.out.println("Case #"+i+": Bad magician!");
			}
		}
	}

}
