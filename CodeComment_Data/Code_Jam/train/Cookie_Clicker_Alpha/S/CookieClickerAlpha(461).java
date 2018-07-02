package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1176;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.text.DecimalFormat;


public class CookieClickerAlpha {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(7);
		
		String filename = "B-small-attempt0.in";
		String line = null;
		
		try {
			FileInputStream fis = new FileInputStream(filename);
			DataInputStream dis = new DataInputStream(fis);
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(dis));
			FileWriter filewriter = new FileWriter("B-small-attempt0.txt");
			BufferedWriter bufferedwriter = new BufferedWriter(filewriter);
			
			line = bufferedReader.readLine();
			int numOfTestCase = Integer.parseInt(line);
			int currentTestCase = 1;
			double C;									// C cookies to buy a farm
			double F;									// extra F cookies after buying a farm
			double X;									// X cookies to stop the game
			double cookieGenerator 	= (double) 2;		// basic rate of cookie generated
			double timebeforebuying 	= (double) 0;
			double timetobuyfarm 	= (double) 0;
			double timeafterbuying 	= (double) 0;
			
			while (currentTestCase <= numOfTestCase) {
				bufferedwriter.write("Case #" + currentTestCase + ": ");
				
				String data = bufferedReader.readLine();
				String[] token = data.split(" ");
				C = Float.parseFloat(token[0]);
				F = Float.parseFloat(token[1]);
				X = Float.parseFloat(token[2]);
				
				timebeforebuying	= (double) X / cookieGenerator;
				timetobuyfarm		= (double) C / cookieGenerator;
				cookieGenerator		= (double) cookieGenerator + F;
				timeafterbuying		= (double) X / (cookieGenerator) + timetobuyfarm;	

				while (timeafterbuying < timebeforebuying) {
					timebeforebuying	= (double) timeafterbuying;
					timetobuyfarm		= (double) timetobuyfarm + C / cookieGenerator;
					cookieGenerator		= (double) cookieGenerator + F;
					timeafterbuying		= (double) X / (cookieGenerator) + timetobuyfarm;
				}

				bufferedwriter.write(df.format((double)timebeforebuying));
				bufferedwriter.newLine();
				currentTestCase++;
				timebeforebuying	= (double) 0;
				timetobuyfarm		= (double) 0;
				cookieGenerator		= (double) 2;
				timeafterbuying		= (double) 0;
			}
			
			bufferedwriter.close();
	} catch (Exception e) {
		System.err.println("Error: " + e.getMessage());
	} 

	}

}
