package methodEmbedding.Speaking_in_Tongues.S.LYD611;

import java.io.*;


public class A
{
	public static void main(String[] args) throws IOException
	{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		char[] maping = new char[26];
		String[] text = {"ejp mysljylc kd kxveddknmc re jsicpdrysi",
				 "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd",
				 "de kr kd eoya kw aej tysr re ujdr lkgc jv"
				};
		String[] mt = {"our language is impossible to understand",
			       "there are twenty six factorial possibilities",
			       "so it is okay if you want to just give up"
			      };
		for(int i=0;i<26;i++) maping[i] = 'A';
		
		maping['q'-'a'] = 'z';
		maping['z'-'a'] = 'q';
		for(int i=0;i<3;i++)
		{
			int len  = text[i].length();
			for(int j=0;j<len;j++)
			{
				char a = text[i].charAt(j); 
				char b = mt[i].charAt(j); 
				if(a < 'a' || a > 'z')
					continue;
				maping[a-'a'] = b;
			}
		}

//		for(int i=0;i<26;i++)
//			System.out.println((char)('a'+i)+" "+maping[i]);
		for(int i=1;i<=T;i++)
		{
			String line = br.readLine();
			char[] temp = line.toCharArray();
			int len = line.length();
			for(int j=0; j<len; j++)
			{
				if(temp[j] < 'a' || temp[j] > 'z')
					continue;
				temp[j] = maping[temp[j]-'a'];
			}
			line = new String(temp);
			System.out.println("Case #"+i+": "+line);
		}
		
	}
}
