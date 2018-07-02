package methodEmbedding.Standing_Ovation.S.LYD1519;

import java.util.Scanner;

public class StandingOvation {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		for(int c=0; c<n; c++){
			int a[] = new int[in.nextInt() + 1];
			String s = in.next();
			for(int i=0; i<s.length(); i++){
				a[i] = (int)(s.charAt(i) - '0');
			}
			int count = 0;
			int at=0;
			for(int i=0; i<a.length; i++){
				while(a[at] == 0){
					at++;
				}
				if(at <= i){
					a[at]--;
				}
				else{
					count++;
				}
			}
			System.out.printf("Case #%d: %d\n", c+1, count);
		}
	}
}
