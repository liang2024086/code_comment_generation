package methodEmbedding.Counting_Sheep.S.LYD0;

class Sheep
{
public static void main(String args[])
{
java.util.Scanner kb=new java.util.Scanner(System.in);
int t=kb.nextInt();
int [] z=new int[t];
for(int i=0;i<z.length;i++)
z[i]=1;
for(int i=0;i<t;i++)
{
int count =0;
int n=kb.nextInt();
int r=n;
int a=0;
int aa=0;
int ab=0;
int ac=0;
int ad=0;
int ae=0;
int af=0;
int ag=0;
int ah=0;
int ai=0;
int aj=0;
boolean y=true;
while(y)
{
int k=r;
while(k>0)
{
int o;
if(k%10==0 && k<10)
o=k;
else 
o=k%10;
switch(o)
{
case 0:if(a==0)
count++;
a=1;
break;
case 1:if(aa==0)
count++;
aa=1;
break;
case 2:if(ab==0)
count++;
ab=1;
break;
case 3:if(ac==0)
count++;
ac=1;
break;
case 4:if(ad==0)
count++;
ad=1;
break;
case 5:if(ae==0)
count++;
ae=1;
break;
case 6:if(af==0)
count++;
af=1;
break;
case 7:if(ag==0)
count++;
ag=1;
break;
case 8:if(ah==0)
count++;
ah=1;
break;
case 9:if(ai==0)
count++;
ai=1;
break;
case 10:if(aj==0)
count++;
aj=1;
break;

}
k/=10;
}
int u=r;
r=n*++z[i];
if(u==r)
count=-1;
if(count>=10)
y=false;
else if(count==-1)
{
y=false;
z[i]=-1;
}
}
if(z[i]>0)
z[i]=n*(--z[i]);
}
for(int i=0;i<z.length;i++)
{
if(z[i]<0)
System.out.println("Case"+" "+"#"+(i+1)+":"+" "+"INSOMNIA");
else
System.out.println("Case"+" "+"#"+(i+1)+":"+" "+z[i]);

}
}
}
