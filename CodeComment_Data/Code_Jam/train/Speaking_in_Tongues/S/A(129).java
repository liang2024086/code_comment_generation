package methodEmbedding.Speaking_in_Tongues.S.LYD1253;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;


public class A {
	public static void main(String[] args)throws Exception
	{
		Scanner br=new Scanner(new File("A-small-attempt0.in"));
		PrintWriter out=new PrintWriter("file.out");
		int cases=br.nextInt();
		String str="ynficwlbkuomxsevzpdrjgthaq";
		br.nextLine();
		for(int c=1;c<=cases;c++)
		{
			char[] s=br.nextLine().toCharArray();
			for(int i=0;i<s.length;i++)
			{
				if(s[i]!=' ')
					s[i]=(char)('a'+str.indexOf(s[i]));
			}
			out.printf("Case #%d: %s\n",c,new String(s));
		}
		out.close();
	}
}
