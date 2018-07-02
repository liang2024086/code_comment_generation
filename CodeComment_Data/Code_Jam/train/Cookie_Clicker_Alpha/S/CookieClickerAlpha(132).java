package methodEmbedding.Cookie_Clicker_Alpha.S.LYD575;

import java.io.*;
import java.util.*;

public class CookieClickerAlpha  {
		public static void main(String args[]) throws Exception{
			
			File file = new File("/Users/JinHao/Desktop/B-small-attempt0.in");
			BufferedReader br = new BufferedReader(new FileReader(file));
			int T = Integer.parseInt(br.readLine());
			int count = 1;
			while ( count <= T ){
				
				//Init Start---
				String temp=br.readLine();
				Double c= Double.parseDouble(	temp.split(" ")[0]);
				Double f= Double.parseDouble(	temp.split(" ")[1]);
				Double x= Double.parseDouble(	temp.split(" ")[2]);
				//Init End----
				double currentRate = 2.0d;
				int currentFarm = 0;
				double result = Float.MAX_VALUE;
				int FarmNumber=0;
				while(true) {
					
					double tempResult = 0.0d;
					tempResult = x/(2+FarmNumber*f);
					
					for (int i = 0; i < FarmNumber ; i++){
						tempResult += c/(2+i*f);
					}
					if (tempResult<result) result = tempResult;
					if (tempResult>result) break;
					FarmNumber++;
			}
				System.out.format("Case #%d: %.7f\n", count,result);
				count++;
			}
			
			
		}

}
