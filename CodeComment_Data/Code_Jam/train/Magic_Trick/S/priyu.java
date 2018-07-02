package methodEmbedding.Magic_Trick.S.LYD1403;

import java.util.StringTokenizer;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.lang.Double;
import java.io.*;
import java.util.StringTokenizer;
import java.util.*;
class priyu
{
public static void main(String[] args)
{
try
{
	FileReader fr = new FileReader("A-small-attempt1.in");
	BufferedReader br = new BufferedReader(fr);
	FileWriter fw =new FileWriter("newwrite.txt");
	BufferedWriter bw = new BufferedWriter(fw);
	int total = Integer.parseInt(br.readLine());
	int r1[] = new int[4];
	int r2[] = new int[4];
	int p[][] = new int[4][4];
	for(int i=0;i<total;i++)
	{
		int row1 = Integer.parseInt(br.readLine());
		String[] s1 = new String[4];
		for(int j=0;j<4;j++)
		{
			s1[j] = br.readLine();
			StringTokenizer st = new StringTokenizer(s1[j]," ");
			if(j+1==row1)
			{
				int k = 0;
				while(st.hasMoreTokens())
				{
					r1[k] = Integer.parseInt(st.nextToken());
					k++;
				}
			}
		}
		int row2 = Integer.parseInt(br.readLine());
		String[] s2 = new String[4];
		for(int j=0;j<4;j++)
		{
			s2[j] = br.readLine();
			StringTokenizer st = new StringTokenizer(s2[j]," ");
			if(j+1==row2)
			{
				int k = 0;
				while(st.hasMoreTokens())
				{
					r2[k] = Integer.parseInt(st.nextToken());
					k++;
				}
			}
		}
		int count = 0,ans=0;
		for(int a=0;a<4;a++)
		{
			for(int b=0;b<4;b++)
			{
				if(r1[a]==r2[b])
				{
					ans = r1[a];
					count++;
				}
			}
		}
		if(count == 1)
		{
		String str="Case #"+(i+1)+": ";
		bw.write(str);
		bw.write(String.valueOf(ans));
		}
		else if(count>1)
		{
		String str="Case #"+(i+1)+": "+"Bad magician!";
		bw.write(str);
		}
		else
		{
		String str="Case #"+(i+1)+": "+"Volunteer cheated!";
		bw.write(str);
		}
		bw.newLine();
	}
	bw.flush();
	bw.close();
}
catch(Exception e)
{
e.printStackTrace();
}
}
}
