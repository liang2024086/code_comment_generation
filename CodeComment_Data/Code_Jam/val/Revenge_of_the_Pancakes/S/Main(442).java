package methodEmbedding.Revenge_of_the_Pancakes.S.LYD870;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

	public static void main(String [] args) throws FileNotFoundException
	{

		Scanner sc = new Scanner(new File("B-small-attempt1.in"));
		//grap total as
		int total = Integer.parseInt(sc.nextLine());
		for(int i = 0; i < total; i++)
		{
			
			
			//grap next number
			String k = sc.nextLine();
			String n = new String(k);
			int totalflip = 0;
			
			for(int j = 0; j < k.length()- 1; j++)
			{
				if(k.charAt(j) != k.charAt(j + 1))
				{
					totalflip++;
					//k = flip(k.substring(0,j+1)) + k.substring(j+1);
					
				}
			}
			
			if(k.charAt(k.length()-1) == '-') totalflip++;
			
			

			
			System.out.print("case #" + (i+1) + ": ");
	
			System.out.println(totalflip);

			
		}
	}
	
	
	
}
