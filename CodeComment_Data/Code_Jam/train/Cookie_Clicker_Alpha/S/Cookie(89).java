package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1410;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Cookie {

	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("Cookie.in"));
		PrintWriter out = new PrintWriter(new FileWriter("C:/Users/David/Desktop/Cookie.txt"));
		StringTokenizer t = new StringTokenizer(f.readLine());
		int testCases = Integer.parseInt(t.nextToken());
		for (int i = 0; i < testCases; i++)
		{
			t = new StringTokenizer(f.readLine());
			double C, F, X;
			C = Double.parseDouble(t.nextToken());
			F = Double.parseDouble(t.nextToken());
			X = Double.parseDouble(t.nextToken());
			double rate = 2;
			double time ;
			if (X < C)
				time = X/rate;
			else
			{
				time = C/rate;
				double cookieNeed = X - C;
				//buy vs not buy
				while (cookieNeed/rate > X/(rate+F))
				{
					rate += F;
					time += C/rate;
				}
				time += cookieNeed/rate;
			}
			String ans = "Case #" + (i+1) + ": " + time;
			System.out.println(ans);
			out.println(ans);
		}
		

		out.close(); f.close(); System.exit(0);
	}

}
