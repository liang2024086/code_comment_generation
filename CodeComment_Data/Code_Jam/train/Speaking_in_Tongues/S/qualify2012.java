package methodEmbedding.Speaking_in_Tongues.S.LYD1283;


import java.io.*;
import java.util.*;

public class qualify2012 {

	public static void main(String[] args)	{
		int numTestCases;
		String[] theCode = new String[]{"y", "h", "e", "s", "o", "c",
				"v", "x", "d", "u", "i", "g", 
				"l", "b", "k", "r", "z", "t",
				"n", "w", "j", "p", "f", "m",
				"a", "q"};
		
		try	{
			Scanner scan = new Scanner(new File("A-small-attempt0 (1).in"));
			PrintWriter writer = new PrintWriter("output.txt");
			
			numTestCases = Integer.parseInt(scan.nextLine());
			for(int i=1; i<=numTestCases; i++)	{
				writer.print(String.format("Case #%d: ", i));
				
				String[] input = scan.nextLine().split(" ");
				for (String nextWord : input)	{
					for(char nextLetter : nextWord.toCharArray())	{
						writer.print(theCode[nextLetter-97]);
					}
					writer.print(" ");
				}
				writer.println();
			}
			
			
			writer.close();
			scan.close();
		}
		catch(FileNotFoundException fnfe)	{
			System.out.println("File not found.");
		}
	}
}
