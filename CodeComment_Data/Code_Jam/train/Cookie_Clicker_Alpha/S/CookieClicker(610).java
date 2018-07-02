package methodEmbedding.Cookie_Clicker_Alpha.S.LYD130;


import java.io.FileReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CookieClicker {
	public static void main(String args[]) throws Exception {
		String inFile = "asdf.in";
		Scanner in = new Scanner(new FileReader(inFile));
		
		int numCases = Integer.valueOf(in.nextLine());
		
//		in.nextLine();
//		int numCases =2;
		
		for (int i=1;i<=numCases;i++) {

			List<String> dataList = new ArrayList<String>(Arrays.asList(in.nextLine().split(" ")));

			double farmCost = Double.valueOf(dataList.get(0));
			double rate = 2.0000000;
			double bonusRate = Double.valueOf(dataList.get(1)); //added rate


			double target = Double.valueOf(dataList.get(2));

//			System.out.println("Farm Cost: " + farmCost);
//			System.out.println("Cookies earning rate: " + rate);
//			System.out.println("Target : " + target);
//			System.out.println("Bonus rate per farm : " + bonusRate);

			double timeTaken1 = 0.0000000;
			double timeTaken2 = 0.0000000;
			double timeTakenForNextFarm = 0.0000000;

			int numFarms = 0;
			double rateFarm = 2.0000000;

			while (timeTaken1 >= timeTaken2) {

				if (timeTaken2 == 0.0000000) {
					timeTaken1 = target/rate;
				} else {
					timeTaken1 = timeTaken2;
				}

//				System.out.println("T1: " + timeTaken1);

				timeTakenForNextFarm = farmCost/rate + timeTakenForNextFarm;
				
//				System.out.println("TFarm: " + timeTakenForNextFarm);
				
				rate = rate + bonusRate;

				timeTaken2 = target/rate + timeTakenForNextFarm;
				
//				System.out.println("T2: " + timeTaken2);

				numFarms ++;
			}

			System.out.println("Case #" + i + ": " + timeTaken1);

		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
