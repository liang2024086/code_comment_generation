package methodEmbedding.Cookie_Clicker_Alpha.S.LYD254;

/**
 * Google Code Jam 2014
 * Qualification Round
 * Problem B
 *
 * Author: MC van der Bank
 * Date: 2014/04/12
 *
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.FileOutputStream;
import java.math.*;
import java.lang.*;

public class GCJ_B
{
	public static void main(String[] args)
	{
		if(args.length == 0) {
			System.out.println("Invalid argument. Usage: 'GCJ_B inputfile' ");
			return;
		}
		
		Writer writer = null;
		try	{
			FileReader file = new FileReader(args[0]);
			BufferedReader reader = new BufferedReader(file);
			
			writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("GCJ_Q_B_output.txt"), "utf-8"));
			
			//Get test cases
			int T = Integer.parseInt(reader.readLine());
			
			//Do each case
			for(int t=1; t<=T; t++) {
				
				//Get game info
				String line[] = reader.readLine().split(" ");
				
				BigDecimal C = new BigDecimal(line[0]);
				BigDecimal F = new BigDecimal(line[1]);
				BigDecimal X = new BigDecimal(line[2]);
				
				BigDecimal rate = new BigDecimal(2.0);
				BigDecimal time = new BigDecimal(0.0);
				BigDecimal cummtime = new BigDecimal(0.0);
				
				//Initialize
				time = X.divide(rate,17,RoundingMode.CEILING);
				
				while(true) {
					BigDecimal buyfarm = C.divide(rate,17,RoundingMode.CEILING);
					if( (cummtime.add(buyfarm.add(X.divide(rate.add(F),17,RoundingMode.CEILING)  )) ).compareTo(time) == -1 ) {
						cummtime = cummtime.add(buyfarm);
						rate = rate.add(F);
						time = cummtime.add((X.divide(rate,17,RoundingMode.CEILING)));
						
					} else {
						break;
					}
				}
				
				//System.out.println(time);
				writer.write("Case #"+Integer.toString(t)+": "+time.toString()+"\n");
			}
		}
		catch(IOException e){}
		
		finally {
		   try {writer.close();} catch (Exception ex) {}
		}
	}
}
