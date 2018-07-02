package methodEmbedding.Speaking_in_Tongues.S.LYD641;

import java.io.*;
import java.util.Scanner;

public class CopyOfjam1Lang2 {
	
	public static void main(String args[]) throws java.lang.Exception
	{
		int arr[][]=new int[26][2];
		int tmp1=0;
		//int parr[]=new int[26];
		String parr[]=new String[26];
	
		
		
		
		String str1="ejp mysljylc kd q z kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv";
		String str2="our language is z q impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up";
		String tstr1,tstr2;
		int m,n;
		int len=str1.length();
		for(int i=0;i<len;i++)
		{
			tstr1=str1.substring(i, i+1);
			tstr2=str2.substring(i, i+1);
			if(tstr1.equals(" "))
			{
				continue;
			}
			else
			{
			m=str1.charAt(i);n=str2.charAt(i);
			parr[m-97]=tstr2;
			//System.out.println(m);
			}
		}
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		in = new BufferedReader(new FileReader("A-small-attempt1" + ".in"));
		//in = new BufferedReader(new FileReader("input" + ".in"));
		PrintWriter out=new PrintWriter("Output" + ".out");
		Scanner scan=new Scanner(System.in);
		int t,cas=1;
		//t=scan.nextInt();
		t=Integer.parseInt(in.readLine());
		
		//System.out.println(t);
		
		while(t!=0)
		{
			t--;
		
		str1=in.readLine();
		len=str1.length();
		
		out.print("Case #"+cas+": ");
		System.out.print("Case #"+cas+": ");
		cas++;
		for(int i=0;i<len;i++)
		{
			
			tstr1=str1.substring(i, i+1);
			//tstr2=str2.substring(i, i+1);
			if(tstr1.equals(" "))
			{
				//continue;
				out.print(" ");
				System.out.print(" ");
			}
			else
			{
				m=str1.charAt(i);
				out.print(parr[m-97]);
				System.out.print(parr[m-97]);
				//char ch=Integer.to
				
				
			}
		}
		
		out.println();
		System.out.println();
		
		}
		
		in.close();
		out.close();

	
		
	
	
	}

}
