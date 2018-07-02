package methodEmbedding.Revenge_of_the_Pancakes.S.LYD73;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class ReverseWords {
	public static void main (String args[]){
		try {
			Scanner input = new Scanner(new File("C:\\Java\\Codejam\\rev.in"));		
			int testcases = input.nextInt();
			input.nextLine();
			
			FileWriter fstream = new FileWriter("out.txt");
			BufferedWriter out = new BufferedWriter(fstream);
				
			for(int t=1;t<=testcases;t++){
				String sentence = input.nextLine();
				String words[] = sentence.split(" ");
					
				System.out.print("Case #"+ t + ": ");
				out.write("Case #"+ t +": ");
					
				for(int w=words.length-1;w>=0;w--){
					System.out.print(words[w] + " ");
					out.write(words[w] + " ");
				}
				System.out.println();
				out.newLine();
			}
			out.close();			  
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("Error: " + e.getMessage());
			e.printStackTrace();
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}	
	}
}
