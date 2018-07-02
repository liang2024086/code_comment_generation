package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1003;

import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;


public class Cookie {
	
	
	
	public static void main(String[] args) throws FileNotFoundException {
     Scanner file = new Scanner(new File("B-small-attempt1.in"));
	 int T = file.nextInt();
	 int count = 1;
	 while (count < T + 1) {
		double C = file.nextDouble();
		double rate = 2;
		double F = file.nextDouble();
		double X = file.nextDouble();
		double time = 0;
		int num = 0;
		while ((X/rate) > ((C/rate) + (X/(rate + F)))) {
			num++;
			rate = rate + F;
	}
		double tempRate = 2;
		for (int i = 0;i < num;i++) {
			time = time + C/tempRate;
			tempRate += F;
		}
		time = time + X/tempRate;
		System.out.println("Case #" + count +": " + time);
		count++;
	 }
	 file.close();
		
	
		
		
	}
	
	
	
	
}
