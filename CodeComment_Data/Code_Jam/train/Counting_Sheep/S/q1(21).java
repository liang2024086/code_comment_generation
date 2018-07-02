package methodEmbedding.Counting_Sheep.S.LYD1148;

import java.util.*;
import java.io.*;

class Solution
{
	static String filename= "output.txt";
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
       int t=in.nextInt();
       for(int k=1;k<=t;k++)
       {
       		int n=in.nextInt();
       		int last=1;
       		ArrayList<Integer> array=new ArrayList<Integer>();
       		for(int i=1;i<=100;i++)
       		{
       			last=n*i;
       			int curr=n*i;
       			while(curr!=0)
       			{
       				int key=curr%10;

       				if(!array.contains(key))
       				{
       					array.add(key);
       				}
       				curr/=10;
       			}
       			if(array.size()==10)
       			break;	
       		}
       		if(array.size()==10)
       			System.out.println("Case #"+k+": "+last);
       		else
       			System.out.println("Case #"+k+": "+"INSOMNIA");
       	}
    }
}       		
