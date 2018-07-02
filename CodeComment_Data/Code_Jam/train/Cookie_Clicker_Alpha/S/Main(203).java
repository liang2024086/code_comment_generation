package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1185;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import javax.print.attribute.standard.Sides;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("B-small-attempt0.in"));
		PrintWriter out = new PrintWriter(new File("out.out"));
		int t = Integer.parseInt(br.readLine());
		String [] sp;
		double c, f, x;
		double curOut;
		for (int i = 0; i < t; i++) {
			sp = br.readLine().split(" ");
			c = Double.parseDouble(sp[0]);
			f = Double.parseDouble(sp[1]);
			x = Double.parseDouble(sp[2]);
			curOut = 2;
			double min = x / curOut;
			double cost = 0;
			
			for (int j = 0; j < 2000000; j++) {
				cost += c / curOut;
				curOut += f;
				min = Math.min(min, cost + (x / curOut));
			}
			
			out.println("Case #" + (i+1) + ": " + min);
			
		}
		br.close();
		out.close();
	}
}
