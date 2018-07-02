package methodEmbedding.Speaking_in_Tongues.S.LYD263;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class RoundOneProblemA {
	
	private static char[]gToS = {'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
	
	public static void main(String args[]) throws IOException
	{
		BufferedReader input = new BufferedReader(new FileReader("input.txt"));
		BufferedWriter output = new BufferedWriter(new FileWriter("output.txt"));
		
		int noOfTestCases = Integer.parseInt(input.readLine());
		
		for(int i=1;i<=noOfTestCases;i++)
		{
			String gLine = input.readLine();
			int len = gLine.length();
			StringBuilder builder = new StringBuilder(100);
			for(int j=0;j<len;j++)
			{
				char currChar = gLine.charAt(j);
				if(currChar!=' ')
					builder.append(gToS[gLine.charAt(j) - 97]);
				else
					builder.append(' ');
			}
			
			output.write("Case #" + i + ": " + builder.toString() + "\n");
		}
		
		input.close();
		output.close();
	}

}
