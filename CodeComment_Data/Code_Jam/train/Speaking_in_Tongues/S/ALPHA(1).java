package methodEmbedding.Speaking_in_Tongues.S.LYD1153;

import java.io.*;

public class ALPHA 
{
    public static void main(String[] args) throws IOException
	{
        int tc,i=1,j=0;
        String[] s=new String[1000];
        String[] ss=new String[1000];
        char[] c=new char[1000];
        DataInputStream d=new DataInputStream(System.in);
        tc=Integer.parseInt(d.readLine());
        for(i=1;i<=tc;i++)
        {
            s[i]=d.readLine();
            ss[i]="";
            c=s[i].toCharArray();
            for(j=0;j<s[i].length();j++)
            {
                if(c[j]=='a')
                    c[j]='y';
                else if(c[j]=='b')
                    c[j]='h';
                else if(c[j]=='c')
                    c[j]='e';
                else if(c[j]=='d')
                    c[j]='s';
                else if(c[j]=='e')
                    c[j]='o';
                else if(c[j]=='f')
                    c[j]='c';
                else if(c[j]=='g')
                    c[j]='v';
                else if(c[j]=='h')
                    c[j]='x';
                else if(c[j]=='i')
                    c[j]='d';
                else if(c[j]=='j')
                    c[j]='u';
                else if(c[j]=='k')
                    c[j]='i';
                else if(c[j]=='l')
                    c[j]='g';
                else if(c[j]=='m')
                    c[j]='l';
                else if(c[j]=='n')
                    c[j]='b';
                else if(c[j]=='o')
                    c[j]='k';
                else if(c[j]=='p')
                    c[j]='r';
                else if(c[j]=='q')
                    c[j]='z';
                else if(c[j]=='r')
                    c[j]='t';
                else if(c[j]=='s')
                    c[j]='n';
                else if(c[j]=='t')
                    c[j]='w';
                else if(c[j]=='u')
                    c[j]='j';
                else if(c[j]=='v')
                    c[j]='p';
                else if(c[j]=='w')
                    c[j]='f';
                else if(c[j]=='x')
                    c[j]='m';
                else if(c[j]=='y')
                    c[j]='a';
                else if(c[j]=='z')
                    c[j]='q';
                ss[i]+=c[j];
            }
        }
        for(i=1;i<=tc;i++)
        {
            System.out.println("Case #"+i+": "+ss[i]);
        }
    }
}
