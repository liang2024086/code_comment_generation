package methodEmbedding.Standing_Ovation.S.LYD1381;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter ;
class life
{
public static void main(String[] args)throws Exception
{
BufferedReader q = new BufferedReader (new InputStreamReader(System.in));
PrintWriter p = new PrintWriter ( System.out ); 
int t=Integer.parseInt(q.readLine());
int j=0;
while(t>0)
{

int count=0;int fr=0;
String[] s = q.readLine().split(" "); 
int max=Integer.parseInt(s[0]);
String s1=s[1];
int a[]=new int[s1.length()];
for(int i=0;i<s1.length();++i)
{
a[i]=s1.charAt(i)-48;
}
count+=a[0];
for(int i=1;i<=max;++i)
{
if(i<=count)
{
count+=a[i];
}
else if(i>count&&a[i]>0)
{
fr+=i-count;
count+=fr+a[i];
}
}
--t;
++j;
p.print("Case #");
p.print(j);
p.println(": "+fr);

}
p.close();
}
}
