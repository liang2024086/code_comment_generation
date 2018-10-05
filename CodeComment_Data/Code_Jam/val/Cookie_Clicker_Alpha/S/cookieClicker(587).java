package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1424;


import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class cookieClicker {
	
	public static void main (String [] args) throws Exception{
		Scanner fileName = new Scanner(System.in);
		FileReader fileRead = new FileReader(fileName.nextLine());
		PrintWriter fileWrite = new PrintWriter(fileName.nextLine());
		Scanner sc = new Scanner(fileRead);
		
		double C, F, X;
		
		int testCase = 0;
		int TC = sc.nextInt();
		while (testCase++ < TC){
			C = sc.nextDouble();
			F = sc.nextDouble();
			X = sc.nextDouble();
			
			double rate = 2.0;
			
			double fastestTime, farmTime, accumulatedFarmTime;
			fastestTime = X/rate; // Without buying cookie farms.
			accumulatedFarmTime = 0.0;
			
			while (true) {
				farmTime = C/rate;
				rate += F;
				if (farmTime + X/rate + accumulatedFarmTime < fastestTime){
					fastestTime = farmTime + X/rate + accumulatedFarmTime;
					accumulatedFarmTime += farmTime;
				} else {
					break; // Too slow already.
				}
			};
			
			fileWrite.print("Case #"+ testCase + ": ");
			fileWrite.printf("%.7f", fastestTime);
			fileWrite.println();
		}
		
		fileWrite.close();
		return;
	}
	
}

