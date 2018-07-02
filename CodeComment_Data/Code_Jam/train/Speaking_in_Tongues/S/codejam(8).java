package methodEmbedding.Speaking_in_Tongues.S.LYD78;

import java.io.*;
import java.util.*;
class codejam {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.print("Working");
		char in[]=new char[26]; 
		in[0]='y';//a
		in[1]='h';
		in[2]='e';
		in[3]='s';
		in[4]='o';
		in[5]='c';
		in[6]='v';
		in[7]='x';
		in[8]='d';
		in[9]='u';//j
		in[10]='i';
		in[11]='g';
		in[12]='l';
		in[13]='b';
		in[14]='k';//o
		in[15]='r';
		in[16]='z';
		in[17]='t';
		in[18]='n';//s
		in[19]='w';
		in[20]='j';
		in[21]='p';
		in[22]='f';
		in[23]='m';
		in[24]='a';
		in[25]='q';
		
		BufferedReader inpu = new BufferedReader(new InputStreamReader(System.in));
		String s="";
		try{
		s=inpu.readLine();}
		catch (IOException e)
		{
			System.out.print("Error");
		}
		int i=0;
		for(i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				System.out.print(" ");
			}
			else
				System.out.print(in[(int)s.charAt(i)-(int)'a']);
		}
	}

}

