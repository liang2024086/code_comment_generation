package methodEmbedding.Counting_Sheep.S.LYD294;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CountingSheep {
	public static void main(String args[]) throws IOException
	{
	int o=0,l=1,n,r,i,j,m=0,mc,count=0, num_list[]={0,1,2,3,4,5,6,7,8,9};
	String print= new String("");
Scanner inp= new Scanner(System.in);
File file = new File("/home/jeffreymjosanne/Downloads/A-small-attempt2.in");
File outFile = new File("/home/jeffreymjosanne/Downloads/A-small-practice.out");
BufferedReader br = new BufferedReader(new FileReader(file));
BufferedWriter bw = new BufferedWriter(new FileWriter(outFile));
int testCases = Integer.parseInt(br.readLine());
for(int t=1;t<=testCases;t++){
	//count=0;
//t=inp.nextInt();
//while(l<=t)
//{
n=Integer.parseInt(br.readLine());

if(n==0)
{
	print="Case #"+l+": INSOMNIA";
	
}
else if(n==1)
{
	print="Case #"+l+": 10 ";
	}
else
{mc=0;
count=0;
for(o=0;o<10;o++)
	num_list[o]=o;
for(i=1;count<10;i++)
{
	//System.out.println("procesing"+ "");
mc=n*i;
m=mc;
while(m!=0)
{r=m%10;
m=m/10;
num_list[r]=-1;
}
count=0;
for(j=0;j<10;j++)
{
if(num_list[j]==-1)
{
count++;	
}
}
	}
print="Case #"+ l +": "+mc;

}

System.out.println(print);
bw.write(print);bw.newLine();
	
l++;}
br.close();
bw.close();

}

}


