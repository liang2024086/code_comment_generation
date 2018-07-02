package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1263;

import java.lang.*;
import java.io.*;

class CCA{

public static void main(String[] args) throws Exception{

BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("B-small-attempt0.in"),"cp1252"));

BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("B-output.txt"),"cp1252"));

int t= Integer.parseInt(br.readLine() );
int tcase=1;

while(tcase<t+1){

bw.write("Case #"+tcase+": ");

double c=0,f=0,x=0 ;

String st1=br.readLine();

String[] array = st1.split(" ");

c=Double.parseDouble(array[0]);

f=Double.parseDouble(array[1]);

x=Double.parseDouble(array[2]);

int fu=0;


double r=2.0,n=0,time=0,t1=0,t2=0,result=0;


while(fu!=1){

t1 = c/r;
t1 = t1+ (x/(r+f));

t2=x/r;

if(t2>t1){

time=c/r;
n++;
r=r+f;


}

else{
fu =1;
time=x/r;
}
result+= time;

}


bw.write(String.valueOf(result));
bw.newLine();






tcase++;
}

br.close();
bw.close();

}




}
