package methodEmbedding.Magic_Trick.S.LYD938;



import java.util.Scanner;

public class source1 {

	public static void main(String args[])throws Exception
	{
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		for(int i=0;i<a;i++)
		{
			int q1,q2;
			int p1[]=new int[4];
			int p2[]=new int[4];
			
			q1=scn.nextInt();
			for(int j=0;j<4;j++)
				for(int k=0;k<4;k++)
				{int x=scn.nextInt();
					if(j==q1-1)
						p1[k]=x;
				}
			q2=scn.nextInt();
			for(int j=0;j<4;j++)
				for(int k=0;k<4;k++)
				{int x=scn.nextInt();
					if(j==q2-1)
						p2[k]=x;
				}
			int equatnuatn=0,bon=0;
			for(int j=0;j<4;j++)
				for(int k=0;k<4;k++)
				{if(p1[j]==p2[k])
					{equatn=p1[j];bon++;}
				}
			if(bon==1)
				System.out.println("Case #"+(i+1)+": "+equatn);
			else if(bon==0)
				System.out.println("Case #"+(i+1)+": Volunteer cheated!");
			else
				System.out.println("Case #"+(i+1)+": Bad magician!");


		}
	}
	
}
