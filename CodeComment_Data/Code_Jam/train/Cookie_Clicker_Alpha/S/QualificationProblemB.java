package methodEmbedding.Cookie_Clicker_Alpha.S.LYD780;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class QualificationProblemB{
	public static void main(String[] args) {
		try {
		
		// Passed parameters
		double C = 0;
		double F = 0;
		double X = 0;
			
		int testCount = 0;
		
		double cookieCount = 0;
		double baseIncome = 2;
			
		String [] parsedLine = new String[3];
		
		// Read in test input
		BufferedReader in = new BufferedReader(new FileReader("B-small-attempt5.in"));
		BufferedWriter out = new BufferedWriter(new FileWriter("Output15.txt"));

		// # of test cases
		String cur = in.readLine();
		testCount = Integer.parseInt(cur);
		int flag = 0;
		
		while (flag < testCount) {
			
			out.write(("Case #" + (flag + 1) + ": "));
			System.out.println("Case #" + (flag + 1) + ": ");
			
			cur = in.readLine();
			String[] test = cur.split(" ");

			for (int i = 0; i < test.length; ++i) {
				parsedLine[i] = test[i];
			}
			
			C = Double.parseDouble(parsedLine[0]);
			F = Double.parseDouble(parsedLine[1]);
			X = Double.parseDouble(parsedLine[2]);
			double seconds = 0;
		
			while(cookieCount < X) {				
				if(cookieCount >= C) {
					// Check whether its quicker to buy a farm or wait it out					
					double wait = seconds + (X - cookieCount) / baseIncome;
					// The amount of time buying one farm would save you
					double go = seconds + (X - (cookieCount - C))/ (baseIncome + F);

					if(wait > go){
						// Buy a farm
						baseIncome+=F;
						cookieCount-=C;
					} else {
						seconds+= (X - cookieCount) / baseIncome;
						break;
					}
				}
				
				double secondsRemaining2 = (C - cookieCount) / baseIncome;
				double seconds2 = seconds + secondsRemaining2;
				double cookieCount2 = cookieCount + (secondsRemaining2 * baseIncome);
				
				if (C - cookieCount >= 1 && cookieCount2 < X){
					seconds = seconds2;
					cookieCount = cookieCount2;
				} else {
					seconds+= 0.0000001;
					cookieCount+=(baseIncome/10000000);
				}
			}
			
			double value = seconds;
			value = value*10000000;
			value = Math.round(value);
			value = value /10000000;
			
			out.write(Double.toString(value));
		
			flag++;
			cookieCount = 0;
			baseIncome = 2;
			
			if(flag != testCount){
				out.write("\r\n");
			}
		}
		out.flush();
		out.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
