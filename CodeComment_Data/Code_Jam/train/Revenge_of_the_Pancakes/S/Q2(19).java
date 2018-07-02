package methodEmbedding.Revenge_of_the_Pancakes.S.LYD769;


import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str;
		int t = in.nextInt();
		int ans, ind;
		for( int k = 1; k <= t; k++ ){
			ans = 0;
			str = in.next();
			ind = str.lastIndexOf('-');
			while ( ind != -1 ){
				char[] a = str.toCharArray();
				char[] b = str.toCharArray();
				for( int i = 0; i <= ind; i++ ){
					if ( a[i] == '-' ){
						a[i] = '+';
					} else {
						a[i] = '-';
					}
				}
				for( int i = 0; i <= ind; i++ ){
					b[i] = a[ind-i];
				}

				if ( b.equals(str) ){
					str = new String(a);
				} else {
					str = new String(b);
				}
				str = new String(a);
				ans++;
				ind = str.lastIndexOf('-');
			}
			System.out.printf("Case #%d: %d\n", k, ans);
		}
		in.close();
	}

}
