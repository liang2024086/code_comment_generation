package methodEmbedding.Counting_Sheep.S.LYD794;

import java.util.*;
import java.io.*;
public class Main{


	public static void main(String[] args)
	{
		Scanner s = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

		int t = s.nextInt();
		//System.out.println("t:"+t);
		for(int i=0;i<t;i++)
		{
			int[] arr = new int[10];
			int count=0;
			long N = s.nextLong();
			//System.out.println("N:"+N);	
			long mul=1;
			int lastNum =0;
			long tN=0;
			if(N==0){
			System.out.println("Case #"+(i+1)+": INSOMNIA");
				continue;
			}
			else{
			while(count<10)
			{
				tN=N*mul;
				long temp = tN;
				int tmp=0;
				while(String.valueOf(temp).length() >= 1 && count<10 && temp>0)
				{
					tmp=(int)temp%10;
					temp=temp/10;
				//	System.out.println("tmp:"+tmp+"  temp:"+temp+" tN:"+tN);
					if(arr[tmp]==0)
					{	
						arr[tmp]=1;
						count++;
					}
				}
				mul++;
			}
			System.out.println("Case #"+(i+1)+": "+tN);
			}			
		}
	}
}
