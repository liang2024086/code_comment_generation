package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1273;

import java.io.*;
import java.*;
class cookie
{
public static void main(String args[])throws IOException
{
double C=0.0, F=0.0, F1=0.0, X=0.0, sec=0.0;
int T=0;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String s=br.readLine();
String s1="";
T=Integer.parseInt(s);
int i,j, tem=0, flag=0;

for(i=1;i<=T;i++)
{
	sec=0.0;
s=br.readLine();
	for(j=0;j<s.length();j++)
	{
	if(s.charAt(j)==' ')
	{
	s1=s.substring(0,j);
	C=Double.parseDouble(s1);
	tem=j;
	break;
	}
	}
	for(j=tem+1;j<s.length();j++)
	{
	if(s.charAt(j)==' ')
	{
	s1=s.substring(tem,j);
	F=Double.parseDouble(s1);
	tem=j;
	break;
	}
	}
	s1=s.substring(tem,s.length());
	X=Double.parseDouble(s1);

	//finding answer
	F1=2.0;
	flag=0;
	while(flag!=1)
	{
	if(X/F1 > (C/F1 + (X/(F1+F))))
	{
	sec+=(C/F1);
	F1+=F;
	}
	else
	{
	sec+=(X/F1);
	flag=1;
	}
	}
	System.out.println("Case #"+i+": "+sec);
}
}
}
