package methodEmbedding.Standing_Ovation.S.LYD1364;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.*;
import java.*;


/**
 *
 * @author pankaj
 */
public class TestSolution {
    
    
public static void main(String args[]) {
	
	try{	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
	
        int T=Integer.parseInt(br.readLine());
		//String arrold[]=new String[T];
		//String arrnew[]=new String[T];
		String arr=new String();
		int res[]=new int[T];
		//int resval=0;
		int m=0,sum=0,max=0;
		for(int i=0;i<T;i++)
		{
			
			//arrold[i]=br.readLine();
			//arrnew=arrold.substring(2);
			//resval=0;
			arr=br.readLine();
			arr=arr.substring(2);
			max=0;
			m=arr.length();
			int arrint[]=new int[m];
			for(int z=0;z<m;z++)
			{
				arrint[z]=Integer.parseInt(arr.substring(z,z+1));
			}
			for(int k=1;k<=m;k++)
			{
				sum=0;
				for(int l=0;l<=k-1;l++)
				{
					sum=sum+arrint[l];
				}
				if(max<(k-sum))
					max=k-sum;
			}
			res[i]=max;
		}
		for(int i=0;i<T;i++)
		{
			System.out.println("Case #"+(i+1)+": "+res[i]);
		}
	}	
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}
