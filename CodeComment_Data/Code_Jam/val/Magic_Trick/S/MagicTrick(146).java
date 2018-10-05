package methodEmbedding.Magic_Trick.S.LYD623;

import java.io.*;
import java.util.*;
public class MagicTrick
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
int r1,r2,t,count,number=-1,k=1;
int set1[]=new int[16];
int set2[]=new int[16];
t=scan.nextInt( );
while(t>0)
{
r1=scan.nextInt( );
for(int i=0;i<16;i++)
{
set1[i]=scan.nextInt( );
}
r2=scan.nextInt( );
for(int i=0;i<16;i++)
{
set2[i]=scan.nextInt( );
}
count=0;
for(int i=(r1-1)*4;i<r1*4;i++)
{
for(int j=(r2-1)*4;j<r2*4;j++)
{
if(set1[i]==set2[j])
{
number=set1[i];
count++;
break;
}
}
}
System.out.print("Case #"+k+": ");
if(count==1)
{
System.out.println(number);
}
else if(count>1)
{
System.out.println("Bad magician!");
}
else if(count==0)
{
System.out.println("Volunteer cheated!");
}
k++;
t--;
}
}
}
