package methodEmbedding.Cookie_Clicker_Alpha.S.LYD477;


import java.util.Scanner;
public class Main {
	public static void main( String[] args ) {
		Scanner input = new Scanner( System.in );
		int test = input.nextInt();
		for ( int i = 1; i <= test; ++i ) {
			double c, f, x, t1, t2, preTime = 0;
			double rate = 2.0;
			c = input.nextDouble();
			f = input.nextDouble();
			x = input.nextDouble();
			while ( true ) {
				t1 = preTime + (c / rate) + x / (rate + f);
				t2 = preTime + x / rate;
				if( t1 < t2 ) {
					preTime += c / rate;
					rate += f;
				}
				else {
					System.out.printf( "Case #%d: %.7f\r\n", i, t2 );
					break;
				}
			}
		}
	}
}
