package methodEmbedding.Magic_Trick.S.LYD444;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		for (int caze = 1; caze <= cases; caze++) {
			int row = sc.nextInt();
			Set<Integer> possible = new HashSet<Integer>();
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					int tmp = sc.nextInt();
					if (i + 1 == row)
						possible.add(tmp);
				}
			}
			row = sc.nextInt();
			Set<Integer> possible2 = new HashSet<Integer>();
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					int tmp = sc.nextInt();
					if (i + 1 == row)
						possible2.add(tmp);
				}
			}
			possible.retainAll(possible2);
			System.out.print("Case #" + caze + ": ");
			if (possible.size() == 1) {
				System.out.println(possible.iterator().next());
			} else if (possible.size() == 0) {
				System.out.println("Volunteer cheated!");
			} else {
				System.out.println("Bad magician!");
			}
		}
	}

}
