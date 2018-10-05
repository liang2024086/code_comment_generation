package methodEmbedding.Magic_Trick.S.LYD2106;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class MagicTrick {

	public static void main(String[] args) {
		Scanner sc = null;
		PrintWriter fout = null;

		try {
			sc = new Scanner(new File(args[0]));
			fout = new PrintWriter(new BufferedWriter(new FileWriter("result.txt")));
		} catch(Exception e) {
			System.out.println(e);
		}

		final int T = sc.nextInt();
		for( int t = 0; t < T; t++ ) {
			boolean check[] = new boolean[17];
			final int ans1 = sc.nextInt();
			for( int i = 1; i <= 4; i++ ) {
				for( int j = 1; j <= 4; j++ ) {
					int tmp = sc.nextInt();
					if( i == ans1 ) {
						check[tmp] = true;
					}
				}
			}
			final int ans2 = sc.nextInt();
			int sum = 0;
			int num = 0;
			for( int i = 1; i <= 4; i++ ) {
				for( int j = 1; j <= 4; j++ ) {
					int tmp = sc.nextInt();
					if( i == ans2 ) {
						if( check[tmp] == true ) {
							sum++;
							num = tmp;
						}
					}
				}
			}

			String res;
			if( sum == 0 ) {
				res = "Volunteer cheated!";
			}
			else if ( sum == 1 ) {
				res = Integer.toString( num );
			}
			else {
				res = "Bad magician!";
			}
			//			System.out.println( "Case #" + (t+1) + ": " + res );
			fout.println( "Case #" + (t+1) + ": " + res );
		}
		fout.close();
		sc.close();
	}
}
