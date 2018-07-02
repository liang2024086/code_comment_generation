package methodEmbedding.Speaking_in_Tongues.S.LYD73;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

	public static void main(String args[]) throws IOException
	{
		char map[]=new char[26];
		int t;
		int i,j;
		String str;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		map[0]='y';
		map[1]='h';
		map[2]='e';
		map[3]='s';
		map[4]='o';
		map[5]='c';
		map[6]='v';
		map[7]='x';
		map[8]='d';
		map[9]='u';
		map[10]='i';
		map[11]='g';
		map[12]='l';
		map[13]='b';
		map[14]='k';
		map[15]='r';
		map[16]='z';
		map[17]='t';
		map[18]='n';
		map[19]='w';
		map[20]='j';
		map[21]='p';
		map[22]='f';
		map[23]='m';
		map[24]='a';
		map[25]='q';
		
		//System.out.println("Enter Input");
		t=Integer.parseInt(br.readLine());
		for(i=0;i<t;i++)
		{
			str=br.readLine();
			if(i!=(t-1))
				System.out.println();
			System.out.print("Case #"+(i+1)+": ");
			for(j=0;j<str.length();j++)
			{
				char c=str.charAt(j);
				if(c==' ')
					System.out.print(c);
				else
				{
					int temp=c-'a';
					System.out.print(map[temp]);
				}
				
			}
			//System.out.println();
		}
	}
}

