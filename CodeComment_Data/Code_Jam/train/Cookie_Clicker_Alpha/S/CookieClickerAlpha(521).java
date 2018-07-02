package methodEmbedding.Cookie_Clicker_Alpha.S.LYD110;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class CookieClickerAlpha {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(args.length>0)
			try {
				System.setIn(new FileInputStream(args[0]));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		Scanner in = new Scanner(System.in);

		int T = in.nextInt();
		
		for(int iCase=1;iCase<=T;iCase++){
			double C=in.nextDouble();
			double F=in.nextDouble();
			double X=in.nextDouble();
			double rate=2.0;
			double ans=0;
			
			while(X/rate > ( C/rate + X/(rate+F) ) ){
				ans+=C/rate;
				rate+=F;
			}
			ans+=X/rate;
			
			System.out.println("Case #"+iCase+": "+ans);
			
			
			
		}
	}

}
