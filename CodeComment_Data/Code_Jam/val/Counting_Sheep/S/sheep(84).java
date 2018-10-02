package methodEmbedding.Counting_Sheep.S.LYD1225;

import java.*;
import java.io.*;
class sheep
{
public static void main(String args[])throws IOException
{
int num,n,copy,rem,c=1,flag=0,f=0,j;
int arr[][]=new int[2][10];
FileWriter fr=new FileWriter("C:\\Users\\Rakshit\\Desktop\\Java\\outputFile.text");
BufferedWriter bw = new BufferedWriter(fr);
BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\Rakshit\\Desktop\\Java\\A-small-attempt2.in"));

//bw.write("Input\tOutput\n");

int t=Integer.parseInt(br.readLine());
//bw.write(t+"\n");
if(t>0&&t<101)
{
for(int k=1;k<=t;k++)
{	
num=Integer.parseInt(br.readLine());
copy=num;

for(int i=0;i<10;i++)
{
arr[0][i]=0;

arr[1][i]=0;
}
c=1;
flag=0;

if(num!=0)
{
for(int i=num;;i=c*num)
{

for(copy=i,n=i;copy>0;copy/=10)
{
	
rem=copy%10;

arr[0][rem]++;
}
for(j=0;j<10;j++)
{
if(arr[0][j]>0&&arr[1][j]!=1)
{
	flag++;
arr[1][j]=1;
}
}
if(flag==10)
{

break;
}
c++;

}

if(flag==10)
bw.write("Case #"+k+": "+n+"\n");
}

else
bw.write("Case #"+k+": INSOMNIA\n");
}
}
bw.close();
}
}
