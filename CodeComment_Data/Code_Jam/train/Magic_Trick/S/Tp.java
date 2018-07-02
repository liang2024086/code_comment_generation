package methodEmbedding.Magic_Trick.S.LYD898;

import java.util.*;
import java.io.*;

public class Tp
{

static int n,k ,q;
public static void main(String args[]) throws FileNotFoundException,NullPointerException,IOException

{

File f = new File("A-small-attempt0.in");
File f2 = new File("op.out");
Scanner s = new Scanner(f);
BufferedWriter writer = new BufferedWriter(new FileWriter(f2));
int  testcase = s.nextInt();
    
for (int t = 0; t < testcase ;t++)
	{
	
	writer.write("Case #"+(t+1)+": ");
int m = s.nextInt();

Integer[][] ass1 = new Integer[4][4];
Integer[][] ass2 = new Integer[4][4];
int ar1[] = new int[4];
int ar2[] = new int[4];

for(int i=0;i<4;i++)
{
		for(int j=0;j<4;j++)
		{
			ass1[i][j] = s.nextInt();
		}
}

int n = s.nextInt();
for(int i=0;i<4;i++)
{
		for(int j=0;j<4;j++)
		{
			ass2[i][j] = s.nextInt();
		}
}

		for(int j=0;j<4;j++)
		{
			 ar1[j] = ass1[m-1][j] ;
			 
		}




		for(int j=0;j<4;j++)
		{
			 ar2[j] = ass2[n-1][j] ;
			 
		}
		
int count=0,no=0;
for(int i=0;i<4;i++)
		{
for(int j=0;j<4;j++)
		{
		if(ar1[i] == ar2[j]){
			count++;no=ar2[j];}
		}
		}
		
		if(testcase == t+1){
		if(count== 1)
		writer.write(no+"");
		
		else if(count == 0)
		writer.write("Volunteer cheated!");
		
		else
		writer.write("Bad magician!");
		
		}
		else {
		if(count== 1){
		writer.write(no+"");
		writer.newLine();}
		else if(count == 0){
		writer.write("Volunteer cheated!");
		writer.newLine();}
		else{
		writer.write("Bad magician!");
		writer.newLine();}
		}
		}
		writer.close();
}
}
