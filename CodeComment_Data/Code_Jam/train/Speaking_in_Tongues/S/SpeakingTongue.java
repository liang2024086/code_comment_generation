package methodEmbedding.Speaking_in_Tongues.S.LYD486;

import java.io.*;
public class SpeakingTongue
{
public static void main (String arg[]) throws Exception
{
BufferedReader ob=new BufferedReader (new FileReader("A-small-attempt0.in"));

PrintWriter pw=new PrintWriter ("output.txt");

String temp="";
temp=ob.readLine();
int t=Integer.parseInt(temp);
for(int l=1;l<=t;l++)
{
 temp=ob.readLine();
 String str="";
 for(int i=0;i<temp.length();i++)
 {
  char ch=temp.charAt(i);
  char ch1=' ';
  switch (ch)
  {
   case 'a':ch1='y';break;
   case 'b':ch1='h';break;
   case 'c':ch1='e';break;
   case 'd':ch1='s';break;
   case 'e':ch1='o';break;
   case 'f':ch1='c';break;
   case 'g':ch1='v';break;
   case 'h':ch1='x';break;
   case 'i':ch1='d';break;
   case 'j':ch1='u';break;
   case 'k':ch1='i';break;
   case 'l':ch1='g';break;
   case 'm':ch1='l';break;
   case 'n':ch1='b';break;
   case 'o':ch1='k';break;
   case 'p':ch1='r';break;
   case 'q':ch1='z';break;
   case 'r':ch1='t';break;
   case 's':ch1='n';break;
   case 't':ch1='w';break;
   case 'u':ch1='j';break;
   case 'v':ch1='p';break;
   case 'w':ch1='f';break;
   case 'x':ch1='m';break;
   case 'y':ch1='a';break;
   case 'z':ch1='q';break;
   default :ch1=ch;
  }
  str=str+ch1;
 }
 temp="Case #"+l+": "+str;
 pw.println(temp);
}
pw.close();
}
}
