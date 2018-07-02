package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1492;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class CookieClicker {
	
	
	
	public static void main(String[] args) {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader("input.txt"));
			PrintWriter writer = new PrintWriter("output.txt");
			int ncases = Integer.parseInt(reader.readLine());
			for(int i = 1; i<= ncases ; i++){
				String[] cases = reader.readLine().split(" ");
				double price = Double.parseDouble(cases[0]);
				double augment = Double.parseDouble(cases[1]);
				double goal =Double.parseDouble(cases[2]);
				
				double cps = 2.0;
				double time = 0;
				double answer = goal/cps;
				double oldanswer = 999999999999.0;
					
				while(answer < oldanswer){
					oldanswer = answer;
					time += price/cps;
					cps += augment;
					answer = (time+(goal/cps));
				}
				
				
				writer.println("Case #"+i+": "+ oldanswer);
			}
			reader.close();
			writer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
