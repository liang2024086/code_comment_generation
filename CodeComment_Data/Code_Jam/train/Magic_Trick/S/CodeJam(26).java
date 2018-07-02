package methodEmbedding.Magic_Trick.S.LYD1947;

import java.util.Scanner;
import java.io.*;

public class CodeJam {
	public static void main(String[] args) throws IOException
	{
		Scanner in = new Scanner(new File("in.txt"));
		PrintStream out = new PrintStream(new File("out.txt"));
		int n=in.nextInt();
		for(int m=1;m<=n;m++)
		{
			int a=in.nextInt();
			int[][] aa = new int[4][4];
			for(int i=0;i<4;i++)
				for(int j=0;j<4;j++)
					aa[i][j]=in.nextInt();
			int b=in.nextInt();
			int[][] bb = new int[4][4];
			for(int i=0;i<4;i++)
				for(int j=0;j<4;j++)
					bb[i][j]=in.nextInt();
			int ans=0,cheat=0;
			for(int i=0;i<4;i++)
				for(int j=0;j<4;j++)
					if(aa[a-1][i]==bb[b-1][j])
					{
						if(ans==0)
							ans=aa[a-1][i];
						else
							cheat=1;
					}
			String x;
			if(cheat==1)
				x="Bad magician!";
			else if(ans==0)
				x="Volunteer cheated!";
			else
				x=ans+"";
			out.println("Case #"+m+": "+x);
		}
		in.close();
		out.close();
	}
}
