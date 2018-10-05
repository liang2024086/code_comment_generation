package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1340;

import java.io.*;
import java.util.*;

public class ProblemB {
	public static void main(String[] ar) throws IOException {

		double c = 0, f = 0, x = 0, cookies = 0, totalTimes = 0, incre = 0, timesC = 0, timesX = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter writer = new PrintWriter("outputB.txt", "UTF-8");
		int t = Integer.parseInt(br.readLine());

		for(int i = 0; i < t; ++i) {
			String[] elements = br.readLine().split(" ");
			c = Double.parseDouble(elements[0]);
			f = Double.parseDouble(elements[1]);
			x = Double.parseDouble(elements[2]);

			cookies = 0;
			incre = 2;
			totalTimes = 0;
			
			while(cookies != x) {
				timesC = (c/incre) + (x/(incre+f));
				timesX = (x/incre);

				if(timesC > timesX) {
					totalTimes += (x/incre);
					cookies = x;
				}
				else{
					totalTimes += (c/incre);
					incre += f;
					cookies = c;
				}
			}
			writer.println("CASE #" + (i+1) + ": " + totalTimes);
		}
		writer.close();
	}	
}
