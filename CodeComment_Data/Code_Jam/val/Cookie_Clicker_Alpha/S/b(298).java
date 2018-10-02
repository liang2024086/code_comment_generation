package methodEmbedding.Cookie_Clicker_Alpha.S.LYD510;

import java.util.*;
import java.io.*;
public class b{
public static PrintWriter out = new PrintWriter(System.out);//HACER FLUSHHHH
public static void main(String args[]) throws IOException{
BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
int tt =Integer.parseInt(lector.readLine());
for(int cc = 0;cc<tt;cc++){
String tmp[] = lector.readLine().split(" ");
double c = Double.parseDouble(tmp[0]);
double f = Double.parseDouble(tmp[1]);
double x = Double.parseDouble(tmp[2]);
double res = 0.0;
double med = 2.0;
while(true){
if(x/med<=c/med+x/(med+f)){
res+=x/med;
break;

}
res+=c/med;
med+=f;
}
String re = ""+Math.round(res*10000000.0)/10000000.0;
int y = re.indexOf(".");
while(re.length()-y-1<7)re+="0";
System.out.println("Case #"+(cc+1)+": "+re);
}
}

}
