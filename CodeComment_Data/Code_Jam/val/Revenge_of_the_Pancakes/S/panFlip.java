package methodEmbedding.Revenge_of_the_Pancakes.S.LYD359;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class panFlip {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		File file = new File("B-small-attempt0.in");
		//System.err.println(file.getAbsolutePath());
		Scanner inFile = new Scanner(file);
		
		int lines = Integer.parseInt(inFile.nextLine());
		PrintWriter pw = new PrintWriter("outputPanFlip.txt");
		int counter = 0;
		
		for(int i =1; i <= lines; i++){
			counter = 0;
			char[] input = inFile.nextLine().toCharArray();
			if(input[input.length-1] == '-'){
				counter++;
			}
			
			for(int j=input.length-1; j>0; j--){
				
				if(input[j] != input[j-1]){
					System.out.println(input[j] + " " + input[j-1]);
					counter++;
				}
					
			}
			
			System.out.println("CASE# " + counter);
			
			pw.println("Case #" + i + ": " + counter);
		}
		pw.close();
		inFile.close();
		
	}

}
