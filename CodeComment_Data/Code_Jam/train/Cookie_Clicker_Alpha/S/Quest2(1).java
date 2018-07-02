package methodEmbedding.Cookie_Clicker_Alpha.S.LYD77;

import java.util.ArrayList;
import java.util.Scanner;


public class Quest2 {
	double C = 0;
	double F = 0;
	double X = 0;
	int T;
	ArrayList<String> cases = new ArrayList<String>();

	Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double C = 0;
		double F = 0;
		double X = 0;
		
		int T;
		ArrayList<String> cases = new ArrayList<String>();
		
		
		
		Scanner scan = new Scanner(System.in);
		
		T = scan.nextInt();
		
		for (int a = 0; a < T; a++){
			int numOfFact = 0;
			double time1 = 0;
			double time2 = 0;
			C = scan.nextDouble();
			F = scan.nextDouble();
			X = scan.nextDouble();
			double minTime = 0;
			boolean yep = true;
			while(yep){
				
				time1 = X / ((numOfFact * F) + 2);
				time2 = X / ((numOfFact + 1) * F + 2) + (C / ((numOfFact) * F + 2));
				if(time1 < time2){
					yep = false;
					for (double b = 0; b < numOfFact; b++){
						minTime = minTime + (C / (b * F  + 2 ));
					}
					minTime = minTime + (X / (numOfFact * F + 2));
				}
				else
					numOfFact++;
			}
			
			cases.add(String.format("%.7f", minTime));

		}
		for (int a = 0; a< cases.size(); a++){
			System.out.println("Case #" + (a+1) + ": " + cases.get(a));
		}
	}

	/*public static double tree(double C, double F, double X, double producing, double previousRate){
		if (previousRate != 0)
			sumTime = (X / producing) + (C / previousRate);
		else
			sumTime = (X / producing);
		sumTime1 = (C / producing) + (X / (producing + F));

		if( sumTime1 < sumTime){
			tree(C, F, X, producing + F, producing);
		}
		
		return sumTime;
	}*/
}
