package methodEmbedding.Standing_Ovation.S.LYD1984;

import java.util.Scanner;


public class A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		
		for (int i = 1; i <= T; i++) {
			int numClasses = in.nextInt();
			String classes = in.next();
			
			int n=0;
			int extra = 0;
			for (int j = 0; j <= numClasses; j++) {
				int s = Integer.parseInt(classes.substring(j,j+1));
				if (n < j && s != 0) {
					extra += j-n;
					n = j;
				}
				n += s;
			}
			
			System.out.println("Case #" + i + ": " + extra);
			
		}
		
		in.close();
 	}
}
