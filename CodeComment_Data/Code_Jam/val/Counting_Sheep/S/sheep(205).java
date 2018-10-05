package methodEmbedding.Counting_Sheep.S.LYD55;

import java.util.*;
import java.io.*;
public class sheep{
public static void main(String args[]) throws IOException{
BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
int ca = Integer.parseInt(lector.readLine());
for(int c=0;c<ca;c++){
long res = Long.parseLong(lector.readLine());
int co = 0;
long aa = res;
boolean si[]=new boolean[10];
do{
long p = res;
//if(res<0)return;
do{
int r = (int)(p%10L);
if(!si[r] && (si[r]=true))co++;
}while((p/=10)>0);
}while(co<10 && (res+=aa)>0);

System.out.println("Case #"+(c+1)+": "+(res==0?"INSOMNIA":res));
}
}
}
