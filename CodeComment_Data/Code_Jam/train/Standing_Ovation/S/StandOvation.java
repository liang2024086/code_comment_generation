package methodEmbedding.Standing_Ovation.S.LYD180;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=1;i<=t;i++)
		{
			int max=sc.nextInt();
			String a=sc.next();
			int add=0,ans=0;
			int stand=a.charAt(0)-48;
			//System.out.println(stand);
			for(int j=1;j<max+1;j++)
			{
				int shyppl=a.charAt(j)-48;
				add=0;
				if(shyppl!=0 && j>stand)
				{
					add+=j-stand;
					ans+=add;
					stand+=add;
				}
				stand+=shyppl;
			
			}
			
			System.out.println("Case #"+i+": "+ans);
			//System.out.println("Ppl standing="+stand+" Ans="+ans);
			/*for(int j=0;j<max+1;j++)
			{
				int shy=a.charAt(j);
				System.out.println(shy-48);
				System.out.println();
			}*/
			//System.out.println(max+" "+a);
		}
	}
}
