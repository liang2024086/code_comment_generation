package methodEmbedding.Speaking_in_Tongues.S.LYD1528;

import java.io.*;
import java.util.*;
public class Ldec{
public static void main(String args[])throws Exception{
BufferedReader br=new BufferedReader(new FileReader("ginp.txt"));
PrintWriter pr=new PrintWriter("Ldec.txt");
char x[]=new char[26];int i=0,j=0,k=0,tc=Integer.parseInt(br.readLine());


String s1[]={"ejp mysljylc kd kxveddknmc re jsicpdrysi","rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd","de kr kd eoya kw aej tysr re ujdr lkgc jv"},s2[]={"our language is impossible to understand","there are twenty six factorial possibilities","so it is okay if you want to just give up"},st="",sr="";
for(i=0;i<3;i++)
 for(j=0;j<s1[i].length();j++)
    if(s1[i].charAt(j)!=' ')
       x[s1[i].charAt(j)-'a']=s2[i].charAt(j);
//for(i=0;i<26;i++)
//System.out.println(('a'+i)+" "+x[i]);
x[16]='z';
x[25]='q';
for(k=1;k<=tc;k++)
{st=br.readLine();
sr="";
for(i=0;i<st.length();i++)
{char c=st.charAt(i);
sr =c!=' '?sr+x[c-'a']:sr+c;	
	
}
pr.println("Case #"+k+": "+sr);
}
pr.close();


}}
