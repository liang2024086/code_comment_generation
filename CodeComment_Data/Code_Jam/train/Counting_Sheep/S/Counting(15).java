package methodEmbedding.Counting_Sheep.S.LYD823;

import java.util.*;
import java.io.*;
import java.lang.*;


public class Counting
{
	public static void main(String args[])throws Exception
	{
		 Scanner sc = new Scanner(System.in);
		//System.out.println("Enter t");
		//int t=sc.nextInt();
		FileInputStream fin=new FileInputStream("A-small-attempt1.in");
		BufferedReader br=new BufferedReader(new InputStreamReader(fin));
		FileOutputStream fout=new FileOutputStream("Output.in");
			
		boolean r=true;	
		
		int t=Integer.parseInt(br.readLine());
		int arr[]=new int[t];		
		for(int i=0;i<t;i++)
		{
			arr[i]=Integer.parseInt(br.readLine());
		}
		for(int i=0;i<t;i++)
		{
			if(arr[i]==0)
				new PrintStream(fout).println("Case #"+(i+1)+": INSOMNIA");
			else
			{
				int num=arr[i];
				int check[]={0,0,0,0,0,0,0,0,0,0};
				while(num>0)
				{
					int temp=num%10;
					check[temp]=1;
					num=num/10;
				}
				int j=2;
				r=true;
				while(r==true)
				{
					int num2=j*arr[i];
					num=num2;
					while(num>0)
					{
						int temp=num%10;
						check[temp]=1;
						num=num/10;
					}
												
					for(int a=0;a<10;a++)
					{
						if(check[a]==0)
							break;
						else if(a==9)
						{
							new PrintStream(fout).println("Case #"+(i+1)+": "+num2);
							r=false;
						}
					}//for close
					j++;
				}//while close
			}//else close
		}//for close
		fin.close();
		fout.close();
	}
}
