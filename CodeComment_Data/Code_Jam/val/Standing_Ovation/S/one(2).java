package methodEmbedding.Standing_Ovation.S.LYD1004;

import java.util.*;
import java.util.Scanner;

public class one
{


	public static void main(String [] args)
	{

		Scanner in =new Scanner(System.in);
		int a=0;
		int b=0;
		String s=null;
		a=in.nextInt();

		for(int i=0;i<a;i++)
		{
			int count=0;
			int result=0;
			b=in.nextInt();
				//in.nextLine();
		    s=in.next();
		    count=count+Integer.parseInt(s.charAt(0)+"");

		    	for(int j=1;j<s.length();j++)
		    	{

		    			if(s.charAt(j)>0)
		    			{

		    					if(count<j)
		    					{
								result=result+(j-count);
		    						count=j;
		    						

						
		    					}
		    					count=count+Integer.parseInt(s.charAt(j)+"");
		    			
	}

		    	}
		    	System.out.println("Case #"+(i+1)+": "+(result));
		}


	}
}
