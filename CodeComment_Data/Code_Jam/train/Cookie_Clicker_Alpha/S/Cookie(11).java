package methodEmbedding.Cookie_Clicker_Alpha.S.LYD954;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class Cookie {

	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new FileReader("B-small-attempt0.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("output.txt"))); 
		
		int T = Integer.parseInt(in.readLine());
		
		for (int i = 0; i < T; i++) {
			String line = in.readLine();
			StringTokenizer st = new StringTokenizer(line);
			double C = Double.parseDouble(st.nextToken());
			double F = Double.parseDouble(st.nextToken());
			double X = Double.parseDouble(st.nextToken());
			double ans = 0.0;
			double rate = 2.0;
			while (X/rate > C/rate + X/(rate+F)) {
				ans = ans + C/rate;
				rate = rate + F;
			}
			ans = ans + X/rate;
			int temp = i+1;
			out.print("Case #" + temp + ": ");
			out.println(ans);
		}
		
			in.close();
			out.close();
			System.exit(0);
	}
		
}
