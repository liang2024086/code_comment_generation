package methodEmbedding.Counting_Sheep.S.LYD508;

import java.io.*;  
class Sheep
{
public static void main(String[] args)throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int t=Integer.parseInt(br.readLine());
for(int lp=1;lp<=t;lp++)
{
long n=Integer.parseInt(br.readLine());
int a[]=new int[10]; String s=""; int flag=0,pos=0; long ans=0;
for(int i=0;i<10;i++)
{
a[i]=99;
}

for(long i=1;true;i++)
{
if(n==0)
{
ans=0;
break;
}
s=Long.toString((i*n));
for(int j=0;j<s.length();j++)
{
for(int k=0;k<a.length;k++)
{
if((s.charAt(j))==(a[k]+48))
{
flag=1;
}
}
if(flag==0)
{
a[pos]=s.charAt(j)-48;
pos++;
}
flag=0;
}
if(pos==10)
{
ans=n*i;
break;
}
}
if(ans==0)
System.out.println("Case #"+lp+": INSOMNIA");
else
System.out.println("Case #"+lp+": "+ans);
}
}
}

