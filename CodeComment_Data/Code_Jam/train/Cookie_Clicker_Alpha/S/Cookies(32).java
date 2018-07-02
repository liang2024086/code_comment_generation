package methodEmbedding.Cookie_Clicker_Alpha.S.LYD876;

import java.io.*;
import java.util.*;

public class Cookies {
	public static final int BASE_INCOME = 2;
	
	public static void main(String[] args) throws FileNotFoundException {
		int cases;
		
		Scanner sc = new Scanner(new File("input.txt"));
		PrintStream output = new PrintStream(new FileOutputStream("output.txt"));
		
		cases = Integer.parseInt(sc.nextLine());
		
		for (int i = 1; i <= cases; i++) {
			double x, y;
			double farm_cost, farm_income, income, win;
			int num_farm = 0;
			
			String line = sc.nextLine();
			String[] line_info = line.split(" ");
			farm_cost = Double.parseDouble(line_info[0]);
			farm_income = Double.parseDouble(line_info[1]);
			win = Double.parseDouble(line_info[2]);
			
			x = 0;
			income = BASE_INCOME;
			for (int j = 1; j <= num_farm; j++) {
				x += farm_cost / income;
				income += farm_income;
			}
			x += win / income;
			
			num_farm++;
			
			y = 0;
			income = BASE_INCOME;
			for (int j = 1; j <= num_farm; j++) {
				y += farm_cost / income;
				income += farm_income;
			}
			y += win / income;
			
			while (x >= y) {
				x = y;
				
				y = 0;
				income = BASE_INCOME;
				for (int j = 1; j <= num_farm; j++) {
					y += farm_cost / income;
					income += farm_income;
				}
				y += win / income;
				
				num_farm++;
			}
			
			output.printf("Case #%d: %.7f", i, x);
			output.println();
		}
		
		output.close();
		sc.close();
	}
}
