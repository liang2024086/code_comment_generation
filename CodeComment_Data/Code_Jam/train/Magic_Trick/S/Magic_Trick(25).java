package methodEmbedding.Magic_Trick.S.LYD1944;

import java.util.*;
import java.io.*;

class Magic_Trick
{
	public static void main(String args[]) throws IOException
	{
		File  fileName =new File( "A-small-attempt0.in");
		Scanner in = new Scanner(fileName);
		
		File file = new File("Magic_Trick_output.txt");
		
		if (!file.exists()) {
				file.createNewFile();
			}
		FileWriter fwriter = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fwriter);

		int test_case,row1,row2,check=0;
		int arrangement[][]=new int[5][5];
		int r1[]=new int[5];
		test_case=in.nextInt();
		int result[]=new int[test_case+1];
		int answer[]=new int[test_case+1];
		for(int x=1;x<=test_case;x++)
		{
			row1=in.nextInt();
			for(int i=1;i<5;i++)
				for(int j=1;j<5;j++)
					arrangement[i][j]=in.nextInt();

			for(int i=1;i<5;i++)
				r1[i]=arrangement[row1][i];
			
			row2=in.nextInt();
			for(int i=1;i<5;i++)
				for(int j=1;j<5;j++)
					arrangement[i][j]=in.nextInt();
				
			for(int i=1;i<5;i++)
			{
				if(r1[1]==arrangement[row2][i]||r1[2]==arrangement[row2][i]||r1[3]==arrangement[row2][i]||r1[4]==arrangement[row2][i])
				{
					check++;
					answer[x]=arrangement[row2][i];
				}
				
			}
			result[x]=check;
	
		check=0;
		}
		
		for(int i=1;i<=test_case;i++)
		{
			if(result[i]==1)
				bw.write("Case #"+i+": "+answer[i]+"\n");
				
			else if(result[i]==0)
				bw.write("Case #"+i+": Volunteer cheated!\n");
			else 
				bw.write("Case #"+i+": Bad magician!\n");
		}
		bw.close();
	}
}
