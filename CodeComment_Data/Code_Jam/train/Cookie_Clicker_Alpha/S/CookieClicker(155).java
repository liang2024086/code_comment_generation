package methodEmbedding.Cookie_Clicker_Alpha.S.LYD551;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class CookieClicker {
	public static void main(String[] args){
		try {
			//File input = new File("inputFile.txt");
			File input = new File("B-small-attempt1.in");
			
			Scanner scan = new Scanner(input);
			int num_cases = Integer.parseInt(scan.nextLine());
			PrintStream out = new PrintStream(new FileOutputStream("output.txt"));
		    DecimalFormat form = new DecimalFormat("0.000000000"); 
			System.setOut(out);
		    MathContext mc = new MathContext(100, RoundingMode.HALF_EVEN);
			for (int current_case = 0; current_case < num_cases; current_case++){
				BigDecimal cookies_per_sec = new BigDecimal(2);
				BigDecimal current_time = new BigDecimal(0);
				BigDecimal cost = new BigDecimal(Float.parseFloat(scan.next()));
				BigDecimal income = new BigDecimal(Float.parseFloat(scan.next()));
				BigDecimal goal = new BigDecimal(Float.parseFloat(scan.next()));
				
				BigDecimal time_to_buy = cost.divide(cookies_per_sec, mc);
				BigDecimal time_to_goal_after_buy = goal .divide (cookies_per_sec.add(income), mc);
				BigDecimal time_to_goal = goal.divide(cookies_per_sec, mc);
				while(time_to_goal.subtract(time_to_buy).compareTo(time_to_goal_after_buy) > 0){
					current_time = current_time.add(cost.divide(cookies_per_sec, mc));
					cookies_per_sec = cookies_per_sec.add(income);
					time_to_buy = cost.divide(cookies_per_sec, mc);
					time_to_goal_after_buy = goal .divide (cookies_per_sec.add(income), mc);
					time_to_goal = goal.divide(cookies_per_sec, mc);
				}
				current_time = current_time.add(goal.divide(cookies_per_sec, mc));
				
				System.out.println("Case #" + (current_case+1) + ": " + form.format(current_time));
			}
			
			scan.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
