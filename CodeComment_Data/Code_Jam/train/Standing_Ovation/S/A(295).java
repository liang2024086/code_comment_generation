package methodEmbedding.Standing_Ovation.S.LYD693;

import java.util.Scanner;

/**
 * 
 */

/**
 * @author nikhil
 *
 */
public class A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();
		for (int i = 0; i < count; i++) {
			int fCount = 0;
			int sM = in.nextInt();
			String str = in.next();
			char[] charArray = str.toCharArray();
			int pplCount = 0;
			for (int j = 0; j < (sM+1); j++) {
				int s = Integer.valueOf("" + charArray[j]);
				if (j > 0) {
					if (j > pplCount && s > 0) {
						fCount += (j - pplCount);
						pplCount += fCount;
					}
				}
				pplCount += s;
			}
			System.out.println("Case #" + (i+1) + ": " + fCount);
		}
	}
}
