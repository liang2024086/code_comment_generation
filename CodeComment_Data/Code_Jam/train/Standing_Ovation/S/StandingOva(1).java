package methodEmbedding.Standing_Ovation.S.LYD1591;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;


public class StandingOva {

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException{
		String filename = "A-small-attempt0.in";
		File myFile = new File(filename);
		Scanner input = new Scanner(myFile);
		PrintWriter writer = new PrintWriter("output.txt", "UTF-8");
		
		int standing=0;
		int peopleNeeded =0;
		int maxShy=0;
		int testcases;
		String temp;
		int temp2;
		
		temp = input.nextLine();
		temp = temp.trim();
		testcases = Integer.parseInt(temp);
		
		
		
		for(int i =0;i<testcases;i++){
			temp = input.nextLine();
			temp = temp.trim();
			String[] parts = temp.split("(?!^)\\s");
			temp2 = Integer.parseInt(parts[1]);
			
			maxShy = Integer.parseInt(parts[0]);
			int[] shyness = new int[parts[1].length()];
			
			for(int j =parts[1].length()-1;j>-1;j--){
				shyness[j] = temp2 % 10;
				temp2 = temp2 / 10;
			}
			for(int p = 0; p< shyness.length;p++){
				while(standing<p){
					peopleNeeded++;
					standing++;
				}
				
				standing += shyness[p];
			}
			
			
			writer.println("Case #"+(i+1)+ ": " +peopleNeeded);
			standing =0;
			peopleNeeded = 0;
		}
		
		writer.close();
		input.close();
	}
}
