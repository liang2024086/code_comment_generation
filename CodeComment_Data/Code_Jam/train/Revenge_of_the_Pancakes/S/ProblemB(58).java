package methodEmbedding.Revenge_of_the_Pancakes.S.LYD425;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class ProblemB {

	public static void main(String[] args) throws FileNotFoundException {
		File f=new File("B-small-attempt1.in");
		
		Scanner sc=new Scanner(f);
		File o=new File("output.txt");
		PrintStream ps=new PrintStream(o);
		System.setOut(ps);
		int T=Integer.parseInt(sc.nextLine());
		for(int t=1;t<=T;t++)
		{
			String s=sc.nextLine();
			int n=0;
			if(s.charAt(0)=='-')
			{
				n=n+1;
			}
			boolean plusfound=false;
			for (Character ch : s.toCharArray()) {
				if(ch=='+')
				{
					plusfound=true;
				}
				else if(plusfound==true && ch=='-')
				{
					n+=2;
					plusfound=false;
				}
				else
				{
					plusfound=false;
				}
			}
			System.out.println("Case #"+t+": "+n);
		}
	}

}
