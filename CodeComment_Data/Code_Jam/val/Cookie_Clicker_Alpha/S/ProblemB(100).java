package methodEmbedding.Cookie_Clicker_Alpha.S.LYD667;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class ProblemB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;
		
		try {
			String currentLine = null;
			br = new BufferedReader(new FileReader("C:\\Users\\Eddy\\Downloads\\B-small-attempt0.in"));
		
			int nCase = 0;
			
			nCase = Integer.parseInt(br.readLine());
			
			for(int n = 1; n <= nCase; n++) {
				double totalTime = 0.0;
				double currentRate = 2.0;
				
				currentLine = br.readLine();
				String[] parts = currentLine.split(" ");
				
				double cost = Double.parseDouble(parts[0]);
				double rate = Double.parseDouble(parts[1]);
				double max = Double.parseDouble(parts[2]);
				
				double t1, t2;
				
				while(true) {
					t1 = (max/currentRate);
					t2 = (max/(currentRate + rate)) + (cost/currentRate);
					
					//System.out.println(t1 + " " + t2);
					
					//if waiting is faster
					if(t1 <= t2) {
						totalTime += t1;
						break;
					}
					
					//totalTime to buy new farm
					totalTime += (cost/currentRate);
					
					//increase rate
					currentRate += rate;
				}
				
				DecimalFormat df = new DecimalFormat("#.0000000");
				System.out.println("Case #" + n + ": " + df.format(totalTime))	;
			}
			
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
