package methodEmbedding.Counting_Sheep.S.LYD339;

import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a=0b0000000000;
		int t=Integer.parseInt(br.readLine());
		int n,test,dig,j;
		for(int i=1;i<=t;i++)
		{
			n=Integer.parseInt(br.readLine());
			if(n==0)
				System.out.println("Case #"+(i)+": "+"INSOMNIA");
			else
			{
				a=0b0000000000;
				j=1;
				while(true)
				{
					test=j*n;
					while(test!=0)
					{
						a|=1<<(test%10);
						test=test/10;
					}
					if(a==0b1111111111)
					{
						System.out.println("Case #"+(i)+": "+(j*n));
						break;
					}
					j++;
				}
			}
		}
		
	}
}
