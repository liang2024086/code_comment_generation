package methodEmbedding.Speaking_in_Tongues.S.LYD1301;

import java.util.*;
import java.math.*;
import java.io.*;
public class Main
	{
	public static void main(String args[])	throws IOException
		{
		Scanner c=new Scanner(System.in);
		int T=c.nextInt();
		c.nextLine();
		char A[]={'y', 'h', 'e', 's', 'o', 'c', 'v', 'x', 'd', 'u', 'i', 'g', 'l', 'b', 'k', 'r', 'z', 't', 'n', 'w', 'j', 'p', 'f', 'm', 'a', 'q'};
		for(int i=0;i<T;i++) 
			{
			String s1=c.nextLine();
			System.out.print("Case #"+(i+1)+": ");
			for(int j=0;j<s1.length();j++) 
				{
				if(s1.charAt(j)==' ')
					System.out.print(' ');
				else
					System.out.print(A[s1.charAt(j)-'a']);
				}
			System.out.println("");
			}
		}
	
	}

//must declare new classes here
