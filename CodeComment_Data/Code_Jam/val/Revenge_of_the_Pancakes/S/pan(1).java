package methodEmbedding.Revenge_of_the_Pancakes.S.LYD652;

import java.util.*;

class pan {
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int N = Integer.parseInt(in.nextLine());
		
		for(int i =0 ; i<N ; i++)
		{
			int count =0;
			String pat = in.nextLine();
			
			for(int j =0 ; j< (pat.length() -1);j++)
			{
				if(pat.charAt(j) == pat.charAt(j+1))
					continue;
				else
				{
					count ++;
					int k = j ;
					while(k>=0)
					{
						char[] patarray = pat.toCharArray();
                        patarray[k] = patarray[j+1];
                        pat = String.valueOf(patarray);
						
						k--;
					}
					//System.out.println("Case #"+(i+1)+": " +pat);
				}
			}
			
			
		  if(pat.charAt(0) == '-')
		  {
			  count++;
			  for(int j =0 ; j< (pat.length() -1);j++)
			
			  {
				        char[] patarray = pat.toCharArray();
                        patarray[j] = '+';
                        pat = String.valueOf(patarray);
						
			  }
			 // System.out.println("Case #"+(i+1)+": " +pat);
		  }
			
			System.out.println("Case #"+(i+1)+": " +count);
			
		}
	}
}
