package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1493;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.text.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader cin = new BufferedReader(new FileReader("B-small-attempt0.in"));
		// BufferedReader cin = new BufferedReader(new
		// InputStreamReader(System.in));

		int t = Integer.parseInt(cin.readLine());

		for (int i = 0; i < t; i++) {
			
			double ep = 0.0000001;
			
			String line = cin.readLine();
			String[] parts = line.split(" ");
			double c = Double.parseDouble(parts[0]);
			double f = Double.parseDouble(parts[1]);
			double x = Double.parseDouble(parts[2]);
			
			int fnum=0;
			double previous = 0;
			double current = x/2;
			
			
			//add one more farmer and see if time reduces
			while(previous==0||(current-previous)<ep){
				fnum++;
				previous=current;
				double build =0;
				for(int j=0;j<fnum;j++){
					build = build +(c/(2+j*f));
				}
				current = build+(x/(2+fnum*f));
				//current = Math.min(previous, current);
				
			}
			
			
			
			System.out.print("Case #"+(i+1)+": ");
			System.out.format("%.7f%n", previous);
		}

		cin.close();
	}

}
