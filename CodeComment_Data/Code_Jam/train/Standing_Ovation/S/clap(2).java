package methodEmbedding.Standing_Ovation.S.LYD1328;

import java.util.*;
import java.io.*;
class clap{
public static void main(String[] args){
try{
FileInputStream fstream = new FileInputStream("inpu.in");
BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
   BufferedWriter pw= new BufferedWriter(new FileWriter("output.in"));
String newLine = System.getProperty("line.separator");
int t=Integer.parseInt(br.readLine());
int m,res,sum,x,z;
String s[]=new String[t];
for(int i=0;i<t;i++){
s[i]=br.readLine();
}
for(int j=0;j<t;j++){
res=0;
sum=0;
z=0;
String s1[]=s[j].split(" ");
m=Integer.parseInt(s1[0]);
for(int k=1;k<m+1;k++){
x=Character.getNumericValue(s1[1].charAt(k-1));
z=z+x;
sum=sum+x;
if((k-sum)>0){
   res=res+(k-sum);
    sum=sum+(k-sum);
}
}
z=z+Character.getNumericValue(s1[1].charAt(m));
if(z==0)
pw.write("Case #:"+(j+1)+" "+z);
else{
String ou="Case #"+(j+1)+": "+res+newLine;
pw.write(ou);
}
}
pw.close();
}

catch(FileNotFoundException e)
    {
      System.out.println("File does not exist. " + e);
    }
catch(IOException e)
    {
      System.out.println("Some I/O problem. " + e);
    }
}
}
