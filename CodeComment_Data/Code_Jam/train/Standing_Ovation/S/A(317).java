package methodEmbedding.Standing_Ovation.S.LYD2120;

import java.util.*;
import java.io.*;
public class A{
public static void main(String args[]) throws IOException{
BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
int ca = Integer.parseInt(lector.readLine());
for(int c  = 1;c<=ca;c++){
long res = 0;
String t = lector.readLine();
int a = Integer.parseInt(t.substring(0,t.indexOf(" ")));
String b = t.substring(t.indexOf(" ")+1);
int acum = 0;
for(int n = 0;n<=a;n++){
if(acum<n){
res+=n-acum;
acum=n;
}
acum+=b.charAt(n)-'0';
}
System.out.println("Case #"+c+": "+res);
}

}
}
