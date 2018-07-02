package methodEmbedding.Standing_Ovation.S.LYD1228;

import java.util.Scanner;


public class Asmall {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for (int i=0; i<T; i++) {
			int N = scan.nextInt();
			int nfriends = 0;
			int nstanding = 0;
			String people = scan.next();
			for (int p=0; p<=N; p++) {
				int s = people.charAt(p) - '0';
				if (p > nstanding) {
					nfriends += p-nstanding;
					nstanding = p;
				}
				nstanding += s;
			}
			System.out.format("Case #%d: %d\n", i+1, nfriends);
		}

	}

}
