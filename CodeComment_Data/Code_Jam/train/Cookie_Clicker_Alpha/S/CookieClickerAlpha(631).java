package methodEmbedding.Cookie_Clicker_Alpha.S.LYD722;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.LinkedList;

public class CookieClickerAlpha {

	public static void main(String[] args) {
		DecimalFormat format = new DecimalFormat("0.0000000");
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("in"));
			BufferedWriter bw = new BufferedWriter(new FileWriter("out"));

			int tests = Integer.parseInt(br.readLine());

			for (int i = 0; i < tests; ++i) {
				String[] tokens = br.readLine().split(" ");
				double c = Double.parseDouble(tokens[0]);
				double f = Double.parseDouble(tokens[1]);
				double x = Double.parseDouble(tokens[2]);
				double rate = 2.0d;
				double time = 0.0d;
				double cookies = 0.0d;
				
				while(cookies != x) {
					// Go to the time you can afford a farm?
					double ttnf = c / rate;
					double ttx = x /rate;
					if(ttnf < ttx) {
						// Go to this time.
						time += ttnf;
						cookies = c;
					} else {
						time += ttx;
						cookies = x;
						continue;
					}
					
					// Should a farm be bought?
					if((x / (rate + f) < ((x - cookies) / rate)))
					{
						// Buy a farm
						cookies = 0.0d;
						rate += f;						
					}
					else
					{
						ttx = (x - cookies) / rate;
						time += ttx;
						cookies = x;
					}					
				}
				
				bw.write("Case #" + Integer.toString(i + 1) + ": " + format.format(time) + "\n");
			} 
			
			br.close();
			bw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
