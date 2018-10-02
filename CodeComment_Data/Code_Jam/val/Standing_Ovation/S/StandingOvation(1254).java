package methodEmbedding.Standing_Ovation.S.LYD877;

import java.util.Scanner;


public class StandingOvation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i=0;i<t;i++) {
			int n = in.nextInt();
			String numbers = in.next();
			int[] num = new int[n+1];
			for(int j=0;j<n+1;j++) {
				num[j] = Integer.parseInt(numbers.charAt(j)+"");
			}
			int ans =0,ppl =0;
			for(int j=0;j<n+1;j++) {
				if(num[j] == 0)
					continue;
				if(j <= ppl)
					ppl += num[j];
				else {
					ans += (j - ppl);
					ppl = j + num[j];
				}
			}
			System.out.println("Case #"+(i+1)+": "+ans);
		}
	}

}
