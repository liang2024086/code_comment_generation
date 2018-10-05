package methodEmbedding.Counting_Sheep.S.LYD1625;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.*;

public class sheep
{
	public static void main(String[]args) throws FileNotFoundException
	{
		Scanner in = new Scanner(System.in);
		int read = in.nextInt();
		in.nextLine();
		for(int cases=1;cases<=read;cases++)
		{
			String g = in.nextLine();
			boolean flag = false;
			List<Character> count = new LinkedList<Character>();
			int counter = 2;
			String n = g;
			while (count.size() < 10)
			{				
				if(Integer.parseInt(n) == 0)
					{flag = true; break;}				
				
				for(int i=0; i<n.length(); i++)
				{
					char temp = n.charAt(i);
					if (!count.contains(temp))
						count.add(temp);					
				}
				if(count.size() == 10)
					break;
				n = String.valueOf((Long.parseLong(g)*counter++));
			}
			
			if(flag)
				System.out.println("Case #"+(cases)+": INSOMNIA");
			else
				System.out.println("Case #"+(cases)+": "+n);
		}
		in.close();
	}
}
