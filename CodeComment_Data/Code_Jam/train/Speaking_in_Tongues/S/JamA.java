package methodEmbedding.Speaking_in_Tongues.S.LYD807;

import java.io.*;
import java.util.*;

class JamA
{

public static void main(String args[])throws Exception
{

FileReader fr = new FileReader("A-small-attempt0.in"); 
BufferedReader br = new BufferedReader(fr); 

FileWriter fw= new FileWriter("out.txt");

BufferedWriter bw=new BufferedWriter(fw);
PrintWriter pw= new PrintWriter(bw);

int t=Integer.parseInt(br.readLine());
String s="";String ns="";

char A[]={'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};

for(int i=0;i<t;i++)
{
ns="";
s=br.readLine();
for(int j=0;j<s.length();j++)
{
if(s.charAt(j)!=' ')
ns+=A[((int)s.charAt(j))-97];
else
ns+=" ";
}

pw.println("Case #"+(i+1)+": "+ns);
}
pw.close();
bw.close();
fw.close();
}
}

