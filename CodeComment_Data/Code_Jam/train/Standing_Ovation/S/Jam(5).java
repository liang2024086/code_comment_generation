package methodEmbedding.Standing_Ovation.S.LYD2083;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;


public class Jam {

	public static void main(String[] args) throws IOException{
		FileReader in = new FileReader("src/A-small-attempt2.in");
		BufferedReader br = new BufferedReader(in);
		int T = Integer.parseInt(br.readLine());
				 
		File file = new File("src/output.txt");

		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);

		System.out.println("Done");
		
		for(int i = 0; i < T; i++){
			String str = br.readLine();
			String[] split = str.split(" ");
			char[] nums = split[1].toCharArray();
			int total = 0;
			int count = 0;
			for(int j = 0; j < nums.length; j++){
				if (j > total){
					count = count + (j-total);
					total = total + (j-total) + Character.getNumericValue(nums[j]);
				}
				else{
					total = total + Character.getNumericValue(nums[j]);
				}
			}
			bw.write("Case #" + Integer.toString(i+1) + ": "+ Integer.toString(count));
			bw.newLine();
		}
		in.close();
		bw.close();
	}
    
}
