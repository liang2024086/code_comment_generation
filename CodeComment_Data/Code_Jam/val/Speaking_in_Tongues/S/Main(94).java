package methodEmbedding.Speaking_in_Tongues.S.LYD838;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Main {
	static String decode ="abcdefghijklmnopqrstuvwxyz";
	static String code ="ynficwlbkuomxsevzpdrjgthaq";
	public static void main(String[] args) throws FileNotFoundException {
		Scanner in =new Scanner(new File("A-small.in"));
		PrintWriter out=new PrintWriter("A-small.out");
		String Case="";  
		int T=1;
		T=in.nextInt();
		Case=in.nextLine();
		for(int i=0;i<T;i++)
		{
			out.print("Case #"+(i+1)+": ");
			Case=in.nextLine();
			for(int j=0;j<Case.length();j++)
			{
				if(decode.indexOf(Case.charAt(j))!=-1)
					out.print(decode.charAt(code.indexOf(Case.charAt(j))));
				else out.print(Case.charAt(j));
			}
			if(i+1!=T) out.println("");
		}
		out.close();
		in.close();
	}
}
