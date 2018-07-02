package methodEmbedding.Speaking_in_Tongues.S.LYD1388;

import java.io.*;

public class CodeJam1{	
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		char[][] array1=new char[26][2];
		array1[0][0]='a';
		array1[1][0]='b';
		array1[2][0]='c';
		array1[3][0]='d';
		array1[4][0]='e';
		array1[5][0]='f';
		array1[6][0]='g';
		array1[7][0]='h';
		array1[8][0]='i';
		array1[9][0]='j';
		array1[10][0]='k';
		array1[11][0]='l';
		array1[12][0]='m';
		array1[13][0]='n';
		array1[14][0]='o';
		array1[15][0]='p';
		array1[16][0]='q';
		array1[17][0]='r';
		array1[18][0]='s';
		array1[19][0]='t';
		array1[20][0]='u';
		array1[21][0]='v';
		array1[22][0]='w';
		array1[23][0]='x';
		array1[24][0]='y';
		array1[25][0]='z';
		array1[16][1]='z';
		array1[25][1]='q';


		array1[0][1]='y';
		array1[1][1]='n';
		array1[2][1]='f';
		array1[3][1]='i';
		array1[4][1]='c';
		array1[5][1]='w';
		array1[6][1]='l';
		array1[7][1]='b';
		array1[8][1]='k';
		array1[9][1]='u';
		array1[10][1]='o';
		array1[11][1]='m';
		array1[12][1]='x';
		array1[13][1]='s';
		array1[14][1]='e';
		array1[15][1]='v';
		array1[16][1]='z';
		array1[17][1]='p';
		array1[18][1]='d';
		array1[19][1]='r';
		array1[20][1]='j';
		array1[21][1]='g';
		array1[22][1]='t';
		array1[23][1]='h';
		array1[24][1]='a';
		array1[25][1]='q';

		int testCases=Integer.parseInt(br.readLine());
		for(int i=0;i<testCases;i++)
		{
			String t=br.readLine();
			String t1="";
			for(int j=0;j<t.length();j++)
			{
				if(t.charAt(j)==' ')
				{
					t1=t1+" ";
				}
				else
				{
					for(int k=0;k<array1.length;k++)
					{
						if(array1[k][1]==t.charAt(j))
							t1=t1+array1[k][0];
					}
					for(int k=0;k<array1.length;k++)
					{
						/*System.out.println(" The value of");*/
					}
				}
			}
			System.out.println("Case #"+(i+1)+": "+t1);
		}

	}

}
