package methodEmbedding.Magic_Trick.S.LYD629;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Magic{

public static void main(String[] args) throws IOException 
{

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

int cases=Integer.parseInt(br.readLine());

if(cases>=1 && cases<=100)
{
StringBuilder[] answers=new StringBuilder[cases];
int count=0;
int temp=0,suspectCheck;

String[][] firstAlign=new String[4][];
String[][] secondAlign=new String[4][];
for(int i=0;i<cases;i++)
{
count=0;
answers[i]=new StringBuilder("");

int firstRow=Integer.parseInt(br.readLine());

for(int align=0;align<4;align++)
{
firstAlign[align]=br.readLine().split("\\s");
}

int secondRow=Integer.parseInt(br.readLine());

for(int align=0;align<4;align++)
{
secondAlign[align]=br.readLine().split("\\s");
}

int[] suspects=new int[4];

for(int j=0;j<suspects.length;j++)
{
suspects[j]=Integer.parseInt(firstAlign[firstRow-1][j]);
}

int[] otherSuspects=new int[4];

for(int j=0;j<otherSuspects.length;j++)
{
otherSuspects[j]=Integer.parseInt(secondAlign[secondRow-1][j]);
}

for(int j=0;j<4;j++)
{
suspectCheck=otherSuspects[j];
for(int m=0;m<4;m++)
{
	if(suspectCheck==suspects[m])
	{
		count++;
		temp=j;
	}
}
}
if(count==1)
answers[i].append(secondAlign[secondRow-1][temp]);

else if(count==0)
answers[i].append("Volunteer cheated!");

else
answers[i].append("Bad magician!");

	
}


System.out.println();
for(int i=0;i<cases;i++)
{
System.out.println("Case #"+(i+1)+": "+answers[i]);

}

}}}
	
		
