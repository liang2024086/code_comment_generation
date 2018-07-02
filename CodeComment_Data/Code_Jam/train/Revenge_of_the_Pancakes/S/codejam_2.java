package methodEmbedding.Revenge_of_the_Pancakes.S.LYD673;

import java.io.*;
import java.util.Scanner;

class codejam_2
{
public static void main(String args[])throws IOException
{ 
FileInputStream in =new FileInputStream("B-small-attempt0.in");
FileOutputStream outer =  new FileOutputStream("output.txt");
InputStreamReader inn=new InputStreamReader(in);
BufferedReader br=new BufferedReader(inn);
PrintWriter ob=new PrintWriter(outer,true);
String b=br.readLine();int i;
int t=Integer.parseInt(b);int j=0;
while(t-->0)
{
j++;
String aa=br.readLine();
int x=aa.length();
int sum=0;
for(i=1;i<x;i++)
{
if(aa.charAt(i)!=aa.charAt(i-1))
sum++;
}
if(aa.charAt(x-1)=='-')
sum++;

ob.println("Case #"+j+": "+sum);
}
in.close();
outer.flush();
outer.close();
}
}
