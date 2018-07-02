package methodEmbedding.Standing_Ovation.S.LYD1793;


import java.io.*;

public class Driver {

	public static void main(String[] args) throws IOException {
		int numTotal, maxShy;
		String temp;
		
		File in = new File("A-small-attempt2.in");
		FileWriter out = new FileWriter("A-small-attempt2.out");
		
		BufferedReader reader = new BufferedReader(new FileReader(in));
		BufferedWriter writer = new BufferedWriter(out);
		
		numTotal = Integer.parseInt(reader.readLine());
		
		for (int i = 0; i < numTotal; i++)
		{
			temp = reader.readLine();
			String[] list = temp.split(" ");
			
			// maximum shyness level, also how many terms the next term has
			maxShy = Integer.parseInt(list[0]);
			
			// shyness level
			char [] audience = list[1].toCharArray();
			
			int numStanding = 0;
			int numNeeded = 0;
			int diff;
			for (int j = 0; j < maxShy + 1; j++)
			{
				
				if(numStanding < j && audience[j] != '0') // not enough
				{
					diff = j - numStanding;
					numNeeded += diff;
					numStanding += diff;
					numStanding += Character.getNumericValue(audience[j]);
					//System.out.println(numStanding + " " + Character.getNumericValue(audience[j]) + " up j = " + j);
				}
				else // numStanding > j, enough
				{	
					numStanding += Character.getNumericValue(audience[j]);
					//System.out.println(numStanding + " " + Character.getNumericValue(audience[j]) + " down j = " + j);
				}
			}
			//System.out.println("numNeeded = " + numNeeded);
			//System.out.println();
			writer.write("Case #" + (i+1) + ": " + numNeeded + "\n");
			
			// reset for next line
			numStanding = 0;
			numNeeded = 0;
		}
		reader.close();
		writer.close();
	}

}
