package methodEmbedding.Counting_Sheep.S.LYD267;

import java.util.Scanner;
import java.io.*;
class CountingSheeps
{
public static void main(String args[]) throws Exception
{
Scanner sc=new Scanner(new FileReader("input.in"));
PrintWriter pw = new PrintWriter(new FileWriter("output.in"));

int t=sc.nextInt();
for(int c=1;c<=t;c++)
{
pw.print("Case #"+c+": ");

int n=sc.nextInt();
if(n==0)
{
pw.println("INSOMNIA");
continue;
}
boolean arr[]=new boolean[10];
int co=0;
int i=0,temp;	
while(co<10)
{
i+=n;
temp=i;
while(temp!=0)
{
if(!arr[temp%10])
{
arr[temp%10]=true;
co++;
}
temp=temp/10;
}
}
pw.println(i);
}
pw.flush();
pw.close();
sc.close();

}
}
