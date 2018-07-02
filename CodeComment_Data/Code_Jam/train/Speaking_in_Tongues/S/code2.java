package methodEmbedding.Speaking_in_Tongues.S.LYD279;

import java.io.*;

class code2
{
	public static void main(String args[]) throws Exception 
	{
		File ii = new File ("A-small-attempt0.in");
		FileInputStream fis = new FileInputStream(ii);
		BufferedReader  br = new BufferedReader(new InputStreamReader (fis));
		int cases = Integer.parseInt(br.readLine());
		FileOutputStream fout = new FileOutputStream ("output.txt");
		DataOutputStream dout = new DataOutputStream (fout);
		char input [][] ={{'y', 'a'},{'n', 'b'},{'f', 'c'},{'i', 'd'},{'c', 'e'},{'w', 'f'},{'l', 'g'},{'b', 'h'},{'k', 'i'},{'u', 'j'},{'o', 'k'},{'m', 'l'},{'x', 'm'},{'s', 'n'},{'e', 'o'},{'v', 'p'},{'z', 'q'},{'p', 'r'},{'d', 's'},{'r', 't'},{'j', 'u'},{'g', 'v'},{'t', 'w'},{'h', 'x'},{'a', 'y'},{'q', 'z'}};
		for(int i=0;i<cases;i++){
		String temp=br.readLine();
		char f [] = temp.toCharArray();
		for(int k=0;k<temp.length();k++)
		{
			for(int p=0;p<26;p++)
			if(f[k]==input[p][0]){
				f[k]=input[p][1];break;
			}
		}
		String a = new String (f);
		dout.writeBytes("Case #"+(i+1)+ ": "+a+"\n");

		}
	}
}
