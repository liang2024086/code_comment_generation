package methodEmbedding.Standing_Ovation.S.LYD463;

import java.util.Scanner;


public class codejam1 {

	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int tc=Integer.parseInt(sc.nextLine());
		int count=1;
		while(count<=tc)
		{
			String line=sc.nextLine();
			int stnd=0;
			int req=0;
			String arr[]=line.split(" ");
			if(arr.length!=2)
				System.out.println("Input Split fault");
			else
			{
				int maxs=Integer.parseInt(arr[0]);
				for(int i=0;i<=maxs;i++)
				{
					int pepl=arr[1].charAt(i)-48;
					//System.out.println("pepl"+pepl);
					if(pepl>0)
					{
					if(stnd>=i)
						stnd+=pepl;
					else
					{
						//System.out.println("req"+(i-stnd)+"i= "+i);
						req+=(i-stnd);
						stnd=i;
						stnd+=pepl;
					}
					}
					
				}
				System.out.println("Case #"+count+":"+" "+req);
			}
			count++;
		}

	}

}
