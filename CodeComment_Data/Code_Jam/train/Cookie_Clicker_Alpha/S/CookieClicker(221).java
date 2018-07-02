package methodEmbedding.Cookie_Clicker_Alpha.S.LYD886;

import java.io.*;
import java.text.*;

public class CookieClicker {

	public static void main(String[] args) {
		// Set up files
		File file = new File("input.txt");
		File outfile = new File("output.txt");
		if(!file.exists()) {
			System.err.println("File doesn't exist!");
			return;
		}
		// Set up data
		int T;
		double C, F, X;
		double cookiesPerSecond;
		
		// Set up output format
		DecimalFormat format = new DecimalFormat("0.0000000");
		
		try {
			// Set up streams
			BufferedReader fin = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
			BufferedWriter fout = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outfile)));
			
			String line = fin.readLine();
			T = Integer.parseInt(line.trim());
			
			for(int caseNum=0; caseNum<T; ++caseNum) {
				line = fin.readLine();
				String[] vals = line.split(" ");
				C = Double.parseDouble(vals[0]);
				F = Double.parseDouble(vals[1]);
				X = Double.parseDouble(vals[2]);
				cookiesPerSecond = 2.0;
				double minTime = X/cookiesPerSecond;
				
				int numFarms = 1; // Try buying one farm
				double altTime = C/2;
				cookiesPerSecond += F;
				altTime += X/cookiesPerSecond;
				while(altTime < minTime) {
					minTime = altTime;
					cookiesPerSecond = 2;
					++numFarms;
					altTime = 0;
					for(int i=0; i<numFarms; ++i) {
						altTime += C/cookiesPerSecond;
						cookiesPerSecond += F;
					}
					altTime += X/cookiesPerSecond;
				}
				
				System.out.println("Case #" + (caseNum+1) + ": " + format.format(minTime));
				fout.write("Case #" + (caseNum+1) + ": " + format.format(minTime) + "\n");
			}
			
			// Clean up streams
			fin.close();
			fout.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}		

	}

}
