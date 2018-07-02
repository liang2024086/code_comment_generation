package methodEmbedding.Standing_Ovation.S.LYD2170;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



/**
 *
 * @author Amkit
 */
public class Jam {
    public static void main(String[] args)throws IOException
            
    {
        File file = new File("C:\\Users\\Amkit\\Downloads\\A-small-attempt0.in");
    File outFile = new File("C:\\Users\\Amkit\\Downloads\\Result.out");
    BufferedReader br = new BufferedReader(new FileReader(file));
    BufferedWriter bw = new BufferedWriter(new FileWriter(outFile));

		int t=Integer.parseInt(br.readLine());
        int l=0,tt=0,req=0;
        
String s[]=new String[t];
for(int i=0;i<t;i++)
{
s[i]=br.readLine();
s[i]=s[i].substring(2,s[i].length());
}
for(int j=0;j<t;j++)
{
l=s[j].length();
int a[]=new int[l]; 
for(int i=0;i<l;i++)
{   
a[i]=Character.getNumericValue(s[j].charAt(i));
if(a[i]>0)
{
if(tt>=i)
{
tt+=a[i];
}
else
{
req+=i-tt;
tt+=req+a[i];
}
}
}
bw.write("Case #"+(j+1)+": "+req+"\n");
req=0; tt=0;
}
System.out.println("done");
br.close();
bw.close();
    }
}
