package methodEmbedding.Cookie_Clicker_Alpha.S.LYD132;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class ProblemB {
	private static final double EPSILON = 0.0000000000000000000000001d;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner infile = null;
		PrintWriter pw = null;
		try {
			infile = new Scanner(new FileReader(args[0]));
			pw = new PrintWriter(new FileWriter(args[1]));
			
			int numCases = infile.nextInt();
			for (int caseNum = 0; caseNum < numCases; caseNum++) {
				//price of the new cookie farm
				double c = infile.nextDouble();
				//cookie price produce f cookies/s
				double f = infile.nextDouble();
				//number of the wished cookies. 
				double x = infile.nextDouble();
				//how much cookeis/s we can produce
				double s = 2;
				//time in sec
			
				
				
				//time for the new farm
				double newFarmTime=c/s;
				//if no farm, this time needs to win
				double winningTime = x/s;
				//if we buy a new farm we need this time for winning
				double withNewFarmWinningTime = newFarmTime + x/(s+f);
				//Until it is worth to buy a new farm
				while(!(winningTime<=withNewFarmWinningTime+EPSILON)){
					s=s+f;
					winningTime = newFarmTime+x/s;
					newFarmTime+=c/s;
					withNewFarmWinningTime =  newFarmTime + x/(s+f);
				}
				//The example is conflict with the problem. Problem says each 1 sec. you earn cookies. 
				//But in the example you can earn cookies in 83.3333333....
//				if(x<2.0+EPSILON){
//					winningTime = 1;
//				}
				String result = String.format("%.7f",winningTime);
				
				pw.println("Case #" + (caseNum + 1) + ": "+result);
			

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (infile != null) {
				infile.close();
			}
			if (pw != null) {
				pw.flush();
				pw.close();
			}
		}
	}

}
