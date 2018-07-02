package methodEmbedding.Cookie_Clicker_Alpha.S.LYD185;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner input = null;
		File file = new File("B-small-attempt0.in");
		try {
			input = new Scanner(file);
//			input  = new Scanner(System.in);
			PrintStream out = new PrintStream(new FileOutputStream("output.txt"));
			System.setOut(out);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		int number_of_tests = input.nextInt();
		double farm_cost;
		double cookies_per_farm;
		double cookies_to_win;
		double total_time_1;
		double total_time_2 = 0;
		int number_of_farms = 0;
		double cookies_per_second = 2.0;
		double previous_farm_cost = 0;
		int case_number = 1;
		
		while (input.hasNext()) {
			farm_cost = input.nextDouble();
			cookies_per_farm = input.nextDouble();
			cookies_to_win = input.nextDouble();
			
			
			total_time_1 = cookies_to_win / cookies_per_second;
			
			for(;;) {
				number_of_farms++;
				total_time_2 = previous_farm_cost + (farm_cost / cookies_per_second);
				previous_farm_cost = total_time_2;
				cookies_per_second = 2.0 + cookies_per_farm * number_of_farms;
				total_time_2 += (cookies_to_win / cookies_per_second); 
				if (total_time_2 < total_time_1) total_time_1 = total_time_2;
				else break;
			}
			
			System.out.println("Case #" + case_number + ": " + total_time_1);
			
			number_of_farms = 0;
			previous_farm_cost = 0;
			cookies_per_second = 2;
			case_number++;
		}
		
	}
	
}
