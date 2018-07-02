package methodEmbedding.Cookie_Clicker_Alpha.S.LYD518;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;

public class Cookies {

	public static void main(String[] args) {
		try 
		{
			BufferedReader in = new BufferedReader(new FileReader("input1.in"));
			PrintWriter writer = new PrintWriter("output.txt", "UTF-8");
			String text = in.readLine();
			int cases = Integer.parseInt(text);
			DecimalFormat df = new DecimalFormat("#.0000000"); 
			for (int i = 0; i < cases; i++) 
			{
				String line = in.readLine();
				String[] data = line.split(" ");
				double cVal = Double.parseDouble(data[0]);
				double fVal = Double.parseDouble(data[1]);
				double xVal = Double.parseDouble(data[2]);
				double cookieInc = 2.0;
				double currentTime = 0;
				while (true)
				{
					if (xVal/cookieInc < cVal/cookieInc + xVal/(cookieInc+fVal)) {
						currentTime += xVal/cookieInc;
						break;
					}
					currentTime += cVal/cookieInc;
					cookieInc += fVal;
				}
				
				writer.println("Case #" + (i + 1) + ": " + df.format(currentTime));
			}
			in.close();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
