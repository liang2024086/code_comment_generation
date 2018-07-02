package methodEmbedding.Counting_Sheep.S.LYD1395;

import java.io.*;
import java.util.*;
public class ProblemA
{
	public static void main(String args[])throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int count,num;
		String n,fn;
		for(int tc = 1; tc<= t; tc++)
		{
			ArrayList<Character> al= new ArrayList<Character>(); 
			for(int i= 48; i<58;i++)
			{
				al.add((char)i);
			}

			n = (br.readLine());
			fn = n;
			num = Integer.parseInt(n);
			count = 1;
			/* String testing = "0128754236789";
			for(int i = 0; i<10;i++)
			{
				al.remove((Character)testing.charAt(i));
				System.out.println(al);
			} */
				
			if(num == 0)
				System.out.println("Case #"+tc+": INSOMNIA");
			else
			{
				while(!al.isEmpty())
				{
					fn = String.valueOf(num * count);
					//System.out.println(fn);
					for(int i = 0; i<fn.length();i++)
					{
						al.remove((Character)fn.charAt(i));
						/* System.out.println((Character)fn.charAt(i));
						System.out.println(num* count);
						System.out.println(al); */
						if(al.isEmpty())
							break;
					}
					count++;
				}
				System.out.println("Case #"+tc+": "+fn);
			}
		}
	}
}
