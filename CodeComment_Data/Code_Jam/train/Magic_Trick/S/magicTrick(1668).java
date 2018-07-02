package methodEmbedding.Magic_Trick.S.LYD1471;

import java.util.*;

class magicTrick
{
	public static void main(String[] args)
	{
		int numTest;
		int row;
		int[] temp = new int[4];
		int[][] matrix = new int[4][4];
		Scanner sc = new Scanner(System.in);

		numTest=sc.nextInt();

		for (int count=1;count<numTest+1;count++)
		{
			LinkedList<Integer> repeated = new LinkedList<Integer>();
			//get initial row
			row=sc.nextInt()-1;
			//input of cards
			for(int a=0;a<4;a++)
			{
				for(int b=0;b<4;b++)
				{
					matrix[a][b]=sc.nextInt();
				}
			}
			//copy out initial row
			for(int a=0;a<4;a++)
			{
				temp[a]=matrix[row][a];
			}

			//input of new row
			row=sc.nextInt()-1;
			
			//input cards after reshuffling
			for(int a=0;a<4;a++)
			{
				for(int b=0;b<4;b++)
				{
					matrix[a][b]=sc.nextInt();
				}
			}
			
			//tracking repetitions
			for(int a=0; a<4;a++)
			{
				for (int b=0;b<4;b++)
				{
					if (temp[a]==matrix[row][b])
						repeated.add(temp[a]);
				}
			}

			System.out.print("Case #"+count+": ");
			if (repeated.size()==0)
				System.out.println("Volunteer cheated!");
			if (repeated.size()==1)
				System.out.println(repeated.get(0));
			if (repeated.size()>1)
				System.out.println("Bad magician!");
					repeated.clear();
		}
	}
}
