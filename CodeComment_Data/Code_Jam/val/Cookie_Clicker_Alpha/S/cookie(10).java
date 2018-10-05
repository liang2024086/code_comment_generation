package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1200;

import java.lang.*;
import java.io.*;

class Cookie{

public static void main(String[] args) throws Exception{

BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("B-small-attempt0.in"),"cp1252"));

BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("B-output.txt"),"cp1252"));

int t= Integer.parseInt(br.readLine() );
int num=1;

while(num<=t){

bw.write("Case #"+num+": ");

double c=0.0,f=0.0,x=0.0 ;

String s1=br.readLine();

String[] arr = s1.split(" ");

c=Double.parseDouble(arr[0]);

f=Double.parseDouble(arr[1]);

x=Double.parseDouble(arr[2]);

int found=0;


double r=2.0,n=0,time=0,t1=0,t2=0,res=0;


while(found!=1){

t1 = c/r;
t1 = t1+ (x/(r+f));

t2=x/r;

if(t2>t1){

time=c/r;
n++;
r=r+f;


}

else{
found =1;
time=x/r;
}
res+= time;

}


bw.write(String.valueOf(res));
bw.newLine();






num++;
}

br.close();
bw.close();

}




}
