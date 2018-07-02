package methodEmbedding.Magic_Trick.S.LYD1751;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Main
{

public static void main(String args[]) throws IOException
	{

BufferedReader br = new BufferedReader(new FileReader("input.txt"));

int T = Integer.parseInt(br.readLine());

File file = new File("output.txt");
 
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
 
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
		
		for(int t=1;t<=T;t++)
		{
	
		
		int b1[][] = new int[4][4];
		int b2[][] = new int[4][4];
		
		int a1 = Integer.parseInt(br.readLine());
		
		

		for(int i=0;i<4;i++)
			{
			String str1[] = br.readLine().split(" ");
			for(int j=0;j<4;j++)
				{
				b1[i][j] = Integer.parseInt(str1[j]);				
				}
			}

		int a2 = Integer.parseInt(br.readLine());
		
		for(int i=0;i<4;i++)
			{
			String str2[] = br.readLine().split(" ");
			for(int j=0;j<4;j++)
				{
				b2[i][j] = Integer.parseInt(str2[j]);				
				}
			}

		int count = 0;
		int ans=0;

		for(int i=0;i<4;i++)
			{
			for(int j=0;j<4;j++)
				{
				if(b1[a1-1][i]==b2[a2-1][j])
					{
					count++;
					ans = b1[a1-1][i];
					break;
					}
				}
			}

		if(count==0)
			bw.write("Case #"+t+": "+"Volunteer cheated!");
		
		else if(count==1)
		bw.write("Case #"+t+": "+ans);
		
		else
		bw.write("Case #"+t+": "+"Bad magician!");
		
		bw.newLine();

		}

	bw.close();

	}

}
