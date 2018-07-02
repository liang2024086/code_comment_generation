package methodEmbedding.Counting_Sheep.S.LYD1599;

import java.io.*;
import java.util.*;
import java.math.*;

public class count_sheep{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(int f=1;f<=t;f++)
		{
			int n=s.nextInt();
			int[] a=new int[10];
			//Arrays.fill(a,0);
			int i=0,num=0,count=0,q,r;
			while(i!=10&&count<2)
			{
				num+=n;
                               // System.out.println(num);
				r=num%10;
				q=num/10;
                                a[r]++;
				while(q!=0)
				{
                                    r=q%10;
				    q=q/10;
                                    a[r]++;	
				}
				for(i=0;i<10&&a[i]!=0;i++)
                                {}
				if(num==n)
					count++;
					
			}
                        if(count>=2)
                        {System.out.println("Case #"+f+": INSOMNIA"); continue; }  
			
                        System.out.println("Case #"+f+": "+num);
		}
	}
}
