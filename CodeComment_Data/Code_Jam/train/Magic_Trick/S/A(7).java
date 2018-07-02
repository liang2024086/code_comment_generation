package methodEmbedding.Magic_Trick.S.LYD361;

import java.io.*;

public class A {
    public static void main(String[] args) throws Exception
    {
       	java.io.BufferedReader br= new java.io.BufferedReader(new FileReader("input2.in"));
	java.io.PrintStream pw = new java.io.PrintStream(new java.io.FileOutputStream("output.txt"));
	System.setOut(pw);

	int t = Integer.parseInt(br.readLine());

	try{
		int tc = 0;
		while (t-- > 0)
		{
			tc++;
			int [] ans = new int[2];
			int [][][] rows = new int[2][4][4];

			for (int y=0;y<2;y++)
			{
				ans[y] = Integer.parseInt(br.readLine());
				int fr = 0;
				for (int i=0;i<4;i++)
				{
					String row =  br.readLine();
					String [] trow =  row.split(" ");
					for (int j=0;j<4;j++)
					{
						rows[y][fr][j] = Integer.parseInt(trow[j]);
						
					}
					fr++;
				}
			}

			int matches = 0;
			int match = 0;

			int [] rone = new int[4];
			int [] rtwo = new int[4];
			for (int i=0;i<4;i++)
			{					
				rone[i] = rows[0][ans[0] - 1][i];
				rtwo[i] = rows[1][ans[1] - 1][i];
			}

			for (int i=0;i<4;i++)
			{
				int cn = rone[i];
				for (int j=0;j<4;j++)
				{
					if (cn == rtwo[j])
					{
						matches++;
						match = cn;
					}
				}
			}

			if (matches == 1)
			{
				pw.println("Case #" + tc + ": " + match);
			}
			else if(matches > 1)
			{
				pw.println("Case #" + tc + ": Bad magician!");
			}
			else
			{
				pw.println("Case #" + tc + ": Volunteer cheated!");
			}
					
		}
	}
	catch(Exception e){
		 e.printStackTrace();
	}

	pw.flush();	
    }
}
