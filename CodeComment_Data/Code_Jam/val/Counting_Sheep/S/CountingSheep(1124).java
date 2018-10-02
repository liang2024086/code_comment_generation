package methodEmbedding.Counting_Sheep.S.LYD1035;

import java.io.*;
class CountingSheep
{
public static void main(String[] args)
{

int t,N;
try{
BufferedReader br=new BufferedReader(new FileReader("C:/Users/sagar/Desktop/A-small-attempt0.in"));
t=Integer.parseInt(br.readLine());
//System.out.println(t);
int test=1;
while(test<=t)
{
N=Integer.parseInt(br.readLine());
//System.out.println(N);

int name=N;
int count=0;
int array[]=new int[10];
for(int i=0;i<=9;i++)
{
	array[i]=0;
}
int j=1;

if(N==0)
{
System.out.print("Case #"+test+": INSOMNIA");

	System.out.println();
	
	
}
else
{
while(count<10)
{
	//N=name*j;
//System.out.println("start "+N);

while(N!=0)
{
int rem=N%10;
//System.out.println("rem "+rem);

N=N/10;
array[rem]++;

}
 count=0;
for(int i=0;i<=9;i++)
{
if(array[i]>0)
count++;
}
//System.out.println("count "+count);
if(count!=10)
{
N=name*j;
j++;
}
} }
name=name*(j-1);
if(name!=0)
{
System.out.print("Case #"+test+": "+name);

	System.out.println();
}
test++;
}
}
catch(Exception e)
{
	System.out.println(e.toString());
	
}





}






}
