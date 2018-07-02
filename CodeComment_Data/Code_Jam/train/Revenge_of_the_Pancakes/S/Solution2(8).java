package methodEmbedding.Revenge_of_the_Pancakes.S.LYD601;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution2 {
	public static void main (String []args) throws IOException{
		File inputFile = new File("C:/Users/dinhq/OneDrive/Documents/Study/College/Sophomore Year/Spring/COSC 290L/Twitter/B-small-attempt0.in");
		File outputFile = new File("C:/Users/dinhq/OneDrive/Documents/Study/College/Sophomore Year/Spring/COSC 290L/Twitter/Output.txt");
		Scanner input = new Scanner (inputFile);
		FileWriter output = new FileWriter(outputFile);
		int test = input.nextInt();
		input.nextLine();
		int count;
		for(int i = 1; i <= test; i++){
			String data = input.nextLine();
			char[] dataChar = data.toCharArray();
			count = 0;
			for(int j = dataChar.length - 1; j >= 0 ; j--){
				while(j >=0 && dataChar[j]== '+')
					j--;
				if(j < 0)
					break;
				while(j >=0 && dataChar[j]== '-')
					j--;
				count++;
				j++;
				if(j>=0){
					for(int k = j - 1; k >= 0; k--){
						if(dataChar[k] == '-')
							dataChar[k] = '+';
						else
							dataChar[k] = '-';
					}
				}
			}
			output.write("Case #" + i + ": " + count +"\n");
		}
		input.close();
		output.close();
	}
}
