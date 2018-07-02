package methodEmbedding.Speaking_in_Tongues.S.LYD1132;


import java.io.*;
import java.util.*;

public class probA {
	public static void main (String args[]) throws IOException
	{
		BufferedReader in = new BufferedReader(new FileReader("C:\\downloads\\a-small-attempt0.in"));
		BufferedWriter out = new BufferedWriter(new FileWriter("C:\\downloads\\a-small-output.in"));
		int t = Integer.parseInt(in.readLine());
		int i,j;
		String s = "abcdefghijklmnopqrstuvwxyz ";
		String s1 = "ynficwlbkuomxsevzpdrjgthaq ";
		for (i=1;i<=t;i++)
		{ String str = in.readLine();
		  StringBuilder sb = new StringBuilder();
		  for (j=0;j<str.length();j++)
			  sb.append(s.charAt(s1.indexOf(str.charAt(j))));
		  str = sb.toString();
		  out.write("Case #"+i+": "+str);
		  out.newLine();
		}
		out.close();

	}
}
