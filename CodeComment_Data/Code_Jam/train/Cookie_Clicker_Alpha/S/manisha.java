package methodEmbedding.Cookie_Clicker_Alpha.S.LYD22;

import java.util.StringTokenizer;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.lang.Double;
import java.io.*;
import java.util.StringTokenizer;
import java.util.*;
class manisha
{
public static void main(String[] args)
{
try
{
	FileReader fr = new FileReader("B-small-attempt0.in");
	BufferedReader br = new BufferedReader(fr);
	FileWriter fw =new FileWriter("write2.txt");
	BufferedWriter bw = new BufferedWriter(fw);
	int total = Integer.parseInt(br.readLine());
	for(int i=0;i<total;i++)
	{
		String s = new String(br.readLine());
		StringTokenizer st = new StringTokenizer(s," ");
		int j=0;
		double cost,fprod,need;
		cost =  Double.parseDouble(st.nextToken());
		fprod =  Double.parseDouble(st.nextToken());
		need =  Double.parseDouble(st.nextToken());
		double otime,ntime,ctime;
		double cokprod=2;
		ctime = cost/cokprod;
		
		otime = need/cokprod;
		cokprod = cokprod + fprod;
		ntime = ctime + (need/cokprod);
		while(otime>ntime)
		{
			otime = ntime;
			ctime = ctime + (cost/cokprod);
			cokprod += fprod;
			ntime = ctime + (need/cokprod);
			//System.out.println(ctime);
		}
		//System.out.println(otime+" "+ntime);
		String str="Case #"+(i+1)+": ";
		bw.write(str);
		bw.write(String.valueOf(otime));
		bw.newLine();
 	}
	bw.flush();
	bw.close();
}
catch(Exception e)
{
e.printStackTrace();
}
}
}
