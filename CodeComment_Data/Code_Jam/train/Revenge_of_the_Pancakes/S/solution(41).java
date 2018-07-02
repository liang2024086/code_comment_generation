package methodEmbedding.Revenge_of_the_Pancakes.S.LYD235;

import java.io.File;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

public class solution {
	public static void main(String[] args) {
		Scanner s = new Scanner("");
		PrintWriter out;
		String line = new String("hi");
		String[] output = new String[100];
		int outLimit = 0;
		int outIndex = 0;
		int flipCount = 0;
		boolean invertedFlag = false;
		try {
			s = new Scanner(new File("/Users/samoor/Documents/workspace/CJQual1.2/src/B-small-attempt0.in.txt"));
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception occured "+ e);
		}
		line = s.nextLine();
		outLimit = Integer.parseInt(line);
		char[] arr = new char[outLimit];
		while(s.hasNext()){
			line = s.nextLine();
			if(line.contains("-")){
				arr = line.toCharArray();
				char x = arr[0];
				for(int i = 1; i < arr.length ; i++){
					if(arr[i] != x){
						flipCount ++;
						x = arr[i];
					}
				}
				if( x == '-')flipCount ++;
			}
			output[outIndex] = "Case #"+(outIndex+1) +": " +flipCount;
			flipCount = 0;
			outIndex ++;
		}
		
		try {
			out = new PrintWriter("output.txt");
			for(int i = 0; i < outLimit; i++){
				out.println(output[i]);
			}
			out.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception occured "+e);
		}		
	}
	
}
