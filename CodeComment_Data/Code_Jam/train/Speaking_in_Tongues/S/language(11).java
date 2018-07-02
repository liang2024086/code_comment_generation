package methodEmbedding.Speaking_in_Tongues.S.LYD229;

import java.io.*;
import java.util.*;
import java.math.*;
public class language
{
	static int T=0;
	static char[] code= {'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
	static String in1;
	static String ans;
	public static void main(String[] args)
	{
		Scanner scan= new Scanner(System.in);
		
		T=scan.nextInt();
	//	System.out.println(T);
		scan.nextLine();
		for(int i=1; i<=T; i++)
		{
			in1= scan.nextLine();
			ans="";
			
			for(int j=0; j<in1.length(); j++)
				if(in1.charAt(j)!=' ')
					ans+= code[in1.charAt(j)-'a'];
				else
					ans+=" ";
			System.out.println("Case #"+i+": "+ans);
		}
	}

}
