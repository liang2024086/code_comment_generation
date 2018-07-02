package methodEmbedding.Magic_Trick.S.LYD1510;


import java.util.Scanner;

public class Magic {

	public static void main(String[] args)
	{
		Scanner in  = new Scanner(System.in);
		int testCases = in.nextInt();
		for(int test =1 ;test<=testCases ; test++)
		{
			int choice1 = in.nextInt()-1;
			int[] tempArray = new int[4];
			for(int i=0;i<4;i++)
			{
				for(int j=0;j<4;j++)
				{
					int t = in.nextInt();
					if(choice1==i)
					{
						tempArray[j] = t;
					}
				}
			}
			
			choice1= in.nextInt()-1;
			int count=0;
			int output =0;
			for(int i=0;i<4;i++)
			{
				for(int j=0;j<4;j++)
				{
					int l = in.nextInt();
					if(choice1==i)
					{
						for(int k=0;k<4;k++)
						{
							if(tempArray[k]==l)
							{
								output = l;
								count++;
							}
						}
					}
				}
			}
			if(count==1)
			{
				System.out.println("Case #"+test +": "+output);
			}
			else if(count>1)
			{
				System.out.println("Case #"+test +": Bad magician!");
			}
			else if(count==0)
			{
				System.out.println("Case #"+test +": Volunteer cheated!");
			}
		}
	}

}
