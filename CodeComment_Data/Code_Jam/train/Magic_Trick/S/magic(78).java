package methodEmbedding.Magic_Trick.S.LYD115;


import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class magic
{
public static void main(String args[]) throws IOException
	{
		FileReader fr = new FileReader("/Users/deepeecasoundarrajan/Documents/magic1.txt");
		BufferedReader bf = new BufferedReader(fr);
		int[][] a = new int[4][4];
		int[][] b = new int[4][4];
		int flag;
		String line =  bf.readLine();
		int test = Integer.parseInt(line);
		int ans = 0;
		for(int  i = 1; i <= test; i++)
		{
			flag = 0;
			line = bf.readLine();
			int row1 =  Integer.parseInt(line);
			for(int j = 0; j < 4; j++)
			{
				line = bf.readLine();
				String[] words =  line.split(" ");
				for(int k = 0; k < 4; k++)
				{
					a[j][k] = Integer.parseInt(words[k]);
				}
			}
			line = bf.readLine();
			int row2 =  Integer.parseInt(line);
			for(int j = 0; j < 4; j++)
			{
				line = bf.readLine();
				String[] words =  line.split(" ");
				for(int k = 0; k < 4; k++)
				{
					b[j][k] = Integer.parseInt(words[k]);
				}
			}
			for(int l =0; l<4; l++)
			{
				for(int m =0; m < 4; m++)
				{
				if(a[row1-1][l] == b[row2-1][m])
				{
					flag++;
					ans = a[row1-1][l];
				}
				    
			    }
			}
				if(flag == 1)
				{
					System.out.print("Case #");
				    System.out.print(i);
				    System.out.print(": ");
				    System.out.print(ans);
				    System.out.print("\n");
				}
				else if(flag > 1)
				{
					System.out.print("Case #");
				    System.out.print(i);
				    System.out.print(": ");
				    System.out.print("Bad magician!");
				    System.out.print("\n");
				}
				else if(flag == 0)
				{
					System.out.print("Case #");
				    System.out.print(i);
				    System.out.print(": ");
				    System.out.print("Volunteer cheated!");
				    System.out.print("\n");
				}

		}
	
	}
}
