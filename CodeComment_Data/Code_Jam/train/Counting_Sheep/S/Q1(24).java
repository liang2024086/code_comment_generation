package methodEmbedding.Counting_Sheep.S.LYD1390;


import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String n2;
		int t = in.nextInt();
		int n, cnt, aux;
		for( int k = 1; k <= t; k++ ){
			n = in.nextInt();
			boolean[] mark = new boolean[10];
			for( int i = 0; i < 10; i++ ){
				if ( mark[i] ){
					System.out.println("MARK");
				}
			}
			aux = n;
			cnt = 0;
			while ( cnt < 10 && n != 0){
				n2 = Integer.toString(n);
				for( int i = 0; i < 10; i++ ){
					if ( !mark[i] ){
						if ( n2.indexOf((char)i+48) != -1 ){
							mark[i] = true;
							cnt++;
						}
					}
				}
				n += aux;
			}
			if ( n != 0 ){
				System.out.printf("Case #%d: %d\n", k, n-aux);
			} else {
				System.out.printf("Case #%d: INSOMNIA\n", k);				
			}
		}
		in.close();
	}
}
