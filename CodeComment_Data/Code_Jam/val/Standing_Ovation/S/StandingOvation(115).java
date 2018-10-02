package methodEmbedding.Standing_Ovation.S.LYD2121;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.HashMap;
public class StandingOvation {
	public static void main(String[] args) throws IOException{
		String filename;
		String output;
		if (args.length < 2){
			System.out.println("No input/output file given");
			return;
		}
		else{
			filename = args[0]; //file we're reading from
			output = args[1]; //file we're reading to
		}
		FileInputStream fstream = new FileInputStream(filename);
		BufferedReader input = new BufferedReader(new InputStreamReader(fstream));
		PrintWriter outputFile = new PrintWriter(output, "UTF-8");
		int cases = Integer.parseInt(input.readLine()); //read number of cases first
		for(int i = 0; i < cases; i++){
			String[] params = input.readLine().split(" ");
			int[] shyness = new int[params[1].length()];
			for(int level = 0; level < params[1].length();level++){
				shyness[level] = params[1].charAt(level) - '0';
			}
			System.out.println(Arrays.toString(shyness));
			int standing = 0;
			int extra = 0;
			for(int level = 0; level < shyness.length; level++){
				while(standing < level){
					standing++; extra++;
				}
				standing += shyness[level];
			}
			outputFile.println("Case #"+(i+1)+": "+extra);
		}
		input.close();
		outputFile.close();
	}
}
