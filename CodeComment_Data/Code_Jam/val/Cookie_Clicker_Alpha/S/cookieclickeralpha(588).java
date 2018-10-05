package methodEmbedding.Cookie_Clicker_Alpha.S.LYD562;

import java.util.*;
import java.io.*;

public class cookieclickeralpha {
	public static void main(String[] args) throws IOException
	{
		Scanner input = new Scanner(new File("B-small-attempt0.in"));
		PrintWriter out = new PrintWriter("cookie.out");
		int count = input.nextInt();
		for(int i=0; i<count; i++)
		{
			double c = input.nextDouble();
			double f = input.nextDouble();
			double x = input.nextDouble();
			double ftemp = 2;
			double time = 0;
			while(c/ftemp + x/(ftemp + f) < x/(ftemp))
			{
				time += c/ftemp;
				ftemp+=f;
			}
			time+=x/ftemp;
			out.println("Case #" + (i + 1) + ": " + time);
		}
		out.close();
	}
}
