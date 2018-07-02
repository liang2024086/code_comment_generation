package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1595;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class Cookie {
	private static final String fileIn = "/Users/sasank/Downloads/B-small-attempt0.in";

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new FileReader(fileIn));
		
		int T = Integer.parseInt(br.readLine());//# test cases
		for(int i = 1 ; i <= T; i++){			
			StringTokenizer sr = new StringTokenizer(br.readLine());
			double C = Double.parseDouble(sr.nextToken());
			double F = Double.parseDouble(sr.nextToken());
			double X = Double.parseDouble(sr.nextToken());
			
			double time = 0, total_cookies = 0, current_rate = 2;
			
			while(total_cookies < X){
				double timeFarmBuy = X/(current_rate + F) + C/current_rate;
				double timeWithoutFarm = X/(current_rate);
				if(timeFarmBuy < timeWithoutFarm){
					time += C/current_rate;
					total_cookies = 0;
					current_rate += F;
				} else{
					time += X/current_rate;
					total_cookies += X;
				}
			}
			
			System.out.println("Case #" + i + ": " + time);
		}
	}

}
