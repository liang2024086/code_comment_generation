package methodEmbedding.Cookie_Clicker_Alpha.S.LYD604;

import java.util.Scanner;


public class P2 {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		double C,F,X;
		for (int t=1; t<=T; t++){
			C = scan.nextDouble();// amount needed to buy a farm
			F = scan.nextDouble();// factor added per farm
			X = scan.nextDouble();// amount of cookies to reach
			double cur = 0; // how many cookies at this point
			double time = 0;// total time
			double factor = 2;// current (total) factor
			while (cur<X){
				// to reach X at the current factor rate
				double time1 = X/factor;
				// to buy a farm and then reach X
				double time2 = (C/factor) + X/(factor+F);
				if (time1<time2){
					time += time1;
					System.out.println("Case #"+ t+ ": " +time);
					cur=X;// end this test case
				} else {
					time += C/factor;
					factor = factor+F;
					cur = 0;
				}
			}
		}
		scan.close();
	}
}
