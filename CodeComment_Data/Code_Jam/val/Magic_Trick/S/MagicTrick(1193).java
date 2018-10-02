package methodEmbedding.Magic_Trick.S.LYD1167;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class MagicTrick {
public static void main(String args[])throws IOException
{
	BufferedReader obj = new BufferedReader(new FileReader("D:\\A-small-attempt0.in"));
	PrintWriter prt = new PrintWriter(new FileWriter("D:\\output.txt"));
	String line = obj.readLine();
	int t = Integer.parseInt(line);
	for (int i=1;i<=t;i++)
	{
		prt.print("Case #"+ i+": ");
		int arr1[][] = new int[4][4];
		int arr2[][] = new int[4][4];
		line = obj.readLine();
		int ans[]= new int[4];
		int l=0;
		int a1  = Integer.parseInt(line);
		a1--;
		for (int j=0;j<4;j++)
		{
			line =obj.readLine();
			String str[] = line.split(" ");
			for (int k=0;k<4;k++)
			{
				arr1[j][k] = Integer.parseInt(str[k]);
			}
		}
		line = obj.readLine();
		int a2  = Integer.parseInt(line);
		a2--;
		for (int j=0;j<4;j++)
		{
			line =obj.readLine();
			String str[] = line.split(" ");
			for (int k=0;k<4;k++)
			{
				arr2[j][k] = Integer.parseInt(str[k]);
			}
		}
		
		for (int j=0;j<4;j++)
		{
			for (int k=0;k<4;k++)
				if (arr1[a1][j]==arr2[a2][k])
					ans[l++] = arr1[a1][j];
		}
	    if (l==1)
	    	prt.println(ans[l-1]);
	    if (l==0)
	    	prt.println("Volunteer cheated!");
	    if (l>1)
	    	prt.println("Bad magician!");
		
		
	  
}
	 obj.close();
	   prt.close();
}
}
