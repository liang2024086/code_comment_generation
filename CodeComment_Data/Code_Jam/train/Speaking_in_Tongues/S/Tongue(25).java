package methodEmbedding.Speaking_in_Tongues.S.LYD353;

import java.io.*;
//import java.lang.*;
class Tongue
{	
	public static void main(String[] args) throws IOException
	{
		char ch[]=new char[30];
	ch[0]='y';
	ch[1]='h';
	ch[2]='e';
	ch[3]='s';
	ch[4]='o';
	ch[5]='c';
	ch[6]='v';
	ch[7]='x';
	ch[8]='d';
	ch[9]='u';
	ch[10]='i';
	ch[11]='g';
	ch[12]='l';
	ch[13]='b';
	ch[14]='k';
	ch[15]='r';
	ch[16]='z';
	ch[17]='t';
	ch[18]='n';
	ch[19]='w';
	ch[20]='j';
	ch[21]='p';
	ch[22]='f';
	ch[23]='m';
	ch[24]='a';
	ch[25]='q';
	
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();
		int test=Integer.parseInt(str);
		for(int i=1;i<=test;i++)
		{
			str=reader.readLine();
			int len=str.length();
			System.out.print("Case #"+i+": ");
			for(int j=0;j<len;j++)
			{
				//System.out.print(str.charAt(i)-97+" ");
				if(str.charAt(j)!=' ')
				System.out.print(ch[(str.charAt(j)-97)%26]);
				else
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
