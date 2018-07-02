package methodEmbedding.Speaking_in_Tongues.S.LYD1170;

import java.util.*;

class a
{
	public static void main(String [] args)
	{
		String t1 = "ejp mysljylc kd kxveddknmc re jsicpdrysi";
		String t2 = "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd";
		String t3 = "de kr kd eoya kw aej tysr re ujdr lkgc jv";
		
		String s1 = "our language is impossible to understand";
		String s2 = "there are twenty six factorial possibilities";
		String s3 = "so it is okay if you want to just give up";
		
		HashMap<String , String> lang = new HashMap<String,String>();
		char alphakey [] = new char[26];
		char alphaval [] = new char[26];
		alphakey['z'-'a'] = 1;
		alphaval['q'-'a'] = 1;
		lang.put("z","q");
		for(int i=0;i<t1.length();++i) if(t1.charAt(i) != ' ')
		{
			alphakey[t1.charAt(i)-'a'] = 1;
			alphaval[s1.charAt(i)-'a'] = 1;
			lang.put("" + t1.charAt(i), ""+s1.charAt(i));
		}
		for(int i=0;i<t2.length();++i)if(t2.charAt(i) != ' ')
		{
			alphakey[t2.charAt(i)-'a'] = 1;
			alphaval[s2.charAt(i)-'a'] = 1;
			lang.put("" + t2.charAt(i), ""+s2.charAt(i));
		}
		for(int i=0;i<t3.length();++i)if(t3.charAt(i) != ' ')
		{
			alphakey[t3.charAt(i)-'a'] = 1;
			alphaval[s3.charAt(i)-'a'] = 1;
			lang.put("" + t3.charAt(i), ""+s3.charAt(i));
		}
		lang.put("q","z");

		Scanner in = new Scanner(System.in);
		int t = Integer.parseInt(in.nextLine().trim());
		for(int i=1;i<=t;++i)
		{
			String line = in.nextLine().trim();
			String replace = "";
			for(int k=0;k<line.length();++k)
			{
				if(line.charAt(k) == ' ')
				{
					replace = replace + (" ");
				}
				else
				{
					char curr = line.charAt(k);
					String scurr = "" + curr;
					String rep = lang.get(scurr);
					replace = replace + (rep);
				}
			}
			System.out.println("Case #"+i+": " + replace);
		}
	}
}
