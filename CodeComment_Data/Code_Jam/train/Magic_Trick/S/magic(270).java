package methodEmbedding.Magic_Trick.S.LYD559;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


public class magic {

		public static void main(String[] args) {
		
		try{
			//insert file name
			String fileName = "A-small-attempt1";
			//turn on reader and writer
			BufferedReader reader = new BufferedReader(new FileReader(("/home/dustin/Downloads/"+fileName+".in")));
			PrintWriter writer = new PrintWriter(("/home/dustin/Downloads/"+fileName+".out"), "ASCII");
			//get number of cases
			int cases = Integer.parseInt(reader.readLine());
			//read file and put in list
			String line = null;
			List<String> lines = new ArrayList<String>();
			while((line = reader.readLine())!=null){
				lines.add(line);
				
			}
			//Algorithm
			int it = 1;
			for(int i = 0;i<cases*10;i+=10){
				String row1 = lines.get(i);
				String row2 = lines.get(i+5);
				String[] cards1 = lines.get(i+Integer.valueOf(row1)).split(" ", 4);
				String[] cards2 = lines.get(i+5+Integer.valueOf(row2)).split(" ", 4);
				String num = "Volunteer cheated!";
				boolean match = false;
				for(int r1 = 0; r1 < cards1.length; r1++){
					for(int r2 = 0; r2 < cards2.length; r2++){
						if(cards1[r1].equals(cards2[r2])){
							if(!match){
								num = cards1[r1];
								match = true;
							}
							else{
								num = "Bad magician!";
							}
						}
					}
				}
				//write to file
				writer.println("Case #"+it+": "+ num);
				it++;
				
				}
				
			
				
				
				
					
			
		//close reader and writer	
		reader.close();
		writer.close();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		 
		}
		
	}
		
		
