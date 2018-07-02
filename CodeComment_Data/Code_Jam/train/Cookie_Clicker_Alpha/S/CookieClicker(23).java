package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1638;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;


public class CookieClicker {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader in = new BufferedReader(new FileReader("b-small-attempt0.in"));
		
		int N = Integer.parseInt(in.readLine());
		double cookies = 0.0, rate = 2.0;
		double CFX[] = new double[3];
		String[] temp = new String[3];
		DecimalFormat df = new DecimalFormat(".#######");
		
		for (int i=0; i<N; i++){
			cookies = 0.0;
			rate = 2.0;
			
			temp = in.readLine().split(" ");
			for(int j=0; j<3; j++){
				CFX[j] = Double.parseDouble(temp[j]);
			}
			
			double time = 0, currentTime = 0, nextTime = 0, timeToNextUpgrade = 0;
			while (cookies < CFX[2]){
				timeToNextUpgrade = (CFX[0] - cookies) / rate;
				currentTime = (CFX[2] - cookies) / rate;
				nextTime = timeToNextUpgrade + ((CFX[2] - cookies) / (rate + CFX[1]));
				
				if (currentTime > nextTime){
					time += timeToNextUpgrade;
					rate += CFX[1];
				}
				else{
					time += currentTime;
					cookies += CFX[2];//rate * currentTime;
				}
			}
			
			System.out.println("Case #" + (i+1) + ": " + df.format(time));
			
		}
	}
}
