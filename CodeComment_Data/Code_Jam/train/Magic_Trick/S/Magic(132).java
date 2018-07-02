package methodEmbedding.Magic_Trick.S.LYD651;

import java.io.*;
import java.util.StringTokenizer;
class Magic
{
	void main() throws IOException
	{
		FileReader fin = new FileReader("magic.txt");
		BufferedReader br = new BufferedReader(fin);
		PrintWriter pw = new PrintWriter("output.txt");
		int T = Integer.parseInt(br.readLine());
		cases:
		for(int i=0; i<T; i++)
		{
			pw.print("Case #" + (i+1) + ": ");
			int n1 = Integer.parseInt(br.readLine());
			int A[] = new int[4];
			for(int j=0; j<4; j++)
			{
			    String cur = br.readLine();
				if(j==(n1-1))
				{
					StringTokenizer st = new StringTokenizer(cur);
					for(int k=0; k<4; k++)
					{
						A[k] = Integer.parseInt(st.nextToken());
					}
				}
			}
			int n2 = Integer.parseInt(br.readLine());
			int B[] = new int[4];
			for(int j=0; j<4; j++)
			{
			    String cur = br.readLine();
				if(j==(n2-1))
				{
					StringTokenizer st = new StringTokenizer(cur);
					for(int k=0; k<4; k++)
					{
						B[k] = Integer.parseInt(st.nextToken());
					}
				}
			}
			//compare
			boolean found = false;
			int id=-1;
			for(int j=0; j<4; j++)
			{
				int cur = A[j];
				for(int k=0; k<4; k++)
				{
					if(B[k]==cur)
					{
						if(found)
						{
							pw.print("Bad magician!");
							pw.println("");
							continue cases;
						}
						else
						{
							found = true;
							id = cur;
						}
					}
				}
			}
			if(found)
				pw.print(id + "\n");
			else
				pw.print("Volunteer cheated!\n");
			pw.println("");
		}
		pw.close();
	}
}
