package methodEmbedding.Cookie_Clicker_Alpha.S.LYD337;


import java.io.IOException;

import lib.IO;;

public class CookieClickerAlpha {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		IO io = new IO("/home/preetam/workspace/CodeJam/files/year2014/qualification/problem_b/B-small-attempt0.in");
		int t = Integer.parseInt(io.read());
		for(int i = 1; i <= t; i++)
		{
			String data [] = io.read().split(" ");
			double c = Double.parseDouble(data[0]);
			double f = Double.parseDouble(data[1]);
			double x = Double.parseDouble(data[2]);
			double cur = 2.0;
			double total = 0;
			while(x/cur > c/cur + x/(cur+f))
			{
				total += c/cur;
				cur += f;
			}
			total += x/cur;
			io.write(i, total+"\n");
		}
		io.close();
	}

}
