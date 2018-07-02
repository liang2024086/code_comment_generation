package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1463;

import java.io.*;
import java.util.ArrayList;
public class CookieClicker {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//System.out.println("Hello");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int total = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= total; i++){
			String[] input = br.readLine().split(" ");
			
			double rate = 2.0;
			double time = 0.0;
			double C = Double.parseDouble(input[0]);
			double F = Double.parseDouble(input[1]);
			double X = Double.parseDouble(input[2]);
			
			while(true){
				double duration1 = X/rate;
				double duration2 = C/rate + X/(F+rate);
				if(duration2 > duration1){
					break;
				}else{
					time += C/rate;
					rate += F;
				}
			}
			time += X/rate;
			System.out.printf("Case #%d: %.7f\n",i,time);
		}		
	}
}
