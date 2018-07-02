package methodEmbedding.Cookie_Clicker_Alpha.S.LYD682;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.DecimalFormat;


public class CookieAlpha {

	public static void main(String[] args) {
		
		try{
			
			BufferedReader reader = new BufferedReader(new FileReader("B-small-attempt0.in"));
			BufferedWriter writer = new BufferedWriter(new FileWriter("problem2.out"));
			int T = Integer.parseInt(reader.readLine());
			double C,F,X;
			
			for(int t=0; t<T; t++){
				
				String[] line = reader.readLine().split(" ");
				C = Double.parseDouble(line[0]);
				F = Double.parseDouble(line[1]);
				X = Double.parseDouble(line[2]);
				
				double temp = (F * X) - (2*C) - (C*F);
				temp /= (F * C);
				int answer = (int) Math.ceil(temp);
				
				if(answer < 0)
					answer = 0;
				
				double time = X / (2+(answer*F));
				for(int i=0; i<answer; i++){
					
					time += C / (2 + (i*F));
					
				}
				
				DecimalFormat df = new DecimalFormat("#.#######");
		       // System.out.print(df.format(d));
				String ans = String.format("%.7f", time);
				writer.write("Case #"+(t+1)+": "+ans+"\n");
			}
			
			reader.close();
			writer.close();
			
		}catch(Exception ex){}
		

	}

}
