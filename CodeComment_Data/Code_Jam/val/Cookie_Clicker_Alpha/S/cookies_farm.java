package methodEmbedding.Cookie_Clicker_Alpha.S.LYD664;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class cookies_farm {
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(new File("input.txt"));
		int t = s.nextInt();
		int this_case = 0 ;
		while (t-- > 0) {
			this_case++;
			final double c = s.nextDouble(), f = s.nextDouble(), x = s.nextDouble();
			int farms = -1;
			double seconds = Double.MAX_VALUE;
			double secondsTmp = 0;
			while (true) {
				secondsTmp = 0;
				farms++;
				int tmp_farm = farms;
				double tmp_f = 2;
//				double tmp_secs = 0;

				
				while (tmp_farm-- > 0) {
					secondsTmp += c / tmp_f;
					tmp_f += f;
				}
				secondsTmp += x / tmp_f;
				if(secondsTmp > seconds){
					
					break;
				}else
					seconds = secondsTmp;
				
			}
			System.out.print("Case #" + this_case + ": ");
			System.out.println(Math.round(seconds*10000000.0)/10000000.0);
			

		}
	}
}
