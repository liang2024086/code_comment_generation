package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1277;

import java.io.*;
import java.util.*;
import java.math.*;
    
public class c {
public static void main(String [] args) throws IOException {
BufferedReader br = new BufferedReader (new FileReader("M:/kanu/cook/B-small-attempt0 (2).in"));
PrintWriter p = new PrintWriter (new BufferedWriter (new FileWriter("M:/kanu/cook/testlarge.out")));
int T = Integer.parseInt(br.readLine());
for(int i=0; i<T; i++)
{
StringTokenizer s = new StringTokenizer(br.readLine());
double C = Double.parseDouble(s.nextToken());
double F = Double.parseDouble(s.nextToken());
double X = Double.parseDouble(s.nextToken());
double tp = 2;
double nt=0,ot=1,t=0;
while(1==1)
{
ot = X/tp;
nt = (C/tp)+(X/(tp+F));
if(ot>nt)
{
t+=(C/tp);
tp+=F;
}
else
{
t+=ot;
break;
}
}            
double o = (double)Math.round(t*10000000)/10000000;
p.println("Case #"+(i+1)+": "+o);
}
p.close();
System.exit(0);
}
}
