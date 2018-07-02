package methodEmbedding.Cookie_Clicker_Alpha.S.LYD676;

import java.util.*;
import java.io.*;
import java.lang.*;
class Nvn
{
public static void main(String x[])
{
try
{
File file=new File("Output.txt");
file.createNewFile();
PrintWriter pout=new PrintWriter(new FileWriter(file));
File filein=new File("input.in");
Scanner s=new Scanner(new FileReader(filein));
int t=s.nextInt();
int cs=0;
for(cs=0;cs<t;cs++)
{
double nf=s.nextDouble();
double more=s.nextDouble();
double achievement=s.nextDouble();
boolean b=true;
double r=2.0000000;
double tt=0.0000000;
double a=0,c=0,d=0,e=0;
while(b)
{
a=achievement/r;
c=nf/r;
r=r+more;
d=achievement/r;
e=c+d;
if(a>e)
{
tt=tt+c;
}
else
{
tt=tt+a;
b=false;
}
}
pout.println("Case #"+(cs+1)+": "+tt);
}
pout.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}
