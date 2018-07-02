package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1244;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class CookieClickerAlpha {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(
				new FileInputStream("C:/B-small-attempt0.in")));
		int numCase = Integer.parseInt(br.readLine());
		String output[] = new String[numCase];
		DecimalFormat df = new DecimalFormat("#.0000000");
		
		for (int i = 0; i < numCase; i++) {
			String CXF[] = br.readLine().split(" ");
			double rate = 2;
			double timeTaken = 0;
			double minTime;
			double C = Double.parseDouble(CXF[0]);
			double X = Double.parseDouble(CXF[1]);
			double F = Double.parseDouble(CXF[2]);
			
			minTime = F/rate;
			
			while(true){
				timeTaken = timeTaken + C/rate;
				rate = rate + X;
				timeTaken = timeTaken + F/rate;
				if(timeTaken > minTime)
					break;
				else
					minTime = timeTaken;		
				timeTaken = timeTaken - F/rate;
			}
			output[i] = df.format(minTime);
			
		}
		
		for (int out = 0; out < numCase; out++)
			System.out.println("Case #" + (out + 1) + ": " + output[out]);
	}
}
