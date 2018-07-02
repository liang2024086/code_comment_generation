package methodEmbedding.Magic_Trick.S.LYD590;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;


public class EvilMagician {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length < 1){
			System.out.println("Incorrect arguments! Correct usage : java EvilMagician <filepath>");
			return;
		}
		BufferedReader reader = null;
		BufferedWriter writer = null;
		try{
			reader = new BufferedReader(new FileReader(args[0]));
			writer = new BufferedWriter(new FileWriter("output.txt"));
			int cases = Integer.parseInt(reader.readLine());
			
			for(int i = 0; i < cases; i++){
				int row1 = Integer.parseInt(reader.readLine());
				HashSet<Integer> numbers = new HashSet<Integer>();
				for(int j = 0; j < 4; j++){
					String line = reader.readLine();
					if(j+1 == row1){
						for(String s : line.split(" "))
							numbers.add(Integer.parseInt(s));
					}									
				}
				
				boolean flag = false, badMagician = false;
				int row2 = Integer.parseInt(reader.readLine());
				int num = -1;
				for(int j = 0; j < 4; j++){
					String line = reader.readLine();
					if(j+1 == row2){
						
						for(String s : line.split(" ")){
							if(numbers.contains(Integer.parseInt(s))){
								numbers.remove(Integer.parseInt(s));
								if(flag)
									badMagician = true;
								else{
									flag = true;
									num = Integer.parseInt(s);
								}
							}
						}
					}									
				}
				
				if(badMagician)
					writer.write("Case #"+(i+1)+": Bad magician!\n");
				else if(flag)
					writer.write("Case #"+(i+1)+": "+num+"\n");
				else
					writer.write("Case #"+(i+1)+": Volunteer cheated!\n");
				
			}
			
			reader.close();
			writer.close();
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
		
	}

}
