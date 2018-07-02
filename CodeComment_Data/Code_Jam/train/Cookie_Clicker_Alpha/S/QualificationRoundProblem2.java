package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1121;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class QualificationRoundProblem2
{
	public static void main(String[] args)
	{
		try
		{
			FileInputStream fstream = new FileInputStream("pr2_2014_input.txt");
			DataInputStream in      = new DataInputStream(fstream);
			BufferedReader  br      = new BufferedReader(new InputStreamReader(in));
			
			FileWriter fout = new FileWriter("output.txt");
			BufferedWriter out = new BufferedWriter(fout);
			
			int iCases = Integer.parseInt(br.readLine());
			for (int iStep = 0; iStep < iCases; iStep++)
			{
				String strLine = br.readLine();
				String[] numbers = strLine.split(" ");
				
				double totalSecons = 0;
				double currentSpeen = 2;
				double C = Double.valueOf(numbers[0]).doubleValue();
				double F = Double.valueOf(numbers[1]).doubleValue();
				double X = Double.valueOf(numbers[2]).doubleValue();
				
				while (X >= C)
				{
					totalSecons += C / currentSpeen;
					
					//< Calculate the case where we continue like this
					double keepSpeed = totalSecons + (X - C) / currentSpeen;
					double buyFarm = totalSecons + X / (currentSpeen + F);
					
					if (keepSpeed < buyFarm)
					{
						X = X - C;
					}
					else
					{
						currentSpeen = currentSpeen + F;
					}
				}
				
				totalSecons += X / currentSpeen;
				
				out.write(String.format("Case #%d: %f\n", iStep + 1, totalSecons));
			}
			
			in.close();
			out.close();
		}
		catch (Exception e)
		{
			  System.err.println("Error: " + e.getMessage());
		}
	}
}
