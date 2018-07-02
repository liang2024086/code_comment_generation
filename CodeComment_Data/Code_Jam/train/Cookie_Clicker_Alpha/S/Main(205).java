package methodEmbedding.Cookie_Clicker_Alpha.S.LYD451;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		Scanner stdin = new Scanner(System.in);
		
		int numCases = stdin.nextInt();
		for(int curr = 1; curr <= numCases; curr++){
			double farmCost = stdin.nextDouble();
			double farmRate = stdin.nextDouble();
			double goalCookies = stdin.nextDouble();
			
			double rate = 2;
			double time = 0;
			double cookies = 0;
			
			while(true){
				double wait = (goalCookies-cookies)/rate;
				
				double waitTilFarm = 0; 
				double afterFarmCookies = cookies-farmCost;
				double afterFarmRate = rate+farmRate;
				if(cookies < farmCost){
					waitTilFarm = (farmCost-cookies)/rate;
					afterFarmCookies = (waitTilFarm*rate) - farmCost;
					
				}
				
				if(wait < waitTilFarm + (goalCookies-afterFarmCookies)/afterFarmRate){
					time += wait;
					break;
				}else{
					time += waitTilFarm;
					rate = afterFarmRate;
					cookies = afterFarmCookies;
				}
			
			}
			
			System.out.print("Case #" + curr + ": ");
			System.out.println(new DecimalFormat("0.0000000").format(time));
		}
	}
}
