package methodEmbedding.Magic_Trick.S.LYD2191;

import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;


public class A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(new BufferedInputStream(System.in));
		
		int T =	sc.nextInt();
		for (int t = 1; t <= T; ++t) {
			int r1 = sc.nextInt();
			HashSet<Integer> possible = new HashSet<Integer>();
			ArrayList<Integer> gar = new ArrayList<Integer>();
			for (int cr = 1; cr <= 4; ++cr) {
				for (int card = 0; card < 4; ++card) {
					gar.add(sc.nextInt());
				}
				if (cr == r1) possible.addAll(gar);
				gar.clear();
			}
			
			int r2 = sc.nextInt();
			for (int cr = 1; cr <= 4; ++cr) {
				for (int card = 0; card < 4; ++card) {
					gar.add(sc.nextInt());
				}
				if (cr == r2) {
					// check if we can identify the card or what
					possible.retainAll(gar);
					
					System.out.print("Case #" + t + ": ");
					switch (possible.size()) {
					case 0: System.out.println("Volunteer cheated!"); break;
					case 1: System.out.println(possible.iterator().next()); break;
					default:  System.out.println("Bad magician!"); break;
					}
				}
				gar.clear();
			}
			
		}

	}

}
