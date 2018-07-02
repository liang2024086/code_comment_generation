package methodEmbedding.Standing_Ovation.S.LYD1771;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class StandingOvation {
	public static void main(String[] args) throws FileNotFoundException{
		File file = new File("output.txt");
		FileOutputStream fis = new FileOutputStream(file);
		PrintStream out = new PrintStream(fis);
		System.setOut(out);
		
		Scanner scan = new Scanner(System.in);
		int cases = Integer.parseInt(scan.nextLine());
		int currentCase = 1;
		for(int i = 0; i < cases; i++){
			String line = scan.nextLine();
			
			int currentNum = 0;
			int neededNum = 0;
			int currentLevel = 0;
			
			
			String[] sections = line.split(" ");
			int max = Integer.parseInt(sections[0]);
			
			String numbers = sections[1];
			
			for(int j = 0; j < numbers.length(); j++){
				int next = Integer.parseInt(numbers.substring(j, j+1));
				
				if(currentNum < currentLevel){
					if(j != 0)
					{
						neededNum+=currentLevel-currentNum;
						currentNum+=currentLevel-currentNum;
					}
					
				}
				currentNum+=next;
				currentLevel++;
				
			}
			System.out.println("Case #"+currentCase++ + ": "+neededNum);
			
		}
		
		
		
		
		scan.close();
	}
}
