package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1510;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = null;
		PrintWriter out = null;

		try {
			sc = new Scanner(new FileReader("inputSmall.txt"));
			out = new PrintWriter(new FileWriter("C:\\Users\\arto\\workspace\\Cookie Clicker Alpha\\outputSmall.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("error");
		}
		
		int numberOfCases = Integer.parseInt(sc.nextLine());
		int caseNumber = 1;
		
		while(sc.hasNext()){
			double C = sc.nextDouble();
			double F = sc.nextDouble();
			double X = sc.nextDouble();
			System.out.println("C: " + C + "   F: " + F + "    X: " + X );
			
			double earn = 0.0;
			double timeSpend = 0.0;
			double farms = 0.0;
			
			while(earn < X){
				double earnPerSecond = (farms*F+2);
				
				//If I don't buy a new Farm
				double timeSpendWithoutNewFarmToGetX = timeSpend + (X-earn)/earnPerSecond;
				
				//If I buy a new Farm
				double secsNeededForNewFarm = (C-earn)/earnPerSecond;
				double earnPerSecondWithNewFarm = earnPerSecond + F;
				double timeSpendWithNewFarmToGetX = timeSpend + secsNeededForNewFarm + X/earnPerSecondWithNewFarm;
				
				
				System.out.println("timeSpendWithNewFarmToGetX: " +timeSpendWithNewFarmToGetX);
				System.out.println("timeSpendWithoutNewFarmToGetX: " + timeSpendWithoutNewFarmToGetX);
				System.out.println("farms: " + farms);
				System.out.println();
				if(timeSpendWithNewFarmToGetX < timeSpendWithoutNewFarmToGetX){ // Buy a new Farm
					farms++;
					timeSpend = timeSpend + secsNeededForNewFarm;
					earn = 0;
				}else{ // Don't buy a new Farm
					timeSpend = timeSpendWithoutNewFarmToGetX;
					break;
				}
			}
			out.println("Case #" + caseNumber + ": " + timeSpend);
//			System.out.println("timeSpend: " + timeSpend);
			caseNumber++;
//			break;
		}
		out.close();
	}

}
