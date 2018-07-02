package methodEmbedding.Magic_Trick.S.LYD473;

import java.io.*;
import java.util.*;
class magic
{
public static void main(String args[])throws Exception
{
int i,j,k,k1;
File f=new File("aa.in");
Scanner s=new Scanner(f);
int n=s.nextInt();int out[]=new int[n];for(int o=0;o<n;o++){out[o]=0;}int a[]=new int[n];int b[]=new int[n];
int row1[][][]=new int[n][4][4];int row2[][][]=new int[n][4][4];int pos[]=new int[1000];
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
for(j=0;j<4;j++)
{
for(k=0;k<4;k++)
{
row1[i][j][k]=s.nextInt();
}}
b[i]=s.nextInt();
for(j=0;j<4;j++)
{
for(k=0;k<4;k++)
{
row2[i][j][k]=s.nextInt();
}}
}
//new module
for(i=0;i<n;i++)
{go :{
for(k=0;k<4;k++)
{
for(k1=0;k1<4;k1++)
{
if(row1[i][(a[i]-1)][k]==row2[i][(b[i])-1][k1])
{
out[i]=out[i]+1;
if(out[i]>1)
break go;
else
pos[i]=row2[i][(b[i])-1][k1];
}}}}}
for(int o=0;o<n;o++)
{
if(out[o]==1){
System.out.println("Case #"+(o+1)+": "+(pos[o]));}
else if(out[o]==0){
System.out.println("Case #"+(o+1)+": Volunteer cheated!");}
else if(out[o]>=2){
System.out.println("Case #"+(o+1)+": Bad magician!");}
}
}
}
