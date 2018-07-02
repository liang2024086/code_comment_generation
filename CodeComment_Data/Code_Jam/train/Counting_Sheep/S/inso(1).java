package methodEmbedding.Counting_Sheep.S.LYD1462;

import java.util.*;
public class inso
{
 public static void main(String args[])

{

int n;

Scanner e= new Scanner(System.in);

n=e.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
a[i]=e.nextInt();
for(int j=0;j<n;j++)
{
if(a[j]==0)
{
System.out.println("Case #"+(j+1)+":"+" "+"INSOMNIA");
//continue;
}
else
{
int x[]={0,0,0,0,0,0,0,0,0,0};
int p=0,r=1;
int b=0;
while(p<10)
{
b=a[j];
b*=r;
while(b>0)
{
int c=b%10;
if(x[c]==0)
{
x[c]=1;
p++;
}
b=b/10;
}
r++;
}
System.out.println("Case #"+(j+1)+":"+" "+a[j]*(r-1));
}
}
}
}
