package methodEmbedding.Standing_Ovation.S.LYD2037;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ProblemA {

	public static void main(String[] args) {
		File file = new File("A-small-attempt0.in");
		try {
			Scanner input = new Scanner(new FileInputStream(file));
			int cases;
			cases = input.nextInt();
			
			int answer[] = new int[cases];

			for(int i = 0; i < cases; i++){
				int maxlv = input.nextInt();
				
				int line[] = new int[maxlv+1];
				
				String arrayString = input.next();
				
				int curClaps = 0;
				int addition = 0;
				int cur_addition = 0;
				int j = 0;
				
				for(j = 0; j <= maxlv; j++)
					line[j] = arrayString.charAt(j)-48;
				
				for(j = 0; j <= maxlv; j++){
					cur_addition = 0;
					if(j > curClaps){
						cur_addition = j - curClaps;
						addition += cur_addition;
					}
					curClaps += line[j] + cur_addition;
				}
				
				answer[i] = addition;	
			}
			
//			for(int i = 0; i < cases; i++){
//				System.out.println("Case #" + (i+1) + ": " + answer[i]);
//			}
//			
			FileWriter fw = new FileWriter("out.txt");
			 
			for (int i = 0; i <cases; i++) {
				fw.write("Case #" + (i+1) + ": " + answer[i] +"\n");
			}
		 
			fw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
