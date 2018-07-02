package methodEmbedding.Magic_Trick.S.LYD1123;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class First 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		int[][] f = new int[4][4];
		int[][] s = new int[4][4];
		
		Scanner fin = new Scanner(new File("A-small-attempt2.in"));
		PrintWriter fout = new PrintWriter(new File("A-small-attempt0.out"));
		int cases = fin.nextInt();
		for(int k = 1 ; k<= cases; k++)
		{
			int fr = fin.nextInt()-1;
			for(int i=0;i!=4;i++)
			{
				for(int j=0;j!=4;j++)
					f[i][j] = fin.nextInt();
			}
			int sr = fin.nextInt()-1;
			for(int i=0;i!=4;i++)
			{
				for(int j=0;j!=4;j++)
					s[i][j] = fin.nextInt();
			}
			int c =0;
			int ans = 0;
			for(int i=0;i!=4;i++)
			{
				for(int j=0;j!=4;j++)
					if(f[fr][i]==s[sr][j])
					{
						c++;
						ans = f[fr][i];
					}	
			}
			
			if(c == 1)
				fout.println("Case #" + k + ": " + ans);
			else if(c>1)
				fout.println("Case #" + k + ": Bad magician!");
			else if(c==0)
				fout.println("Case #" + k + ": Volunteer cheated!");

		}
		
		fout.close();
		
	}

}
