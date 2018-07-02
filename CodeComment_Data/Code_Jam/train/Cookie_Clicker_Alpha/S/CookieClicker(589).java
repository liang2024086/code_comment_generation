package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1094;

import java.io.File;
import java.util.Scanner;


public class CookieClicker {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		File inputFile = new File("B-small-attempt0.in");
		int intTestCases = 0;
		
		double cookieToBuyFarm = 0d;
		double farmRate = 0d;
		double defaultRate = 2.0d;
		double cookiesToObtain = 0d;		
		
		try {
			Scanner sc=new Scanner(inputFile);
			java.io.PrintStream ps = new java.io.PrintStream( "B-small-attempt0.out" );
			
			intTestCases = sc.nextInt();
			
			for(int i=0;i<intTestCases;i++)
			{
				cookieToBuyFarm = sc.nextDouble();
				farmRate = sc.nextDouble();
				cookiesToObtain = sc.nextDouble();				
				
				double timeNotBought = 0d;
				double timeBought = 0d;
				double timeSpent = 0d;
				defaultRate = 2.0d;
				
				if(cookiesToObtain>cookieToBuyFarm)
				{
					do
					{
						timeNotBought = timeSpent + cookiesToObtain/defaultRate;
						
						timeSpent = timeSpent + cookieToBuyFarm / defaultRate;
						
						defaultRate = defaultRate + farmRate;
						
						timeBought = timeSpent + cookiesToObtain / defaultRate;
						
						
					}while(timeNotBought>timeBought);
					
					ps.print("Case #" + (i+1) + ": ");
					ps.printf("%.7f", timeNotBought);
					ps.println();
				}
				else
				{
					ps.print("Case #" + (i+1) + ": ");
					ps.printf("%.7f", cookiesToObtain/defaultRate);
					ps.println();								
				}
			}
			
			ps.close();
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		
	}

}
