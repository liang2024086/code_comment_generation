package methodEmbedding.Counting_Sheep.S.LYD1359;

import java.io.*;
import java.util.*;

class count_sheep
{
	public static void main(String[] args)throws IOException
	{
		Scanner sc = new Scanner(System.in);
		PrintStream ot = new PrintStream(new FileOutputStream("OutputA.txt"));
        System.setOut(ot);
		int t = sc.nextInt(),t1=t;
		while(t-->0)
		{
			int N = sc.nextInt(),N1=N,N2,c=0,m=1,a[]={0,0,0,0,0,0,0,0,0,0};
			System.out.print("Case #"+(t1-t)+": ");
			if(N==0) System.out.println("INSOMNIA");
			else
			{
				do
				{
					N1=N*m++;
					N2=N1;
					c=0;
					while(N2!=0)
					{
						a[N2%10]++;
						N2/=10;
					}
					for(int i=0; i<10; i++)
					{
						if(a[i]>0) c++;
					}
				}while(c<10&&m<=100);
				System.out.println((m<=100)?N1:"INSOMNIA");
			}
		}
	}
}
