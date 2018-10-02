package methodEmbedding.Counting_Sheep.S.LYD894;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * Solution to 2016 code jam qualification problem 1.
 */

public class CountingSheep {
	
	public static void main(String[] args) {
		
		if(args.length == 0) {
			
			System.out.println("No arguments provided");
			return;
			
		}
		
		try {
			
			File file = new File(args[0]);
			Scanner input = new Scanner(file);
			FileWriter fileOut = new FileWriter("output.txt");
			BufferedWriter writer = new BufferedWriter(fileOut);
			
			int numTestCases = input.nextInt();
			
			int i;
			
			for(i = 0; i < numTestCases; i++) {
				
				//Read in n
				int n = input.nextInt();
				
				if(n == 0) {
					
					writer.write("Case #" + (i+1) + ": " + "INSOMNIA" + "\n");
					
				} else {
				
					//Set up the boolean array for each digit, and the count of digits seen
					boolean[] digitsSeen = new boolean[10]; //Java auto initialises to false
					
					int numDifferentDigitsSeen = 0;
					double multiplier = 1;
					
					while(numDifferentDigitsSeen != 10) {
						
						//Add all the digits of n*multiplier
						double currentNumber = multiplier * n;
						
						System.out.println("CurrentNumber: " + currentNumber);
						
						while(currentNumber >= 1) {
							
							int nextDigit = (int) (currentNumber%10);
							
							System.out.println(nextDigit);
							
							if(!digitsSeen[nextDigit]) {
								
								numDifferentDigitsSeen++;
								digitsSeen[nextDigit] = true;
								
							}
							
							currentNumber = currentNumber/10;
							
						}
						
						multiplier++;
						
					}
					
					multiplier--;
					int finalNumber = (int) (n*multiplier);
					
					writer.write("Case #" + (i+1) + ": " + finalNumber + "\n");
					
				}					
				
			}
			
			writer.close();
			fileOut.close();
			input.close();
			
		} catch(FileNotFoundException e) {
			
			System.out.println("Error reading input file");
			
		} catch(IOException e) {
			
			System.out.println("Error writing output");
			
		}
		
	}

}
