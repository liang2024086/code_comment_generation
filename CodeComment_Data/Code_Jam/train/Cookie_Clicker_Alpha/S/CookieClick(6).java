package methodEmbedding.Cookie_Clicker_Alpha.S.LYD933;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



public class CookieClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length < 1){
			System.out.println("Incorrect arguments! Correct usage : java CookieClick <filepath>");
			return;
		}
		BufferedReader reader = null;
		BufferedWriter writer = null;
		try{
			reader = new BufferedReader(new FileReader(args[0]));
			writer = new BufferedWriter(new FileWriter("output.txt"));
			int cases = Integer.parseInt(reader.readLine());
			
			for(int i = 0; i < cases; i++){
				
				String[] words = reader.readLine().split(" ");
				double C = Double.parseDouble(words[0]);
				double F = Double.parseDouble(words[1]);
				double X = Double.parseDouble(words[2]);
				
				double time = 0.0;
				double curRate = 2.0;
				while(true){
					// Time to reach cookie goal at current pace
					double t1 = (X) / curRate;
					// Time to buy a farm and reach cookie goal
					double t2 = ((C)/ curRate) + X / (curRate + F);
					
					if(t1 < t2){
						time += t1;
						break;
					}
					else {
						time += (C) / curRate;
						curRate += F;						
					}
					
				}

				writer.write("Case #"+(i+1)+": "+time+"\n");
				
			}
			
			reader.close();
			writer.close();
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
		
	}

}
