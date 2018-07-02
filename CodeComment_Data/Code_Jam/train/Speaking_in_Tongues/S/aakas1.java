package methodEmbedding.Speaking_in_Tongues.S.LYD1476;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class abc 
{
	public static void main(String arg[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a=Integer.parseInt(br.readLine());
		int count=1;
		while(a!=0)
		{
			String s=br.readLine();
			char c[]=s.toCharArray();
			for(int i=0;i<c.length;i++)
			{
				switch(c[i])
				{
					case 'a':
						c[i]='y';
						break;
					case 'b':
						c[i]='h';
						break;
					case 'c':
						c[i]='e';
						break;
					case 'd':
						c[i]='s';
						break;
					case 'e':
						c[i]='o';
						break;
					case 'f':
						c[i]='c';
						break;
					case 'g':
						c[i]='v';
						break;
					case 'h':
						c[i]='x';
						break;
					case 'i':
						c[i]='d';
						break;
					case 'j':
						c[i]='u';
						break;
					case 'k':
						c[i]='i';
						break;
					case 'l':
						c[i]='g';
						break;
					case 'm':
						c[i]='l';
						break;
					case 'n':
						c[i]='b';
						break;
					case 'o':
						c[i]='k';
						break;
					case 'p':
						c[i]='r';
						break;
					case 'q':
						c[i]='z';
						break;
					case 'r':
						c[i]='t';
						break;
					case 's':
						c[i]='n';
						break;
					case 't':
						c[i]='w';
						break;
					case 'u':
						c[i]='j';
						break;
					case 'v':
						c[i]='p';
						break;
					case 'w':
						c[i]='f';
						break;
					case 'x':
						c[i]='m';
						break;
					case 'y':
						c[i]='a';
						break;
					case 'z':
						c[i]='q';
						break;
				
				}
			}
			
			String x=new String (c);	
			System.out.println("Case #"+count+": "+x);
			a--;
			count++;
		}
	
	
	}
}
