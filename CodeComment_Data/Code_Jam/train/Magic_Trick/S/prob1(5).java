package methodEmbedding.Magic_Trick.S.LYD1663;

import java.util.*;
class prob1
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int test_cases=in.nextInt();
		int[][]temp =new int[4][4];
		int [] temp2=new int [4];
		
		//int [] temp4=new int [4];
		int line;
		int line2;
		//while (in.hasNext())
		//{
			for (int i=0;i<test_cases;i++)
			{
				int [] temp4=new int [4];
				int [] value=new int [4];
					line=in.nextInt();
					for (int k=0;k<4;k++)
					{
						for (int l=0;l<4;l++)
						{
							temp[k][l]=in.nextInt();
						}
					}
					for (int k=0;k<4;k++)
					{
						temp2[k]=temp[line-1][k];
					}
					line2=in.nextInt();
					
					//System.out.println(line + " " + line2);
					for (int k=0;k<4;k++)
					{
						for (int l=0;l<4;l++)
						{
							int temp3=in.nextInt();
							for (int num=0;num<4;num++)
							{
								if (temp3==temp2[num])
								{
									temp4[k]++;
									value[k]=temp3;
								}
							}
						}
					}
					int t=i+1;
					for (int k=0;k<4;k++)
					{
						//System.out.println(temp2[k]+ " " +temp4[k]);
					}
					
					if (temp4[line2-1]==1)
					{
						System.out.println("Case #"+t+": "+value[line2-1]);
					}
					
					else if (temp4[line2-1]==0)
					{
						System.out.println("Case #"+t+": Volunteer cheated!");
					}
					else if (temp4[line2-1]>1)
					{
						System.out.println("Case #"+t+": Bad magician!");
					}
					
					
					
					
					
				
			}
		//}
		
		
		
		
	}
}
