package methodEmbedding.Counting_Sheep.S.LYD260;



//import java.io.*;
import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;

public class Sheep {

 public static void main(String[] args)
{

   Scanner in = new Scanner(System.in);
   int t = in.nextInt();
if(t>=1&&t<=100)
{
int a[]=new int[t];
int res[]=new int[t];

for(int i=0;i<t;i++)
{
a[i]=in.nextInt();
if(a[i]>200)
{res[i]=-1;
}
if(a[i]<=200)
{
if(a[i]==0)
{

res[i]=0;


}
else
{
int test[]=new int[10];
int n=a[i];
int flag=0;
int y=0;
int c=2;
int co=0;
int n1=n;
while(flag==0)
{
int b=n;
while(b!=0)
{
int d=b%10;
b=b/10;
int f=0;
for(int r=0;r<y;r++)
{
if(d==test[r])
{
f=1;
}
}
if(f==0&&y<10)
{test[y]=d;
y++;
}
if(y==10)
{
flag=1;
break;
}
}
res[i]=n;
n=n1*c;
c++;
co++;
/*for(int j=0;j<y-1;j++ )
{ System.out.println(test[y]);}
 System.out.println(co);
  System.out.println("n"+n);*/
}
//res[i]=co;


}

}

    
}

for(int i=0;i<t;i++)
    
{
    if(res[i]==0)
{
 System.out.println("Case #"+(i+1)+": INSOMNIA");
 
}
    else if(res[i]>0)
     System.out.println("Case #"+(i+1)+": "+res[i]);
}

}



}
}
