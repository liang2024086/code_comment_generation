package methodEmbedding.Cookie_Clicker_Alpha.S.LYD174;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class cookie {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new FileReader (new File ("Input.in")));
		
		BufferedWriter output = new BufferedWriter(new FileWriter(new File ("Output.txt")));
		
		int n = Integer.parseInt(input.readLine());
		for (int i = 1;i <= n; i++){
			output.write("Case #" + i + ": ");
		
			String[] CFX = input.readLine().split(" ");
			double cookiePerFarm = Double.parseDouble(CFX[0]);
			double extraCookies = Double.parseDouble(CFX[1]);
			double maxCookies = Double.parseDouble(CFX[2]);
			double cookieCount = 0;
			double time = 0;
			double timeToWait;
			double timeToBuy;
			double cookiePerSecond = 2;
			while (cookieCount < maxCookies){
				timeToWait = (maxCookies-cookieCount)/cookiePerSecond;
				
				timeToBuy = (cookiePerFarm-cookieCount)/cookiePerSecond + 
						(maxCookies-cookieCount)/(cookiePerSecond + extraCookies);
				
				if (timeToWait < timeToBuy){
					time += timeToWait;
					break;
				}
				
				else {
					time += (cookiePerFarm-cookieCount)/cookiePerSecond;
					cookiePerSecond += extraCookies;
				}
			}
			output.write(String.valueOf(time));
			output.newLine();
				
			
		
		
		
		}
		input.close();
		output.close();
	}

}
