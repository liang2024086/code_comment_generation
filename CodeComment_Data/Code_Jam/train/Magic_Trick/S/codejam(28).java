package methodEmbedding.Magic_Trick.S.LYD1737;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.*;
class codejam{

public static void main(String args[])
{
try{
FileReader in = new FileReader("C:\\A-small-attempt0.in");
BufferedReader br=new BufferedReader(in);
int i=0;
char c;
//reading of the file content
String tt;
tt = br.readLine();
int T;
T=Integer.parseInt(tt);
String s[] = new String[T*10+1];

PrintWriter writer = new PrintWriter("C:\\output.txt");

while (i!=T*10)
{
s[i] = br.readLine();
i++;
}
// number of test cases

for(int ww=0;ww<T;ww++)
{
//converting everything to integer format and removing the empty spaces

int a[][] = new int[T*10+1][4];
int n;

for(int l=0;l<10;l++)
{
String[] aa=s[ww*10+l].split(" ");
n = aa.length;
for(int y=0;y<n;y++)
a[l][y] = Integer.parseInt(aa[y]);
}
//taking out the two arrays
int arr1[][] = new int[4][4];
int arr2[][] = new int[4][4];
int l;	
for(int j=0;j<4;j++)
{
for(int k=0;k<4;k++)
{

arr1[j][k] = a[1+j][k];
arr2[j][k] = a[6+j][k];
}
}
int a1,a2;

a1 = a[0][0];
a2 = a[5][0];
int counter=0;
int temp=0;

a1 = a1-1;
a2=a2-1;
//comparing the two arrays to find a common element;
int index=0;
for(int j=0;j<4;j++)
{
temp = arr1[a1][j];
for(int k=0;k<4;k++)
{
if(temp==arr2[a2][k])
{
counter++;
index = j;
}

}
}
String s2,s3,s4;
if(counter>1)
counter=2;
//System.out.println(counter+" counter");

switch(counter)
{
case 0: System.out.println("Case #"+(ww+1)+": "+"Volunteer cheated!"); 
s2 = "Case #"+(ww+1)+": "+"Volunteer cheated!";
writer.println(s2);
break;
case 1: System.out.println("Case #"+(ww+1)+": "+arr1[a1][index]); 
s3 = "Case #"+(ww+1)+": "+arr1[a1][index];
writer.println(s3);
break;

case 2: System.out.println("Case #"+(ww+1)+": "+"Bad magician!");
s4 = "Case #"+(ww+1)+": "+"Bad magician!";
writer.println(s4);
break;

}
}
writer.close();
}
catch(Exception e)
{}
}

}
