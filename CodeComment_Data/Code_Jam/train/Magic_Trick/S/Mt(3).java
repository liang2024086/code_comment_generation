package methodEmbedding.Magic_Trick.S.LYD1558;

import java.io.*;
import java.util.*;

class Mt{
public static void main(String [] args) throws IOException {
BufferedReader br=new BufferedReader (new FileReader("M:/kanu/magic/A-small-attempt0 (1).in"));
PrintWriter out = new PrintWriter (new BufferedWriter (new FileWriter("M:/kanu/magic/A-small-test.out")));
int T = Integer.parseInt(br.readLine());
for( int i=0; i<T; i++)
{
int a= Integer.parseInt(br.readLine());
int store[] = new int[4];
for(int j=0; j<4; j++)
{
StringTokenizer s = new StringTokenizer(br.readLine());
if(a==(j+1))
{
int k=0;
while(s.hasMoreTokens())
{
store[k] = Integer.parseInt(s.nextToken());
k++;
}
}
}
int b= Integer.parseInt(br.readLine());
int f=0,kp=0;
for( int j=0; j<4; j++)
{
StringTokenizer ss = new StringTokenizer(br.readLine());
if(b==(j+1))
{
int ck;
while(ss.hasMoreTokens())
{
ck = Integer.parseInt(ss.nextToken());
for(int k=0; k<4; k++)
{
if(ck==store[k])
{ f++;
kp=store[k];}
}
}
}
}
if(f==0)
out.println("Case #"+(i+1)+": Volunteer cheated!");
else if(f==1)
out.println("Case #"+(i+1)+": "+kp);
else
out.println("Case #"+(i+1)+": Bad magician!");
            
}
out.close();
System.exit(0);
}
}
