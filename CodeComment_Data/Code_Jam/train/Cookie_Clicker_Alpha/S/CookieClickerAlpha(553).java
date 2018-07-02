package methodEmbedding.Cookie_Clicker_Alpha.S.LYD648;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;


public class CookieClickerAlpha {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(new File("B-small-attempt0.in"));
		double c = 0;
		double f = 0;
		double x = 0;
		double raise = 2.0;
		double result, newResult;
		int caseCounter = 0;
		int i=0;
		boolean cont = true;
		double tmp2;
		String s;
		caseCounter = scanner.nextInt();		
		BufferedWriter out = new BufferedWriter(new FileWriter("result.out"));
		DecimalFormat df = new DecimalFormat("#.#######");
		df.setMinimumFractionDigits(7);
		
		for(i=0;i<caseCounter;i++){
			
			raise = 2.0;
			cont = true;
			s = scanner.next();
			c = Double.parseDouble(s);
			s = scanner.next();
			f = Double.parseDouble(s);
			s = scanner.next();
			x = Double.parseDouble(s);

			
			result = x/raise;
			tmp2 = 0.0;
			
			while(cont){
				
				tmp2 += c/raise;
				raise = raise + f;
				newResult = tmp2 + x/raise;
				if(newResult < result)
					result = newResult;
				else
					cont = false;
				
			}
			
			out.write("Case #" + (i+1) + ": " + df.format(result).replace(',','.'));
			out.newLine();
		}
		
		out.close();
		
	}

}
