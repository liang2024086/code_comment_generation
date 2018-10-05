package methodEmbedding.Revenge_of_the_Pancakes.S.LYD484;

import java.util.*;
import java.io.*;
public class pancakeFlip
{
	public static void main(String[] args) throws IOException, Exception
	{
		Scanner kb = new Scanner(new FileInputStream(args[0]));
    	PrintWriter out = new PrintWriter(new File("small_outP.txt"));
		
		int total = Integer.parseInt(kb.nextLine());
		for(int t = 0; t < total; t++)
		{
			char[] input = kb.nextLine().toCharArray();

			int count = 0;
      		if(input[input.length - 1] == '-')
      		{
      			count = 1;
      		} 
      		
      		char temp = input[0];
      		for (int i = 0; i < input.length; i++) 
      		{
        		char var = input[i];
        		if(temp != var)
        		{
          			++count;
          			temp = var;
        		}
      		}
     		 out.println("Case #" + (t+1) + ": "+ count);
    	}
    out.close();	
		
	}

}
