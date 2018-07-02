package methodEmbedding.Cookie_Clicker_Alpha.S.LYD30;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

	public Main() {
		try {
			Scanner sc = new Scanner(new File("B-small-attempt1.in"));
			PrintStream ps = new PrintStream(new File("answers.txt"));
			int T = sc.nextInt();
			for (int i = 1; i <= T; i++) {
				double farmCost = sc.nextDouble();
				double farmRate = sc.nextDouble();
				double win = sc.nextDouble();
				double cookies = 0;
				double time = 0;
				double rate = 2;
				loop:while(true){
					double buyFarmTime = (farmCost-cookies)/rate;
					if(buyFarmTime < 0){ buyFarmTime = 0;}
					double buyWinTime = buyFarmTime + (win-cookies)/(rate+farmRate);
					double waitTime = (win - cookies)/rate;
					if(buyWinTime < waitTime){
						time += buyFarmTime;
						cookies += buyFarmTime*rate;
						rate += farmRate;
						cookies -= farmCost;
					}
					else if(waitTime <= buyWinTime){
						time += waitTime;
						break loop;
					}
				}
				//System.out.printf("Case #%d: %.7f\n", i, time);
				ps.printf("Case #%d: %.7f\n", i, time);
			}
			sc.close();
			ps.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		new Main();
	}

}
