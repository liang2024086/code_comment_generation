package methodEmbedding.Counting_Sheep.S.LYD1569;

import java.io.*;
import java.util.*;

public class SheepCounting {

	public static void main(String[] args)throws IOException {
		Scanner sc= new Scanner(System.in);
		int testno= sc.nextInt();
		
		
		long mul=0;
		for(int i=0;i<testno;i++)
		{
			ArrayList<Integer> digits= new ArrayList<Integer>();
			long number= sc.nextLong();
			if(number==0)
			{
				System.out.println("Case #"+(i+1)+": INSOMNIA");
				
			}
			else
			{
			//System.out.println(number);
			int m=1;
			while(digits.size()<10)
			{
				
				 mul= m*number;
				int ld=(int) mul;
				//System.out.println("Outer while");
				while(mul!=0)
				{
					//System.out.println("inner while");
					int last= (int)mul%10;
					//System.out.println("last"+last);
					if(!digits.contains(last))
					{
						digits.add(last);
					if(digits.size()==10)
						System.out.println("Case #"+(i+1)+": "+ld);
					}
					mul= mul/10;
				}
					m++;
					
				
			}
			}
		
		
		}
		sc.close();
	}
}

