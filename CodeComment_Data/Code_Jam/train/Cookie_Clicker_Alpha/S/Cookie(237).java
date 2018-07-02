package methodEmbedding.Cookie_Clicker_Alpha.S.LYD504;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Cookie {
	
	public static void main(String[] args) {
		
		Scanner file = null;
		try {
			file = new Scanner(new File("B-small-attempt0.in"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		int total_cases = file.nextInt();
		file.nextLine();
		
		for (int i = 0; i < total_cases; i++) {
			
			double c, f, x;
			
			c = file.nextDouble();
			f = file.nextDouble();
			x = file.nextDouble();
			file.nextLine();
			
			double cookies_per_second = 2.0;
			
			double total_time = 0;
			double new_total_time = 0;
			
			while (true) {
				
				new_total_time = (x / cookies_per_second) + total_time;
				
				total_time += (c / cookies_per_second);
				
				//System.out.println("Total time " + total_time + "Answer Time " + new_total_time);
				
				cookies_per_second += f;
				
				if ((x / cookies_per_second) + total_time > new_total_time) {
					break;
					
				}
				
			}
			
			
			System.out.println("Case #" + (i+1) + ": " + new_total_time);
		}
		
		
	}

}
