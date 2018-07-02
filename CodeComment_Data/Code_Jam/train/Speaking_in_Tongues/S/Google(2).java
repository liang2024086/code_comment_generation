package methodEmbedding.Speaking_in_Tongues.S.LYD916;

import java.io.*;
class Google
{ 
public static void main(String []args)throws IOException
{
BufferedReader a=new BufferedReader(new InputStreamReader(System.in));
char x[]={'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
int t=Integer.parseInt(a.readLine());
if(t>=1&&t<=30)
{
String s[]=new String[t];
for(int i=0;i<t;i++)
{
String n=a.readLine();
s[i]="";
if(n.length()<=100)
{
for(int j=0;j<n.length();j++)
{
int d=n.charAt(j);
if(d==32)
s[i]=s[i]+" ";
else
s[i]=s[i]+x[d-97];
}
}
}
for(int i=0;i<t;i++)
System.out.println("Case #"+(i+1)+": "+s[i]);
}
}
}

