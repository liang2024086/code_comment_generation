package methodEmbedding.Standing_Ovation.S.LYD1660;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Console;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class ProblemA {

	public static void main(String[] args) throws IOException {
		
		FileReader input1 = new FileReader("A-small-attempt1.in");
		FileWriter output = new FileWriter("output.txt");
		
		BufferedReader reader1 = new BufferedReader(input1);
		BufferedWriter writer = new BufferedWriter(output);
		
		
		String line1 = reader1.readLine();

		int total = Integer.valueOf(line1);
		
		for(int i=0; i<total; i++)
		{
			line1 = reader1.readLine();
			
			String[] data = line1.split(" ");
			
			int maxShyness = Integer.parseInt(data[0]);
			String[] counts = data[1].split("");
			int currentCount = Integer.parseInt(counts[1]);
			int requiredPeople = 0;
			
			for(int j=1; j<=maxShyness; j++)
			{
				int Si = Integer.parseInt(counts[j+1]);
				if((j)>currentCount)
				{
					requiredPeople += ((j)-currentCount);
					currentCount += ((j)-currentCount);
				}
				currentCount += Si;
			}
			
			writer.write("Case #" + (i+1) + ": ");
			writer.write(String.valueOf(requiredPeople));
			writer.newLine();
		}
		
		reader1.close();
		writer.close();

	}

}
