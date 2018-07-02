package methodEmbedding.Magic_Trick.S.LYD1537;

import java.util.*;
public class magic {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int cases=sc.nextInt();
	for(int i=1;i<=cases;i++)
	{
		int first=sc.nextInt();
		int fir[]=new int[4];
		int sec[]=new int[4];
		int j,k;
		j=4*(first-1);
		for(int l=0;l<j;l++)
		{
			int x =sc.nextInt();
		}
		for(int l=0;l<4;l++)
		{
			fir[l]=sc.nextInt();
		}
		for(int l=4*first;l<16;l++)
		{
			int x=sc.nextInt();
		}
		int second=sc.nextInt();
		k=4*(second-1);
		for(int l=0;l<k;l++)
		{
			int x=sc.nextInt();
		}
		for(int l=0;l<4;l++)
		{
			sec[l]=sc.nextInt();
		}
		for(int l=(second)*4;l<16;l++)
		{
			int x=sc.nextInt();
		}
		HashMap <Integer,Integer> map=new HashMap<Integer,Integer>();
		int no=0,count=0;
		for(int l=0;l<fir.length;l++)
		{
			map.put(fir[l], 1);
		}
		for(int l=0;l<sec.length;l++)
		{
			if(map.containsKey(sec[l]))
			{
				no=sec[l];
				count++;
			}
		}
		if(count==1)
		{
			System.out.println("Case #"+i +": "+no);
		}
		else if(count ==0)
		{
			System.out.println("Case #"+i +": Volunteer cheated!");	
		}
		else
		{
			System.out.println("Case #"+i +": Bad magician!");
		}
		
		
	}
	

}
}
