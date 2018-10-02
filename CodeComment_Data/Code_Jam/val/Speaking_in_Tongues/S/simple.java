package methodEmbedding.Speaking_in_Tongues.S.LYD1415;

import java.io.*;

public class simple {
	
public static void main(String args[]) throws Exception
{
	int n;
	String s,finall="",temp;
	char a;
	String s1="abcdefghijklmnopqrstuvwxyz "; 
	String s2="ynficwlbkuomxsevzpdrjgthaq ";
	BufferedReader br = new BufferedReader(new FileReader("A-small-attempt.in"));
	BufferedWriter bw = new BufferedWriter(new FileWriter("A-small-attempt.out"));
		n = Integer.parseInt(br.readLine());
		int i=1;
	int x=0;
	for(int v=0;v<n;v++)
	{
	while((s=br.readLine())!=null)
	{
		for(int j=0;j<s.length();j++)
		{
			a=s.charAt(j);
			x=s2.indexOf(a);
			temp = Character.toString(s1.charAt(x));
			finall = finall.concat(temp);
		}
		bw.write("Case #"+i+": "+finall+"\n");
		i++;
		finall="";
		}
	}
	bw.close();
}
}
