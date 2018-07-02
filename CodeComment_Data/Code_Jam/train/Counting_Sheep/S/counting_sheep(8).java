package methodEmbedding.Counting_Sheep.S.LYD1052;

import java.io.*;
import java.util.Scanner;


class counting_sheep
{
	public static void main(String []args) throws Exception
	{
		File f=new File("C:\\Users\\Abhi\\Downloads\\A-small-attempt1.in");
		Scanner sc=new Scanner(f);
		int t=sc.nextInt();
		int []N=new int[t];
		
			for(int i=0;i<t;i++)
			{
				N[i]=sc.nextInt();
				
				int cnt=10,tmp=N[i],dig=0,tmp1=0;
				int []num=new int[10];
				
				
					if(N[i]==0)
					{
						System.out.println("Case #"+(i+1)+": INSOMNIA");
		
					}
					else{
						int j=1;
						while(cnt>0)
						{
							if(tmp==0)
							{
								j=j+1;
								tmp=j*N[i];
								tmp1=tmp;
							}
							dig=tmp%10;
							if(num[dig]==0)
							{
								num[dig]=1;
								cnt--;
							}
							tmp=tmp/10;
						}
						System.out.println("Case #"+(i+1)+": "+tmp1);
					}
			}
				
	}
}
