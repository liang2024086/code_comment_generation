package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1576;

import java.io.*;
import java.util.*;

public class Cookie{

public static void main(String[] args)throws IOException{
BufferedReader bf=new BufferedReader(new FileReader("entrada.in"));
PrintWriter out=new PrintWriter(new BufferedWriter(new FileWriter("A-small-practice.out")));

StringTokenizer st;
double c;
double f;
double x;
double time1;
double time2;
double time3;
int cases=1;

int t=Integer.parseInt(bf.readLine());

while(t>0){
    time1=0;
    time2=0;
    time3=0;
    double n=2;
st=new StringTokenizer(bf.readLine());
c=Double.parseDouble(st.nextToken());f=Double.parseDouble(st.nextToken());x=Double.parseDouble(st.nextToken());
double t1=c/n;
time1=x/n;
time2=t1+(x/(n+f));
time3=t1+(c/(n+f));
while(time1>time2){
    n+=f;
    time1=time2;
    time2=time3+(x/(n+f));
    time3=time3+(c/(n+f));
}
if(time1<time2)
out.println("Case #"+cases+": "+Math.round(time1*Math.pow(10,7))/Math.pow(10,7));
else
out.println("Case #"+cases+": "+Math.round(time2*Math.pow(10,7))/Math.pow(10,7));

cases++;
t--;

}

out.close();
System.exit(0);

}
}
