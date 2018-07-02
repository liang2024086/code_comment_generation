package methodEmbedding.Cookie_Clicker_Alpha.S.LYD717;

import java.util.*;
import java.io.*;

class CookieClicker{
	public static void main(String args[]){

		try{
			Scanner s = new Scanner(new File(args[0]));
			FileWriter writer = new FileWriter(args[1]);
		
			double costOfFarm, farmProduction, goal;
			double production, spentTime, balance;

			int numTests = s.nextInt();

			// solve each test case
			for (int i = 0; i < numTests; i++){
				balance = 0;
				production = 2.0;
				spentTime = 0;
				
				costOfFarm = s.nextDouble();
				farmProduction = s.nextDouble();
				goal = s.nextDouble();

				while (balance < goal){
					// time if there is no new farm
					double timeNoFarm = ((goal - balance) / production);
					double timeWithFarm = (costOfFarm / production) + ((goal - balance) / (production + farmProduction));

					if (timeNoFarm < timeWithFarm){
						spentTime += timeNoFarm;
						balance = goal;
					}
					else {
						spentTime += costOfFarm / production;
						production += farmProduction;
					}
				}

				writer.write("Case #"+(i+1)+": " + spentTime + "\n");
			}
			writer.close();
		}
		catch(Exception e){
			// file not according to the format
			System.out.println("Not good format");
		}
	}
}
