package methodEmbedding.Standing_Ovation.S.LYD416;

import java.io.*;
import java.util.*;
import java.math.*;
import java.text.*;
public class Main
{
public static void main(String[] args)throws java.lang.Exception
{
BufferedReader in = new BufferedReader(new FileReader("A-small-attempt0.in"));
PrintWriter out=new PrintWriter("output.txt");
int t,x1,smax,frnd,sum,i,val;
String str;


t=Integer.parseInt(in.readLine());


for(x1=0;x1<t;x1++)
{
StringTokenizer st1=new StringTokenizer(in.readLine());

smax=Integer.parseInt(st1.nextToken());
str=st1.nextToken().trim();


sum=0;
frnd=0;

if(str.charAt(0)=='0')
{
++frnd;
sum=1;
}
else
{
sum+=(int)str.charAt(0)-48;
}


for(i=1;i<=smax;i++)
{
val=(int)str.charAt(i)-48;

if(sum>=i)
	{
	sum+=val;
	}
else
	{
	++frnd;
	sum+=(val+1);
	}
}

out.println("Case #"+(x1+1)+": "+frnd);

}

out.flush();
out.close();
}
}   
