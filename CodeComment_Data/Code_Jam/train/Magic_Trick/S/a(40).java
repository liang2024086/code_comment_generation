package methodEmbedding.Magic_Trick.S.LYD297;

import java.util.*;

public class a {

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		int numCases = stdin.nextInt();

		for (int loop=1; loop<=numCases; loop++) {

			int r1 = stdin.nextInt() - 1;
			int[] b1 = new int[4];

			for (int i=0; i<16; i++)
				b1[i/4] += (1 << (stdin.nextInt()-1));

			int r2 = stdin.nextInt() - 1;
			int[] b2 = new int[4];
			for (int i=0; i<16; i++)
				b2[i/4] += (1 << (stdin.nextInt()-1));

			int intersect = b1[r1] & b2[r2];
			if (intersect == 0)
				System.out.println("Case #"+loop+": Volunteer cheated!");
			else if (Integer.bitCount(intersect) == 1)
				System.out.println("Case #"+loop+": "+ (1+(int)(Math.log(intersect+.1)/Math.log(2))));
			else
				System.out.println("Case #"+loop+": Bad magician!");
		}
	}
}
