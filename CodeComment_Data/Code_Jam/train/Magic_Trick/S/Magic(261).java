package methodEmbedding.Magic_Trick.S.LYD324;


import java.io.FileNotFoundException; 
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Magic
{
	public static void main(String[] args) 
	{
		int N, x, a1, a2; 
		int[][] cards = new int[4][4];
		int[] pos = new int[4];
		int[] m = new int[4];
		String card = null;

		try 
		{
			Scanner s = new Scanner(new FileReader("input.txt"));
			PrintWriter outputStream = new PrintWriter(new FileOutputStream("output.txt"));
			N = s.nextInt();
			for(x=1; x<=N; x++)
			{
				a1 = s.nextInt();
				for(int i=0; i<4; i++)
				{
					for(int k=0; k<4; k++)
						cards[i][k] = s.nextInt();
				}
				for(int i=0; i<4; i++)
				{
					pos[i] = cards[a1-1][i];
				}
				a2 = s.nextInt();
				for(int i=0; i<4; i++)
				{
					for(int k=0; k<4; k++)
						cards[i][k] = s.nextInt();
				}
				m = cards[a2-1];
				int count = 0;
				for(int j=0; j<4; j++)
				{
					for(int k=0; k<4; k++)
					{
						if(pos[j] == m[k])
						{
							card = pos[j] + " ";
							count++;
						}
					}
				}
				if(count > 1)
					card = "Bad magician!";
				if(count == 0)
					card = "Volunteer cheated!";
				outputStream.println("Case #" + x + ": " + card);
			}
			outputStream.close();
		} catch (FileNotFoundException e) 
		{	
			System.out.println("File not found");
		}
	}
}
