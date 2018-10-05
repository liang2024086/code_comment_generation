package methodEmbedding.Revenge_of_the_Pancakes.S.LYD178;

import java.io.File;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.*;
import java.lang.StringBuilder;
import java.lang.Math;
class MyClass 
{



public static void main(String[] arguments) throws Exception
{
BufferedReader br=new BufferedReader(new FileReader(new File("C:\\Java\\B-small-attempt0.in")));
BufferedWriter bw=new BufferedWriter(new FileWriter(new File("C:\\Java\\B-small-attempt0.out")));
BufferedWriter bw2=new BufferedWriter(new FileWriter(new File("C:\\Java\\PractiseData2.out")));	

int T = java.lang.Integer.parseInt(br.readLine());
String Line;
//double divisor;
for(int t=0;t<T;++t)
{
Line = br.readLine();
Boolean[] BA = new Boolean[Line.length()];

	for(int i = 0;i< Line.length();i++)
	{
	 if(Line.charAt(i)=='+')
	 {
	 BA[i]=true;
	 }
	 else 
	 {
	 BA[i]=false;
	 }
	}
int Negate=0;
for(int j=(Line.length()-1);j>-1;j--)
{
	if(BA[j]==false)
	{
		//Negate Array
		for(int k=0;k<j;k++)
		{
		BA[k]=!BA[k];
		}
		Negate++;
	}

}
 
bw.write("Case #"+(t+1)+": "+Negate);
bw.newLine();

}
bw.close();
bw2.close();
}
}


