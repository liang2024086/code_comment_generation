package methodEmbedding.Counting_Sheep.S.LYD1022;

import java.io.*;
import java.util.*;

class Solution
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=1;i<=t;i++)
		{
			int input=sc.nextInt();
			int output;
			int j=1;
			if(input==0)
				output=-1;
			else
			{
				LinkedList<Integer> array=new LinkedList<Integer>();
				array.add(0);
				array.add(1);
				array.add(2);
				array.add(3);
				array.add(4);
				array.add(5);
				array.add(6);
				array.add(7);
				array.add(8);
				array.add(9);
		//		System.out.println(array.toString());
				int temp=input;
				while(!array.isEmpty())
				{
					
				//	System.out.println(array.toString());
					//List<Integer> digits = new ArrayList<Integer>();
    				try
    				{
    				while(temp > 0)
    				{
        		//		System.out.println("(int)temp % 10: "+(int)temp % 10);
        				int remove=temp%10;
        				array.remove((Integer)remove);
        				temp /= 10;
        		//		System.out.println(array.toString());
    				}	
    				}
    				catch(Exception ex){}
    				j++;

    				temp=input*j;
    		//		System.out.println("j: "+j+"temp: "+temp);
				}
				output=input*(j-1);
			}
			if(output==-1)
			{
				System.out.println("Case #"+i+": INSOMNIA");
			}
			else
			{
				System.out.println("Case #"+i+": "+output);
			}
		}
	}
}
