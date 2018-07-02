package methodEmbedding.Cookie_Clicker_Alpha.S.LYD578;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Solver {
	public static void main(String[] args) throws IOException{
		if(args.length > 0){
			File file = new File(args[0]);
			Scanner scanner = new Scanner(file);
			String topLine = scanner.nextLine();
			FileWriter fstream = new FileWriter(args[0] + ".out");
			BufferedWriter out = new BufferedWriter(fstream);

			int numberOfTestCases = Integer.parseInt(topLine);
			
			for(int i = 0; i < numberOfTestCases; i++){
				String values[] = scanner.nextLine().split(" ");
				double cookiesPerSecond = 2;
				double currentCookies = 0;
				double elapsedTime = 0;
				
				//Amount to buy farm
				double C = Double.parseDouble(values[0]);
				
				//Extra per farm
				double F = Double.parseDouble(values[1]);
				
				//Win rate
				double X = Double.parseDouble(values[2]);

				
				String output = "";
				
				boolean solved = false;
				
				if(X < C){
					output = X / cookiesPerSecond + ""; 
					solved = true;
				}

				while(!solved){
//					//Can we buy a farm?
//					if(currentCookies == X){
//						
//					}
//					if(currentCookies >= C){
//						System.out.println("Can buy farm");
//						/*
//						 * Do we need a farm?
//						 * Will we spend C on a farm when we can win it 
//						 * in less time that it takes to regen that C? 
//						 */
//						double timeToRegen = C / (cookiesPerSecond + F);
//						if(timeToRegen < ((X - currentCookies) / cookiesPerSecond)){
//							System.out.println("Should  buy farm");
//							cookiesPerSecond += F;
//							currentCookies -= C;
//						}else{
//							System.out.println("Not worth buying farm");
//							elapsedTime += ((X - currentCookies) / cookiesPerSecond);
//							output = elapsedTime + "";
//							solved = true;
//						}
//					}else{
//						//Gather enough to buy a farm or win
						System.out.println("Gathering enough cookies for farm or win");
						double timeToGetFarm = C / cookiesPerSecond;
						double timeToGetWin = X / cookiesPerSecond;
						if(timeToGetWin <= timeToGetFarm){
							elapsedTime += timeToGetWin;
							output = elapsedTime + "";
							break;
						}else{
							double timeToWinIfBuy = (C / cookiesPerSecond ) + (X / (cookiesPerSecond + F));
//							double extraInTime = timeToCatchUp * cookiesPerSecond;
//							double extraTime = extraInTime / (F);
//							double timeToRegen = timeToCatchUp + extraTime;
							if(timeToWinIfBuy < timeToGetWin){
								System.out.println("Should  buy farm");
								elapsedTime += C / cookiesPerSecond;
								cookiesPerSecond += F;
								//currentCookies -= C;
							}else{
								System.out.println("Not worth buying farm");
								elapsedTime += X / cookiesPerSecond;
								output = ((double)(Math.round(elapsedTime * 10000000))/10000000) + "";
								solved = true;
							}
//							elapsedTime += timeToGetFarm;
//							currentCookies = C;
						}
//					}
				}
				
				
				
				//output = String.format("%.5g%n", elapsedTime);
				
				System.out.println("Case #" + (i+1) + " of " + numberOfTestCases + " done");
				System.out.println("Case #" + (i+1) + ": " + output+ "\n");
				out.write("Case #" + (i+1) + ": " + output+ "\n");
			}
			out.flush();
			out.close();
			fstream.close();
			scanner.close();
			System.out.println("Done");

		}
		else{
			System.out.println("Please use file as arguement");
		}
	}
}
