package methodEmbedding.Speaking_in_Tongues.S.LYD1023;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Googlerese
{
	public static void main(String[] args)
	{
		try
		{
			FileReader fileReader = new FileReader("input/A-small-attempt0.in");
			BufferedReader bufferedReader = new BufferedReader(fileReader);		
			
			String record = null;
			int numOfCases = -1;
			int lineCount = 0;
			List<String> googlereseInputList = new ArrayList<String>();
			
			// Read input
			while ((record = bufferedReader.readLine()) != null)
			{
				// First row is number of cases
				if (lineCount == 0)
				{
					numOfCases = Integer.valueOf(record);
				} 
				// Googlerese
				else
				{
					googlereseInputList.add(record);					
				}
				
				lineCount++;
			}
			
			fileReader.close();
			
			// Perform algo
			List<String> results = new ArrayList<String>();
			Map<Character, Character> dictionary = new HashMap<Character, Character>();
			dictionary.put('y', 'a');
			dictionary.put('n', 'b');
			dictionary.put('f', 'c');
			dictionary.put('i', 'd');
			dictionary.put('c', 'e');
			dictionary.put('w', 'f');
			dictionary.put('l', 'g');
			dictionary.put('b', 'h');
			dictionary.put('k', 'i');
			dictionary.put('u', 'j');
			dictionary.put('o', 'k');
			dictionary.put('m', 'l');
			dictionary.put('x', 'm');
			dictionary.put('s', 'n');
			dictionary.put('e', 'o');
			dictionary.put('v', 'p');
			dictionary.put('z', 'q');
			dictionary.put('p', 'r');
			dictionary.put('d', 's');
			dictionary.put('r', 't');
			dictionary.put('j', 'u');
			dictionary.put('g', 'v');
			dictionary.put('t', 'w');
			dictionary.put('h', 'x');
			dictionary.put('a', 'y');
			dictionary.put('q', 'z');
			
			for (String googlerese : googlereseInputList)
			{
				char[] resultCharArray = new char[googlerese.length()];
				
				char[] googlereseCharArray = googlerese.toCharArray();
				for (int i = 0; i < googlereseCharArray.length; i++)
				{
					char googlereseChar = googlereseCharArray[i];
					if (!dictionary.containsKey(googlereseChar)) resultCharArray[i] = googlereseChar;
					else resultCharArray[i] = dictionary.get(googlereseChar);
				}
				
				String result = new String(resultCharArray);
				results.add(result);
			}
			
			// Write output
			FileWriter fileWriter = new FileWriter("output/results.out");
		  BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		  for (int i = 0; i < results.size(); i++)
			{
		  	String result = results.get(i);		  	
				bufferedWriter.write("Case #" + (i+1) + ": " + result);
				if (i < results.size() - 1) bufferedWriter.write("\n");
			}			
		  //Close the output stream
		  bufferedWriter.close();
		}
		catch (IOException e)
		{ 
			System.out.println("IOException error!");
			e.printStackTrace();
		}
	}
}
