package methodEmbedding.Counting_Sheep.S.LYD906;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class solution {
	public static void main(String[] args) {
		
		Scanner s = new Scanner("");
		PrintWriter out;
		String line = new String("hi");
		int outLimit = 0;
		int outIndex = 0;
		int digit = 0;
		int check = 0;
		
		try {
			s = new Scanner(new File("/Users/samoor/Documents/workspace/CJQual1.1/src/A-small-attempt0.in.txt"));
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception occured "+ e);
		}
		line = s.nextLine();
		String[] output = new String[Integer.parseInt(line)];
		
		while(s.hasNext()){
			line = s.nextLine();
			int trials = 0;
			if(line.equals("0")){
				output[outIndex] = "Case #"+(outIndex+1) +": " +"INSOMNIA";
				outIndex ++;
			}else{
				check = 0;
				int x = Integer.parseInt(line);
				int m = x;
				while(check != 1023 && trials < 100){
					line = Integer.toString(x);
					for(int i = 0; i < line.length(); i++){
						digit = Character.getNumericValue(line.charAt(i));
						check = check | 1 << digit;
					}
					x = x + m;
				}
				if(trials >= 100){
					output[outIndex] = "Case #"+(outIndex+1) +": " +"INSOMNIA";
					outIndex++;
					trials = 0;
					digit = 0;
				}else{
					output[outIndex] = "Case #"+(outIndex+1) +": " +line;
					outIndex++;
					trials = 0;
					digit = 0;
				}
				
				
			}
		}
		
		try {
			out = new PrintWriter("output.txt");
			for(int i = 0; i < outIndex; i++){
				out.println(output[i]);
			}
			out.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception occured "+e);
		}
		
			
			
	
	
	}
}
