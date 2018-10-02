package methodEmbedding.Revenge_of_the_Pancakes.S.LYD447;

import java.io.*;
import java.util.*;
import java.math.*;
import java.text.*;
public class Main
{  
public static void main(String[] args)throws java.lang.Exception
{
//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//PrintWriter out=new PrintWriter(System.out);

BufferedReader in = new BufferedReader(new FileReader("B-small-attempt4.in"));
PrintWriter out=new PrintWriter("output.txt");

int t,x1,len,i,j,ans;
String str,str1;


t=Integer.parseInt(in.readLine().trim());

for(x1=0;x1<t;x1++)
{
str=in.readLine().trim();
len=str.length();

str1="";

ans=0;

for(i=len-1;i>=0;i--)
{
str1+=str.charAt(i);
}


for(i=0;i<len;i++)
{
if(str1.charAt(i)!='+')
	{
	break;
	}
}


String cur="+";

for(j=i;j<len;j++)
{
if(str1.charAt(j)!=cur.charAt(0))
	{
	ans++;
	cur="";
	cur+=str1.charAt(j);
	}
}


out.println("Case #"+(x1+1)+": "+ans);


}

 
out.flush();
out.close();
}
}  






