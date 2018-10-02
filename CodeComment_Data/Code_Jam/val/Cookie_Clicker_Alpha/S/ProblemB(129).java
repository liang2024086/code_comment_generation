package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1091;

import java.io.*;
import java.util.Scanner;
import java.text.*;

public class ProblemB {

	public static void main(String[] args) {
		Scanner sc = null;
		try {
			sc = new Scanner(new File("DATA_B"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		int T = sc.nextInt();
		for(int x = 1; x <= T; x++) {
			double C = sc.nextDouble();
			double F = sc.nextDouble();
			double X = sc.nextDouble();
			
			double time = 0;
			double rate = 2;
			
			while(true) {
				if((C / rate) + (X / (rate + F)) < X / rate) { // faster to get another farm
					time += C / rate;
					rate += F;
				} else {
					time += X / rate;
					break;
				}
			}
			
			System.out.print("Case #" + x + ": ");
			DecimalFormat df = new DecimalFormat("#.0000000");
			System.out.println(df.format(time));
		}
		
		try {
			sc.close();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
	}
}
