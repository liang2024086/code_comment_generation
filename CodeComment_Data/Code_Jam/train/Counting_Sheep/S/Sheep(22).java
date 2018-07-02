package methodEmbedding.Counting_Sheep.S.LYD944;

import java.io.*;
class sheep
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T,N,a,b,d;
		T=Integer.parseInt(br.readLine());
		if(T<1||T>100)
		System.exit(0);
		long timeOut=10000;
		int j=1;
		while(j<=T)
		{
			long startTime = System.currentTimeMillis();
			N=Integer.parseInt(br.readLine());
			if(N<0||N>200)
			System.exit(0);
			int count0=0;int count1=0;int count2=0;int count3=0;int count4=0;int count5=0;int count6=0;int count7=0;int count8=0;int count9=0;
			for(int i=1;;i++)
			{
				
				b=i*N;
				a=b;
				while(a>0)
				{
					d=a%10;
					a=a/10;
					if(d==0)
					count0++;
					if(d==1)
					count1++;
					if(d==2)
					count2++;
					if(d==3)
					count3++;
					if(d==4)
					count4++;
					if(d==5)
					count5++;
					if(d==6)
					count6++;
					if(d==7)
					count7++;
					if(d==8)
					count8++;
					if(d==9)
					count9++;
				}
				if(count0>=1&&count1>=1&&count2>=1&&count3>=1&&count4>=1&&count5>=1&&count6>=1&&count7>=1&&count8>=1&&count9>=1)
				{
					System.out.println("Case #"+j+": " +b);
					break;
				}
				else
				{
				long elapsed = System.currentTimeMillis() - startTime;
			        if (elapsed >= timeOut) 
					{
					System.out.println("Case #"+j+": INSOMNIA");      			
				    	break;
					}
				}
			}
			j++;	
		}
	}
}		
		
