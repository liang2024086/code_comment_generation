package methodEmbedding.Speaking_in_Tongues.S.LYD821;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeJam2 {	
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		char[][] arr=new char[26][2];
		arr[0][0]='a';
		arr[1][0]='b';
		arr[2][0]='c';
		arr[3][0]='d';
		arr[4][0]='e';
		arr[5][0]='f';
		arr[6][0]='g';
		arr[7][0]='h';
		arr[8][0]='i';
		arr[9][0]='j';
		arr[10][0]='k';
		arr[11][0]='l';
		arr[12][0]='m';
		arr[13][0]='n';
		arr[14][0]='o';
		arr[15][0]='p';
		arr[16][0]='q';
		arr[17][0]='r';
		arr[18][0]='s';
		arr[19][0]='t';
		arr[20][0]='u';
		arr[21][0]='v';
		arr[22][0]='w';
		arr[23][0]='x';
		arr[24][0]='y';
		arr[25][0]='z';
		arr[16][1]='z';
		arr[25][1]='q';
		String[][] s=new String[3][2];
		s[0][0]="our language is impossible to understand";
		s[1][0]="there are twenty six factorial possibilities";
		s[2][0]="so it is okay if you want to just give up";
		s[0][1]="ejp mysljylc kd kxveddknmc re jsicpdrysi";
		s[1][1]="rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd";
		s[2][1]="de kr kd eoya kw aej tysr re ujdr lkgc jv";
		for(int i=0;i<3;i++)
		{
			String s1=s[i][0];
			String s2=s[i][1];
			for(int j=0;j<s1.length();j++)
			{
				for(int k=0;k<arr.length;k++)
				{
					if(s1.charAt(j)==' ')
						break;
					else if(arr[k][0]==s1.charAt(j))
					{
						arr[k][1]=s2.charAt(j);
						break;
					}
				}				
			}
		}

		int cases=Integer.parseInt(br.readLine());
		for(int i=0;i<cases;i++)
		{
			String temp=br.readLine();
			String temp1="";
			for(int j=0;j<temp.length();j++)
			{
				if(temp.charAt(j)==' ')
				{
					temp1=temp1+" ";
				}
				else
				{
					for(int k=0;k<arr.length;k++)
					{
						if(arr[k][1]==temp.charAt(j))
							temp1=temp1+arr[k][0];
					}
				}
			}
			System.out.println("Case #"+(i+1)+": "+temp1);
		}

	}

}
