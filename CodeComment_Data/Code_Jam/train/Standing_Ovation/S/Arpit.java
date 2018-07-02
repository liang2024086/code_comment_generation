package methodEmbedding.Standing_Ovation.S.LYD1079;

import java.io.*;
public class Arpit extends q1
{
public static void main(String[] args)throws IOException
{
BufferedReader ob=new BufferedReader(new FileReader("q11.txt"));
System.out.println("Enter TestCase");
int n=Integer.parseInt(ob.readLine());
String s[]=new String[n];
System.out.println("Enter cases");
for(int i=0;i<n;i++)
{
s[i]=ob.readLine();
}
//
for(int i=0;i<n;i++)
{
int s2=ttly(s[i]);
System.out.println("Case #"+(i+1)+": "+s2);
}
}
}
