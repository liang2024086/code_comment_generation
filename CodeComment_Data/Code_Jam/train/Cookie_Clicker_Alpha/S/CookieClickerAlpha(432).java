package methodEmbedding.Cookie_Clicker_Alpha.S.LYD491;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class CookieClickerAlpha {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("cookie.in"));
		FileWriter out = new FileWriter(new File("cookie.out"));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int Z = new Integer(st.nextToken());
		
		for(int z = 1; z <= Z; z++)
		{
			System.out.print("Case #" + z + ": ");
			
			st = new StringTokenizer(br.readLine());
			double C = Double.parseDouble(st.nextToken());
			double F = Double.parseDouble(st.nextToken());
			double goal = Double.parseDouble(st.nextToken());
			
			int numFarms = 0;
			double time = 0.0;
			
			while(true)
			{
				time += C/(2 + F*numFarms);
				double timeBuy = goal / (2.0 + F*(numFarms + 1));
				double timeNoBuy = (goal - C) / (2 + F* numFarms);
				
				if(timeBuy < timeNoBuy)
					numFarms++;
				else
				{
					time += timeNoBuy;
					break;
				}
			}
			
			System.out.println(time);
		}
	}


}
