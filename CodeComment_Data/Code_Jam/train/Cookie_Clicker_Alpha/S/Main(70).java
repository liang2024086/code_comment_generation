package methodEmbedding.Cookie_Clicker_Alpha.S.LYD992;

import java.util.Scanner;


public class Main {
	public static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		int cases = keyboard.nextInt();
		for(int z = 1; z<=cases; z++){
			double c = keyboard.nextDouble();
			double f = keyboard.nextDouble();
			double x = keyboard.nextDouble();
			
			double rate = 2.0;
			double seconds = 0.0;
			double last = x/rate;
			while(true){
				seconds+=c/rate;
				rate+=f;
				if(seconds+(x/rate)>last){
					break;
				}
				last = seconds+(x/rate);
			}
			System.out.println("Case #"+z+": "+last);
		}
	}
}
