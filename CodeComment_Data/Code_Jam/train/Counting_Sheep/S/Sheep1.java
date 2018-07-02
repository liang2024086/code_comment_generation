package methodEmbedding.Counting_Sheep.S.LYD602;

import java.util.Scanner;
class Sheep1 {
public static void main(String a[])
{
Scanner r = new Scanner(System.in);
int T = r.nextInt();
long l[] = new long[T];
for(int i=0;i<T;i++)
{ long q = r.nextLong();
if(q==0)
l[i]=0;
else{
String S= new String();
S=" ";
for (long j=1;j<1000;j++){
int c=0;
long m=q*j;
S=S+m;
if(S.indexOf('0')!=-1 && S.indexOf('1')!=-1 && S.indexOf('2')!=-1 && S.indexOf('3')!=-1 && S.indexOf('4')!=-1 && S.indexOf('5')!=-1 && S.indexOf('6')!=-1 && S.indexOf('7')!=-1 && S.indexOf('8')!=-1 && S.indexOf('9')!=-1)
 c=c+1;
if(c==1)
{
l[i]=m;
break;
}
}
}
}
for(int i = 0; i < T; i++)
{ if(l[i]==0)
System.out.println("Case #" + (i+1) + ": INSOMNIA" );
else
System.out.println("Case #" + (i+1) + ": " +l[i]);
}
}
}
