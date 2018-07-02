package methodEmbedding.Speaking_in_Tongues.S.LYD194;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Hashtable;



public class A {

	BufferedReader in = null;
	PrintWriter out = null;
	
	private static Hashtable charmap= new Hashtable();
	
	
	public static void main(String[] args) throws Exception 
	{
		BufferedReader br = new BufferedReader(new FileReader("A.in"));
		PrintWriter out =new PrintWriter(new FileWriter("A.out"));
		
		String str1 = "ejp mysljylc kd kxveddknmc re jsicpdrysi";
		String str2 = "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd";
		String str3 = "de kr kd eoya kw aej tysr re ujdr lkgc jv";
		
		String mappedStr1= "our language is impossible to understand";
		String mappedStr2 = "there are twenty six factorial possibilities";
		String mappedStr3 = "so it is okay if you want to just give up";
		
		
		
		for(int i=0;i<str1.length();i++)
		{
			charmap.put(str1.charAt(i), mappedStr1.charAt(i));
		}
		for(int i=0;i<str2.length();i++)
		{
			charmap.put(str2.charAt(i), mappedStr2.charAt(i));
		}
		for(int i=0;i<str3.length();i++)
		{
			charmap.put(str3.charAt(i), mappedStr3.charAt(i));
		}
		
		charmap.put('z', 'q');
		charmap.put('q', 'z');
		
		
	
		int N = Integer.parseInt(br.readLine());
		for(int i = 0; i < N;i++)
		{
			
			String input = br.readLine();
			String temp = "";
			for(int j=0;j<input.length();j++)
			{
				char c = input.charAt(j);
				if(c == ' ')
				temp = temp+ ' ';
				else 
				{
				
				if(Character.isUpperCase(c))
				{
					temp += charmap.get(Character.toLowerCase(c));
				}
				else
					temp += charmap.get(c);
					
				}
							
			}
			out.println("Case #"+(i+1)+": " +temp);
		}
			
		br.close();
		out.close();
	}

}
