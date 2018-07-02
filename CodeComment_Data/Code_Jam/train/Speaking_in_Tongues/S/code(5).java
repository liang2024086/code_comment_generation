package methodEmbedding.Speaking_in_Tongues.S.LYD1460;

import java.io.*;

class code 
{
	public static void main(String args[])throws IOException
	{
		int k=0,t=0,len=0;
		String s,s1[],s2="";
		s1=new String [100];
		BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
		s=br.readLine();
		t=Integer.parseInt(s);
		k=t;
		while(t!=0)
		{
			s=br.readLine();
			s=s.toLowerCase();
			s1[k-t]=s;
			t--;
		}
		t=0;
		while(k!=0)
		{
			len=s1[t].length();
			for(int i=0;i<len;i++)
			{
			switch(s1[t].charAt(i))
			{
			case 'a': s2+='y'; break;
			case 'b': s2+='h'; break;
			case 'c': s2+='e'; break;
			case 'd': s2+='s'; break;
			case 'e': s2+='o'; break;
			case 'f': s2+='c'; break;
			case 'g': s2+='v'; break;
			case 'h': s2+='x'; break;
			case 'i': s2+='d'; break;
			case 'j': s2+='u'; break;
			case 'k': s2+='i'; break;
			case 'l': s2+='g'; break;
			case 'm': s2+='l'; break;
			case 'n': s2+='b'; break;
			case 'o': s2+='k'; break;
			case 'p': s2+='r'; break;
			case 'q': s2+='z'; break;
			case 'r': s2+='t'; break;
			case 's': s2+='n'; break;
			case 't': s2+='w'; break;
			case 'u': s2+='j'; break;
			case 'v': s2+='p'; break;
			case 'w': s2+='f'; break;
			case 'x': s2+='m'; break;
			case 'y': s2+='a'; break;
			case 'z': s2+='q'; break;
			case ' ': s2+=' '; break;
			}
			}
			
			System.out.println("Case #"+(t+1)+": "+s2);
			s2="";
			t++;
			k--;
		}
		
		
	}
}
