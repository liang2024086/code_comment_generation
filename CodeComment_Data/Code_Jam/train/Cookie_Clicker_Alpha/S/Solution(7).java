package methodEmbedding.Cookie_Clicker_Alpha.S.LYD410;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Solution {
	
	private Solution(){}
	
	public static void main(String[] args) throws IOException{
		String file = "C:/zfeng/B-small-attempt1.in";
		String output = "C:/zfeng/B-small-attempt1.out";
		BufferedReader content =  new BufferedReader(new FileReader(file));	
		PrintWriter outputFile = new PrintWriter(new FileWriter(output));
		
		int num_cases = Integer.parseInt( content.readLine() );
		
		for( int i = 1; i<=num_cases; i++ ){
			String dataRow = content.readLine();
			String[] dataArray = dataRow.split(" ");
			double C = Double.parseDouble( dataArray[0] );
			double F = Double.parseDouble( dataArray[1] );
			double X = Double.parseDouble( dataArray[2] );
			
			double threshold = F/C*X - F;
			double cookies = 2;			
			double time = 0;
			
			while(cookies < threshold){				
				time += C/cookies;
				cookies += F;
			}
			
			time += X/cookies;
			outputFile.println( "Case #"+i+": " + time);
		}
		
		content.close();
		outputFile.close();		
	}
	
	
}
