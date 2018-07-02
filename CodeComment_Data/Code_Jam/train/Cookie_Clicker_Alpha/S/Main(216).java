package methodEmbedding.Cookie_Clicker_Alpha.S.LYD881;

import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		int[][] cards = new int[4][4];
		for(int i=0;i<4;i++)
		{
			cards[i] = new int[4];
		}
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		for(int j=0;j<cases;j++)
		{
			int answer1 = sc.nextInt();
			int[] memorize = new int[4];
			//skip till the proper line
			for(int i=0;i<(answer1-1)*4;i++) sc.nextInt();
			//skip end, let's take the datas
			for(int i=0;i<4;i++) memorize[i] = sc.nextInt();
			//skip till the next shuffle
			for(int i=0;i<(4-answer1)*4;i++) sc.nextInt();
			
			int answer2 = sc.nextInt();
			int[] memorize2 = new int[4];
			//skip till the proper line
			for(int i=0;i<(answer2-1)*4;i++) sc.nextInt();
			//skip end, let's take the datas
			for(int i=0;i<4;i++) memorize2[i] = sc.nextInt();
			//skip till the next shuffle
			for(int i=0;i<(4-answer2)*4;i++) sc.nextInt();
			
			//let's compare the memorize 1 and memorize 2
			boolean broken = false;
			int compareCounter = 0;
			int compareValue = 0;
			for(int i=0;i<4;i++)
			{
				for(int k=0;k<4;k++)
				{
					if(memorize[i]==memorize2[k])
					{
						compareCounter++;
						compareValue = memorize[i];
						if(compareCounter > 1)
						{
							System.out.println("Case #"+(j+1)+": Bad magician!");
							k = 4;
							i = 4;
							broken = true;
						}
					}
				}
			}
			if(!broken)
			{
				if(compareCounter==0) System.out.println("Case #"+(j+1)+": Volunteer cheated!");
				else System.out.println("Case #"+(j+1)+": "+compareValue);
			}
		}
	}
}
