package methodEmbedding.Magic_Trick.S.LYD961;

import java.io.*;
import java.util.*;
class MagicTrick{
public static void main(String args[])throws Exception{
FileReader fin=new FileReader("A-small-attempt1.in");
FileWriter fw=new FileWriter("outputb",true);
BufferedWriter bw=new BufferedWriter(fw);
BufferedReader br = new BufferedReader(fin);
String s1="";
String s2[]=new String[4];
int ase,i,j=0,k=0,temp;
int row1=0,row2=0;
int ser1[]=new int[16];
int ser2[]=new int[16];
int res1[]=new int[4];
int res2[]=new int[4];
int count=0;
int res=0;
ase=Integer.parseInt(br.readLine());
for(i=1;i<=ase;i++){
row1=Integer.parseInt(br.readLine());
k=0;
for(j=0;j<4;j++){
temp=0;
s1=br.readLine();
s2=s1.split(" ");
while(temp<4){
ser1[k]=Integer.parseInt(s2[temp]);
k++;
temp++;
}
}
row2=Integer.parseInt(br.readLine());
k=0;
for(j=0;j<4;j++){
temp=0;
s1=br.readLine();
s2=s1.split(" ");
while(temp<4){
ser2[k]=Integer.parseInt(s2[temp]);
k++;
temp++;
}
}
temp=4;
k=(row1-1)*4;j=0;
while(temp!=0){
res1[j]=ser1[k];
System.out.println("1 :"+res1[j]);
j++;k++;
temp--;
}
temp=4;
k=(row2-1)*4;j=0;
while(temp!=0){
res2[j]=ser2[k];
System.out.println("2 :"+res2[j]);
j++;k++;
temp--;
}
for(j=0;j<4;j++){
for(k=0;k<4;k++){
if(res1[j]==res2[k]){
count++;
res=res1[j];
}
}
}
if(count>1)
s1="Case #"+i+": Bad magician!";
if(count==1)
s1="Case #"+i+": "+res;
if(count==0)
s1="Case #"+i+": Volunteer cheated!";
bw.append(s1);
bw.newLine();
count=0;
res=0;
}
bw.close();
fin.close();
}}
