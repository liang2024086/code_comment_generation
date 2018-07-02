package methodEmbedding.Speaking_in_Tongues.S.LYD1312;

import java.io.*;
import java.util.*;
public class CodeJam1{
public static int rech[] = new int[26];
public static void main(String args[]) throws IOException{
String retal[] = {"ejp mysljylc kd kxveddknmc re jsicpdrysi",
"our language is impossible to understand",
"rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd",
"there are twenty six factorial possibilities",
"de kr kd eoya kw aej tysr re ujdr lkgc jv",
"so it is okay if you want to just give up"};
for(int n = 0;n<retal.length;n+=2){
for(int k = 0;k<retal[n].length();k++)
if(retal[n].charAt(k)!=' ')
rech[retal[n].charAt(k)-'a']=retal[n+1].charAt(k)-'a';
}
rech['z'-'a']='q'-'a';
rech['q'-'a']='z'-'a';
BufferedReader lector = new BufferedReader(new FileReader(args[0]));
String tmp = "";
int t=1;
tmp = lector.readLine();
while((tmp = lector.readLine())!=null){
System.out.print("Case #"+(t++)+": ");
for(int n = 0;n<tmp.length();n++)
System.out.print(((tmp.charAt(n)==' ')?' ':(char)(rech[tmp.charAt(n)-'a']+97)));
System.out.println("");
}
}
}
