package methodEmbedding.Counting_Sheep.S.LYD766;

import java.io.*;
class CountingSheep
{
public static void main(String gg[])
{
try
{
File inputFile=new File("abcd.in");
RandomAccessFile randomAccessFile=new RandomAccessFile(inputFile,"r");
File outputFile=new File("result.txt");
RandomAccessFile r=new RandomAccessFile(outputFile,"rw");
long testCases=Integer.parseInt(randomAccessFile.readLine());
long temp=1;
int status[]=new int[10];
long data,lastNumber,farzi;
int x,y;
while(temp<=testCases)
{
data=Integer.parseInt(randomAccessFile.readLine());
if(data==0)
{
r.writeBytes("Case #"+temp+": INSOMNIA");
r.writeBytes("\n");
temp++;
continue;
}
x=1;
while(true)
{
lastNumber=data*x;
farzi=lastNumber;
while(farzi!=0)
{
status[(int)farzi%10]=1;
farzi=farzi/10;
}
for(y=0;y<10;y++) if(status[y]!=1) break;
if(y==10) break;
x++;
}
r.writeBytes("Case #"+temp+": "+lastNumber);
r.writeBytes("\n");
for(y=0;y<10;y++) status[y]=0;
temp++;
}
randomAccessFile.close();
r.close();
}
catch(IOException ioe)
{
System.out.println(ioe);
}
}
}
