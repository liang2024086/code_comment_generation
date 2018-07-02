package methodEmbedding.Cookie_Clicker_Alpha.S.LYD592;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Cookies {

	public static void main (String [] args) throws IOException{

		//Timing
		//long s = System.currentTimeMillis ();

		//Set up the reader and printer
		Scanner in = new Scanner (new File("IN.txt"));
		PrintWriter out = new PrintWriter (new BufferedWriter (new FileWriter ("OUT.txt")));
		int noCases = in.nextInt();
		
		//Solve the cases
		for (int caseNo = 1; caseNo <= noCases; caseNo++){
			
			double rate = 2;
			double farmCost = in.nextDouble();
			double cookiesPerFarm = in.nextDouble();
			double cookiesNeeded = in.nextDouble();
			boolean finished = false;
			double time = 0;
			while (!finished)
			{
				double timeAtCurrent = cookiesNeeded/rate;
				double timeWithFarm = (farmCost/rate) + (cookiesNeeded/(rate + cookiesPerFarm));
				if (timeAtCurrent < timeWithFarm)
				{
					time += cookiesNeeded/rate;
					finished = true;
				}
				else
				{
					time += farmCost/rate;
					rate += cookiesPerFarm;
				}
			}
			
			String answer = String.valueOf(time);
			out.println(String.format("Case #%d: %s", caseNo, answer));
			out.flush();//So I can see how my program is doing
		}

		//Close the files
		in.close();
		out.close();

		//Timing
		//long e = System.currentTimeMillis();
		//System.out.println((e - s) / 1000.0);

		//Terminate the program
		System.exit(0);

	} //Main method
}
