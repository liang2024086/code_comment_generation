package methodEmbedding.Counting_Sheep.S.LYD833;

import java.util.Scanner;

public class sleep {
	static final int[] div = {1, 10, 100, 1000, 10000};
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();
		for (int cn = 0; cn < cases; cn++) {
			int n = in.nextInt();
			System.out.printf("Case #%d: ",cn+1);
			
			if (n == 0) {
				System.out.println("INSOMNIA");
				continue;
			}

			int seen = 0;
			boolean[] array = new boolean[10];
			long use = n;
			do 
			{
				long check = use;
				while (check > 0) {
					int last = (int) (check % 10);
					if (!array[last]) {
						array[last] = true;
						seen++;
					}
					check/=10;
				}
				
				use += n;
//				if(use < 0) System.out.println("we lost boys");
			} while (seen != 10);
			
			System.out.println(use - n);
		}
	}
}
