package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1512;

import java.util.*;
import java.lang.*;

public class CookieClicker{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int num_problems = Integer.parseInt(scan.nextLine());
		for(int case_no = 1; case_no <= num_problems; case_no++) {
			String l = scan.nextLine();
			String[] ls = l.split(" ");
			double c = Double.parseDouble(ls[0]);
			double f = Double.parseDouble(ls[1]);
			double x = Double.parseDouble(ls[2]);			
			double income = 2.0;
			double time = 0.0;
			double fin_time = 0.0;			
			fin_time = time + x/income;			
			while (true){
				time += c/income;
				income += f;
				double tmp_fin_time = time + x/income;
				if(tmp_fin_time < fin_time)
					fin_time = tmp_fin_time;
				else break;
			}			
			System.out.println("Case #" + case_no + ": " + String.format("%.7f", fin_time));			
		}
		scan.close();
		
	}
}
