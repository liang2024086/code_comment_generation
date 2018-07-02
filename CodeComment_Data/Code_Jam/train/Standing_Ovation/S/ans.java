package methodEmbedding.Standing_Ovation.S.LYD1336;

import java.util.*;
import java.io.*;
class eg
{
public static void main(String[] arg)
{
File f = new File("abcde");
try{
Scanner br = new Scanner(f);
int T = br.nextInt();
for(int j = 0; j < T; j++)
{
int N = br.nextInt() + 1;
int[] S = new int[N];
String line = br.next();
String in[] = line.split("");

for(int i = 0; i < N; i++)
S[i] = Integer.parseInt(in[i]);
int p = 0,count = 0;

//count += S[0];

if(S[0] == 0)
{
p += 1;
count += 1;
}
else if(S[0] > 0)
  count += S[0];

for(int i = 1; i < N; i++)
{
count += S[i];
if(count <= i)
{
p += i - count +1 ;
count += i - count +1 ;
}
}
System.out.println("Case #"+(j+1)+": "+p);
}
}
catch(Exception e){}
}
}
