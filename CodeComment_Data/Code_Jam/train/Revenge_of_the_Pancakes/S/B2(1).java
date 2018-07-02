package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1133;



import java.util.*;
import java.io.*;

public class B2
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int cases=s.nextInt();
		
		
		
		
		for(int c=1;c<=cases;c++)
		{
			ArrayList<Character> list=new ArrayList<>();
			int k=0;
			int result =0;
			
		
			String input = s.next();
			
			for(int j=0; j<input.length(); j++)
			{
				list.add(input.charAt(j));
			}
			
			do{
			
				if(list.get(k)=='+')                  
				{
					int change=k;
					try
					{ 
						while(list.get(k)!='-')
						{
							k++;
						}
					}
					catch(Exception e)
					{
						
						break;
					}
				
					for (int j = 0; j < k; j++) 
					{
						list.set(j, '-');
					}
					if(change!=k)
					{
						result++;
					}
					
				}
			
				
				else if(list.get(k)=='-')
				{
					result++;
					try
					{
						while(list.get(k)!='+')
						{
							k++;
						
						}
					}
					catch(Exception e)
					{
						
						break;
					}
				
					for (int j = k; j < k; j++) 
					{
						list.set(k, '+');
					}
				}
			
			
			}
			while(k<list.size());
			
		
			System.out.println("case #" + c + ": "+result);;
			
		}
		s.close();
	}
}
