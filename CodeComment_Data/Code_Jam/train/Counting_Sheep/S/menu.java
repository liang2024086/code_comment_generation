package methodEmbedding.Counting_Sheep.S.LYD886;


import java.io.*;

import java.util.Scanner;


public class menu
{
	public static void main(String[] args) 
    {
		Scanner input = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t;
        t=input.nextInt();
        
        int [] arr =new int[10];
		
        int [] n =new int[t];
		for(int i =0;i<t;i++)
		{
			n[i]=input.nextInt();
		}
		int flag=0;
		int num;
		for(int i =0 ; i<t ;i++)
		{
			if(n[i]==0)
				System.out.println("CASE #"+(i+1)+": INSOMNIA");
			else
			{
				
				for(int k=0 ; k<100 ; k++)
				{
					num=n[i]*(k+1);
					
				    for(int j=num ; j>0 ; j=j/10)
				    {
				    	arr[j%10]=1;
					}
				    flag=0 ;
				    
				    for(int j=0 ;j<10 ; j++)
				    {
				    	if(arr[j]==1)
				    		flag++;
				    }
				    if(flag==10)
				    {
				    	System.out.println("CASE #"+(i+1) +": "+num);
				    	for(int j=0 ;j<10 ; j++)
					    {
					    	arr[j]=0;
					    }
				    	break;
				    }
				}
			}
			
		}
    }
}

