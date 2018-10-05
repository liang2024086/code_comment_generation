package methodEmbedding.Cookie_Clicker_Alpha.S.LYD960;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Problem_B {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int count = 1;
		while(t-->0)
		{
			double C = s.nextDouble();
			double F = s.nextDouble();
			double X = s.nextDouble();
			int numOFFarm = 1;
			int rate = 2;
			double time = X/2.0;
			
			double nextTime = C/2.0 + X/(2.0+numOFFarm*F);
			
			while(time-nextTime>0)
			{
				time = nextTime;
				numOFFarm++;
				nextTime = 0;
				for (int i = 0; i < numOFFarm; i++) {
					nextTime += C/(2.0+i*F);
				}
				nextTime += X/((2.0+numOFFarm*F));
			}
			DecimalFormat dc = new DecimalFormat("0.0000000");
			System.out.println("Case #"+count+": "+dc.format(time));
			count++;
		}
	}

}
