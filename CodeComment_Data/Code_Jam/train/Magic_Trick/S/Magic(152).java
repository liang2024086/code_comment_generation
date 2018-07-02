package methodEmbedding.Magic_Trick.S.LYD1323;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;


public class Magic {
	public static void main(String [] args) throws NumberFormatException, IOException{
		BufferedReader reader = new BufferedReader(new FileReader(new File("A-small.in")));
		PrintWriter writer = new PrintWriter("output.txt", "UTF-8");
		
		int testCases = Integer.parseInt(reader.readLine());

		for(int x = 0;x < testCases;x++){

			
			ArrayList<String> numbers = new ArrayList<String>();
			int first = Integer.parseInt(reader.readLine()) - 1;
			int index = 0;
			int count = 0;
			while(count < 4){
				
				if(first == count){
					String [] num = reader.readLine().split("\\s+");
					numbers.add(num[0]);
					numbers.add(num[1]);
					numbers.add(num[2]);
					numbers.add(num[3]);
					for(String s : num)
						System.out.print(s + ", ");
					System.out.println();
				}
				else{
					reader.readLine();
				}
				count++;
			}
			int second = Integer.parseInt(reader.readLine()) - 1;
			count = 0;
			String found = "";
			int numFound = 0;
			while(count < 4){
				
				if(count == second){
					
					String [] num = reader.readLine().split("\\s+");
					for(String s : num){
						System.out.print(s + ",");
						if(numbers.contains(s)){
							numFound++;
							found = s;
						}
					}
					System.out.println();
				}
				else{
					reader.readLine();
				}
				count++;
			}
			if(numFound == 0){
				writer.println("Case #" + (x+1) + ": Volunteer cheated!");
			}
			else if(numFound == 1){
				writer.println("Case #" + (x+1) + ": " + found);
			}
			else{
				writer.println("Case #" + (x+1) + ": Bad magician!");
			}
		}
		reader.close();
		writer.close();
	}
}
