package methodEmbedding.Counting_Sheep.S.LYD709;

import java.io.*;
import java.util.Scanner;

class codejam_1
{
public static void main(String args[])throws IOException
{ 
FileInputStream in =new FileInputStream("A-small-attempt0.in");
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
int n=Integer.parseInt(aa);
if(n==0)
{ob.println("Case #"+j+": "+"INSOMNIA");
}
else
{
boolean a[]=new boolean[10];
int k=n;int l=10;
int xx=n;
while(k!=0)
{
if(!a[k%10])
{l--;
a[k%10]=true;}
k/=10;
}
while(l!=0)
{
n+=xx;k=n;
while(k!=0)
{
if(!a[k%10])
{l--;
a[k%10]=true;}
k/=10;
}
}
ob.println("Case #"+j+": "+n);

}
}

in.close();
outer.flush();
outer.close();
}
}
