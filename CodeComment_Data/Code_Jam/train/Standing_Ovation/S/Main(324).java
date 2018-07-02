package methodEmbedding.Standing_Ovation.S.LYD1898;

import java.util.*;
import java.io.*;
public class Main 
{
	public static void main(String args[])throws IOException
	{
		Scanner in = new Scanner(new File("abc"));
		int t = in.nextInt();
		int i,j;
		int ans[] = new int[t];
		for(i=0;i<t;i++)
		{
			int n = in.nextInt();
			String w = in.next();
			char y = w.charAt(0);
			int x = y-'0';
			int arr[] = new int[w.length()-1];
			int sum=0;
			int ct=0;
			for(j=0;j<w.length();j++)
			{
				int c=0;
				int z =w.charAt(j)-'0';
				if(z!=0)
				if(sum<(j))
					c+=(j-sum);
				sum+=z;
				ct+=c;
				sum+=c;
			}
			ans[i]=ct;
		}
		FileWriter fw = new FileWriter("/home/pranav/Desktop/test123");
		BufferedWriter bw = new BufferedWriter(fw);
		for(i=0;i<t;i++)
		{
			String w = "Case #";
			w+=(i+1)+": "+ans[i];
			bw.write(w+"\n");
		}
		bw.close();
	}
}
