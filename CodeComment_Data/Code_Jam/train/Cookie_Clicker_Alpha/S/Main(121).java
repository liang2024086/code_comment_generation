package methodEmbedding.Cookie_Clicker_Alpha.S.LYD873;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		File file = new File("B-small-attempt0.in");
		String line = "";
		PrintWriter writer = new PrintWriter("solution.txt", "UTF-8");
		try 
		{
			BufferedReader reader = new BufferedReader(new FileReader(file));
			/*
			 * Read the first line for the number of cases
			 */
			int numOfCases = Integer.parseInt(reader.readLine());
			
			for (int i = 0; i < numOfCases; i++)
			{
				int numOfFarms = 0;
				double rate = 2, time = 0;
				line = reader.readLine();
				double C, F, X;
				C = Double.parseDouble(line.split(" ")[0]);
				F = Double.parseDouble(line.split(" ")[1]);
				X = Double.parseDouble(line.split(" ")[2]);
				

				/*
				 * Calc original values
				 */
				double LHS = (X - C)/rate;
				double RHS = X/(rate + F);
				
				while (LHS > RHS)
				{
					numOfFarms++;
					rate += F;
					LHS = (X-C)/rate;
					RHS = X/(rate + F);
				}
				for (int j = 0; j < numOfFarms; j++)
				{
					time += C/(2 + j * F);
				}
				time += X/(rate);
				
				writer.println("Case #" + (i + 1) + ": " + time);
				
			}
			reader.close();
			writer.close();
		} 
		catch (NumberFormatException | IOException e) 
		{
			System.out.println("Exception: " + e.getMessage());
		}
	}

}
