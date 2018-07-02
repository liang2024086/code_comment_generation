package methodEmbedding.Cookie_Clicker_Alpha.S.LYD454;

import java.io.*;
import java.util.*;
public class CookieClickerAlpha {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader k=new BufferedReader(new FileReader("input.txt"));
		PrintWriter out = new PrintWriter(new FileWriter("output2.txt"));
		
		int test = Integer.parseInt(k.readLine());
		
		for (int i = 1; i <= test; i++) {
			
			StringTokenizer str=new StringTokenizer(k.readLine());
			double buyFarm = Double.parseDouble(str.nextToken());
			double Increase = Double.parseDouble(str.nextToken());
			double wanted = Double.parseDouble(str.nextToken());
			double curTime = 0;
			double intialIncrease = 2;
			double cookie = 0;
			while (true) {
				
				double notbuy = (wanted - cookie) / intialIncrease;
				
				double buy = (buyFarm / intialIncrease);
				buy +=(wanted / (intialIncrease + Increase));
				if (notbuy <= buy) {
					curTime += notbuy;
					break;
				}
				
				curTime += (buy - (wanted / (intialIncrease + Increase)));
				intialIncrease += Increase; 
				
				
			}
			
			
			
			out.println("Case #"+i+": "+curTime);
			
		}
		out.close();
		
	}

}
