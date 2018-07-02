package methodEmbedding.Speaking_in_Tongues.S.LYD794;

import java.util.Scanner;
import java.io.*;
public class Googlerace
{
public static void main(String args[])
throws IOException
{
 try{
   // Create file 
   FileWriter fstream = new FileWriter("out.out");
FileInputStream fstream1=new FileInputStream("A-small-attempt2.in");
DataInputStream in=new DataInputStream(fstream1);
BufferedReader input=new BufferedReader(new InputStreamReader(in));
//BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
String strLine;
strLine=input.readLine();
int T=Integer.parseInt(strLine);
BufferedWriter out = new BufferedWriter(fstream);
int i=0;
do
{
System.out.print("enter the string "+i);
strLine=input.readLine();
char d[]=new char[strLine.length()];
d=strLine.toCharArray();
System.out.print("Case #"+(i+1)+":"+" ");out.write("Case #"+(i+1)+":"+" ");
for(int j=0;j<strLine.length();j++)
{
switch(d[j])
{
case 'a':
d[j]='y'; break;
case 'b':
d[j]='h'; break;
case 'c':
d[j]='e'; break;
case 'd':
d[j]='s'; break;
case 'e':
d[j]='o'; break;
case 'f':
d[j]='c'; break;
case 'g':
d[j]='v'; break;
case 'h':
d[j]='x';break;
case 'i':
d[j]='d';  break;
case 'j':
d[j]='u'; break;
case 'k':
d[j]='i'; break;
case 'l':
d[j]='g'; break;
case 'm':
d[j]='l'; break;
case 'n':
d[j]='b'; break;
case 'o':
d[j]='k'; break;
case 'p':
d[j]='r'; break;
case 'q':
d[j]='z'; break;
case 'r':
d[j]='t';break;
case 's':
d[j]='n'; break;
case 't':
d[j]='w'; break;
case 'u':
d[j]='j'; break;
case 'v':
d[j]='p'; break;
case 'w':
d[j]='f'; break;
case 'x':
d[j]='m'; break;
case 'y':
d[j]='a'; break;
case 'z':
d[j]='q'; break;
default:
d[j]=d[j];
break;
}
System.out.print(d[j]); 
out.write(d[j]);
}
System.out.println("\n"); out.write("\r\n");
i++;
}
while(i<T);
out.close();
input.close();
}catch (Exception e){//Catch exception if any
   System.err.println("Error: " + e.getMessage());
   }
}
}
