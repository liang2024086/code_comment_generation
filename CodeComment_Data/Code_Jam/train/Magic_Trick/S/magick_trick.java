package methodEmbedding.Magic_Trick.S.LYD1769;

import java.io.*;
import java.util.*;
import java.text.*;

public class magick_trick {
	
	public static int COLUMNS = 4;
	
	public static void main(String[] args)throws FileNotFoundException{
	int T, selected_row, found;
	String[] posibles;
	String result = "";
	
	try{		
		BufferedReader br = new BufferedReader(new FileReader("input.txt"));
		String line;
		T = Integer.parseInt(br.readLine());
		
		for(int j = 1; j <= T; j++){
			found = 0;
			line = br.readLine();
			selected_row = Integer.parseInt(line);
			for(int i = 1; i < selected_row; i++)
				br.readLine();
			
			line = br.readLine();
			posibles = line.split(" ");

			for(int i = selected_row; i < COLUMNS; i++)
				br.readLine();
			
			line = br.readLine();
			selected_row = Integer.parseInt(line);

			for(int i = 1; i < selected_row; i++)
				br.readLine();
			
			line = br.readLine();
			String[] nums = line.split(" ");

			for(int i = 0; i < COLUMNS; i++){
				if(Arrays.asList(posibles).contains(nums[i])){
					found++;
					result = nums[i];
				}
			}
			
			for(int i = selected_row; i < COLUMNS; i++)
				br.readLine();
			
			System.out.print("Case #" + j + ": ");
			if(found == 1)
				System.out.println(result);
			else if(found > 1)
				System.out.println("Bad magician!");
			else
				System.out.println("Volunteer cheated!");
		}
		br.close();
	}catch(Exception ex){}
	finally {		
	}		
}
}
