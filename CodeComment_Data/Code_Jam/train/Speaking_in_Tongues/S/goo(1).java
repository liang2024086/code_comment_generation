package methodEmbedding.Speaking_in_Tongues.S.LYD424;

import java.io.*;

class goo
{

public static void main(String args[])
throws IOException
{

FileReader fin=new FileReader("A-small-attempt2.in");
BufferedReader bin=new BufferedReader(fin);

FileWriter fout=new FileWriter("Output.txt");
BufferedWriter bout=new BufferedWriter(fout);
PrintWriter pout=new PrintWriter(bout);

String acc="";
String num=bin.readLine();

int T=Integer.parseInt(num);

String s[]=new String[T];
int i=0;

while(i<T)
{ 
s[i]=bin.readLine();

    int l=s[i].length();
    for(int j=0;j<l;j++)
{
char ch=s[i].charAt(j);
if(ch=='y')
ch='a';

else if(ch=='n')
ch='b';

else if(ch=='f')
ch='c';

else if(ch=='i')
ch='d';

else if(ch=='c')
ch='e';

else if(ch=='w')
ch='f';

else if(ch=='l')
ch='g';

else if(ch=='b')
ch='h';

else if(ch=='k')
ch='i';

else if(ch=='u')
ch='j';

else if(ch=='o')
ch='k';

else if(ch=='m')
ch='l';

else if(ch=='x')
ch='m';

else if(ch=='s')
ch='n';

else if(ch=='e')
ch='o';

else if(ch=='v')
ch='p';

else if(ch=='z')
ch='q';

else if(ch=='p')
ch='r';

else if(ch=='d')
ch='s';


else if(ch=='r')
ch='t';

else if(ch=='j')
ch='u';

else if(ch=='g')
ch='v';
else if(ch=='t')
ch='w';
else if(ch=='h')
ch='x';
else if(ch=='a')
ch='y';
else if(ch=='q')
ch='z';
acc+=ch;
}

pout.println("Case #"+(i+1)+": "+acc);
acc="";
i++;
}


bin.close();
pout.close();
bout.close();
fout.close();



}

}

