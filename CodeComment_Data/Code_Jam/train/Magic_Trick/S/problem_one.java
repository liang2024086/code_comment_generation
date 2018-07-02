package methodEmbedding.Magic_Trick.S.LYD457;

import java.util.*;
import java.io.*;
class problem_one
{
public static void main(String x[]) throws IOException
{
File fo=new File("Output.txt");
fo.createNewFile();
PrintWriter out=new PrintWriter(new FileWriter(fo));
File f=new File("input.in");
Scanner s=new Scanner(new FileReader(f));
int n=s.nextInt();
int i=0;
int g1,g2;
for(i=0;i<n;i++)
{
g1=s.nextInt();
g1=g1-1;
int g1ar[][]=new int [4][4];
for(int j=0;j<4;j++)
{
for(int k=0;k<4;k++)
{
g1ar[j][k]=s.nextInt();
}
}
g2=s.nextInt();
g2=g2-1;
int g2ar[][]=new int [4][4];
for(int j=0;j<4;j++)
{
for(int k=0;k<4;k++)
{
g2ar[j][k]=s.nextInt();
}
}
int count=1,position=0;
for(int p=0;p<4;p++)
{
if(g1ar[g1][p]==g2ar[g2][0]|| g1ar[g1][p]==g2ar[g2][1]|| g1ar[g1][p]==g2ar[g2][2]|| g1ar[g1][p]==g2ar[g2][3])
{
position=g1ar[g1][p];
count++;
}
}
if(count==1)
out.println("Case #"+(i+1)+": Volunteer cheated!");
else
{
if(count==2)
out.println("Case #"+(i+1)+": "+position);
else
out.println("Case #"+(i+1)+": Bad magician!");
}
}
out.close();
}
}
