package methodEmbedding.Cookie_Clicker_Alpha.S.LYD744;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;


public class cookies {
	public static void main (String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(new File("B-small-attempt0.in")));
		Integer n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			String stuff[] = br.readLine().split(" ");
			Double C = Double.parseDouble(stuff[0]);
			Double F = Double.parseDouble(stuff[1]);
			Double X = Double.parseDouble(stuff[2]);
			
			
			Double time = 0.0;
			Double cr = 2.0;
			while (true) {
				Double buy = ( X/(cr+F) ) + ( C / cr );
				Double wait = X / (cr);
				if (buy < wait) {
					time = time + ( C / cr );
					cr = cr + F;
				} else {
					time = time + wait;
					break;
				}
			}
			DecimalFormat df = new DecimalFormat("#.0000000");
			System.out.println("Case #"+(i+1)+": " + df.format(time));
		}
	}
}
