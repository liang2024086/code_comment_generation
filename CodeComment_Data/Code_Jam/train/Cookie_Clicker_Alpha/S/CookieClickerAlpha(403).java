package methodEmbedding.Cookie_Clicker_Alpha.S.LYD324;

import java.io.*;
import java.util.*;

public class CookieClickerAlpha {

	public static void main(String[] args) throws IOException, UnsupportedEncodingException {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		PrintWriter writer = new PrintWriter("CookieClickerAlpha.txt", "UTF-8");

		int numCase = 1;
		
		for(int t = scan.nextInt();t > 0; t--){
		
		double numCookies = 0;
		double CPro = 2;
		double CF = scan.nextDouble();
		double FPro = scan.nextDouble();
		double max = scan.nextDouble();
		double TimeTotal = 0.0000000;
		double timeOld = 0;
		while(numCookies < max){
			double timeA = TimeTotal;
			double timeB = timeA;
			if(timeOld == 0){
				timeOld = 100000000;
			}
			timeB += (max/CPro);
			
			//writer.println(timeB + " : " + timeOld);
			if(timeB < timeOld){
			
			double time = (CF/CPro); 
			numCookies += ((time*CPro) - CF);
			TimeTotal += time;
			CPro += FPro;
			
			}
			else{
				
				TimeTotal = timeOld;
				numCookies = max;
				//break;
			}
			timeOld = timeB;
		}
		
		writer.println("Case #" + numCase + ": " + TimeTotal);
		numCase++;
		}
		
		
		writer.close();
	}

}
