package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1241;


import java.text.*;
import java.util.*;
import java.io.*;

public class problem2 {
	
	public static void main(String [] args) throws IOException{
		Scanner kb = new Scanner(System.in);
		PrintWriter fw = new PrintWriter("outputProblem2.out");
		DecimalFormat df = new DecimalFormat("0.0000000");
		
		int cases = Integer.parseInt(kb.nextLine());
		
		for(int i = 0; i < cases; i++){
			double cookies = 0;
			double c, f, x;
			double y = 0;
			int numOfFarm = 0;
			double timAllen = 0;
			double nextTime = 0;
			double timeTillCookie = 0;
			
			c = Double.parseDouble(kb.next());
			f = Double.parseDouble(kb.next());
			x = Double.parseDouble(kb.next());
			
			while (cookies < x){
				timeTillCookie = (x/(2 + (f * numOfFarm)));
				nextTime = (c / (2 + (f * numOfFarm)) + x / (2 + (f * (numOfFarm+1))));
				
				if(timeTillCookie < nextTime){
					timAllen += (x/(2 + (f * numOfFarm)));
					break;
				}
				
				y = (c / (2 + (f * numOfFarm)));
				timAllen += y;
				
				cookies = (2 * y) + ((f * numOfFarm) * y);
				
				numOfFarm++;
				
			}
			
			fw.println("Case #" + (i + 1) + ": " + df.format(timAllen));
		}
		
		fw.close();
	}
}
