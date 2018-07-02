package methodEmbedding.Speaking_in_Tongues.S.LYD1586;


import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;


public class gjam {
	
	public static void main(String[] args)
	{
	
		int TestCases = 0;
		int currentCase = 0;
		
		try
		{
			
		
			FileInputStream fstream = new FileInputStream("A-small-attempt0.in");
			DataInputStream dstream = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(dstream));
			
			String inputStr = br.readLine();
			
			TestCases = Integer.parseInt(inputStr);
			
			while(currentCase != TestCases)
			{
				inputStr = br.readLine();
				
				String output = "";
				String alphabet = "abcdefghijklmnopqrstuvwxyz ";
				String encode = "ynficwlbkuomxsevzpdrjgthaq ";
				
				for(int i = 0; i<inputStr.length(); i++)
				{
					Character letter = inputStr.charAt(i);
					for(int j = 0; j<encode.length();j++)
					{
						if(letter == encode.charAt(j))
						{
							output += alphabet.charAt(j);
						}
					}
					
					
				}
				
				System.out.println("Case #" + (currentCase +1) + ": " + output);
				currentCase++;
			}
			
			
		}
		catch(Exception e)
		{
			System.err.println("Err: " + e.getMessage());
		}
		
	}
	
}
