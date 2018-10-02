package methodEmbedding.Speaking_in_Tongues.S.LYD106;

import java.util.Scanner;

public class Main {
	public static void main(String args[])
	{
		String s;
		Scanner kb = new Scanner(System.in);
		int x = kb.nextInt();
		kb.nextLine();
		for(int i=0;i<x;i++)
		{
			s = kb.nextLine();
			System.out.print("Case #"+(i+1)+": ");
			
			for(int j=0;j<s.length();j++)
			{	
				if(s.charAt(j)=='a') System.out.print("y");
				else if(s.charAt(j)=='b') System.out.print("h");
				else if(s.charAt(j)=='c') System.out.print("e");
				else if(s.charAt(j)=='d') System.out.print("s");
				else if(s.charAt(j)=='e') System.out.print("o");
				else if(s.charAt(j)=='f') System.out.print("c");
				else if(s.charAt(j)=='g') System.out.print("v");
				else if(s.charAt(j)=='h') System.out.print("x");
				else if(s.charAt(j)=='i') System.out.print("d");
				else if(s.charAt(j)=='j') System.out.print("u");
				else if(s.charAt(j)=='k') System.out.print("i");
				else if(s.charAt(j)=='l') System.out.print("g");
				else if(s.charAt(j)=='m') System.out.print("l");
				else if(s.charAt(j)=='n') System.out.print("b");
				else if(s.charAt(j)=='o') System.out.print("k");
				else if(s.charAt(j)=='p') System.out.print("r");
				else if(s.charAt(j)=='q') System.out.print("z");
				else if(s.charAt(j)=='r') System.out.print("t");
            	else if(s.charAt(j)=='s') System.out.print("n");
            	else if(s.charAt(j)=='t') System.out.print("w");
            	else if(s.charAt(j)=='u') System.out.print("j");
            	else if(s.charAt(j)=='v') System.out.print("p");
            	else if(s.charAt(j)=='w') System.out.print("f");
            	else if(s.charAt(j)=='x') System.out.print("m");
            	else if(s.charAt(j)=='y') System.out.print("a");
            	else if(s.charAt(j)=='z') System.out.print("q");
            	else if(s.charAt(j)==' ') System.out.print(" ");
			}
			System.out.println();
		}
		
	}
	
	
}
