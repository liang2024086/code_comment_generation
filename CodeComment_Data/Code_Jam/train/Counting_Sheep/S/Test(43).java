package methodEmbedding.Counting_Sheep.S.LYD324;

import java.util.*;
public class Test
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
int count=0;
while(t-->0)
{
++count;
int n=sc.nextInt();
boolean flag1=false,flag2=false,flag3=false,flag4=false,flag5=false,flag6=false,flag7=false,flag8=false,flag9=false,flag0=false;
int last=0;
for(int i=1;i<=100;i++)
{
int tn=n*i;
String s=Integer.toString(tn);
int len=s.length();
for(int j=0;j<len;j++)
{
char st=s.charAt(j);
if(st=='1')
flag1=true;
else if(st=='2')
flag2=true;
else if(st=='3')
flag3=true;
else if(st=='4')
flag4=true;
else if(st=='5')
flag5=true;
else if(st=='6')
flag6=true;
else if(st=='7')
flag7=true;
else if(st=='8')
flag8=true;
else if(st=='9')
flag9=true;
else if(st=='0')
flag0=true;
}
if(flag0==true&&flag1==true&&flag2==true&&flag3==true&&flag4==true&&flag5==true&&flag6==true&&flag7==true&&flag8==true&&flag9==true)
{
last=tn;
break;
}
}
if(last==0)
System.out.println("Case #"+count+": "+"INSOMNIA");
else
System.out.println("Case #"+count+": "+last);
}

}





}
