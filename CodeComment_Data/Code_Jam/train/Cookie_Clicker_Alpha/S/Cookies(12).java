package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1232;

import java.util.Scanner;


public class Cookies {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int testCases = in.nextInt();
		for(int i=0;i<testCases;i++) {
			double time=0;
			double cookieRate=2;
			double farmCost=in.nextDouble();
			double farmRate=in.nextDouble();
			double winCookies=in.nextDouble();
			while(((winCookies-farmCost)/cookieRate)>(winCookies/(cookieRate+farmRate))) {
				time+=farmCost/cookieRate;
				cookieRate+=farmRate;
			}
			time+=winCookies/cookieRate;
			System.out.println("Case #"+(i+1)+": "+time);
		}
	}

}
