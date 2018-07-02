package methodEmbedding.Revenge_of_the_Pancakes.S.LYD56;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class q_2 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner in=new Scanner( new File("C:\\Users\\Prerak_D\\Desktop\\test.txt"));
		PrintWriter pw=new PrintWriter(new File("C:\\Users\\Prerak_D\\Desktop\\ans.txt"));
		int test=in.nextInt();
		in.nextLine();
		for(int t=1;t<=test;t++)
		{
			String str=in.nextLine();
			//System.out.println(str);
			boolean c;
			if(str.charAt(0)=='+')
				c=true;
			else
				c=false;
			
			int count=0;
			for(int i=1;i<str.length();i++)
			{
				if(!c && str.charAt(i)=='+')
				{
					count++;
					c=!c;
				}
				else if(c && str.charAt(i)=='-')
				{
					count++;
					c=!c;
				}
			}
			if(!c)
				count++;
			pw.println("Case #"+t+": "+count);
		}
		pw.close();
		
	}

}
