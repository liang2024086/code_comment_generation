package methodEmbedding.Standing_Ovation.S.LYD1652;

import java.util.*;
import java.io.File;
import java.io.*;


class codejam11
{
		public static void main(String args[])throws IOException
	{
		Scanner input=new Scanner(new File("a.in"));
		int test = input.nextInt();
		PrintWriter printer = new PrintWriter(new File("r.txt"));
		//System.out.println("test   "+ test);
		int count=0;
		while ((++count)<=test)
		{

		    int smax=input.nextInt();
		    String s=input.next();
		    int sum=0;
			int min=0;

			for(int j=0;j<=smax;j++)
			{
				int q=(int)(s.charAt(j)-48);
				if(sum<j)
				{
					if(min<(j-sum))
					{
						min=j-sum;
					}
				}
					sum=sum+q;
			}
			String str="Case #"+count+": "+min+"\n";
			printer.println(str);

			printer.flush();

			//System.out.println(s);
		}
	}
}
