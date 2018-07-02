package methodEmbedding.Magic_Trick.S.LYD1577;

import java.util.Scanner;
import java.io.*;
import java.util.*;

class Magic {
	
	
	
	public static void main (String [] args) throws IOException {
		// Use BufferedReader rather than RandomAccessFile; it's much faster
		BufferedReader f = new BufferedReader(new FileReader("small.txt"));
                                                  // input file name goes above
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("out.txt")));
		Scanner in = new Scanner(f);
		int t = in.nextInt();
		
		int [][]p1 = new int[4][4];
		int [][]p2 = new int[4][4];
		int r1, r2;
		int i,j;
		int n = 4;
		int r;
		int flag;
		for(int c = 1; c <= t; c++)
		{
			r1 = in.nextInt();
			r1--;
			for(i = 0; i < n; i++)
			{
				for(j = 0; j < n; j++)
				{
					p1[i][j] = in.nextInt();
				}
			}
			r2 = in.nextInt();
			r2--;
			for(i = 0; i < n; i++)
			{
				for(j = 0; j < n; j++)
				{
					p2[i][j] = in.nextInt();
				}
			}
			r = 0;
			flag = 0;//0 init; 1 one; 2 more;
			for(i = 0; i < n; i++)
			{
				if(flag == 2) break;
				for(j = 0; j < n; j++)
				{
					if(p1[r1][i] == p2[r2][j])
					{
						if(flag == 1)
						{
							flag = 2;
							break;
						}
						if(flag == 0)
						{
							flag = 1;
							r = p1[r1][i];
						}
					}
				}
			}
			if(flag == 0) out.println("Case #" + c + ": Volunteer cheated!");
			if(flag == 1) out.println("Case #" + c + ": " + r);
			if(flag == 2) out.println("Case #" + c + ": Bad magician!");
		}
		
		f.close();
		out.close();
		System.exit(0);                               // don't omit this!
	}
}
