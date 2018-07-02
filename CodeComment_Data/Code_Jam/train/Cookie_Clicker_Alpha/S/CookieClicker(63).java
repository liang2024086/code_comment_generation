package methodEmbedding.Cookie_Clicker_Alpha.S.LYD173;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class CookieClicker {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(new File("B-small-attempt0.in"));
		PrintWriter out = new PrintWriter(new FileWriter("outputB.txt")); 
		int testCases = (int)input.nextDouble();
		for (int i=1; i<=testCases; i++) {
			double C = input.nextDouble();
			double F = input.nextDouble();
			double X = input.nextDouble();
			double cookies = 0;
			double pSec = 2; 
			double time = 0;
			out.print("Case #" + i + ": ");
			double min = Double.MAX_VALUE;
			while (true) {
				min = Math.min(min, time + (X - cookies)/pSec);
				time = (C - cookies)/pSec + time;
				if (min <= time) {
					break;
				}
				pSec += F;
			}
			out.println(min);
		}
		out.close();
	}

}
