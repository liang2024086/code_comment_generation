package methodEmbedding.Counting_Sheep.S.LYD1490;

import java.util.*;
import java.io.*;
class codejam1
{
	public static void main(String args[])throws IOException
{
	 int t;
	 String s="";
	int n;
	FileReader fr=new FileReader("A-small-attempt4.in");
	BufferedReader br=new BufferedReader(fr);
	String saty=br.readLine();
	t=Integer.parseInt(saty);
	
	
	int i;
	for(i=1;i<=t;i++)
	{
		
		
	   saty=br.readLine();
           n=Integer.parseInt(saty);
		int arrint[]=new int[10];
		int k;
		for(k=0;k<10;k++)
		arrint[k]=0;
		 int j=1;
		int sum=0;
		int ans;
		if(n!=0)
		{
		while(true)
		{
			
			sum=j*n;
			ans=sum;
		 int a;
			while(sum>0)
			{
				a=sum%10;
				arrint[a]=1;
				sum=sum/10;
			}
			int count=0;
				for(k=0;k<10;k++)
		        {
		        	if(arrint[k]==1)
		        	count++;
		        }
			if(count==10)
			break;
			j++;
		}
	   s=s+"Case #"+i+":"+" "+ans+"\n";
	   }
	   else
		s=s+"Case #"+i+": INSOMNIA\n";
	}
	
	FileWriter fw=new FileWriter("output.txt");
	BufferedWriter bw=new BufferedWriter(fw);
	bw.write(s);
	bw.close();
	fr.close();
	
}
}
