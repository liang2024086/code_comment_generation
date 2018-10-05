package methodEmbedding.Standing_Ovation.S.LYD804;

import java.io.*;
class StandingOvation
{
public static void main(String gg[])
{
try
{
File inputFile=new File("abcd.in");
RandomAccessFile randomAccessFile=new RandomAccessFile(inputFile,"r");
File outputFile=new File("result.txt");
RandomAccessFile r=new RandomAccessFile(outputFile,"rw");
int testCases=Integer.parseInt(randomAccessFile.readLine());
int temp=1;
while(temp<=testCases)
{
String s=randomAccessFile.readLine();
String splittedString[]=s.split(" ");
char c[]=splittedString[1].toCharArray();
int length=c.length;
int i[]=new int[length];
int x=0;
while(x<length)
{
i[x]=(int)c[x]-48;
x++;
}
int totalStoodUp=0;
int noOfFriends=0;
x=0;
while(x<length)
{
if(totalStoodUp>=x || i[x]==0)
{
totalStoodUp=i[x]+totalStoodUp;
}
else
{
noOfFriends=noOfFriends+x-totalStoodUp;
totalStoodUp=totalStoodUp+i[x]+noOfFriends;
}
x++;
}
r.writeBytes("Case #"+temp+": "+noOfFriends);
r.writeBytes("\n");
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
