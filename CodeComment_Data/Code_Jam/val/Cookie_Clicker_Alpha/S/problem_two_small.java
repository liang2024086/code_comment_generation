package methodEmbedding.Cookie_Clicker_Alpha.S.LYD231;

import java.util.*;
import java.io.*;
class problem_two_small
{
public static void main(String x[]) throws IOException
{
File fo=new File("Output.txt");
fo.createNewFile();
PrintWriter out=new PrintWriter(new FileWriter(fo));
File f=new File("input.in");
Scanner s=new Scanner(new FileReader(f));
int n=s.nextInt();//test case
int cas=0;
for(cas=0;cas<n;cas++)
{
double newfarm=s.nextDouble();//cost
double fp=s.nextDouble();//further production
double target=s.nextDouble();//achievement
boolean flag=true;
double c_rate=2.0000000;
double total_time=0.0000000;
double time1=0,time2=0,time3=0,time4=0;
while(flag)
{
time1=target/c_rate;
time2=newfarm/c_rate;
c_rate=c_rate+fp;
time3=target/c_rate;
time4=time2+time3;
if(time1>time4)
{
total_time=total_time+time2;
}
else
{
total_time=total_time+time1;
flag=false;
}
}
out.println("Case #"+(cas+1)+": "+total_time);
}
out.close();
}
}
