package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1226;

import java.util.Scanner;
/**
 * @(#)CookieClicker.java
 *
 * CookieClicker application
 *
 * @author Firat Ozbay
 * @version 1.00 2014/4/12
 */
 
public class CookieClicker {
    
	public static void main(String[] args)
	{
		double result = 0;
		
		double C ;
		double F ;
		double X ;
		
		double time1 = 0;
		double time2 = 0;
		double allTime = 0;
		
		double fCount = 0;
		
		boolean isBuilding = true;
		
		Scanner scan = new Scanner(System.in);
		
		int tests = scan.nextInt();
		
		for( int i = 1; i < tests+1; i++) 
		{
			isBuilding = true;
			
			allTime = 0;
			
			fCount = 2;
			
			C = scan.nextDouble();
			F = scan.nextDouble();
			X = scan.nextDouble();	
			
			while(isBuilding)
			{
				time1 = X / fCount;
				time2 = (C/fCount) + (X / (fCount+F));
				
				if( time1 <= time2)
				{
					allTime   += time1;
					isBuilding = false;
				}
				else
				{
					allTime += (C/fCount);
					fCount  += F;
				}
			
			}
			System.out.println("Case #"+i+": " + allTime);

		}
	}
}
