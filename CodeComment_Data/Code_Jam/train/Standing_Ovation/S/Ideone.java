package methodEmbedding.Standing_Ovation.S.LYD798;


import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner src=new Scanner(System.in);
		int n=src.nextInt();
		int k=n;
		
		while(n-->0)
		{
			int c=0;
			int p=-0;
			int m=src.nextInt();
			String s=src.nextLine();
                        s=s.replaceAll(" ", "");
			//src.next();
            //            System.out.println(m+" s="+s);
			for(int i=0;i<=m;i++)
			{
				int cu=Integer.parseInt(""+s.charAt(i));
                               // System.out.println("p: "+p+"cu "+cu+"i "+i);
				if(p<i)
				{
					c++;
                                        p+=1;
				}
				p+=cu;
				
			}
			System.out.println("Case #"+(k-n)+": "+c);
			
			
		}
	}
}
