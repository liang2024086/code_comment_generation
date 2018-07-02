package methodEmbedding.Revenge_of_the_Pancakes.S.LYD801;

import java.io.*;
import java.util.BitSet;
public class Flip {
	public static void main(String[] args){
		try{
			// Gets file from program argument
			File inputFile = new File(args[0]);
			File outputFile = new File(args[0].substring(0, args[0].length()-3) + ".out");
			BufferedReader reader = new BufferedReader(new FileReader(inputFile));
			BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
			String input;
			char inputChar;
			String testText = "Case #";
			long count = 0;
			long testCase = 0;

			boolean prev = false;
			boolean first = true;
			reader.readLine();
			while ((input = reader.readLine()) != null){
				testCase++;
				int length = input.length();
				for (int i = 0; i < length; i++){
					inputChar = input.charAt(i);
					if (!first){
						if (inputChar == '+' || inputChar == '-'){
							if (inputChar == '+'){
								if (prev == false){
									count++;
									prev = true;
								}
							} else{
								if (prev == true){
									count++;
									prev = false;
								}
							}
						} else{
							// Resetting
							first = true;
							break;
						}
					} else{
						if (inputChar == '+'){
							prev = true;
						} else{
							prev = false;
						}
						count++;
					first = false;
					}
					
				}
				if (prev == true){
					count--;
				}
			writer.write(testText + testCase + ": " + count);
			writer.newLine();
			first = true;
			count = 0;
			}
			writer.close();
			System.out.println("Done!");
		} catch(Exception e){
			System.out.println("Fugg!!!");
		}
		

	}
}
