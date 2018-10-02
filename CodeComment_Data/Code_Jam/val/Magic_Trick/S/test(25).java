package methodEmbedding.Magic_Trick.S.LYD1844;

import java.io.*;
import java.util.*;
import java.io.BufferedWriter;
public class test{
	public static void main(String args[])throws IOException{
	File f=new File("1.txt");
	Scanner s=new Scanner(f);
	for(int g=1;g<=100;g++)
	{
	int[] a=new int[1500];
	int i=1,c=0,n=0;
	int[] r1=new int[50];
	int[] e1=new int[50];
	PrintWriter writer=new PrintWriter(new FileWriter("output1.txt",true));
	while(s.hasNextLine())
	{
		if(i<=34)
		{
			try{
			a[i]=s.nextInt();
			}catch(Exception ee){ee.printStackTrace();}
			i=i+1;
		}
		else 
			break;
	}
	if(a[1]==1)
		System.arraycopy(a,2,r1,0,4);
		if(a[1]==2)
		System.arraycopy(a,6,r1,0,4);
		if(a[1]==3)
		System.arraycopy(a,10,r1,0,4);
		if(a[1]==4)
		System.arraycopy(a,14,r1,0,4);
		if(a[18]==1)
		System.arraycopy(a,19,e1,0,4);
		if(a[18]==2)
		System.arraycopy(a,23,e1,0,4);
		if(a[18]==3)
		System.arraycopy(a,27,e1,0,4);
		if(a[18]==4)
		System.arraycopy(a,31,e1,0,4);
		for(int q=0;q<4;q++)
		{
			for(int j=0;j<4;j++)
			{
			if(r1[q]==e1[j])
			{
				c=c+1;
				n=r1[q];
			}
			}
		}try{
	if(c==0)
		writer.println("Case #"+g+": Volunteer cheated!");
	if(c>1)
		writer.println("Case #"+g+": Bad magician!");
	if(c==1)
		writer.println("Case #"+g+": "+n);
		writer.close();}catch(Exception ex){ex.printStackTrace();}		
	}
}
}
