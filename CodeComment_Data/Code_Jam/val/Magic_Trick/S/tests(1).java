package methodEmbedding.Magic_Trick.S.LYD2033;

import java.io.*;
import java.util.Scanner;
public class tests {

	public static void main(String[] args) {

		Scanner in = new Scanner (System.in);
		int t = in.nextInt();
		int mas1[][] = new int[4][4];
		int mas2[][] = new int[4][4];
		int ans1=0, ans2 = 0;
		for (int i=0; i<t; i++)
		{
			ans1 = in.nextInt();
			for (int j=0; j<4; j++)
				for(int k=0; k<4; k++)
					mas1[j][k] = in.nextInt();
			ans2 = in.nextInt();
			for (int j=0; j<4; j++)
				for(int k=0; k<4; k++)
					mas2[j][k] = in.nextInt();
			int key=0, counter = 0;
			for (int j=0; j<4; j++)
			{
				for (int k=0; k<4; k++)
				{
					if (mas1[ans1-1][j] == mas2[ans2-1][k])
					{
						counter++;
						key = mas1[ans1-1][j];
					}
				}
			}
			if (counter==0)
				System.out.println("Case #" + (i+1) + ": Volunteer cheated!");
			else if (counter==1)
				System.out.println("Case #" + (i+1) + ": " + key);
			else
				System.out.println("Case #" + (i+1) + ": Bad magician!");
		}
	}

}
