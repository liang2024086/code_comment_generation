package methodEmbedding.Magic_Trick.S.LYD1708;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class MagicTrick 
{
	public static void main(String[] args) throws IOException 
	{
		Scanner sc = new Scanner (new File("magic_trick.in"));
		BufferedWriter fw = new BufferedWriter(new FileWriter(new File("magic_trick.out")));
		int T = sc.nextInt();
		for (int caseNum = 1; caseNum <= T; caseNum++)
		{
			int row1 = sc.nextInt()-1;
			int[][] cas1 = new int[4][4];
			for (int i = 0; i<4; i++)
			{
				for (int j = 0; j<4; j++)
				{
						cas1[i][j] = sc.nextInt();
				}
			}	
			int row2 = sc.nextInt()-1;
			int[][] cas2 = new int[4][4];
			for (int i = 0; i<4; i++)
			{
				for (int j = 0; j<4; j++)
				{
					cas2[i][j] = sc.nextInt();
				}
			}
			int tot = 0;
			for(int i = 0; i<4; i++)
			{
				for (int j = 0; j<4; j++)
				{
					if (cas1[row1][i] == cas2[row2][j])
					{
						if (tot == 0)
							tot += cas1[row1][i];
						else
							tot += 100;
					}
				}
			}
			fw.write("Case #"+caseNum+": ");
			if (tot == 0)
			{
				fw.write("Volunteer cheated!\n");
			}
			else if (tot>20)
				fw.write("Bad magician!\n");
			else
				fw.write(""+tot+"\n");
		}
		fw.flush();
		fw.close();
		sc.close();
	}
}

