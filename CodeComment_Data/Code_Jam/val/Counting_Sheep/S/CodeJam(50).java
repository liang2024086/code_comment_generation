package methodEmbedding.Counting_Sheep.S.LYD376;

import java.util.*;
import java.io.*;
import java.lang.*;
class CodeJam
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int a;
		int j=1;
		while(j<=t)
		{	
			int i=1;
			int n=sc.nextInt();
			int ar[]=new int[10];
			//int cnt0=0,cnt1=0,cnt2=0,cnt3=0,cnt4=0,cnt5=0,cnt6=0,cnt7=0,cnt8=0,cnt9=0;
			while(true)
			{
				a=i*n;
				int b=0;
				String s=Integer.toString(a);
				if(n==0)
					break;
				while(b<s.length())
				{
					char c=s.charAt(b);
					int d=(int)c;
					d=d-48;
					ar[d]=ar[d]+1;
					b++;
				}
				if(ar[0]>0&&ar[1]>0&&ar[2]>0&&ar[3]>0&&ar[4]>0&&ar[5]>0&&ar[6]>0&&ar[7]>0&&ar[8]>0&&ar[9]>0)
					break;
				i++;
			}
			if(n!=0)
				System.out.println("Case #"+j+": "+a);
			else
				System.out.println("Case #"+j+": INSOMNIA");
			j++;
		}
		
	}
}
