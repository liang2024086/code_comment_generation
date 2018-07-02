package methodEmbedding.Magic_Trick.S.LYD824;

import java.lang.*;
import java.io.*;


class magictrick{

public static void main(String args[]) throws Exception{
BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("A-small-attempt3.in"),"cp1252"));
BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("A-output.txt"),"cp1252"));


int test= Integer.parseInt(br.readLine() );
int number=1;

while(number<=test){

int[] a1 = new int[4];
int[] a2 = new int[4];

bw.write("Case #"+number+": ");

int a= Integer.parseInt(br.readLine() );

for(int i=1;i<5;i++){
String s=br.readLine();

if(i==a){
String[] array= s.split(" ");
for(int k=0;k<4;k++){
a1[k]=Integer.parseInt(array[k]);
}

}

}


int b= Integer.parseInt(br.readLine() );

for(int i=1;i<5;i++){
String s=br.readLine();

if(i==b){
String[] array= s.split(" ");
for(int k=0;k<4;k++){
a2[k]=Integer.parseInt(array[k]);
}

}

}

int count=0;
int x=0;


for(int i=0;i<4;i++){
for(int j=0;j<4;j++){

if(a1[i]==a2[j]){
count++;
x=a1[i];

}

}

}


if(count==1){
String res = String.valueOf(x);
bw.write(res);
bw.newLine();
System.out.println(x);

}


if(count==0){
bw.write("Volunteer cheated!");
bw.newLine();

}

if(count>1){


bw.write("Bad magician!");
bw.newLine();

}


number++;
}


br.close();
bw.close();
}


}
