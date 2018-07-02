package methodEmbedding.Standing_Ovation.S.LYD2089;

import java.util.*;
class StandingOvation
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(int z=1;z<=t;z++)
		{
			int Smax=s.nextInt();
			int a[]=new int[Smax+1];
			int num=s.nextInt();
			int ind=Smax;
			while(num!=0)
			{
				a[ind]=num%10;
				num=num/10;
				ind--;
			}
			/*for(int i=0;i<=Smax;i++)
			System.out.print(a[i]+" ");
			System.out.println();*/
			int stand=a[0],req=0;
			//System.out.println("Init : "+stand+" Req :"+req);
			for(int i=1;i<=Smax;i++)
			{
			//	System.out.println(""+i+" Start : "+stand+" Req :"+req);
				if(stand>=i)
				{
					stand+=a[i];
				}
				else
				{
					req+=(i-stand);
					stand+=(i-stand)+a[i];
				}
				//System.out.println(""+i+" End : "+stand+" Req :"+req);
			}
			System.out.println("Case #"+z+": "+req);
		}
	}
}
