package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1169;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.StringTokenizer;


public class CookieClickerAlpha {

	
	
	
	
	public static void main(String[]args) throws NumberFormatException, IOException{
		
		BufferedReader r = new BufferedReader(new FileReader("input.in"));
		//BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat frmt = new DecimalFormat("0.0000000");
		PrintWriter out=new PrintWriter(new FileWriter("CookieClickerAlpha.out"));
		
		int tests = Integer.parseInt(r.readLine())+1;
		for(int t = 1 ; t <tests ; t++){
			StringTokenizer tkn = new StringTokenizer(r.readLine());
			double C  = Double.parseDouble(tkn.nextToken());
			double F = Double.parseDouble(tkn.nextToken());
			double X = Double.parseDouble(tkn.nextToken());
			double max = X/2.0;
			double ac = 0;
		for(double i = 2.0;i<=200000 ; i=i+F){
			
			
			
			//System.out.println(X/(i+0.0));
			max = Math.min(max, ac+(X/(i+0.0)));
			ac = ac+C/i;
			
			
			
			
			
		}
		
		out.println("Case #"+t+": "+frmt.format(max));	
		
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		out.flush();
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
