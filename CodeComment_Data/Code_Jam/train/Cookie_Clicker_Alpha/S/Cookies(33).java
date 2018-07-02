package methodEmbedding.Cookie_Clicker_Alpha.S.LYD870;

import java.util.*;
import java.io.*;

public class Cookies
{
	public static void main(String[] sArgs) throws IOException
	{
		new Cookies();
	}
	
	Cookies() throws IOException
	{
		Scanner sc = new Scanner(new File("cookies.in"));
		PrintWriter out = new PrintWriter("cookies.out");
		int T = Integer.parseInt(sc.nextLine());
		for(int c=1; c <= T; c++) {
			String[] sAry = sc.nextLine().split("\\s+");
			double C = Double.parseDouble(sAry[0]), F = Double.parseDouble(sAry[1]),
					X = Double.parseDouble(sAry[2]);
			double tF=0, r=2;
			double minT = X/r;
			for(int i=0;i<1000000;i++) {
				tF += C/r;
				r += F;
				double t = tF+X/r;
				if(t > minT)
					break;
				minT = t;
			}
			out.printf("Case #"+c+": %.7f\n",minT);
		}
		sc.close();
		out.close();
	}	
}
