package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1076;


import java.util.Scanner;

public class B {
	
/*

5
-
-+
+-
+++
--+-

 */
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int nt = reader.nextInt();
		for(int tc = 1; tc <= nt; tc++) {
			String S = reader.next();
			char[] c = S.toCharArray();
			int cnt = 0;
			while(true) {
				int j;
				for(j = 1; j < c.length; j++) {
					if(c[j] != c[j - 1]) {
						break;
					}
				}
				if(j == c.length) break;
				for(int i = 0; i < j; i++) {
					c[i] = c[i] == '-' ? '+' : '-'; 
				}
				cnt++;
			}
			if(c[0] == '-') {
				cnt++;
			}
			System.out.printf("Case #%d: %d\n", tc, cnt);
		}
		reader.close();
	}

}
