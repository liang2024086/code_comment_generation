package methodEmbedding.Counting_Sheep.S.LYD253;

import java.util.*;
import java.lang.*;
import java.io.*;

class CodeJam1
{
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int n,n1,check,i,digit,temp;
		for(int z=1;z<=t;z++)
		{
		    int a[]=new int[10];
		        
		    n=sc.nextInt();
		    n1=n;
		    check=0; digit=0; temp=0;
		    if(n1==0)
		    {
		        System.out.println("Case #"+z+": INSOMNIA");
		        continue;
		    }
		    
		    for(i=2;;i++)
		    {
		        temp=n1;
		        while(temp!=0)
		        {
		            digit=temp%10;
		            if(a[digit]==0)
		                a[digit]=1;
		            temp=temp/10;
		        }
		        
		        for(check=0;check<10;check++)
		            if(a[check]==0)
		                break;
		        if(check==10)
		        {
		            System.out.println("Case #"+z+": "+n1);
		            break;
		        }
		        else
		            n1=i*n;
		    }
		    
		    
		}//test case ends
		
	}//main ends
}//class ends
