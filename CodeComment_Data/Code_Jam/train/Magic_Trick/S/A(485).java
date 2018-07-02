package methodEmbedding.Magic_Trick.S.LYD2035;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int no = 1; no <= T; no++) {
			System.out.printf("Case #%d: ", no);

			Set<Integer> s1 = new HashSet<>();
			Set<Integer> s2 = new HashSet<>();
			int a1 = in.nextInt();
			for (int r = 1; r <= 4; r++) {
				for (int c = 0; c < 4; c++) {
					int num = in.nextInt();
					if (r == a1)
						s1.add(num);
				}
			}
			int a2 = in.nextInt();
			for (int r = 1; r <= 4; r++) {
				for (int c = 0; c < 4; c++) {
					int num = in.nextInt();
					if (r == a2)
						s2.add(num);
				}
			}
			s1.retainAll(s2);
			if (s1.size() == 0) {
				System.out.println("Volunteer cheated!");
			} else if (s1.size() == 1) {
				System.out.println(s1.iterator().next());
			} else {
				System.out.println("Bad magician!");
			}
		}
	}

}
