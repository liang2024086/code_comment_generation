package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1102;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;


public class Cookie {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader reader = new BufferedReader(new FileReader("B-small-attempt0.in"));
			BufferedWriter writer = new BufferedWriter(new FileWriter("output2.out"));
			
			int caseNum = Integer.parseInt(reader.readLine());
			
			for(int i = 1;i<= caseNum;i++){
				
				String row = reader.readLine();
				String[] items = row.split(" ");
				if(items.length <3){
					return ;
				}
				double farmcost = Double.parseDouble(items[0]);
				double rate = 2;
				double farmrate = Double.parseDouble(items[1]);
				double goal = Double.parseDouble(items[2]);
				
				double current = 0;
				double time = 0;
				
				double diff = goal - current;
				System.out.println(farmcost+"|"+farmrate+"|"+goal);
				while(diff > farmcost){
					diff -= farmcost;
					time +=farmcost/rate;
					double timeOld = diff/rate;
					double timeNew = (diff+farmcost)/(rate+farmrate);
					if(timeOld < timeNew){
						break;
					}
					else{
						diff += farmcost;
						rate+=farmrate;
						System.out.println("bought!");
					}
				}
				time+=diff/rate;
				
				
				writer.write("Case #"+i+": "+String.format("%.7f", time));
				
				writer.newLine();
			}
			
			
			reader.close();
			writer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberFormatException e){
			e.printStackTrace();
		}
		
	}

}
