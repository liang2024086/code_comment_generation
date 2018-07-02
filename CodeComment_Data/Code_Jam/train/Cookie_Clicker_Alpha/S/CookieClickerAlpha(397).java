package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1480;

import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class CookieClickerAlpha {
	private static File f=new File("cookie_clicker_output.txt");
	public static void main(String args[]) throws Exception {
		FileReader fr = new FileReader("B-small-attempt0.in");
		Scanner in = new Scanner(fr);
		PrintWriter writer=new PrintWriter(f);
		//Scanner in = new Scanner(System.in);
		int testcases = in.nextInt();
		for (int tc = 1; tc <= testcases; tc++) {
			double c = in.nextDouble();
			double f = in.nextDouble();
			double x = in.nextDouble();
			if (x < c)
				//System.out.printf("Case #%d: %f\n", tc, x / 2);
				writer.printf("Case #%d: %f\n", tc, x / 2);
			else {
				double time=0;
				double cookieCount=0;
				double cookieRate=2;
				double farmCount=0;
				boolean flag=false;
				while(true){
					if(flag)
						break;
					if(x/cookieRate > (c/cookieRate) + (x/(cookieRate+f))){
						time+=c/cookieRate;
						cookieRate+=f;
					}
					else{
						time+=x/cookieRate;
						//System.out.printf("Case #%d: %.7f\n", tc,time);
						writer.printf("Case #%d: %.7f\n", tc,time);
						flag=true;
					}
				}
			}
		}
		writer.close();
	}
}
