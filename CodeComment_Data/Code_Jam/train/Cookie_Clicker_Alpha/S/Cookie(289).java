package methodEmbedding.Cookie_Clicker_Alpha.S.LYD503;

import java.io.*;
import java.util.*;
class Cookie{
public static void main(String args[])throws Exception{
FileReader fin=new FileReader("/home/ray/Downloads/B-small-attempt0.in");
FileWriter fw=new FileWriter("outputb",true);
BufferedWriter bw=new BufferedWriter(fw);
BufferedReader br = new BufferedReader(fin);
String s1="";
String s2[]=new String[3];
int ase=Integer.parseInt(br.readLine());
int i;
double x,c,f1=2.0,f,res=0.0,t1,t2;
for(i=1;i<=ase;i++){
s1=br.readLine();
s2=s1.split(" ");
c=Double.parseDouble(s2[0]);
f=Double.parseDouble(s2[1]);
x=Double.parseDouble(s2[2]);


while(true){
t1=x/f1;
t2=(c/f1)+(x/(f1+f));
if(i==4){
System.out.println("x= "+x);
System.out.println("f= "+f);
System.out.println("t1= "+t1);
System.out.println("t2= "+t2);
}if(t1<t2){
res+=t1;
break;
}
res+=c/f1;
f1+=f;

System.out.println("res= "+res);
}
s1="Case #"+i+": "+res;
bw.append(s1);
bw.newLine();
res=0.0;
f1=2.0;
}bw.close();
fin.close();
}}

