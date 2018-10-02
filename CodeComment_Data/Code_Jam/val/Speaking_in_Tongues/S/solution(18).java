package methodEmbedding.Speaking_in_Tongues.S.LYD1521;

import java.util.Scanner;


public class Test1
{
	public static void main(String[] args)
	{
		char[] sub = new char[26];
		for(int i=0;i<sub.length;i++)
			sub[i] = ' ';
		
		String t = "our language is impossible to understand";
		String o = "ejp mysljylc kd kxveddknmc re jsicpdrysi";
		for(int i=0; i<t.length();i++)
		{
			if(o.charAt(i)==' ')
				continue;
			int index = o.charAt(i)-'a';
			sub[index] = t.charAt(i);
		}
		t = "there are twenty six factorial possibilities";
		o = "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd";
		for(int i=0; i<t.length();i++)
		{
			if(o.charAt(i)==' ')
				continue;
			int index = o.charAt(i)-'a';
			sub[index] = t.charAt(i);
		}
		
		o = "de kr kd eoya kw aej tysr re ujdr lkgc jv";
		t = "so it is okay if you want to just give up";
		for(int i=0; i<t.length();i++)
		{
			if(o.charAt(i)==' ')
				continue;
			int index = o.charAt(i)-'a';
			sub[index] = t.charAt(i);
		}

		sub['q'-'a'] = 'z';
		sub['z'-'a'] = 'q';
		
		for(int i=0;i<sub.length;i++)
		{
			char c = (char) (i+97);
			
//			System.out.println(c + ":" + sub[i]);
		}
//		
		Scanner keyboard = new Scanner(System.in);
		int num = Integer.parseInt(keyboard.nextLine());
		String[] input = new String[num];
		String tmp = "";
		for(int i=0;i<num;i++)
		{
			input[i] = keyboard.nextLine();
//			System.out.println(currentLine);
			
		}
		
		for(int i=0;i<num;i++)
		{
			tmp = "";
			for(int j=0;j<input[i].length();j++)
			{
//				char old = (char) (sub[i]+97);
				char old = input[i].charAt(j);
				if(input[i].charAt(j)==' ')
					tmp += " ";
				else
					tmp += sub[input[i].charAt(j)-'a'];
			}
			System.out.println("Case #"+(i+1) +": "+tmp);
		}
	}
}
