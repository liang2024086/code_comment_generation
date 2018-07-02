package methodEmbedding.Magic_Trick.S.LYD978;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Tester {

	public static void main(String[] args) {

		Scanner scanner = null;
		
		try {
			scanner = new Scanner(new FileReader(args[0]));
		} catch (FileNotFoundException e) {
			System.err.println("file not found:" + args[0]);
		}
		
		int T = scanner.nextInt();
		
		for (int i=0; i<T; ++i) {
			int r0 = scanner.nextInt() - 1;
			Set<Integer> candidates = new HashSet<Integer>();
			for (int r=0; r<4; ++r) {
				for (int c=0; c<4; ++c) {
					int n = scanner.nextInt();
					if (r == r0) {
						candidates.add(n);
					}
				}
			}
			int r1 = scanner.nextInt() - 1;
			int found = 0;
			int firstHit = 0;
			for (int r=0; r<4; ++r) {
				for (int c=0; c<4; ++c) {
					int n = scanner.nextInt();
					if (r == r1) {
						if (candidates.contains(n)) {
							firstHit = n;
							++found;
						}
					}
				}
			}
			switch (found) {
			case 0:
				System.out.println("Case #" + (i+1) + ": " + "Volunteer cheated!");
				break;
			case 1:
				System.out.println("Case #" + (i+1) + ": " + firstHit);
				break;
			default:
				System.out.println("Case #" + (i+1) + ": " + "Bad magician!");
				break;
			}
		}
	}

}
