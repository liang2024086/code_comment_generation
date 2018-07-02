package methodEmbedding.Standing_Ovation.S.LYD276;

import java.util.*;
import java.io.*;

class StandOv
{
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(new File("A-small-attempt1.in"));
		int test=sc.nextInt();
		PrintStream ps=new PrintStream(new FileOutputStream("abcStandOv.txt"));
		for(int t=0;t<test;t++)
		{
			int alStand=0;
			int reqStand=0;
			int smax=sc.nextInt();
			String s=sc.next();
			String sm[]=s.split("");
			int sm1[]=new int[sm.length];
			for(int i=0;i<sm.length;i++)
			{
				sm1[i]=Integer.parseInt(sm[i]);
			}
			alStand=alStand+sm1[0];
			//System.out.println("alStand="+alStand);
			//System.out.println("reqStand="+reqStand);
			for(int i=1;i<sm1.length;i++)
			{
				if(sm1[i]!=0)
				{
					int totStand =alStand+reqStand;
					if(i<=(totStand))
					{
						alStand=alStand+sm1[i];
					}
					else
					{
						int temp=i-totStand;
						reqStand+=temp;
						alStand+=sm1[i];
					}
				}
			//	System.out.println("alStand="+alStand);
			//	System.out.println("reqStand="+reqStand);
			}
			ps.println("Case #"+(t+1)+": "+reqStand);
		}
	}
}
