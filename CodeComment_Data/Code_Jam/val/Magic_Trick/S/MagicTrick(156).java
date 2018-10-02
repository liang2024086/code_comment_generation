package methodEmbedding.Magic_Trick.S.LYD1904;

import java.io.*;
class MagicTrick
{
	public static void main(String[] args)throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(input.readLine());
		int answer1,answer2,flag = 0,val = 0;
		PrintWriter writer = new PrintWriter("out.txt", "UTF-8");
		int first[][] =  new int[4][4];
		int second[][] = new int[4][4];
		String s[];
		for(int k = 0;k < t;k++)
		{
		answer1 = Integer.parseInt(input.readLine())-1;
		flag = 0;
		for(int i = 0;i < 4;i++)
		{
			s = input.readLine().split(" ");
			for(int j=0;j<4;j++)
			{
				first[i][j] = Integer.parseInt(s[j]);
			}
		}

		answer2 = Integer.parseInt(input.readLine())-1;

		for(int i = 0;i<4;i++)
		{
			s = input.readLine().split(" ");
			for(int j=0;j<4;j++)
			{
				second[i][j] = Integer.parseInt(s[j]);
			}
		}

		for(int i = 0;i < 4;i++)
		{
			for(int j = 0;j<4;j++)
			{
				if(first[answer1][i] == second[answer2][j])
				{
					val = second[answer2][j];
					flag++;
				}
				else
				{

				}
			}
		}
		
		//System.out.print("Case #"+(k+1)+": ");

		writer.print("Case #"+(k+1)+": ");
		if(flag == 1)
		{
			System.out.println(val);

			writer.println(val);

		}
		else
		{
			if(flag ==0)
			{
				writer.println("Volunteer cheated!");
				//System.out.println("Volunteer cheated!");
			}
			else
			{
				writer.println("Bad magician!");
				//System.out.println("Bad magician!");
			}
		}
	}
	writer.close();

		
	}
}
