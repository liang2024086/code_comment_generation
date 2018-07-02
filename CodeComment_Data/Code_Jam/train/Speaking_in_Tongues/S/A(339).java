package methodEmbedding.Speaking_in_Tongues.S.LYD1143;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class A {
	
	public static void main(String args[]) throws FileNotFoundException
	{
		Scanner sin=new Scanner(new File("C:\\Users\\DELL\\Desktop\\CodeJam\\A-small-attempt1.in"));
		PrintStream ps=new PrintStream(new File("C:\\Users\\DELL\\Desktop\\CodeJam\\out.txt"));
		char array[]="yhesocvxduiglbkrztnwjpfmaq".toCharArray();
		System.out.println(array.length);
		int num=sin.nextInt();
		sin.nextLine();
		for(int j=1;j<=num;j++)
		{
			String s=sin.nextLine();
			//System.out.println(s);
			String out="";
			for(int i=0;i<s.length();i++)
			{
				char c=s.charAt(i);
				if(c==' ')
					out+=' ';
				else
					out+=array[(int)c-97];
				
			}
			ps.println("Case #"+j+": "+out);
		}
		ps.close();
	}

}
