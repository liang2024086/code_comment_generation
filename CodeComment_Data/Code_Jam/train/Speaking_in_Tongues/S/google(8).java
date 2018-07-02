package methodEmbedding.Speaking_in_Tongues.S.LYD904;

import java.util.Scanner;
import java.io.*;
import java.lang.*;
class google
{public static void main(String args[]) throws IOException
{
Scanner cin=new Scanner(System.in);
String t[]=new String[100];
int k=cin.nextInt();

for(int i=0;i<k;i++)
{ t[i]=cin.nextLine();
}

for(int i=0;i<k;i++)
{t[i]=t[i].replace('j','U');
t[i]=t[i].replace('p','R');
t[i]=t[i].replace('m','L');
t[i]=t[i].replace('y','A');
t[i]=t[i].replace('l','G');
t[i]=t[i].replace('d','S');
t[i]=t[i].replace('k','I');
t[i]=t[i].replace('q','Z');
t[i]=t[i].replace('x','M');
t[i]=t[i].replace('v','P');
t[i]=t[i].replace('n','B');
t[i]=t[i].replace('r','T');
t[i]=t[i].replace('e','O');
t[i]=t[i].replace('i','D');
t[i]=t[i].replace('c','E');
t[i]=t[i].replace('a','Y');
t[i]=t[i].replace('f','C');
t[i]=t[i].replace('s','N');
t[i]=t[i].replace('b','H');
t[i]=t[i].replace('t','W');
t[i]=t[i].replace('h','X');
t[i]=t[i].replace('w','F');
t[i]=t[i].replace('o','K');
t[i]=t[i].replace('u','J');
t[i]=t[i].replace('g','V');
t[i]=t[i].replace('z','Q');
t[i]=t[i].toLowerCase();
System.out.println("Case #"+(i+1)+": "+t[i]);
}}
}
