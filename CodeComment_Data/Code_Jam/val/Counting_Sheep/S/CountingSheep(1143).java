package methodEmbedding.Counting_Sheep.S.LYD540;

import java.io.*;
import java.util.*;

public class CountingSheep {
	private static final Scanner SCANNER = new Scanner(System.in);

	public static void main(String args[]) {

		int T = SCANNER.nextInt();
		for (int t = 1; t <= T; t++) {

			int N = SCANNER.nextInt();
			
			int j = 1;
			int n = N;
			
			if (N <= 0)
				System.out.println("Case #" + t + ": INSOMNIA");
			else {
				ArrayList<Integer> integerList = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
				
				while (integerList.size() > 0) {
					n = N * j;
					
					if (n < 10) {
						if (integerList.indexOf(n) != -1) {
							integerList.remove(integerList.indexOf(n));

							if (integerList.size() == 0) {
								System.out.println("Case #" + t + ": " + n);
								break;
							}
						}
					} else {
						int n1=n;
						while (n1 > 0) {
							int d = n1 / 10;
							int k = n1 - d * 10;
							n1 = d;
							if (integerList.indexOf(k) != -1) {
								integerList.remove(integerList.indexOf(k));
								
								if (integerList.size() == 0) {
									System.out.println("Case #" + t + ": " + n);
									break;
								}
							}

							

						}
					}
					j++;
				}
			}
		}
		
	}
}
