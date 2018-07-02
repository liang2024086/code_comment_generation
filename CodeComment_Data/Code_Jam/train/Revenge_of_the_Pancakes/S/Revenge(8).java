package methodEmbedding.Revenge_of_the_Pancakes.S.LYD786;

import java.util.*;
import java.lang.*;

class Revenge 
{
public static void main(String ... ar)
	{
	int i,l;
	Scanner sc = new Scanner(System.in);
	int T = sc.nextInt();
	for(i=0; i<T; i++)
		{
		String s = sc.next();
		if(s.length()==1 && s.charAt(0)=='-')
		System.out.println("Case #"+(i+1)+": 1");
		else
			{
			int count=0;
			for(l=0; l<s.length()-1; l++)
				{
				Character c1= new Character(s.charAt(l));
				Character c2= new Character(s.charAt(l+1));				
				if(c1.compareTo(c2)!=0)
					{
					s.replace(s.charAt(l),s.charAt(l+1));				
					count++;
					}
				}
			if(s.charAt(s.length()-1)=='-')
			count++;		
			System.out.println("Case #"+(i+1)+": "+count);
			}		
		}
	
	}

}

