package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1221;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		String fileName = "test.txt";
		File file = new File(fileName);

			BufferedReader br;
			try {
				br = new BufferedReader(new FileReader(file));
				
				Scanner firstLineScanner = new Scanner(br.readLine());
				int testCases = firstLineScanner.nextInt();
				
				
				for(int testCase = 0; testCase < testCases; testCase++)
				{
					System.out.print("Case #" + (testCase +1 ) + ": " );
					Scanner numberScanner = new Scanner(br.readLine()); 
					double C = numberScanner.nextDouble();
					double F = numberScanner.nextDouble();
					double X = numberScanner.nextDouble();
					
					double t = 0;
					double currentCookies = 0;
					double currentRate = 2;
					
					double timeToEndNoBuy;
					double timeToEndIfBuy;
					
					do
					{
						timeToEndNoBuy = (X - currentCookies) / currentRate;
						
						//this will fail if currentCookies > cost of farm
						double timeToGetFarm = (C - currentCookies) / currentRate;
						timeToEndIfBuy = timeToGetFarm + ((X) / (currentRate + F));
						
						/*System.out.println("t: " + t + " no buy: " + timeToEndNoBuy +// " timeToGetFarm: "+
						 " timeToEndIfBuy " + timeToEndIfBuy);
						*/
						
						if(timeToEndNoBuy > timeToEndIfBuy)
						{
							t += C/currentRate;
							currentCookies = 0; 
							currentRate += F;
							
						}
						else
						{
							t += X/currentRate;
						}
						
						
					}while(timeToEndNoBuy > timeToEndIfBuy);
					//System.out.println(C + " " + F + " " + X );
				
					System.out.println(t);
				}
			
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}

}
