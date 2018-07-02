package methodEmbedding.Standing_Ovation.S.LYD2183;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Scanner;


public class A {
	public static void main(String args[]) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(new File("small.txt"));
		BufferedWriter bw = new BufferedWriter(out);
		
		int T = Integer.parseInt(sc.nextLine());
		
		for (int l=0; l<T; l++)
		{
			String str = sc.nextLine();
			
			
			int j = 0;
			for (j=0; j<str.length(); j++)
				if ((str.charAt(j))==' ')
					break;
			
			int n = Integer.parseInt(str.substring(0, j));
			
			str = str.substring(j+1);	
			
			int guests = 0;
			int count = 0;
			for (int i=0; i<=n; i++)
			{
				int k = Character.getNumericValue(str.charAt(i));
				
				if (k!=0)
				{
					if (count<i) { guests += i-count; count = i; }
					count+=k;
					
				}	
			}
			out.println("Case #" + (l+1) + ": " + guests);
			
		}
		
		out.close();
	}
	
}
