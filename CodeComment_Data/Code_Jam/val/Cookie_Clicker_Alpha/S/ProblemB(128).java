package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1634;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;
import java.math.*;
public class ProblemB
{
	public static void main(String[] args) throws FileNotFoundException
	{
		String inFile = args[0];
		Scanner input = new Scanner(new File(inFile));
		int cases = input.nextInt();
		MathContext mc = new MathContext(16);
		
		double c, f, x, cps, time, tofarm, tofinish;
		BigDecimal bigc, bigf, bigx, bigcps, bigtime, bigtofarm, bigtofinish;

		for(int i = 0; i < cases; i++)
		{
			c = input.nextDouble();
			f = input.nextDouble();
			x = input.nextDouble();
			cps = 2.0;
			time = 0.0;
			tofarm = c/cps;
			tofinish = x/cps;
			
			bigc = new BigDecimal(c);
			bigf = new BigDecimal(f);
			bigx = new BigDecimal(x);
			bigcps = new BigDecimal(cps);
			bigtime = new BigDecimal(time);
			bigtofarm = new BigDecimal(tofarm);
			bigtofinish = new BigDecimal(tofinish);

			while(bigtofinish.compareTo((bigtofarm.add((bigx.divide(bigcps.add(bigf),mc)))))>0)
			{
				bigcps = bigcps.add(bigf);
				bigtime = bigtime.add(bigtofarm);
				bigtofarm = bigc.divide(bigcps,mc);
				bigtofinish = bigx.divide(bigcps,mc);
			}
			bigtime = bigtime.add(bigtofinish);
			System.out.println("Case #" + (i + 1) + ": " + bigtime);
		}
		
		input.close();
	}
}
