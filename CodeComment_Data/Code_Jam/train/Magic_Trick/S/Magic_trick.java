package methodEmbedding.Magic_Trick.S.LYD185;


import java.util.HashSet;
import java.util.Scanner;

public class Magic_Trick {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();		/* number of testcases */

		for (int testcase = 0; testcase < T; testcase++) {
			int r1 = sc.nextInt();
			HashSet<Integer> hs = new HashSet<Integer>();

			for (int ignore = 0; ignore < 4 * (r1 - 1); ignore++) sc.nextInt();
			for(int j = 0; j < 4; j++) hs.add(sc.nextInt());
			for (int ignore = 0; ignore < 4 * (4 - r1); ignore++) sc.nextInt();

			int r2 = sc.nextInt();
			int match = 0, count = 0;

			for (int ignore = 0; ignore < 4 * (r2 - 1); ignore++) sc.nextInt();
			for(int j = 0; j < 4; j++) {
				int num = sc.nextInt();

				if(hs.contains(num)) {
					++count;
					match = num;
				}
			}
			for (int ignore = 0; ignore < 4 * (4 - r2); ignore++) sc.nextInt();

			System.out.print("Case #" + (1 + testcase) + ": ");
			if(count == 0)			System.out.println("Volunteer cheated!");
			else if(count == 1)		System.out.println(match);
			else if(count > 1)		System.out.println("Bad magician!");
		}

	}

}



