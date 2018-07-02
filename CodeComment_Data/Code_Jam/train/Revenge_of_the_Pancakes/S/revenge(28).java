package methodEmbedding.Revenge_of_the_Pancakes.S.LYD441;

import java.util.*;
class revenge{
	public static void main(String arg[])
	{
		Scanner scan=new Scanner(System.in);
		int test,i=1;
		String s=new String("");
		test=scan.nextInt();
		while(test >=i)
		{
			s=scan.next();
			int j=0,output=0;
			System.out.print("Case #"+i+": ");
			while(j<s.length())
				if(s.charAt(j)=='-')
					++j;
				else
					break;
			if(j!=0)
				++output;
			boolean temp=false;
			while(j<s.length())
			{
				if(s.charAt(j)=='-')
					temp=true;
				if(s.charAt(j)=='+')
				{
					if(temp)
					{
						output=output+2;
						temp=false;
					}
				}
				++j;				
			}
			if(temp)
				output=output+2;
			System.out.println(output);
			
			++i;
		
		}
	}
}
