package methodEmbedding.Speaking_in_Tongues.S.LYD730;

import java.io.*;
import java.lang.String;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.util.Arrays.*;

class Tongues
{
public static void main(String args[])
{

BufferedWriter out=null;
int n;
String line=null;
int items[];
try
{
FileWriter fw=new FileWriter("Out.in");
out = new BufferedWriter(fw);
FileReader fr = new FileReader("C:/Users/Faisal/Downloads/A-small-attempt0.in");
BufferedReader br = new BufferedReader(fr);
String s;
n=Integer.parseInt(br.readLine());
for(int i=0;i<n;i++)
{
line=br.readLine();
char words[]=line.toCharArray();
for(int j=0;j<words.length;j++)
	{
	if(words[j]=='a') words[j]='y';
				else if(words[j]=='b') words[j]='h';		
				else if(words[j]=='c') words[j]='e';	
				else if(words[j]=='d') words[j]='s';	
				else if(words[j]=='e') words[j]='o';	
				else if(words[j]=='f') words[j]='c';	
				else if(words[j]=='g') words[j]='v';	
				else if(words[j]=='h') words[j]='x';	
				else if(words[j]=='i') words[j]='d';	
				else if(words[j]=='j') words[j]='u';	
				else if(words[j]=='k') words[j]='i';	
				else if(words[j]=='l') words[j]='g';	
				else if(words[j]=='m') words[j]='l';	
				else if(words[j]=='n') words[j]='b';	
				else if(words[j]=='o') words[j]='k';	
				else if(words[j]=='p') words[j]='r';	
				else if(words[j]=='q') words[j]='z';	
				else if(words[j]=='r') words[j]='t';	
				else if(words[j]=='s') words[j]='n';	
				else if(words[j]=='t') words[j]='w';	
				else if(words[j]=='u') words[j]='j';	
				else if(words[j]=='v') words[j]='p';	
				else if(words[j]=='w') words[j]='f';	
				else if(words[j]=='x') words[j]='m';	
				else if(words[j]=='y') words[j]='a';	
				else if(words[j]=='z') words[j]='q';	
	}

 String str = new String(words);
//System.out.println("Index1 "+index1+" index2 "+index2);
String o="Case #"+(i+1)+": "+str+" ";
out.write(o);
out.newLine(); 

}
out.close();
}
catch(Exception e)
{
System.out.println(e);
}

}
}
