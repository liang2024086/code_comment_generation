package methodEmbedding.Cookie_Clicker_Alpha.S.LYD673;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class CookieClickerAlpha 
{
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner (new File("Cookie_Clicker_Alpha.in"));
		BufferedWriter fw = new BufferedWriter(new FileWriter(new File("Cookie_Clicker_Alpha.out")));
		int T = sc.nextInt();
		for (int caseNum = 1; caseNum <= T; caseNum++)
		{
			double C = sc.nextDouble();
			double F = sc.nextDouble();
			double X = sc.nextDouble();
			boolean done = false;
			int FA = 0;
			double fin = 0;
			while (!done)
			{
				double temp1 = X/(2+FA*F);
				for (int i = 0; i<FA; i++)
				{
					temp1 += C/(2+(F*(i)));   
				}
				double temp2 = X/(2+(FA+1)*F);
				for (int i = 0; i<FA+1; i++)
				{
					temp2 += C/(2+(F*(i)));
				}
				if (temp1<temp2)
				{
					fin = temp1;
					done = true;
				}
				FA++;
			}
			fw.write("Case #"+caseNum+": "+fin+"\n");
		}
		fw.flush();
		fw.close();
		sc.close();
	}
}
