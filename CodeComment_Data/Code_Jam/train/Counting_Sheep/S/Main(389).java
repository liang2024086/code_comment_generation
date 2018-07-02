package methodEmbedding.Counting_Sheep.S.LYD262;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class Main {

	static String FILE_IN_NAME = "A-small-attempt0.in";
	static String FILE_OUT_NAME = "output.txt";
	
	public static void main(String[] args) {
		int expectedTestCases = 0;
		int encounteredTestCases = 0;
		
		try (BufferedReader in = new BufferedReader(new FileReader(FILE_IN_NAME));
				BufferedWriter out = new BufferedWriter(new FileWriter(FILE_OUT_NAME))){
			// read the first line
			String line = in.readLine();
			
			// if the line exists, parse it to be the number of test cases
			if(line != null)
			{
				try
				{
					expectedTestCases = Integer.parseInt(line);
				}
				catch (NumberFormatException e)
				{
					// parse failed, malformed input
					System.exit(-1);
				}
			}
			
			int testCaseNumber = 0;
			// read the rest of the lines
			while((line = in.readLine()) != null)
			{
				++testCaseNumber;
				int n = 0;
				try
				{
					n = Integer.parseInt(line);
					++encounteredTestCases;
				}
				catch (NumberFormatException e)
				{
					// parse failed, malformed input
					System.exit(-1);
				}
				
				if(n == 0)
				{
					// not possible, the value will always be 0
					out.write("Case #" + testCaseNumber + ": INSOMNIA\n");
					continue;
				}
				
				boolean running = true;
				int i = 1;
				ArrayList<Character> valuesSeen = new ArrayList<Character>();
				while(running)
				{
					int currVal = n * i;
					
					// get the string value of the 
					String s = String.valueOf(currVal);
					
					for (char c : s.toCharArray())
					{
						boolean exists = false;
						
						// search the character list to see if we've found this one
						for (Character c2 : valuesSeen)
						{
							if (c2.equals(Character.valueOf(c)))
							{
								// if we have seen it, mark the flag
								exists = true;
								break;
							}
						}
						
						if (!exists)
						{
							// if we have not seen it, add it
							valuesSeen.add(Character.valueOf(c));
						}
						
						if(valuesSeen.size() == 10)
						{
							out.write("Case #" + testCaseNumber + ": " + String.valueOf(currVal) + "\n");
							running = false;
							break;
						}
					}
					
					++i;
				}
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
