package methodEmbedding.Revenge_of_the_Pancakes.S.LYD16;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class Main 
{
	public static void main(String[] args)
	{
		Dataset[] set = null;
		set = Parser.parseByte(Input.read(Input.stdPath + "B-small-attempt0.in"));
		PrintWriter writer = null;
		
		try {
			writer = new PrintWriter("out.txt", "UTF-8");
		} catch (FileNotFoundException | UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int result = 0;
		for(int i = 0; i<set.length; i++)
		{
			result = 0;
			for(int j = 0; j < set[i].count-1; j++)
			{
				if(set[i].count == 1)
				{
					if(set[i].testStr.charAt(0) == '-')
						result++;
					break;
				}
				if(set[i].testStr.charAt(j) != set[i].testStr.charAt(j + 1))
					result++;
			}
			
			if(set[i].testStr.charAt(set[i].count - 1) == '-')
				result++;
			
			System.out.println("Case #" + (i+1) + ": " + result);
			writer.println("Case #" + (i+1) + ": " + result);
		}
		writer.close();
	}
}
