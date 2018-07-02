package methodEmbedding.Cookie_Clicker_Alpha.S.LYD746;

import java.util.Scanner;
import java.io.*;
import java.util.*;

class Cookie {
	
	
	
	public static void main (String [] args) throws IOException {
		// Use BufferedReader rather than RandomAccessFile; it's much faster
		BufferedReader fr = new BufferedReader(new FileReader("small.txt"));
                                                  // input file name goes above
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("out.txt")));
		Scanner in = new Scanner(fr);
		int t = in.nextInt();
		double c,f,x;
		double rate = 2;
		double r = 0;
		for(int cnt = 1; cnt <= t; cnt++)
		{
			c = in.nextDouble();
			f = in.nextDouble();
			x = in.nextDouble();
			rate = 2;
			r = 0;
			while(x/rate > c/rate + x/(rate+f) )
			{
				r += c/rate;
				rate += f;
			}
			r += x/rate;
			out.println("Case #" + cnt + ": " + r);
		}
		
		fr.close();
		out.close();
		System.exit(0);                               // don't omit this!
	}
}
