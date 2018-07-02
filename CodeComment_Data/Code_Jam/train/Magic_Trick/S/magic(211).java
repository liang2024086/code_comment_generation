package methodEmbedding.Magic_Trick.S.LYD118;

import java.io.*;
import java.util.*;
class magic
{public static void main(String arg[])throws IOException
{Scanner sc=new Scanner(new InputStreamReader(System.in));
int T=sc.nextInt();
if(T<1||T>100)
System.exit(0);
int r1,arr1[][]=new int[4][4],arr2[][]=new int[4][4],r2,i,j,a=0,c=1,f=0,b;
while((T--)>0)
{r1=sc.nextInt();
if(r1<1||r1>4)
System.exit(0);
for(i=0;i<4;i++)
{for(j=0;j<4;j++)
{arr1[i][j]=sc.nextInt();
if(arr1[i][j]<1||arr1[i][j]>16)
System.exit(0);
for(a=0;a<i;a++)
for(b=0;b<j;b++)
if(arr1[i][j]==arr1[a][b])
System.exit(0);}}
r2=sc.nextInt();
if(r2<1||r2>4)
System.exit(0);
for(i=0;i<4;i++)
{for(j=0;j<4;j++)
{arr2[i][j]=sc.nextInt();
if(arr2[i][j]<1||arr2[i][j]>16)
System.exit(0);
for(a=0;a<i;a++)
for(b=0;b<j;b++)
if(arr2[i][j]==arr2[a][b])
System.exit(0);
}}
for(i=0;i<4;i++)
for(j=0;j<4;j++)
if(arr1[r1-1][i]==arr2[r2-1][j])
{f++;
a=arr2[r2-1][j];}
System.out.print("Case #"+(c++)+": ");
if(f==1)
System.out.println(a);
else if(f==0)
System.out.println("Volunteer cheated!");
else System.out.println("Bad magician!");
f=0;
}}}
