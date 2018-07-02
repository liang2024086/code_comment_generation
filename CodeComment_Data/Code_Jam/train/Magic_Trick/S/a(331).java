package methodEmbedding.Magic_Trick.S.LYD323;

import java.util.*;
import java.io.*;
public class a{
public static PrintWriter out = new PrintWriter(System.out);//HACER FLUSHHHH
public static void main(String args[]) throws IOException{
BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
int t =Integer.parseInt(lector.readLine());
for(int c = 0;c<t;c++){
int a = Integer.parseInt(lector.readLine());
String tmp = "";
HashSet<Integer> set = new HashSet<Integer>();
String aa[];
for(int n =0;n<4;n++){
tmp = lector.readLine();
if(n==a-1){
aa = tmp.split(" ");
for(int m = 0;m<aa.length;m++)
set.add(Integer.parseInt(aa[m]));
}
}
int b = Integer.parseInt(lector.readLine());
int r = 0,rr=0;
for(int n =0;n<4;n++){
tmp = lector.readLine();
if(n==b-1){
aa = tmp.split(" ");
for(int m = 0;m<aa.length;m++)
if(set.contains(Integer.parseInt(aa[m]))){r++;rr=Integer.parseInt(aa[m]);}
}
}
System.out.println("Case #"+(c+1)+": "+(r==0?"Volunteer cheated!":(r==1?rr:"Bad magician!")));
}
}

}
