package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1030;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Cookie {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		DecimalFormat f = new DecimalFormat("##.00");
		
		int Test = scanner.nextInt();
		for (int nTest = 0; nTest < Test; nTest++) {
		
			double C = scanner.nextFloat();
			double F = scanner.nextFloat();
			double X = scanner.nextFloat();
			
			
			
			double ans  = 0;
			double PC = 2;
			
			double until = X;
			
			do {
				
				double timex= (Math.round( (C / (PC)) *10000000.0)/10000000.0) + (Math.round( (X / ( PC +F )) *10000000.0)/10000000.0) ;
				double timey=(Math.round( (X / (PC)) *10000000.0)/10000000.0);
			
				
				if(timex >= timey ) break;
				
				
				ans += (Math.round( (C / (PC)) *10000000.0)/10000000.0);
				
				PC += F;
				until = until -(C);
			}while(until >  0 );
			
			
			//System.out.println(until+":x: " +ans+ "--->"+ (Math.round( (X / (PC + F)) *10000000.0)/10000000.0));
			
			ans +=  (Math.round( (X / (PC)) *10000000.0)/10000000.0);
			
			System.out.printf("Case #%d: %.7f\n" , (nTest + 1),ans);

		}
	}

}
