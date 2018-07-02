package methodEmbedding.Counting_Sheep.S.LYD1577;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class mainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

																	
		try(BufferedReader br = new BufferedReader(new FileReader("/home/vitor/Downloads/A-small-practice.in"))) {
			
			int testCasesNum;
			int caseNum = 0;
			//Prints answer into a file
			PrintWriter writer = new PrintWriter("answer.txt", "UTF-8");
			
			String getFirstLineValues = br.readLine();
			testCasesNum = Integer.parseInt(getFirstLineValues);
				

			
			//Test cases
			for(int i = 0; i < testCasesNum;i++){
				caseNum++;
				int value = Integer.parseInt(br.readLine());
				int currentValue = value;
				int multiplier = 1;
				int[] usedValues = new int[10];
				//System.out.println("Verifying number " + value);
				
				if(value == 0)
				{
				
					writer.println("Case #" + Integer.toString(caseNum) + ": INSOMNIA");
					continue;
				}			
				
				while(true)
				{
					currentValue = value * multiplier;
					char[] numbers = String.valueOf(currentValue).toCharArray();
										
					
					for(int j = 0; j < numbers.length;j++)
					{
						//System.out.println("Character.getNumericValue(numbers[j]) is " + numbers[j]);
						usedValues[Character.getNumericValue(numbers[j])] = 1;
					}
					
					
					//Checks to see if it's ok
					int sum = 0;
					for(int val : usedValues)
						if(val == 1)
							sum++;
					//System.out.println("Value now is " + currentValue);
					//System.out.println("Sum now is " + sum);
					//Prints the answer if it's the right one
					if(sum == 10)
					{
						writer.println("Case #"+Integer.toString(caseNum) +": "+ Integer.toString(currentValue));
						break;
					}
						multiplier += 1;
				}	
			}
			writer.close();
			
		}
		catch(IOException e){
			System.out.println(e);
		}
			
	}
}

			
			
			
			
//			for(int i = 0; i < testCasesNum;i++)
//			{
//				credit = Integer.parseInt(br.readLine());
//				itemsNumber = Integer.parseInt(br.readLine());
//				itemsPrice = new int[itemsNumber];
//				
//				String getItemValues = br.readLine();
//				String[] priceSubString = getItemValues.split(" ");
//				for(int j = 0; j < itemsNumber; j++){
//					itemsPrice[j] = Integer.parseInt(priceSubString[j]);
//				}
//				
//				
//				int itemValues[] = new int[itemsNumber];
//				
//				System.out.println(credit);
//				System.out.println(itemsNumber);
//				System.out.println(Arrays.toString(itemsPrice));
//				
//				
//				String result = solvesProblem(credit, itemsNumber, itemsPrice, 0, i, writer);
//				
//						
//				}
//				writer.close();
//			}
		
	
	
		
	

	
//	static String solvesProblem(int credit, int itemNumber, int[] valueArray, 
//			int position, int caseNum, PrintWriter writer){
//		
//		int firstValue = valueArray[0];
//		
//		for(int i = 1; i < itemNumber; i++){
//			
//			if(firstValue + valueArray[i] == credit){
//				System.out.println("The positions are are " + Integer.toString(++position) + 
//						" and " +Integer.toString(i+position));
//				System.out.println("The values are " + Integer.toString(firstValue) + Integer.toString(valueArray[i]));
//				
//				writer.println("Case #"+Integer.toString(caseNum+1) +": "+
//						Integer.toString(position) + 
//						" " +Integer.toString(i+position));
//				return "The positions are are " + Integer.toString(++position) + 
//						" and " +Integer.toString(i+position);
//			}
//		}
//		return solvesProblem(credit, itemNumber-1, Arrays.copyOfRange(valueArray, 1, valueArray.length), 
//				position +1, caseNum, writer);


	
