package methodEmbedding.Cookie_Clicker_Alpha.S.LYD93;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;


public class CookieClickerAlpha {

	/*
	public static double findMin(int numFarms, double numCookies, int c,  int time, double x){
		if(x == numCookies){
			return time;
		}
		
		return Math.min(findMin(numFarms + 1, numCookies - c, c, time + 1, x), 
				findMin(numFarms, numCookies, c, time + 1, x));
		
	}*/
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		PrintStream out = null ;
		try {
			out = new PrintStream(new FileOutputStream("output.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.setOut(out);
		
		int cases = sc.nextInt();
		double c;
		double f;
		double x;
		
		int above_farm;
		int below_farm;
		double time1 = 0;
		double time2 = 0;
		
		for(int i = 0; i < cases; i++){
			
			c = sc.nextDouble();
			f = sc.nextDouble();
			x = sc.nextDouble();
			
			time1 = 0;
			time2 = 0;
			
			// finds the farm rounded up and rounded down
			below_farm = (int)(x/c-2/f-1);
			above_farm = (int)(x/c-2/f-1) + 1;
			
			// if negative, just send to 0
			if(x/c-2/f-1 < 0){
				below_farm = 0;
				above_farm = 0;
			}
			
			//System.out.println(x/c-2/f-1);
			
			for(int e = 0; e < below_farm; e++){
				time1 += c / (2+e*f);
			}
			
			time1 += x / (2 + below_farm * f);
			
			for(int e = 0; e < above_farm; e++){
				time2 += c / (2+e*f);
			}
			
			time2 += x / (2 + above_farm * f);
			
			
			time1 = Math.min(time1, time2);
			/*result = findMin(0, 0, buyFarm, 1, x);*/
			
			System.out.println("Case #" + (i+1) + ": " + time1);
		}
	}

	
}
