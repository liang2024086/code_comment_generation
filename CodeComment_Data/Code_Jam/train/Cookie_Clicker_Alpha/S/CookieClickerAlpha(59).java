package methodEmbedding.Cookie_Clicker_Alpha.S.LYD672;

import java.util.*;
public class CookieClickerAlpha
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
int t,k=1;
double c,f,x,time,cookies,rate;
System.out.println();
t=scan.nextInt( );
while(t>0)
{
c=scan.nextDouble( );
f=scan.nextDouble( );
x=scan.nextDouble( );
time=cookies=0;
rate=2;
while(cookies<x)
{
if(c/rate+x/(rate+f)<x/rate)
{
time=time+c/rate;
rate=rate+f;
}
else
{
time=time+x/rate;
break;
}
}
System.out.printf("Case #"+k+": %.7f\n",time);
k++;
t--;
}
}
}
