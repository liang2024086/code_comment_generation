package methodEmbedding.Revenge_of_the_Pancakes.S.LYD35;


import java.util.*;
import java.io.*;

public class Codejam2
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int noCases=s.nextInt();
		
		
		
		
		for(int c=1;c<=noCases;c++)
		{
			ArrayList<Character> cakeStack = new ArrayList<>();
			int index=0;
			int flip =0;
			
		
			String input = s.next();
			
			for(int j=0; j<input.length(); j++)
			{
				cakeStack.add(input.charAt(j));
			}
			
			do{
			
				if(cakeStack.get(index)=='+')                  
				{
					int change=index;
					try
					{ 
						while(cakeStack.get(index)!='-')
						{
							index++;
						}
					}
					catch(Exception e)
					{
						
						break;
					}
				
					for (int j = 0; j < index; j++) 
					{
						cakeStack.set(j, '-');
					}
					if(change!=index)
					{
						flip++;
					}
					
				}
			
				
				else if(cakeStack.get(index)=='-')
				{
					flip++;
					try
					{
						while(cakeStack.get(index)!='+')
						{
							index++;
						
						}
					}
					catch(Exception e)
					{
						
						break;
					}
				
					for (int j = index; j < index; j++) 
					{
						cakeStack.set(index, '+');
					}
				}
			
			
			}
			while(index<cakeStack.size());
			
		
			System.out.println("case #" + c + ": "+flip);;
			
		}
		s.close();
	}
}
