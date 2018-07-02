package methodEmbedding.Revenge_of_the_Pancakes.S.LYD642;

import java.io.FileNotFoundException;
import java.util.Scanner;


public class ProblemB {
	static Scanner in=new Scanner(System.in);
	public static void main(String[] args) throws FileNotFoundException {
		java.io.PrintStream out=new java.io.PrintStream("C:/users/Josh/documents/output.txt");
		int run=Integer.parseInt(in.nextLine());
		for(int p=0;p<run;p++)
		{
			String inp=in.nextLine();
			int check=0;
			int flips=0;
			while(check==0)
			{
				char start=inp.charAt(0);
				int count=1;
				while(count<inp.length()&&inp.charAt(count)==start)
				{
					count++;
				}
				if(count==inp.length())
				{
					if(start=='-')
					{
						check=1;
					}
					else
					{
						flips--;
						check=1;
					}
				}
				else
				{
					inp=inp.substring(count);
					if(start=='-')
					{
						for(int c=0;c<count;c++)
						{
							inp="+"+inp;
						}
					}
					else
					{
						for(int c=0;c<count;c++)
						{
							inp="-"+inp;
						}
					}
				}
				flips++;
			}
			out.println("Case #"+(p+1)+": "+flips);
		}
	}
}
