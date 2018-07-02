package methodEmbedding.Speaking_in_Tongues.S.LYD1551;

import java.io.*;
import java.util.*;
class Speak
{
	
	public static void main(String[] args) throws Exception {
		//Scanner sc = new Scanner(System.in);
		// PrintWriter pw = new PrintWriter(System.out);
		Scanner sc = new Scanner(new FileReader("A-small-attempt0.in"));
		//Console console=System.console(new FileReader("A-small-practice-1.in"));
		PrintWriter pw = new PrintWriter(new FileWriter("A-small-attempt0.out"));
		
		int ntest = sc.nextInt();
		System.out.println(ntest);
		String str="abcdefghijklmnopqrstuvwxyz";
		String str1="yhesocvxduiglbkrztnwjpfmaq";
		String q=sc.nextLine();
		//System.out.println(q);
		String ip="";
		String op="";
		//String f=str+'c';
		for(int j=1;j<=ntest;j++)
		{
			
			System.out.println(j);
			ip=sc.nextLine();
			System.out.println(ip);
			op="";
		for(int i=0;i<ip.length();i++)
		{
			char c=ip.charAt(i);
			//System.out.println(c);
			int k=str.indexOf(c);
			//String ss=String.Valueof(str1.charAt(k));
			//op=op+str1.charAt(k);
			//System.out.println(k);
			if(c==' ')
			{
				op=op+" ";
			}
			else
			{
			op=op+str1.charAt(k);
			
			}
			
			
		}
		//System.out.println(op);
		pw.print("Case #" + j + ": ");
			pw.print(op);
			pw.println();
		}
		
		pw.close();
		sc.close();
	}
	
}
