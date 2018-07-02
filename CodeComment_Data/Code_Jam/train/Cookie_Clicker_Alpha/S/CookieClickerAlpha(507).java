package methodEmbedding.Cookie_Clicker_Alpha.S.LYD813;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class CookieClickerAlpha {
	
	public static void main(String args[]) throws IOException{
		
		BufferedReader f = new BufferedReader(new FileReader("B-small-attempt0.in"));
		PrintWriter p = new PrintWriter(new BufferedWriter(new FileWriter("B.out")));
		StringTokenizer st = new StringTokenizer(f.readLine());
	
		int t = Integer.parseInt(st.nextToken());
		
		double cF,pF,win, totalP = 2, time = 0;
		
		for(int i = 0; i < t; i++){
			
			totalP = 2;
			time = 0;
			
			st = new StringTokenizer(f.readLine());
			
			cF = Double.parseDouble(st.nextToken());
			pF = Double.parseDouble(st.nextToken());
			win = Double.parseDouble(st.nextToken());
			
			while(cF/totalP + win/(totalP+pF) < win/totalP){
				
				time += cF/totalP;
				totalP += pF;
				
			}
			
			time+= win/totalP;
			p.append("Case #" + (i+1) + ": " + time + "\n");
		}
		
		p.close();
	}
}
