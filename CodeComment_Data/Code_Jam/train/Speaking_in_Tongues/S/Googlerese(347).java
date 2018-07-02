package methodEmbedding.Speaking_in_Tongues.S.LYD753;

import java.io.*;

class Googlerese{
public static void main(String arg[])throws Exception
{
File f=new File("A-small-attempt0.in");
FileInputStream fin=new FileInputStream(f);
File f2=new File("ao.txt");
FileOutputStream fout=new FileOutputStream(f2);
BufferedWriter bwr=new BufferedWriter(new OutputStreamWriter(fout));
BufferedReader br=new BufferedReader(new InputStreamReader(fin));
String g="";
char x[]={'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
int n=Integer.parseInt(br.readLine());
int i=1;
String e="";
while(--n >=0)
{
g=br.readLine();
for(int j=0;j<g.length();j++)
{
if(g.charAt(j)==' ')
e+=" ";
else
e+=x[g.charAt(j)-97];
}
bwr.write("Case #"+(i++)+": "+e);
bwr.newLine();
bwr.flush();
e="";
}//while

}
}
