package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1190;

import java.util.Scanner;


public class Problem {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int ii = 0; ii < n; ++ii){
			Double c = in.nextDouble();
			Double f = in.nextDouble();
			Double x = in.nextDouble();

			Double t = x/c-2/f-1;
			Integer tt = t.intValue();
			Double ans2 = 0d;
			for(int i = 0; i < tt+1; ++i){
				ans2 += c / (2d+i*f);
			}
			ans2 += x/(2d+(tt+1)*f);
			Double ans1 = x/2d;
			if(ans2<0) ans2=ans1;
			System.out.format("Case #%d: ", ii+1);
			System.out.println(Math.min(ans1, ans2));
		}
	}

}
