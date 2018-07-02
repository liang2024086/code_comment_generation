package methodEmbedding.Counting_Sheep.S.LYD47;


import java.io.*;
import java.util.*;
public class Insomania {
	public static void main(String args[])throws IOException
	{
		int N,T,n=0;
		int hash[]=new int[10];
		int kithna=0;
		boolean flag=false;
		boolean count=false;
		Scanner s=new Scanner(System.in);
		//System.out.println("Enter number of test cases");
		T=s.nextInt();
		for(int i=0;i<T;i++)
		{
			//System.out.println("Enter the value of N");
			n++;
			N=s.nextInt();
			kithna=0;
			int k=1,temp=0;
			for(int j=0;j<10;j++)
			{
				hash[j]=0;
			}
			//File output=new File("output.in");
			//FileWriter fw=new FileWriter(output);
			flag=false;
			temp=N;
			while(!flag&&kithna<1000)
			{
				int pass=temp;
				kithna++;
				//System.out.println(temp);
				while(temp>0)
				{
					//System.out.println(temp);
					hash[temp%10]=1;
					temp=temp/10;
				}
				count=true;
				for(int j=0;j<10;j++)
				{
					if(hash[j]==0)
						count=false;
				}
				if(count==false)
				{
					temp=(k++)*N;
					flag=false;
				}
				else
				{	
					System.out.println("Case #"+n+": "+pass);
					//fw.write("Case #"+n+": "+pass);
					flag=true;
				}
			}
			if(kithna>=1000)
			{	
				System.out.println("Case #"+n+": "+"INSOMNIA");
				//fw.write("Case #"+n+": "+"INSOMNIA");
			}
		}
		
		
	}

}
