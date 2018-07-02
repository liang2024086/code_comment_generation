package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1523;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.StringTokenizer;


public class CookieClicker {
	public static void main(String[] args) {
		BufferedReader br = null;
		int tests = 0;		
		try {
			 
			String sCurrentLine;
			br = new BufferedReader(new FileReader("/Users/arnabsarkar/Documents/Docs/NYU/Sem2/test.txt"));
			if((sCurrentLine = br.readLine()) != null) {
				tests = Integer.parseInt(sCurrentLine);
			}
			for(int i = 0;i<tests;i++ ){				
				sCurrentLine = br.readLine();
				StringTokenizer st = new StringTokenizer(sCurrentLine);
				double c = Double.parseDouble(st.nextToken());
				double f = Double.parseDouble(st.nextToken());
				double x = Double.parseDouble(st.nextToken());
				double totalTime = 0, currentProd = 2;
				DecimalFormat format = new DecimalFormat("#0.0000000");
				while (x/currentProd > (c/currentProd) + x/(currentProd + f)) {										
					totalTime += c/currentProd;
					currentProd += f;
				}
				totalTime += x/currentProd;
				System.out.println("Case #" + (i+1) +": "+format.format(totalTime));
				
			}			 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}
