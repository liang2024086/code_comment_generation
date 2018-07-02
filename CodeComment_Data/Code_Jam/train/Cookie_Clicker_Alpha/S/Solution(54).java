package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1097;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.text.DecimalFormat;

public class Solution {
	public static void main(String[] args) {
		try{
			BufferedReader reader = new BufferedReader(new FileReader(new File("in.txt")));
			PrintWriter writer = new PrintWriter(new File("out.txt"));
			String s = reader.readLine();
			int total = Integer.parseInt(s.trim());
			for(int i = 0; i < total; i++){
				s = reader.readLine();
				String[] strs = s.split(" ");
				double C, F, X;
				C = Double.parseDouble(strs[0]);
				F = Double.parseDouble(strs[1]);
				X = Double.parseDouble(strs[2]);
				double constant = 2.0;
				double buyFarm = C / constant, curTime, nextTime = X / constant;
				int j = 1;
				do {
					curTime = nextTime;
					nextTime = buyFarm + X / (F * j + constant);
					buyFarm += C / (F * j + constant);
					j++;
				} while(nextTime < curTime);
				DecimalFormat df = new DecimalFormat("#.#######");
				System.out.println("Case #" + (i+1) + ": " + df.format(curTime));
				writer.println("Case #" + (i+1) + ": " + df.format(curTime));
			}
			
			writer.close();
			reader.close();
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	
}
