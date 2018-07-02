package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1271;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;


public class Cookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		try {
			scan = new Scanner(new File("test.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int testCases = scan.nextInt();
		double cost = 0;
		double increase = 0;
		double win = 0;
		double currentTime=0;
		double nextFarm=0;
		double currentRate=2;
		boolean done = false;
		for(int i = 1; i <= testCases; i++)
		{
			cost = scan.nextDouble();
			currentRate=2;
			increase= scan.nextDouble();
			win=scan.nextDouble();
			currentTime = win/currentRate;
			done = false;
			System.out.print("Case #" + i+": ");
			while (!done)
			{
				nextFarm=currentTime-(win/currentRate) + (cost/currentRate) + (win/(currentRate+increase));

				
				if(nextFarm > currentTime)
				{
					System.out.println(currentTime);
					done = true;
				}
				else
				{
					currentTime = nextFarm;
					currentRate +=increase;
				}
			
			}
			
			
		}
		
	}

}
