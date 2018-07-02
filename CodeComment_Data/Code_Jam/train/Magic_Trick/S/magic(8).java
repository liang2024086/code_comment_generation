package methodEmbedding.Magic_Trick.S.LYD1164;

import java.lang.*;
import java.io.*;

class Magic{

public static void main(String args[]) throws Exception{

BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("A-small-attempt0.in"),"cp1252"));

BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("A-output.txt"),"cp1252"));

int t= Integer.parseInt(br.readLine() );
int num=1;

while(num<=t){

int[] ax = new int[4];

int[] bx = new int[4];

bw.write("Case #"+num+": ");



int a= Integer.parseInt(br.readLine() );

for(int i=1;i<5;i++){
String s=br.readLine();

if(i==a){
String[] arr= s.split(" ");
for(int k=0;k<4;k++){
ax[k]=Integer.parseInt(arr[k]);
}

}

}


int b= Integer.parseInt(br.readLine() );

for(int i=1;i<5;i++){
String s=br.readLine();

if(i==b){
String[] arr= s.split(" ");
for(int k=0;k<4;k++){
bx[k]=Integer.parseInt(arr[k]);
}

}

}

int count=0,p=0;


for(int i=0;i<4;i++){
for(int j=0;j<4;j++){

if(ax[i]==bx[j]){
count++;
p=ax[i];

}

}

}


if(count==1){
String ans = String.valueOf(p);
bw.write(ans);
bw.newLine();
System.out.println(p);

}


if(count==0){
bw.write("Volunteer cheated!");
bw.newLine();

}

if(count>1){


bw.write("Bad magician!");
bw.newLine();

}


num++;
}


br.close();
bw.close();
}


}
