package methodEmbedding.Counting_Sheep.S.LYD763;

import java.io.*;
class counting_sheep
{
public static void main(String args[]) throws IOException
{
DataInputStream br=new DataInputStream(System.in);
String a[]=new String[10];
int test=Integer.parseInt(br.readLine());
int input[]=new int[test];
String output[]=new String[test];
for(int i=0;i<test;i++)
input[i]=Integer.parseInt(br.readLine());
for(int q=0;q<test;q++)
{
for(int k=0;k<10;k++)
a[k]=Integer.toString(k);
int n=input[q];
int flag=0;int r=0;int d=0;int qw=0;int count=0;int j=1;
int sum=0;
do
{
count=0;
if(n==0)
break;
r=n*j;
sum=r;
while(r!=0)
{
d=r%10;
for(int k=0;k<10;k++)
{
if(Integer.toString(d).equalsIgnoreCase(a[k]))
a[k]=" ";
}
r=r/10;
}
for(int k=0;k<10;k++)
{
if(a[k]==" ")
count++;
}
if(count==10)
{
flag=1;
qw=sum;
}
j++;  
}while(count!=10);
if(n==0)
output[q]="Case #"+Integer.toString(q+1)+": INSOMNIA";
else if(flag==1)
output[q]="Case #"+Integer.toString(q+1)+": "+Integer.toString(qw); 
}
for(int q=0;q<test;q++)
System.out.println(output[q]);
}
}


