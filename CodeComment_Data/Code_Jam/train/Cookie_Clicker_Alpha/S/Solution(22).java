package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1110;

import java.util.Scanner;
import java.io.*;
import java.text.DecimalFormat;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Solution 
{
	public static void main(String[] args) throws IOException
	{
		
		Scanner scan = new Scanner(new File("/home/jchamp/GoogleJam/QualC/in"));
		
		int t = scan.nextInt();
		int cases = 0;
		DecimalFormat fmt = new DecimalFormat("0.#######");
		while(cases < t)
		{
			cases++;
			System.out.print("Case #" + cases + ": ");
			BigDecimal c = new BigDecimal(scan.nextFloat());
			BigDecimal f = new BigDecimal(scan.nextFloat());
			BigDecimal x = new BigDecimal(scan.nextFloat());
			BigDecimal gain = new BigDecimal(2.00000000000000000);
			boolean foundAnswer = false;
			BigDecimal ttg = new BigDecimal(0);
			ttg = x.divide(gain, 50, RoundingMode.UP);
			BigDecimal ttc = new BigDecimal(0);
			ttc = c.divide(gain, 50, RoundingMode.UP);
			BigDecimal bt = new BigDecimal(0);
			bt = ttg;
			BigDecimal et = new BigDecimal(0);
			
			while(!foundAnswer)
			{
				et = et.add(ttc);
				gain = gain.add(f);
				ttg = x.divide(gain, 50, RoundingMode.UP);
				ttc = c.divide(gain, 50, RoundingMode.UP);
				
				if(ttg.add(et).floatValue() < bt.floatValue())
				{
					bt = ttg.add(et);
				}
				else
				{
					foundAnswer = true;
				}
			}
			
			System.out.println(fmt.format(bt));
		}
		scan.close();
	}
}
