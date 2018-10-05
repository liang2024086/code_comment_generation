package methodEmbedding.Standing_Ovation.S.LYD688;

import java.io.*;
import java.lang.String;
import java.util.*;
public class ovation
{
	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		int T=0;
		T = ob.nextInt();
		int i,k,l,j;
		String[] s = new String[T];
		String[] y = new String[20];;
		String x;
		ob.nextLine();
		for (k=0;k<T;k++)
		{
			s[k]=ob.nextLine();
		}
		int total,counter,q;
		System.out.println();
		for (i=0;i<T;i++)
		{			
			total=0;
			counter=0;
			x=s[i];
			l=x.length();
			for(j=2;j<l;j++)
			{
				q=j-2;
				
				if (total>=q) 
				{
					
				}
				else
				{
					while(total!=q)
					{
						total++;
						counter++;
					}
				}
  				total+=Character.getNumericValue(x.charAt(j));
			}
			System.out.println("Case #"+(i+1)+": "+counter);
		}
	}
} 
