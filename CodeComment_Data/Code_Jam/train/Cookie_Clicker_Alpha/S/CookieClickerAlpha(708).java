package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1447;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class CookieClickerAlpha {

	public static void main(String[] args) throws FileNotFoundException {
		int T = 0;
		Scanner sc = new Scanner(new File("input.in"));
		T = sc.nextInt();
		PrintWriter writer = new PrintWriter("output.out");
		
		double c;
		double f;
		double x;
		double time;
		double rate;
		double cookie;
		double timeToEvenFarm;
		double timeToEarnFarm;
		double timeLeft;
				
		for(int cs = 1; cs<=T; cs++){
			c = sc.nextDouble();
			f = sc.nextDouble();
			x = sc.nextDouble();
			time = 0;
			cookie = 0;
			rate = 2.0;
			timeToEvenFarm = c/f;
			timeToEarnFarm = c/rate;
			timeLeft = (x-c)/rate;
			
			
			while(cookie<x){
			if(timeToEvenFarm<=timeLeft){
				time+=timeToEarnFarm;
				rate+=f;
				timeToEarnFarm = c/rate;
				timeLeft = (x-c)/rate;
				
			}else{
				time+=x/rate;
				cookie = x;
			}
			}
			
			writer.printf("Case #%d: %,.7f%n",cs,time);
			
		}
		sc.close();
		writer.close();


	}

}
