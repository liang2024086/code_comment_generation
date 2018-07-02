package methodEmbedding.Speaking_in_Tongues.S.LYD470;

import java.io.*;
import java.util.*;

public class A{	
	public static void main(String[] args)
	{
		
		String table = "ynficwlbkuomxsevzpdrjgthaq";
		Scanner fin = new Scanner(System.in);
		
		int cnt = 1;
		int n = fin.nextInt(); fin.nextLine();
		for(int i = 1;i<=n;i++)
		{
			char[] l = fin.nextLine().toCharArray();
			System.out.print("Case #" + i + ": ");
			for(char c : l)
				if(c==' ') System.out.print(" ");
				else
				{
					int pos = table.indexOf(c);
					System.out.print((char)(pos+'a'));
				}
			System.out.println();			
		}			
	}
}
