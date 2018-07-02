package methodEmbedding.Standing_Ovation.S.LYD918;


import java.util.Scanner;

public class A {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		Scanner str = new Scanner(System.in);

		int t = in.nextInt();

		for( int i = 0; i < t; ++i ){

			String input = str.nextLine();
			int s = input.charAt(0) - '0';

			int[] shy = new int[s+1];

			for( int j = 0; j <= s; ++j ){
				shy[j] = input.charAt(j+2) - '0';
			}

			int l = 0;
			int a = 0;

			for( int j = 0; j <= s; ++j ){
				if ( ( l + a ) < j && shy[j] != 0 ){
					a += j - ( a + l );

				}
				l += shy[j];
			}

			System.out.println("Case #" + (i+1) + ": " + a );

		}

		in.close();
		str.close();

	}

}
