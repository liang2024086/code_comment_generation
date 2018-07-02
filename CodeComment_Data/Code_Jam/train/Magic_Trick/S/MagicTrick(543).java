package methodEmbedding.Magic_Trick.S.LYD1864;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class MagicTrick {

	/**
	 * @author: Rajesh Kumar, IIIT Hyderabad
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		
		File inputFile = new File("D:\\input.txt");
		Scanner scanner = new Scanner(inputFile);
		
		File outputFile = new File("D:\\output.txt");
		PrintWriter printWriter = new PrintWriter(outputFile);
		
		int count = 0;
		int value = 0;
		
		int numberOfTestCases;
		
		int rowSelected1;
		int rowSelected2;
		
		int arrayDimension = 4;
		int[][] arrangement1 = new int[arrayDimension][arrayDimension];
		int[][] arrangement2 = new int[arrayDimension][arrayDimension];
		
		numberOfTestCases = Integer.parseInt(scanner.next());
		
		for (int tc = 1; tc <= numberOfTestCases; tc++) 
		{
			
		//int[] matchSelectedRows = {0,0,0,0};
		rowSelected1 = Integer.parseInt(scanner.next());
		
		
		for (int i = 0; i < arrayDimension; i++) 
		{
			for (int j = 0; j < arrayDimension; j++)
			{
				arrangement1[i][j] = Integer.parseInt(scanner.next());
			}
			
			
		}
		
		rowSelected2 = Integer.parseInt(scanner.next());
		
		
		for (int i = 0; i < arrayDimension; i++) 
		{
			for (int j = 0; j < arrayDimension; j++)
			{
				arrangement2[i][j] = Integer.parseInt(scanner.next());
			}
			
			
		}
		
		count = 0;
		for (int i = 0; i < arrayDimension; i++) 
		{
			for (int j = 0; j < arrayDimension; j++) 
			{
				if (arrangement1[rowSelected1-1][i] == arrangement2[rowSelected2-1][j])
				{
					count++;
					value = arrangement1[rowSelected1-1][i];
				}	
			}
		}
		
		printWriter.print("Case #"+ tc+": ");
		if (count == 0)
			printWriter.println("Volunteer cheated!");
		else
			if (count == 1)
				printWriter.println(value);
			else
				printWriter.println("Bad magician!");
		
	
		} //End Of Test Case
		
		scanner.close();
		printWriter.close();
		
		
		

	} //End of main

} //End of class
