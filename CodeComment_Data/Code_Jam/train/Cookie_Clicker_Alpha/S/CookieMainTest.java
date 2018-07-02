package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1109;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;



/**
 * 
 * @author sidi
 * @version 2014-04-12
 */
public class CookieMainTest {

	public static void main(String[] args) {
		
		String inputFile = "B-small-attempt0.in";
		String outputFile = "B-small-attempt0.out";
		
		int numTests = -1;
		double cost = -1;
		double rateGain = -1;
		double target = -1;
		
		Scanner s = null;
		BufferedWriter out = null;
		
		try {	
			s = new Scanner(new File(inputFile));
			out = new BufferedWriter(new FileWriter(outputFile));
			
			numTests = s.nextInt();
			for(int i=1; i<=numTests; i++) {
				
				double rate = 2.0;
				double totalSeconds = 0.0;
				
				cost = s.nextDouble();
				rateGain = s.nextDouble();
				target = s.nextDouble();
				
				while(CookieOps.buyNewFarm(cost, rate, rateGain, target)) {
					totalSeconds += cost/rate;
					rate += rateGain;
				}
				
				totalSeconds += target/rate;
				
				out.write("Case #" + i + ": " + totalSeconds + System.lineSeparator());
				
			}
			
		} catch (FileNotFoundException e1) {
			System.out.println(e1.getMessage());
		} catch(IOException e2) {
			System.out.println(e2.getMessage());
		} finally {
			if(s!=null) {
				s.close();
			}
			if(out!=null) {
				try {
					out.close();
				} catch(IOException e3) {
					System.out.println(e3.getMessage());
				}
			}
		}
		
		
		
	}

}
