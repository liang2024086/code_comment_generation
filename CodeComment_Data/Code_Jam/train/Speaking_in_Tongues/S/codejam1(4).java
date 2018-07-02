package methodEmbedding.Speaking_in_Tongues.S.LYD822;

import java.io.*;
import java.io.File.*;
class codejam1
{
public static void main(String args[])throws IOException
{
//File inFile=new File(C-small-attempt0.in);
BufferedReader x=new BufferedReader(new FileReader("C:\\Users\\chotu\\Desktop\\A-small-attempt0.in"));
PrintWriter out=new PrintWriter(new BufferedWriter(new FileWriter("C:\\Users\\chotu\\Desktop\\out.txt")));
int l,t;String g="",f="";
t=Integer.parseInt(x.readLine());
for(int i=1;i<=t;i++)
{
g=x.readLine();
for(int j=0;j<g.length();j++)
{
char y=g.charAt(j);
switch(y)
{
case ' ':f=f+' ';break;
case 'a':f=f+'y';break;
case 'b':f=f+'h';break;
case 'c':f=f+'e';break;
case 'd':f=f+'s';break;
case 'e':f=f+'o';break;
case 'f':f=f+'c';break;
case 'g':f=f+'v';break;
case 'h':f=f+'x';break;
case 'i':f=f+'d';break;
case 'j':f=f+'u';break;
case 'k':f=f+'i';break;
case 'l':f=f+'g';break;
case 'm':f=f+'l';break;
case 'n':f=f+'b';break;
case 'o':f=f+'k';break;
case 'p':f=f+'r';break;
case 'q':f=f+'z';break;
case 'r':f=f+'t';break;
case 's':f=f+'n';break;
case 't':f=f+'w';break;
case 'u':f=f+'j';break;
case 'v':f=f+'p';break;
case 'w':f=f+'f';break;
case 'x':f=f+'m';break;
case 'y':f=f+'a';break;
case 'z':f=f+'q';break;
}
}
out.println("Case #"+i+": "+f);
f="";g="";
}
out.flush();
}

}
