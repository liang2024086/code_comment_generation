package methodEmbedding.Counting_Sheep.S.LYD249;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class ProblemA {

	public static void main(String[] args) throws FileNotFoundException {
		File f=new File("A-small-attempt4.in");
		
		Scanner sc=new Scanner(f);
		//Scanner sc=new Scanner(System.in);
		File o=new File("output.txt");
		PrintStream ps=new PrintStream(o);
		System.setOut(ps);
		int T=sc.nextInt();
		for(int t=1;t<=T;t++)
		{
			Set<Character> nums=new HashSet<Character>();
			int num=0;
			int n=sc.nextInt();
			String s="";
			int i=1;
			int nt=1;
			while(true)
			{
				if(n==0)
				{
					break;
				}
				nt=n*i;
				i++;
				s=nt+"";
				for (Character character : s.toCharArray()) {
					nums.add(character);
					if(nums.size()==10)
					{
						num=nt;
						break;
					}
				}
				if(nums.size()==10)
				{
				num=nt;
				break;
				}
			}
			if(n==0)
			{
				System.out.println("Case #"+t+": INSOMNIA");
			}
			else
				System.out.println("Case #"+t+": "+num);
		}

	}

}
