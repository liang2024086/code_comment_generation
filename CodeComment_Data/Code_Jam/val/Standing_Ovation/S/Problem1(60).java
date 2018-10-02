package methodEmbedding.Standing_Ovation.S.LYD182;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;


public class Problem1 {

	public static void main(String[] args) throws IOException {
		//System.setIn(new FileInputStream("src/sample1.txt"));
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for (int tc = 0; tc< T; tc++) {
			int smax = sc.nextInt();
			int s[] = new int[smax+1];
			String sline = sc.next();
			for (int i =0 ; i<smax+1; i++) {
				s[i]=sline.charAt(i)-'0';
			}
			
			// Solve
			// ????????? 0??? ????????? ?????????.
			int last = 0;
			for (int i=s.length-1; i>=0; i--) {
				if (s[i]!=0) {
					last = i;
					break;
				}
			}
			
			// ????????? ?????? ????????? ?????? ?????????.
			int sum = 0;
			int added = 0;
			for (int i=0; i<=last; i++) {
				sum += s[i];
				if (i - sum + 1 > 0 ) {
					added += i - sum + 1;
					sum += i - sum + 1;
				}
			}
			
			// Output
			System.out.println("Case #"+(tc+1)+": "+added);
		}
		
		sc.close();
	}

}
