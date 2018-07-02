package methodEmbedding.Magic_Trick.S.LYD723;

import java.util.*;

public class magic {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int T = in.nextInt();
		for(int t=0; t<T; ++t) {
			int a = in.nextInt();

			int[] listA = new int[4];
			for(int i=0; i<4; ++i) {
				if(i+1 == a) for(int j=0; j<4; ++j) listA[j] = in.nextInt();
				else for(int j=0; j<4; ++j) in.nextInt();
			}


			int b = in.nextInt();
			int[] listB = new int[4];
			for(int i=0; i<4; ++i) {
				if(i+1 == b) for(int j=0; j<4; ++j) listB[j] = in.nextInt();
				else for(int j=0; j<4; ++j) in.nextInt();
			}
			// System.out.println(Arrays.toString(listA));
			// System.out.println(Arrays.toString(listB));

			int count = 0;
			int save = 0;
			for(int i=0; i<4; ++i) {
				for(int j=0; j<4; ++j) {
					if(listA[i] == listB[j]) {
						++count;
						save = i;
					}
				}
			}
			// System.out.println(count);
			System.out.print("Case #" + (t+1) + ": ");
			if(count == 1) System.out.print(listA[save]);
			else if(count == 0) System.out.print("Volunteer cheated!");
			else System.out.print("Bad magician!");

			if(t < T-1) System.out.println();
		}
	}

}
