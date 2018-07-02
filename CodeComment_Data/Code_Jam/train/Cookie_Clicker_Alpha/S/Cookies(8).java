package methodEmbedding.Cookie_Clicker_Alpha.S.LYD408;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.*;

public class Cookies {

	
	public static void main(String[] args) throws FileNotFoundException {
        // Redirect I/O to files.
        System.setIn(new FileInputStream("src/Cookies/B-small-attempt0.in"));
        System.setOut(new PrintStream("src/Cookies/B-small_output.txt"));
		Scanner console = new Scanner(System.in);

		int caseNumber = console.nextInt();
		
		for (int cases = 1; cases <= caseNumber; cases++) {
			double c = console.nextDouble();
			double f = console.nextDouble();
			double x = console.nextDouble();
			
			double total = 0;
			double income = 2;
			boolean buy = true;
			double totalTime = 0;
			
			
			while (buy) {
				double time1 = (x - total)/income;
				double time2 = 0;
				if (c > total) {
					time2 = (c - total) / income;
					time2 += x / (income + f);
				} else {
					time2 = (x - c - total) / income;
				}
				
				if (time1 < time2)
					buy = false;
				else {
					if (c > total) {
						totalTime += (c - total) / income;
						total = 0;
					} else
						total -= c;
					income += f;
				}
			}
			totalTime += (x - total) / income;
			System.out.printf("Case #%d: %.7f\n", cases, totalTime);
		}
		
		console.close();
	
	
	}

}
