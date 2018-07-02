package methodEmbedding.Cookie_Clicker_Alpha.S.LYD10;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;


public class Cookie {

	public static void main(String[] args) {
		String inFile = "inFiles/B-small-attempt0.in";
		String outFile = "inFiles/out.out";
		
		try {
			
			
			BufferedReader fin = new BufferedReader(new InputStreamReader(
						new FileInputStream(inFile)));
			
			PrintWriter fout = new PrintWriter(outFile);
		
			int N = Integer.parseInt(fin.readLine());
			
			double rate, time,totalTime, currTime, minTotal;
			String[] splt;
			double C,F,X;
			for (int i = 1; i <= N; i++) {				
				rate = 2; totalTime = 0;
				
				splt = fin.readLine().split(" ");
				C = Double.parseDouble(splt[0]);
				F = Double.parseDouble(splt[1]);
				X = Double.parseDouble(splt[2]);
				
				minTotal = X/rate;
				
				while(true){
					
					time = C/rate;
					totalTime += time;
					rate += F;
					currTime = totalTime + X/rate;
					
					if(currTime > minTotal) break;
					else minTotal = currTime;					
				}
				
				fout.println("Case #"+i+": "+minTotal);
				
			}
			
		
			
			fin.close();
			fout.close();
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
